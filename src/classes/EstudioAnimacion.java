/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.concurrent.Semaphore;
import productores.ProjectManager;
import productores.Worker;

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
    //public Director director;
    public int diasInit;
    public int sueldoAcumu;
    public int capituloTransmitido;

    public void restartDeadLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
