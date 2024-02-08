/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard;

import classes.Main;
import classes.EstudioAnimacion;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import productores.TipoWorker;

public class Functions {
    
    public static int validarCantEmpl(EstudioAnimacion plant, String tipo, int valor){
        int[] auxCantEmpl = plant.emplxDep;
        auxCantEmpl[TipoWorker.getIndexTipoWorker(tipo)] = valor; // pongo valor en el array de cantEmplAux para ver si es valido
        int newValor = valor;
        int count = calcWorkersQty(auxCantEmpl);
        
        if(count <= plant.maxWorkerQty){
            //actualizo plant.configuracion del valor (chasis, carroceria, etc)
            plant.confi.setParametro(tipo, newValor);
            //guardo en el txt los nuevos valores, lambo o no
            if(plant.isCartoon){
                plant.confi.actualizarConfiguracion("src//classes//configuracionLambo.txt");
            }else {
                plant.confi.actualizarConfiguracion("src//classes//configuracionRolls.txt");
            }
            //leo txt para actualizar empleados por depto
            plant.actualizarEmplPorDepto();
            
            return newValor;
        } else {
            //retorno el valor original
            return (newValor - 1);
        }
      
    }
    
    public static int calcWorkersQty(int[] cantEmpl) {
        int aux = 0;
        for(int i = 0; i< cantEmpl.length; i++){
            aux += cantEmpl[i];
        }
        return aux;
    }
    
    public static void saveDatosIniciales(int durationDayMs, int deadline){
        
        String path = "src//classes//deadlineAndDuration.txt";
        String datosIniciales = (String.valueOf(durationDayMs)+","+String.valueOf(deadline));
        
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.print(datosIniciales);
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la información");
        }
        
        
        //OJITO AQUI REVISAR SI NO ESTA AL REVEZ
        Main.CartoonStudio.setDaysDeadline(deadline);
        Main.CartoonStudio.setDayDurationInMs(durationDayMs);
        Main.CartoonStudio.setDiasInicio(deadline);
        
        Main.DisneyStudio.setDaysDeadline(deadline);
        Main.DisneyStudio.setDayDurationInMs(durationDayMs);
        Main.DisneyStudio.setDiasInicio(deadline);
    }
    
}
