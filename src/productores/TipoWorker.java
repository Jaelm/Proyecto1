/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productores;

public class TipoWorker {
    static public String guion = "guion";
    static public String escenario = "escenario";
    static public String animador = "animador";
    static public String actor = "actor";
    static public String plotwist = "plotwist";
    static public String ensamblador = "ensamblador";
    static public String fail = "none";
    
    public static String getTipoWorker(int i) {
        switch(i){
            case 0:
                return "Guion";
            case 1:
                return "Escenario";
            case 2:
                return "Animador";
            case 3:
                return "Actor";
            case 4:
                return "Plotwist";
            case 5:
                return "Ensamblador";
            default:
                return "None";
        }
    }
    
    public static int getIndexTipoWorker (String tipo){
        switch(tipo){
            case "guion":
                return 0;
            case "escenario":
                return 1;
            case "animador":
                return 2;
            case "actor":
                return 3;
            case "plotwist":
                return 4;
            case "ensamblador":
                return 5;
            default:
                return 0;
        }
    }
    
    public static String getAreaCreada(int i){
        switch (i){
            case 0:
                return TipoWorker.guion;
            case 1:
                return TipoWorker.escenario;
            case 2:
                return TipoWorker.animador;
            case 3:
                return TipoWorker.actor;
            case 4:
                return TipoWorker.plotwist;
            case 5:
                return TipoWorker.ensamblador;
            default:
                return TipoWorker.fail;
        }
    }
    
    
}

    