
import java.util.ArrayList;

/**
 *
 * @author Никита
 */
public class SaveVariable {
    
        public  ArrayList<Double> amp;
        public  ArrayList<Double> freq;
        int     Com_prist;
        int     Spin_voluedel;
        
       
        
        void freqSifting() {  // функция оставляющая только нужные частоты     
        double  delitel = getdel();
        double r;
        for(int i = 0; i < freq.size(); i++){
            r = freq.get(i)%delitel;
            if(freq.get(i)%delitel < - 0.1 || freq.get(i)%delitel > 0.1){
                freq.remove(i);
                amp.remove(i);
                i--;
            }
        }
    }
        double getdel()
        {
            double res;
            switch(Com_prist){ 
            case 0:                 // ГГц
                res = Spin_voluedel * 1000000000.0;
                return res;
            
            case 1:                 // МГц
                res = Spin_voluedel * 1000000.0;
                return res;
                
            case 2:                 // КГц
                res = Spin_voluedel * 1000.0;
                return res;
                
            default:
                return 1.0;  
            }
        }
    
}
