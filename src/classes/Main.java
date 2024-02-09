/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import productores.*;

public class Main {
    

    public static int[] valoresIniciales = Configuracion.leerDatosIniciales(); //valoresIniciales[0]:duracion dia, [1]:dias para entrega
    public static EstudioAnimacion CartoonStudio = new EstudioAnimacion("Cartoon NetWork", 13, valoresIniciales[0], valoresIniciales[1], true);
    public static EstudioAnimacion DisneyStudio = new EstudioAnimacion("Disney Channel", 13, valoresIniciales[0], valoresIniciales[1], false);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //Aqui tambien pilas que no este al revez
        dashboard.GlobalUI.getMainUI().getCNdashboard1().setCartoonNetwork(CartoonStudio);
        dashboard.GlobalUI.getMainUI().getDNDashboard1().setDisneyChannel(DisneyStudio);
        dashboard.GlobalUI.openMainPage();
    }
    
}
