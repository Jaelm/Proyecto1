/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productores;

import classes.EstudioAnimacion;
import classes.Main;

/**
 *
 * @author PC
 */
public class Director extends Thread {
    private double TotalSueldo;
    private double sueldoxHora;
    private int faltas;
    private boolean isCartoon;
    private EstudioAnimacion estudio;
    
    public Director(EstudioAnimacion estudio, boolean isCartoon){
        this.estudio = estudio;
        this.faltas = 0;
        this.isCartoon = isCartoon;
        this.sueldoxHora = 60;
        this.TotalSueldo = 0;
    }
    
    public int getFaltas() {
        return faltas;
    }
    
    public double getSueldoHora(){
        return this.sueldoxHora;
    }
    
    public double getSueldoTotal(){
        return this.TotalSueldo;
    }
    
    public int calcularSaldoFinalManager() {
        int descuentoPorFalta = 100; // Monto de descuento por cada falta
        int sueldoManager = 28800; //Mensual
        int saldoFinalManager = sueldoManager - (faltas * descuentoPorFalta);
        return saldoFinalManager;
    }
    
        public int calcSalarioRestado(int faltas){
        int totalRestado = faltas * 100;
        return totalRestado;
    }
    
    public int calcularSalariosMensuales(boolean isLambo){

        int total = 0;
        if(isCartoon){
                for(int i = 0; i< Main.CartoonStudio.emplContratados(); i++){
                    total += Main.CartoonStudio.getWorker(i).getSueldoTotal();
                }
                System.out.println(total);
                return total;
            }else{
                for(int i = 0; i<Main.DisneyStudio.emplContratados();i++){
                    total += Main.DisneyStudio.getWorker(i).getSueldoTotal();
                    
                    }
            return total;
            }
        }
    
}
