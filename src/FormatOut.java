/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Никита
 */
public class FormatOut {
    
    public static String outformat(String volue){

        String STS = volue.substring(0,5); // STS - start to string
        String ETS = volue.substring(6,9); // ETS - end to string
        switch(ETS){
             
            case "-02": 
                String repSTS = STS.replace(",", ".");
                double dSTS = Double.valueOf(repSTS);
                dSTS = dSTS * 10;
                return dSTS + " мВ";
                // break;
            case "N": 
                System.out.println("Вы нажали букву N");
                break;
            default:
                System.out.println("Вы нажали неизвестную букву");    
        
        
            return volue; 
        }
    return volue; 
    }
}
