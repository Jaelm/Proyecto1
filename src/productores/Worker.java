/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productores;

import classes.EstudioAnimacion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Worker extends Thread{
    private double sueldoTotal;
    private double sueldoPorHora;
    private long dayDurationInMs;
    private double produceAlDia;
    private double cuentaParte;
    private String workerArea;
    
    final private boolean active = true;
    private boolean isEnsamblador;
    private boolean isCartoon;
    private EstudioAnimacion estudio;
    
    public Worker(String tipo, boolean isCartoon, long dayDurationInMs, EstudioAnimacion estudio){
        this.workerArea = tipo;
        this.sueldoTotal = 0;
        this.cuentaParte = 0;
        this.isCartoon = isCartoon;
        this.dayDurationInMs = estudio.dayDurationMs;
        this.estudio = estudio;
        this.initializeWorker();
    }
    
    public void run(){
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(this.active){
            try {
                
             this.produceForTheDay();
             this.payCheck();
             
//             System.out.println(this.accSalary);
            sleep(this.dayDurationInMs);

            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void initializeWorker(){
        
        if (this.workerArea.equals(TipoWorker.guion)) {
            this.sueldoPorHora = 20; 
            this.produceAlDia = this.getProdGuionDia(this.isCartoon);
        }
        else if (this.workerArea.equals(TipoWorker.escenario)) {
            this.sueldoPorHora = 26;
            this.produceAlDia = this.getProdEscenarioDia(this.isCartoon);
        }
        else if (this.workerArea.equals(TipoWorker.animador)) {
            this.sueldoPorHora = 40; 
            this.produceAlDia = this.getProdAnimacionDia(this.isCartoon);
        }
        else if (this.workerArea.equals(TipoWorker.actor)) {
             this.sueldoPorHora = 16;
             this.produceAlDia = this.getProdDoblajeDia(this.isCartoon);
        }
        else if (this.workerArea.equals(TipoWorker.plotwist)) {
             this.sueldoPorHora = 34;
             this.produceAlDia = this.getProdPlowtistDia(this.isCartoon);        
        }
        else if (this.workerArea.equals(TipoWorker.ensamblador)) {
             this.sueldoPorHora = 50;
             this.produceAlDia = 0;
             this.isEnsamblador = true;
             return;        
        }
        else {
             this.sueldoPorHora = 0;
             this.produceAlDia = 0;             
        }
        setCuentaPieza(0);
        setIsEnsamblador(false);                
    }
    
    public void setWorkerType(String type){
        this.workerArea = type;
        this.initializeWorker();
    }
    
    private double getProdGuionDia(boolean isCartoon){
        if (isCartoon){
            return 0.5;
        }
        return 0.5;
    }
    
    private double getProdEscenarioDia(boolean isCartoon){
        if (isCartoon){
            return 0.5;
        }
        return 0.5;
    }
    
     private double getProdAnimacionDia(boolean isCartoon){
        if (isCartoon){
            return 3;
        }
        return 3;
    }
     
    private double getProdDoblajeDia(boolean isCartoon){
        if (isCartoon){
            return 3;
        }
        return 3;
    }
    
    private double getProdPlowtistDia(boolean isCartoon){
        if (isCartoon){
            return 0.33;
        }
        return 0.33;
    }

    public void produceForTheDay(){
        this.cuentaParte += this.produceAlDia;
        
        if (this.cuentaParte >= 1) {
            try {
                estudio.mutex.acquire();
                estudio.drive.updateDrive(this.workerArea, (int) this.cuentaParte, this.isCartoon);
                estudio.mutex.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
            // intentar acceder al almacén
            this.cuentaParte = 0;
        }
        if (this.isEnsamblador){
            try{
                estudio.mutex.acquire();
                boolean partsTaken = estudio.drive.tomarPart(this.isCartoon);
                estudio.mutex.release();
                
                //una vez tomadas las piezas, dormir 2 dias que tarda en hacer el carro (solo si tomo las piezas)
                if(partsTaken){
                    sleep(estudio.dayDurationMs * 2);
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setTipoWorker(String tipo){
        this.workerArea = tipo;
        this.initializeWorker();
    }

    public String getTipoWorker(){
        return this.workerArea;
    }
    
    public double getSueldoTotal(){
        return this.sueldoTotal;
    }
    
    public double getSueldoHora(){
        return this.sueldoPorHora;
    }
    
    public void payCheck(){
        this.sueldoTotal += (getSueldoHora()*24);
    }   
    
    public double getProduccionDiaria() {
        return produceAlDia;
    }
    
    public void setProduccionDiaria(double produceAlDia) {
        this.produceAlDia = produceAlDia;
    }
    
    public double getAccProduction() {
        return cuentaParte;
    }
    
    public void setCuentaPieza(double cuentaParte) {
        this.cuentaParte = cuentaParte;
    }
   
    public String getWorkerPieza() {
        return workerArea;
    }
    
    public void setWorkerPieza(String workerArea) {
        this.workerArea = workerArea;
    }
    
    public boolean isEnsamblador() {
        return isEnsamblador;
    }
    
    public void setIsEnsamblador(boolean isEnsamblador) {
        this.isEnsamblador = isEnsamblador;
    }
}
