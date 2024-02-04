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
    
    public void updateDrive (String TipoWorker, int PartFinish, boolean isCartoon){
        switch(TipoWorker){
            case "guion":
                if(this.guionQty < this.maxGuionQty){
                    this.guionQty += PartFinish;
                    if(this.guionQty > this.maxGuionQty){
                        this.guionQty = this.maxGuionQty;
                    }
                    
                    System.out.println("Guion producido: " + this.guionQty);
                }
                break;
            case "escenario":
                if(this.escenarioQty < this.maxEscenarioQty){
                    this.escenarioQty += PartFinish;
                    if(this.escenarioQty > this.maxEscenarioQty){
                        this.escenarioQty = this.maxEscenarioQty;
                }
                    
                    System.out.println("Escenario producido: " + this.escenarioQty);
                } 
                break;
            case "animacion":
                if(this.animacionQty < this.maxAnimacionQty){
                    this.animacionQty += PartFinish;
                    if(this.animacionQty > this.maxAnimacionQty){
                        this.animacionQty = this.maxAnimacionQty;
                }
                    
                    System.out.println("Escenario producido: " + this.animacionQty);
                } 
                break;
            case "actor":
                if(this.doblajeQty < this.maxDoblajeQty){
                    this.doblajeQty += PartFinish;
                    if(this.doblajeQty > this.maxDoblajeQty){
                        this.doblajeQty = this.maxDoblajeQty;
                }
                    
                    System.out.println("Escenario producido: " + this.doblajeQty);
                } 
                break;
            case "plotwist":
                if(this.plotwistQty < this.maxPlotwistQty){
                    this.plotwistQty += PartFinish;
                    if(this.plotwistQty > this.maxPlotwistQty){
                        this.plotwistQty = this.maxPlotwistQty;
                }
                    
                    System.out.println("Escenario producido: " + this.plotwistQty);
                } 
                break;
        }
    }
    
    public boolean tomarPart(boolean isCartoon){
        if(isCartoon){
            //revisa la cantidad de capitulos creados para ver si añade un Plotwist
            if(this.contCapPlo == 3){
                //revisa si hay cantidad de areas disponible para crear un capitulo
                if(this.existeStock(isCartoon) && this.existeStockPlo(isCartoon)){
                    this.restarDrive(isCartoon, true);
                    this.contCapPlo = 0;
                    this.totalCapPlo += 1;
                    System.out.println("Creo un capitulo con Plotwist");
                    int dinero = this.getCapUtility(isCartoon);
                    return true;
                }
                return false;
            } else {
                if(this.existeStock(isCartoon)){
                    this.restarDrive(isCartoon, false);
                    this.contCapPlo += 1;
                    this.totalCapitulos += 1;
                    System.out.println("Creo un capitulo");
                    return true;
                }
                return false;
            }
            
        } else {
            if(this.contCapPlo == 2){
                //revisa si hay cantidad de areas disponible para crear un capitulo
                if(this.existeStock(isCartoon) && this.existeStockPlo(isCartoon)){
                    this.restarDrive(isCartoon, true);
                    this.contCapPlo = 0;
                    this.totalCapPlo += 1;
                    System.out.println("Creo un capitulo con Plotwist");
                    int dinero = this.getCapUtility(isCartoon);
                    return true;
                }
                return false;
            } else {
                if(this.existeStock(isCartoon)){
                    this.restarDrive(isCartoon, false);
                    this.contCapPlo += 1;
                    this.totalCapitulos += 1;
                    System.out.println("Creo un capitulo");
                    return true;
                }
                return false;
        }
        
    }
}
    
    public boolean existeStock (boolean isCartoon){
        if(isCartoon){
            return(this.guionQty >= 1 && this.escenarioQty >= 2 && this.animacionQty >= 6 && this.doblajeQty >= 5);
        }
        return(this.guionQty >= 1 && this.escenarioQty >= 1 && this.animacionQty >= 2 && this.doblajeQty >= 4);
    }
    
    public boolean existeStockPlo (boolean isCartoon){
        if(isCartoon){
            return this.plotwistQty >= 1;
        }
        return this.plotwistQty >= 3;
    }
    
    public void restarDrive (boolean isCartoon, boolean conPlow){
        if(isCartoon){
            this.guionQty -= 1;
            this.escenarioQty -= 2;
            this.animacionQty -= 6;
            this.doblajeQty -= 5;
            if(conPlow){
                this.plotwistQty -= 1;
            }
        } else {
            this.guionQty -= 1;
            this.escenarioQty -= 1;
            this.animacionQty -= 2;
            this.doblajeQty -= 4;
            if(conPlow){
                this.plotwistQty -= 3;
        
            }
        }
    }
    
    public int getCapUtility (boolean isCartoon){
        int total = 0;
        if(isCartoon){
            total = (this.totalCapitulos * 30000) + (this.totalCapPlo * 650000);
        } else {
            total = (this.totalCapitulos * 25000) + (this.totalCapPlo * 600000);
        }
        return total;
    }
}
