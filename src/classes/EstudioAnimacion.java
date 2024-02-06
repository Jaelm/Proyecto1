/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.concurrent.Semaphore;
import productores.Director;
import productores.ProjectManager;
import productores.TipoWorker;
import productores.Worker;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class EstudioAnimacion extends Thread {
    private String name;
    public int maxWorkerQty;
    private Worker[] workers;
    public int[] emplxDep;
    public long dayDurationMs;
    public Drive drive;
    public Semaphore mutex;
    public boolean isCartoon;
    public int entrega;
    public Configuracion confi = new Configuracion();
    public int cantidadWorkers;
    public ProjectManager manager;
    public Director director;
    public int diasInit;
    public int sueldoAcumu;
    public int capituloTransmitido;

    
     public EstudioAnimacion (String name, int maxWorkerQty, int dayDurationMs, int entrega, boolean isCartoon) {
        this.name = name;
        this.maxWorkerQty = maxWorkerQty;
        this.workers = new Worker[maxWorkerQty];
        this.drive = new Drive(25, 20, 55, 35, 10);
        this.mutex = new Semaphore(1);
        this.isCartoon = isCartoon;
        this.entrega = entrega;
        this.dayDurationMs = dayDurationMs;
        this.director = new Director(this,isCartoon);
        this.manager = new ProjectManager(this,dayDurationMs);
        this.diasInit = entrega;
        this.sueldoAcumu = 0;
        
        actualizarEmplPorDepto();        
        crearWorkers();
        startManagerDir();
        this.start();
    }   
     
    @Override
    public void run() {
              while(true){
            try {       
//                this.updateDeadlineDurationDeTxt();
                //get sueldos
                int num = this.getSueldosPagados();
                if(this.isCartoon){
                }else{
                    }
                //get ganancias
                // get utilidad (ganancias - sueldos)
                int ganancias = this.drive.getCapUtility(isCartoon);
                int utilidad = ganancias - num;
                if(this.isCartoon){
                    
                }else{
               
                }                                
                
                Thread.sleep(this.dayDurationMs);
            } catch (InterruptedException ex){
                System.out.println("error");
            }
        }
    }
     public void startManagerDir(){
        this.manager.start();
        this.director.start();
    }
    
    public void updateDeadlineDurationDeTxt() {
        int[] datos = Configuracion.leerDatosIniciales();
        this.dayDurationMs = datos[0];
        this.entrega = datos[1];
        //setear daysdeadline y duration en UI
    }
    
    public int getSueldosPagados(){
        int total = 0;
        for(int i = 0; i<this.workers.length; i++){
            total += this.getWorker(i).getSueldoTotal();
        }
        total += this.getDirector().getSueldoTotal();
        total += this.getSueldoGerente();
        this.sueldoAcumu += total;
        return (total);
    }
    
    
    public void setDiasInicio(int dias){
        this.diasInit = dias;
    }
    
    public int getSueldoGerente(){
        int total = 0;
        int faltas = 0;
        
        faltas = this.director.getFaltas();
        total = (int) this.manager.getSueldoTotal();
        total = total - (faltas * 100);
        
        return total;
    }
    
    public void actualizarEmplPorDepto(){
        String parametrosEmpl;
        if(isCartoon){
            parametrosEmpl = "src//classes//configuracionCartoon.txt";
        }else{
            parametrosEmpl = "src//classes//configuracionDisney.txt";
        }
                
        this.emplxDep = this.confi.reedConfig(parametrosEmpl);//leer txt para ver cantidad de empleados por departamento
    }
    
    public void crearWorkers(){                        
        int cont = 0;
        
        for(int i = 0; i<this.emplxDep.length; i++){
            int aux = this.emplxDep[i];
            while(aux > 0){
                
                String tipo = TipoWorker.getAreaCreada(i);
                Worker worker = new Worker(tipo, this.isCartoon, manager.getDayDurationInMs(), this);
                worker.start();
                this.cantidadWorkers +=1;
                this.workers[cont] = worker;
                cont++;
                aux--;
            }

        }        
        
        while (cont < this.maxWorkerQty){
            this.workers[cont] = new Worker(TipoWorker.fail, this.isCartoon, this.dayDurationMs, this);
            cont++;
        }
    }
    
    public void reorganizarTrabajadores(){
        int cantCounter = 0;
        int workersCounter = 0;
        //int[] workersQty = new int[6];
        
        actualizarEmplPorDepto();        
        
        for (int i = 0; i < this.emplxDep.length; i++) {
           
            int cantPorDepto = this.emplxDep[i];
            for (int j = 0; j < cantPorDepto; j++) {
                
                getWorker(workersCounter).setWorkerType(TipoWorker.getAreaCreada(cantCounter));
                workersCounter += 1;
            }
                        
            cantCounter+=1;
        }
        
        while (workersCounter <= this.maxWorkerQty){
            getWorker(workersCounter).setWorkerType(TipoWorker.fail);
            workersCounter += 1;
        }
        
        //setear salario mensual
    }
    
    public void setDayDurationInMs(int dayDuration){
        this.dayDurationMs = dayDuration;
    }
    
    public void setDaysDeadline(int day){
        this.entrega = day;
    }
    
    public int maxWorkers(){
        System.out.println(maxWorkerQty);
        return maxWorkerQty;
    }
    
    public Worker getWorker(int i){
        return workers[i];
    }
    
    public int emplContratados(){
        return cantidadWorkers;
    }
    
    public int restartDeadLine(){
        this.capituloTransmitido += this.drive.totalCapitulos + this.drive.totalCapPlo;
        if(isCartoon){
            
        }else{
            
        }
        return this.entrega = diasInit;        
    }
    
    public Director getDirector(){
        return this.director;
    }
    
    public ProjectManager getGerente(){
        return this.manager;
    }
}
