import java.io.*;
import javax.swing.JFileChooser;
import java.lang.*;
import java.util.ArrayList;
/*
 * @author Nikita
 */
 class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        canvas1 = new java.awt.Canvas();
        textArea1 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        jButton1.setText("Рассчитать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label2.setText("Частоты, Гц");

        label1.setText("Амплитуды, В");

        jLabel1.setText("Файл не выбран");

        jMenu1.setText("File");

        jMenuItem1.setText("Open...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(76, 76, 76)
                                                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(328, 328, 328))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                                        .addComponent(textArea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Double> Coord_X = new ArrayList<Double>();
    ArrayList<Double> Coord_Y = new ArrayList<Double>();
    void calcAll(ArrayList<Double> Coord_Y)
    {
       // textArea1.setLineWrap(true);
        //textArea1.setWrapStyleWord(true);

        Compute com = new Compute();
        System.out.println(com.mean(Coord_Y));
        System.out.println(com.SO(Coord_Y));
        System.out.println(com.med(Coord_Y));
        System.out.println(com.moda(Coord_Y));
        System.out.println(com.disp(Coord_Y));
        System.out.println(com.StOt(Coord_Y));
        System.out.println(com.exc(Coord_Y));
        System.out.println(com.asim(Coord_Y));
        System.out.println(com.min(Coord_Y));
        System.out.println(com.max(Coord_Y));
        System.out.println(com.interval(Coord_Y));
        System.out.println(com.sum(Coord_Y));
        System.out.println(com.count(Coord_Y));
        System.out.println(com.CI(Coord_Y));
        textArea2.setText(textArea2.getText() + String.valueOf("Среднее: \t"+com.mean(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Ст. ошибка: \t"+com.SO(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Медиана: \t"+com.med(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Мода: \t"+com.moda(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Ст. откл. : \t"+com.StOt(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Дисп. выб. : \t"+com.disp(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Эксцесс: \t"+com.exc(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Асимм.: \t"+com.asim(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Интервал: \t"+ com.interval(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Минимум: \t"+com.min(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Максимум: \t"+com.max(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Сумма: \t"+com.sum(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Счет: \t"+com.count(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Ур.надёж.: \t"+com.CI(Coord_Y))+ '\n');


    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        calcAll(Coord_Y);
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        String[][] Coord_Str;
       // String str [] = new String[] ;
        ArrayList<String> Coord_List = new ArrayList<String>();
        //ArrayList<Double> Coord_X = new ArrayList<Double>();
       //ArrayList<Double> Coord_Y = new ArrayList<Double>();
        //RegPointTNO reg = new RegPointTNO();
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            try(FileReader reader = new FileReader(file))
            {
                char[] buffer = new char[(int)file.length()];// считаем файл полностью
                reader.read(buffer);

                String TextTNO = new String(buffer);         // делаем текст строкой

                int index = TextTNO.indexOf("Waveform Values");     // получаем индекс нужной строки

                for(int i = 0;i<5;i++){
                    index = TextTNO.indexOf("\r\n", index+1);  //  поиск начала нужных данных(пропуск пяти строк)
                }

                String pointsTNO = TextTNO.substring(index, TextTNO.length());// K
                textArea1.setText(pointsTNO);

                for (String retval : pointsTNO.split("\r\n")) {
                                                         // заполнение листа строками координат
                    Coord_List.add(retval.trim());
                }

                //теперь можно заполнять массив х и у координатами отдельно
                String[] arr = Coord_List.toArray(new String[Coord_List.size()]);
                Coord_List.clear();

                /*for(String s: arr)
                for (String retval : s.split("   "))   // заполнение листа  координатами
                    Coord_List.add(retval);*/
                for(String s: arr) {
                    //textArea1.setText(textArea1.getText()+ s + '\n');
                    for (String retval : s.split("\\s+"))   // заполнение листа  координатами
                        Coord_List.add(retval);
                }

                for(int i = 1; i< Coord_List.size()-1; i = i+2){

                    Coord_X.add(Double.valueOf(Coord_List.get(i)));
                   // System.out.println(Coord_X.get(i));
                    Coord_Y.add(Double.valueOf(Coord_List.get(i+1)));
                }

                for (Double s: Coord_Y) {
                    System.out.println(s);
                }


               // jTextField1.setText(Coord_List.get(1));
               // Coord_Str = new String[Coord_List.size()][2];
                //str = Coord_List.toArray();
               // for (String retval : Coord_List.split("   ")) {  // заполнение листа строками координат
                //    Coord_Str[].add(retval);
                //}


            }

            catch(IOException ex){
                System.out.println(ex.getMessage());
            }

            //jTextField1.setText( Coord_Str.toString());

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed



    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */

/*        JFrame frame2 = new JFrame("Syanfros");
        frame2.setContentPane(new Syanfros().panelMain);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setVisible(true);*/

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>




        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Variables declaration - do not modify
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration


    // End of variables declaration//GEN-END:variables
}import java.io.*;
import javax.swing.JFileChooser;
import java.util.regex.*;
import java.lang.*;
import java.util.ArrayList;
/*
 * @author Nikita
 */
public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        canvas1 = new java.awt.Canvas();
        textArea1 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        jButton1.setText("Рассчитать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label2.setText("Частоты, Гц");

        label1.setText("Амплитуды, В");

        jLabel1.setText("Файл не выбран");

        jMenu1.setText("File");

        jMenuItem1.setText("Open...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(textArea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        String[][] Coord_Str;
        //String str [] = new String[] ;
        ArrayList<String> Coord_List = new ArrayList<String>();
        
         
        RegPointTNO reg = new RegPointTNO();
        JFileChooser fileopen = new JFileChooser(); 
        int ret = fileopen.showDialog(null, "Открыть файл");  
            if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile(); 
                try(FileReader reader = new FileReader(file))
                    {
                    char[] buffer = new char[(int)file.length()];// считаем файл полностью
                    reader.read(buffer);
                    
                    String TextTNO = new String(buffer);         // делаем текст строкой

                    int index = TextTNO.indexOf("Waveform Values");     // получаем индекс нужной строки

                    for(int i = 0;i<5;i++){
                        index = TextTNO.indexOf("\r\n", index+1);  //  поиск начала нужных данных(пропуск пяти строк)
                        }
                    String pointsTNO = TextTNO.substring(index, TextTNO.length());// K
                    

                    for (String retval : pointsTNO.split("\r\n")) {  // заполнение листа строками координат
                        Coord_List.add(retval);
                        }
                    
                    //теперь можно заполнять массив х и у координатами отдельно
                    Coord_Str = new String[Coord_List.size()][2];
                
                    }
                    
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
               
            //jTextField1.setText("OK");
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
