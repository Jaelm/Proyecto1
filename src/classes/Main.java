/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

import Interfaces.DashBoard;
import productores.ProjectManager;
import productores.Director;

/**
 *
 * @author PC
 */
public class Main {

    public static int[] valoresIniciales = Configuracion.leerDatosIniciales(); //valoresIniciales[0]:duracion dia, [1]:dias para entrega
    public static EstudioAnimacion CartoonStudio = new EstudioAnimacion("Cartoon NetWork", 13, valoresIniciales[0], valoresIniciales[1], true);
    public static EstudioAnimacion DisneyStudio = new EstudioAnimacion("Disney Channel", 13, valoresIniciales[0], valoresIniciales[1], false);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DashBoard DB = new DashBoard();
        DB.setLocationRelativeTo(null);
        DB.setVisible(true);
    }
    
}
