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
    
    public static String outformat(double vol){
        String volue = String.format("%.3e", vol);        
        String STS = volue.substring(0,5); // STS - start to string
        String ETS = volue.substring(6,9); // ETS - end to string
        String repSTS = STS.replace(",", ".");
        double dSTS = Double.valueOf(repSTS);
        
        switch(ETS){
            case "-12": 
                return String.format("%.3f",dSTS) + " пВ";
                
            case "-11": 
                dSTS = dSTS * 10;
                return String.format("%.3f",dSTS) + " пВ"; 
            
            case "-10":
                dSTS = dSTS / 10;
                return String.format("%.3f",dSTS) + " нВ";    
                
            case "-09": 
                return String.format("%.3f",dSTS) + " нВ";
            
            case "-08": 
                dSTS = dSTS * 10;
                return String.format("%.3f",dSTS) + " нВ";     
                
            case "-07":
                dSTS = dSTS / 10;
                return String.format("%.3f",dSTS) + " мкВ"; 
                
            case "-06": 
                return String.format("%.3f",dSTS) + " мкВ"; 
                
            case "-05": 
                dSTS = dSTS * 10;
                return String.format("%.3f",dSTS) + " мкВ"; 
                
            case "-04": 
                dSTS = dSTS / 10;
                return String.format("%.3f",dSTS) + " мВ";  
                
            case "-03": 
                return String.format("%.3f",dSTS) + " мВ";  
                
            case "-02": 
                dSTS = dSTS * 10;
                return String.format("%.3f",dSTS) + " мВ";
                
            case "-01": 
                dSTS = dSTS / 10;
                return String.format("%.3f",dSTS) + " В";
                
            case "+00": 
                return String.format("%.3f",dSTS) + " В";  
                
            case "+01": 
                dSTS = dSTS * 10;
                return String.format("%.3f",dSTS) + " В"; 
                
            case "+02": 
                dSTS = dSTS / 10;
                return String.format("%.3f",dSTS) + " кВ"; 
            
            case "+03": 
                return String.format("%.3f",dSTS) + " кВ";
                
            case "+04": 
                dSTS = dSTS * 10;
                return String.format("%.3f",dSTS) + " кВ";
                
            case "+05": 
                dSTS = dSTS / 10;
                return String.format("%.3f",dSTS) + " МВ";
            
            case "+06": 
                return String.format("%.3f",dSTS) + " МВ";
                
            default:
                return volue;    
        }
    }
    static double MulByTen(double d){
       return d * 10;
    }
}
