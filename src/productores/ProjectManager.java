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
public class ProjectManager extends Thread{
    
    private double totalSueldo;
    private double sueldoxHora;
    
    private long TiempoComienzo;
    private int diasTranscu;
    private int horasTranscu;
    private boolean viendoOnePiece;
    private EstudioAnimacion estudio;
    private int diasTotal;
    
    public ProjectManager(EstudioAnimacion estudio,long dayDurationMs){
    
        this.TiempoComienzo = System.currentTimeMillis(); // Inicializar el tiempo de inicio
        this.diasTranscu = 0;
        this.horasTranscu = 0;
        this.viendoOnePiece = false; // Inicialmente el gerente no está viendo carreras
        this.estudio = estudio;
        this.sueldoxHora = 40;
        this.diasTotal = 0;
    }
    
    public long getDayDurationMs(){
        return estudio.dayDurationMs;
    }
    
    public double getSueldoHora(){
        return this.sueldoxHora;
    }  
    
    public void verOnePiece() {
        viendoOnePiece = true; // El Project Manager comienza a ver One Piece
        System.out.println("Manager viendo One Piece");
    }
    
    public void dejarDeVerOnePiece() {
        viendoOnePiece = false; // El Project Manager deja de ver carreras
        System.out.println("Manager Trabajando");
    }
    
    public boolean estaViendoOnePiece() {
        return viendoOnePiece;
    }

    public long getDayDurationInMs() {
        return estudio.dayDurationMs;
    }

    public int getDaysDeadline() {
        return estudio.entrega;
    }

    public void iniciarNuevoDia() {
        diasTranscu++;
        horasTranscu = 0;
        TiempoComienzo = System.currentTimeMillis();
        System.out.println("Quedan: " + getDaysDeadline() + " para la entrega de los capitulos");
    }

    public int obtenerDiasTranscurridos() {
        return diasTranscu;
    }

    public int obtenerHorasTranscurridas() {
        long tiempoTranscurrido = obtenerTiempoTranscurrido();
        horasTranscu = (int) (tiempoTranscurrido / (1000 * 60 * 60)) % 24; // Cantidad de horas transcurridas en el dia 
        return horasTranscu;
    }

    public long obtenerTiempoTranscurrido() {
        long tiempoActual = System.currentTimeMillis();
        return tiempoActual - TiempoComienzo; // Tiempo transcurrido desde el inicio
    }

    @Override
    public void run() {
        while (true) {
            this.paySueldo();
            if(estudio.entrega > 0){
                    System.out.println(estudio.entrega);

             for (int i = 0; i < 48; i++) { // Un intervalo equivale a 30 min y un dia tiene 48 intervalos

            if (i < 32) { // Las primeras 16 horas del día
                if (i % 2 == 0) { // Comienzo de una hora
                    if (!estaViendoOnePiece()) {
//                        System.out.println("Manager viendo One Piece a las " + (i / 2) + ":00");
                        verOnePiece();
                        // set viendo one piece
                        if(estudio.isCartoon){
                            //viendo one piece
                        }else{
                           //viendo one piece
                        }
                    }
                } else { // Media hora intervalos
                    if (estaViendoOnePiece()) {
//                        System.out.println("Manager deja de ver One Piece a las " + (i / 2) + ":30");
                        dejarDeVerOnePiece();
                        // set revisando el avance del proyecto
                        if(estudio.isCartoon){
                            //revisando el avance del proyecto
                        }else{
                            //revisando el avance del proyecto
                        }
                    }
                }
            } else { // El resto del día
                // set cambiando contador
                if(estudio.isCartoon){
                    //
                }else{
                    //
                }
                
                if (estaViendoOnePiece()) {
//                    System.out.println("Manager revisando el avance del proyecto a las " + (i / 2));
                    dejarDeVerOnePiece();                
                }
            }
                try {
                    Thread.sleep(estudio.dayDurationMs / 48); // Espera el intervalo de 30 minutos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
             }

            // Actualizar contador de días restantes
            estudio.entrega--;
            diasTotal++;
            //
            if(estudio.isCartoon){
                // set dias restantes UI          
                // set dias totales UI
            }else{
                // set dias restantes UI               
                // set dias totales UI
            }

            }else{
                try {
                    Thread.sleep(estudio.dayDurationMs/2);
                    estudio.restartDeadLine();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            }                    
        }

    public void paySueldo(){
        this.totalSueldo += (getSueldoHora()*24);
    }  
    
    public double getSueldoTotal(){
        return this.totalSueldo;
    }   
}
