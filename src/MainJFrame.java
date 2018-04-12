import java.io.*;
import javax.swing.JFileChooser;
import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * @author Nikita
 */
public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();

        //this.setComponentZOrder(jComboBox1, 1);
        //this.setComponentZOrder(jComboBox2, 1);
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
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSpinner2 = new javax.swing.JSpinner();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "пс", "нс", "мкс", "мс", "с" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("частота гармоники");
        jCheckBox1.setActionCommand("указать частоту гармоники");

        jSpinner2.setToolTipText("");
        jSpinner2.setValue(1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ГГц", "МГц", "КГц" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.setRequestFocusEnabled(false);
        jComboBox2.setVerifyInputWhenFocusTarget(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton2.setText("График");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(jSpinner2)))
                                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, 1, Short.MAX_VALUE))
                                .addGap(1, 1, 1)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("jLabel1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // чтение данных(если существуют)
    
   //if(списки данных существуют?)
//    {
//     (открываем списки данных)
//    }
//    else
//    {
        ArrayList<Double> meanList = new ArrayList<Double>();
        ArrayList<Double> SOList = new ArrayList<Double>();
        ArrayList<Double> medList = new ArrayList<Double>();
        ArrayList<Double> modaList = new ArrayList<Double>();
        ArrayList<Double> StOtList = new ArrayList<Double>();
        ArrayList<Double> dispList = new ArrayList<Double>();
        ArrayList<Double> excList = new ArrayList<Double>();
        ArrayList<Double> asimList = new ArrayList<Double>();
        ArrayList<Double> intervalList = new ArrayList<Double>();
        ArrayList<Double> minList = new ArrayList<Double>();
        ArrayList<Double> sumList = new ArrayList<Double>();
        ArrayList<Double> maxList = new ArrayList<Double>();
        ArrayList<Double> countList = new ArrayList<Double>();
        ArrayList<Double> CIList = new ArrayList<Double>();
        
//    }
    
    
    ArrayList<Double> Coord_X = new ArrayList<Double>();
    ArrayList<Double> Coord_Y = new ArrayList<Double>();
    void calcAll(ArrayList<Double> Coord_Y)
    {          
        
       /// сдесь заполняем эти листы данными
        double mean = Compute.mean(Coord_Y);
        double SO = Compute.SO(Coord_Y);
        double med = Compute.med(Coord_Y);
        //double moda = Compute.moda(Coord_Y); -- исправить!
        double StOt = Compute.StOt(Coord_Y);
        double disp = Compute.disp(Coord_Y);
        double exc = Compute.exc(Coord_Y);
        double asim = Compute.asim(Coord_Y);
        double interval = Compute.interval(Coord_Y);
        double min = Compute.min(Coord_Y);
        double max = Compute.max(Coord_Y);
        double sum = Compute.sum(Coord_Y);
        double count = Compute.count(Coord_Y);
        double CI = Compute.CI(Coord_Y);
        
       // Compute com = new Compute();
        textArea2.setText("");    
        textArea2.setText(textArea2.getText() + String.valueOf("Среднее: \t"    +       FormatOut.outformat(mean))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("СКО: \t\t"      +       FormatOut.outformat(SO))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Медиана: \t"    +       FormatOut.outformat(med))+ '\n');
        
        textArea2.setText(textArea2.getText() + String.valueOf("Мода: \t\t"));
        for (Double d : Compute.moda(Coord_Y))textArea2.setText(textArea2.getText() + FormatOut.outformat(d)+ '\n');
          
        textArea2.setText(textArea2.getText() + String.valueOf("Ст. откл. : \t" +       FormatOut.outformat(StOt))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Дисп. выб. : \t"+       FormatOut.outformat(disp))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Эксцесс: \t"    +       FormatOut.outformat(exc))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Асимм.: \t\t"   +       String.format("%.3f",asim))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Интервал: \t"   +       FormatOut.outformat(interval))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Минимум: \t"    +       FormatOut.outformat(min))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Максимум: \t"   +       FormatOut.outformat(max)+ '\n'));
        textArea2.setText(textArea2.getText() + String.valueOf("Сумма: \t\t"    +       FormatOut.outformat(sum))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Счет: \t\t"     +       String.valueOf(count))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Ур.надёж.: \t"  +       FormatOut.outformat(CI))+ '\n');   
    }

    
    //  Функция получения полезных данных
    ///
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       String[][] Coord_Str;
       StringBuilder sb = new StringBuilder();
        ArrayList<String> Coord_List = new ArrayList<String>();
        ArrayList<String> Coord_List_s = new ArrayList<String>();
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            try(FileReader reader = new FileReader(file))
            {
                char[] buffer = new char[(int)file.length()];// считаем файл полностью
                reader.read(buffer);
                sb.insert(sb.length(), buffer); // tes                   
                int s_index = sb.indexOf("Waveform Values");     // получаем индекс нужной строки tes

                for(int i = 0;i<5;i++){
                    s_index = sb.indexOf("\r\n", s_index+1);  //  поиск начала нужных данных(пропуск пяти строк) tes
                }
               
                StringBuilder sbp = new StringBuilder();  
                sbp.append(sb.substring(s_index, sb.length())); 

                for (String retval : sbp.toString().split("\r\n")) {                                
                                                         // заполнение листа строками координат
                    Coord_List_s.add(retval.trim());
                }
    
                //теперь можно заполнять list х и у координатами отдельно
                for(String s: Coord_List_s) {          
                    for (String retval : s.split("\\s+"))   // заполнение листа  координатами
                        Coord_List.add(retval);
                }
      
                StringBuilder sb_out = new StringBuilder();
                for(int i = 1; i< Coord_List.size()-1; i = i+2){          
                 //   sb_out.append(Coord_List.get(i));
                //    sb_out.append("\t\t");
                    Coord_X.add(Double.valueOf(Coord_List.get(i)));
                    Coord_Y.add(Double.valueOf(Coord_List.get(i+1)));
           //          sb_out.append(Coord_List.get(i+1));
                //     sb_out.append("\n");      
                } 
                

                for(int i = 0; i< Coord_X.size(); i++){ 
                    sb_out.append(Coord_X.get(i));
                    sb_out.append("\t\t");
                    sb_out.append(Coord_Y.get(i));
                    sb_out.append('\n');
                    }
     
                if(Coord_X.isEmpty() || Coord_Y.isEmpty()){
                    jLabel1.setText("Файл не корректен");
                }
                else{
                jLabel1.setText("Введите длинну фронта:");    
                textArea1.setText(sb_out.toString());
                }
            }

            catch(Exception e){
                jLabel1.setText("Файл не корректен");
                //System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(Coord_Y.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error message", 
                                              "Ошибка чтения файла!",
                                              JOptionPane.ERROR_MESSAGE);
        }
        else{ 
        if(jCheckBox1.isSelected()){
            
            FreqSelect FS = new FreqSelect();
            FS.amp = Coord_Y;
            FS.freq = Coord_X;
            FS.Com_prist = jComboBox2.getSelectedIndex();
            FS.Spin_voluedel = (int)jSpinner2.getModel().getValue();
            FS.freqSifting();
            Coord_Y = FS.amp;
            Coord_X = FS.freq;
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i< Coord_X.size(); i++){ 
                sb.append(Coord_X.get(i));
                sb.append("\t\t");
                sb.append(Coord_Y.get(i));
                sb.append('\n');
            }
            textArea1.setText(sb.toString());
            
        }
        textArea2.setText("");
        
        calcAll(Coord_Y);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    

    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        AFC_Form myform =  new AFC_Form();
        //myform.setSize(300,200);

        
        //myform.getContentPane().removeAll();
        myform.setVisible(true);          
        
// Кнопка 2 график
       // myform.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
