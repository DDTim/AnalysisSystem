import java.io.*;
import javax.swing.JFileChooser;
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
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
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
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        jLabel1.getAccessibleContext().setAccessibleName("jLabel1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Double> Coord_X = new ArrayList<Double>();
    ArrayList<Double> Coord_Y = new ArrayList<Double>();
    void calcAll(ArrayList<Double> Coord_Y)
    {
       // Compute com = new Compute();
        textArea2.setText("");    
        textArea2.setText(textArea2.getText() + String.valueOf("Среднее: \t"    +       FormatOut.outformat(Compute.mean(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("СКО: \t\t"      +       FormatOut.outformat(Compute.SO(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Медиана: \t"    +       FormatOut.outformat(Compute.med(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Мода: \t\t"     +       FormatOut.outformat(Compute.moda(Coord_Y))+ '\n'));
        textArea2.setText(textArea2.getText() + String.valueOf("Ст. откл. : \t" +       FormatOut.outformat(Compute.StOt(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Дисп. выб. : \t"+       FormatOut.outformat(Compute.disp(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Эксцесс: \t"    +       FormatOut.outformat(Compute.exc(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Асимм.: \t\t"   +       String.format("%.3f",Compute.asim(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Интервал: \t"   +       FormatOut.outformat(Compute.interval(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Минимум: \t"    +       FormatOut.outformat(Compute.min(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Максимум: \t"   +       FormatOut.outformat(Compute.max(Coord_Y))+ '\n'));
        textArea2.setText(textArea2.getText() + String.valueOf("Сумма: \t\t"    +       FormatOut.outformat(Compute.sum(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Счет: \t\t"     +       String.valueOf(Compute.count(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Ур.надёж.: \t"  +       FormatOut.outformat(Compute.CI(Coord_Y)))+ '\n');   
    }

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
                    sb_out.append(Coord_List.get(i));
                    sb_out.append("\t");
                    Coord_X.add(Double.valueOf(Coord_List.get(i)));
                    Coord_Y.add(Double.valueOf(Coord_List.get(i+1)));
                     sb_out.append(Coord_List.get(i+1));
                     sb_out.append("\n");
                    
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
        textArea2.setText("");
        calcAll(Coord_Y);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSpinner jSpinner1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
