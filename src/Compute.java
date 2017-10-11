import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Никита on 20.08.2017.
 */
public class Compute {
    //ArrayList<Double> Amp = new ArrayList<Double>();

    public double mean(ArrayList<Double> Amp) {      //среднее
        double volue = 0;
        int c = 0;
        for (Double s : Amp) {
            volue += s;
            c++;
        }
        if (c == 0)
            return -1;
        else volue = volue / c;
        return volue;

    }

    public double med(ArrayList<Double> Amp) {       // медиана
        double vol = 0;
        Collections.sort(Amp);
        //на ноль проверкуу сделати
        if (Amp.size() % 2 == 0) {
            vol = (Amp.get(Amp.size() / 2) + Amp.get(Amp.size() / 2 - 1)) / 2;
            return vol;
        } else {
            double i = (double) Amp.size() / 2;
            vol = Amp.get((int) Math.ceil(i));
            return vol;
        }
    }

    public double SO(ArrayList<Double> Amp) {       //Стандартная ошибка (СКО выборочного среднего)
        double medX = mean(Amp);
        double sumXmdX = 0;
        double SKO;
        double vol = 0;
        for (Double s : Amp) sumXmdX += Math.pow(s - medX, 2);
        SKO = Math.sqrt(sumXmdX / Amp.size());
        vol = SKO / Math.sqrt(Amp.size());
        return vol;
    }

    public ArrayList<Double> moda(ArrayList<Double> Amp) {        //Мода
        ArrayList<Double> lst = new ArrayList<Double>();    // список мод

        // нахождение числа повторений:
        double i = 0;
        int count = 0;
        int ncount = 0;
        for (Double v : Amp) {
            for (Double s : Amp) {
                if (v == s) ncount++;
            }
            if (ncount > count) {
                lst.clear();
                lst.add(v);
                count = ncount;
            }
            if (ncount == count) {
                for (Double q : lst)
                    if (q != v)
                        lst.add(v);
            }
        }
        return lst;


    }
    public double StOt(ArrayList<Double> Amp) {       //Стандартное отклонение (исправленное выборочное СКО)
        double medX = mean(Amp);
        double disp = disp(Amp);
        double ispSKO;
        //for (Double s : Amp) disp += Math.pow(s - medX, 2);
       // disp = disp/ (Amp.size() -1);
        ispSKO = Math.sqrt((Amp.size()*disp)/(Amp.size()-1));
        return ispSKO;
    }
    public double disp(ArrayList<Double> Amp) {
        double medX = mean(Amp);
        double disp = 0;
        for (Double s : Amp) disp += Math.pow(s - medX, 2);
        disp = disp/ (Amp.size() -1);
        return disp;
    }
    public double exc(ArrayList<Double> Amp) { // Эксцесс
        double medX = mean(Amp);
        double sko4 = Math.pow(disp(Amp),2);
        double d4 = 0;
        for (Double s : Amp)  d4 += Math.pow(s - medX, 4);
        double excess = (d4/Amp.size())/sko4 -3;
        return excess;
    }
    public double asim(ArrayList<Double> Amp) { // Асимметричность
        double medX = mean(Amp);
        double sko3 = Math.pow(disp(Amp),1.5);
        double A;
        double n =0;
        for (Double s : Amp) n += Math.pow(s - medX, 3);
        n = n / Amp.size();
        A = n/ sko3;
        return  A;}
    public double min(ArrayList<Double> Amp) { // Минимум
        return Collections.min(Amp);
    }
    public double max(ArrayList<Double> Amp) { // Максимум
        return Collections.max(Amp);
    }
    public double interval(ArrayList<Double> Amp) { // Интервал
        return Collections.max(Amp) - Collections.min(Amp);
    }

    public double sum(ArrayList<Double> Amp) { // Сумма
        double summa = 0;
        for (Double i : Amp) summa += i;
        return summa;
    }
    public double count(ArrayList<Double> Amp) { // Счет
        return Amp.size();
    }
    public double CI(ArrayList<Double> Amp) { // Уровень надёжности 	C.I. (confidence interval yegorij); credible interval (Supergrooo)

        double medX = mean(Amp);
        double SKO = StOt(Amp);
        double t = 0.95;
        double sqrt_n = Math.sqrt(Amp.size());
        double si = (medX + t*(SKO/sqrt_n)) - (medX - t*(SKO/sqrt_n));
        return si;
    }

}