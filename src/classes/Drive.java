/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author PC
 */
public class Drive {
    public int guionQty;
    public int escenarioQty;
    public int animacionQty;
    public int doblajeQty;
    public int plotwistQty;
    
    public int maxGuionQty;
    public int maxEscenarioQty;
    public int maxAnimacionQty;
    public int maxDoblajeQty;
    public int maxPlotwistQty;
    
    public int totalCapitulos;
    public int contCapPlo;
    public int totalCapPlo;
    
    public Drive(int maxGuion, int maxEscenario, int maxAnimacion, int maxDoblaje, int maxPlotwist){
        this.maxGuionQty = maxGuion;
        this.maxEscenarioQty = maxEscenario;
        this.maxAnimacionQty = maxAnimacion;
        this.maxDoblajeQty = maxDoblaje;
        this.maxPlotwistQty = maxPlotwist;
        
        this.guionQty = 0;
        this.escenarioQty = 0;
        this.animacionQty = 0;
        this.doblajeQty = 0;
        this.plotwistQty = 0;
        this.totalCapitulos = 0;
        this.contCapPlo = 0;
        this.totalCapPlo = 0;
    }
    
    public int getTotalCap(){
        return totalCapitulos;
    }
    
    public int getTotalCapPlo(){
        return totalCapPlo;
    }
}
