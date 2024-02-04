/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productores;

import classes.EstudioAnimacion;
import classes.Main;
import java.util.Random;

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
    
    public void paySueldo(){
        this.TotalSueldo += (getSueldoHora()*24);
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
    
    private double calcularGananciasCapTransmitidos(int totalCap, int totalCapPlo, int precioCap, int preciCapPlo) {
    // Ejemplo de cálculo de ganancias:
    double ganancias = totalCap * precioCap + totalCapPlo * preciCapPlo;
    return ganancias;
    }
    
     @Override
    public void run() {
        Random random = new Random(); // Generador de números aleatorios
        while (true) {
            //System.out.println(Main.gerente.getDaysDeadline());
            if (estudio.entrega == 0) {
                int sueldosPagados = calcularSalariosMensuales(isCartoon);
                int capEntregadosCartoon = Main.CartoonStudio.drive.getTotalCap() + Main.CartoonStudio.drive.getTotalCapPlo();
                int capEntregadosDisney = Main.DisneyStudio.drive.getTotalCap() + Main.DisneyStudio.drive.getTotalCapPlo();
                double gananciaBrutaCartoon = calcularGananciasCapTransmitidos(Main.CartoonStudio.drive.getTotalCap(), Main.CartoonStudio.drive.getTotalCapPlo(), 300000, 650000);
                double gananciaBrutaDisney = calcularGananciasCapTransmitidos(Main.DisneyStudio.drive.getTotalCap(), Main.DisneyStudio.drive.getTotalCapPlo(), 250000, 600000);
                System.out.println("Capitulos transmitidos de Cartoon NetWork" + capEntregadosCartoon);
                System.out.println("Ganancia bruta del estudio Cartoon NetWork : " + gananciaBrutaCartoon + "$");
                System.out.println("carros transmitidos de Disney Channel" + capEntregadosDisney);
                System.out.println("Ganancia bruta del estudio Disney Channel: " + gananciaBrutaDisney + "$");

                // Enviar capitulos a transmitir
                System.out.println("Enviando capitulos a transmision...");
                // Simulamos el tiempo que toma enviar los capitulos
                try {
                    Thread.sleep(estudio.dayDurationMs); // 24 horas
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                // Realizar tareas administrativas
                // Verificar lo que está haciendo el manager
                try {
                int randomHour = random.nextInt(24); // Generar una hora aleatoria del día
                int randomMin = random.nextInt(60);
                for (int i = 0; i < 24; i++) { // Simulando cada hora del día
                    if (i == randomHour) {
                        for(int j=0; j<60;j++){
                            if(j==randomMin){
                                //cambio a "supervisando"
                                if(isCartoon){
                                 
                                }else{
                                
                                }                                
                                verificarActividadManager();
                            }
                            Thread.sleep(estudio.dayDurationMs / (24*60));
                        }
                    }
                    //
                    Thread.sleep(estudio.dayDurationMs / 24); // Espera una hora en tiempo de simulación
                }
                        } catch(InterruptedException e){
                            e.printStackTrace();
                        }
            }
        }
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
    
    public void verificarActividadManager() throws InterruptedException {
        System.out.println("Director supervisando al Project Manager");

        if (estudio.manager.estaViendoOnePiece()) {
            // El gerente está viendo carreras
            System.out.println("Falta al manager por ver One Piece. Se descontarán $100 de su sueldo.");
            faltas++;
            
            if(isCartoon){
                
                int sal = this.calcSalarioRestado(faltas);
                
            }else{
                
                int sal = this.calcSalarioRestado(faltas);
                
            }
//            
        } else {
            // El gerente está trabajando
            System.out.println("El Project Manager está trabajando.");
        }
        Thread.sleep(estudio.dayDurationMs / 57);//sleep 25 minutos
        //cambio a trabajando
        if(isCartoon){
            
        }else{
            
        }
    }

    
    
}
