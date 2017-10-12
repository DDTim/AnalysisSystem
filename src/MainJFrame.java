import java.io.*;
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Double> Coord_X = new ArrayList<Double>();
    ArrayList<Double> Coord_Y = new ArrayList<Double>();
    void calcAll(ArrayList<Double> Coord_Y)
    {
        Compute com = new Compute();

        textArea2.setText(textArea2.getText() + String.valueOf("Среднее: \t"    +       String.format("%2.3e",com.mean(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Ст. ошибка: \t" +       String.format("%2.3e",com.SO(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Медиана: \t"    +       String.format("%2.3e",com.med(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Мода: \t\t"     +       com.moda(Coord_Y))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Ст. откл. : \t" +       String.format("%2.3e",com.StOt(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Дисп. выб. : \t"+       String.format("%2.3e",com.disp(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Эксцесс: \t"    +       String.format("%2.3e",com.exc(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Асимм.: \t\t"   +       String.format("%2.3e",com.asim(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Интервал: \t"   +       String.format("%2.3e",com.interval(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Минимум: \t"    +       String.format("%2.3e",com.min(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Максимум: \t"   +       String.format("%2.3e", com.max(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Сумма: \t\t"    +       String.format("%2.3e",com.sum(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Счет: \t\t"     +       String.format("%2.3e",com.count(Coord_Y)))+ '\n');
        textArea2.setText(textArea2.getText() + String.valueOf("Ур.надёж.: \t"  +       String.format("%2.3e",com.CI(Coord_Y)))+ '\n');


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
                textArea1.setText(sb_out.toString());
            }

            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       calcAll(Coord_Y);
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
