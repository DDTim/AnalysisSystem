import java.util.regex.*;    
   
public class RegPointTNO{  
   
    private Pattern pattern;                               //К ?
    private Matcher matcher;  
   
    private static final String PATTERN = "()";  
   
    public RegPointTNO(){  
        pattern = Pattern.compile(PATTERN,Pattern.MULTILINE);  
    }  
   
    boolean validate(String text){
        //System.out.println(text+"asdasdasd");                                        //К
        matcher = pattern.matcher(text);
        return matcher.matches();
     
    } 
    //public static boolean valid(char[] buffer){
    //    String s = new String(buffer);
    //    return validate(s);    
    // } 
} 