/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author orginal
 */
public class test extends javax.swing.JFrame {
    ArrayList<String> arr = new ArrayList<>();
     private final String Arrive = "Arive.txt";
     private final String Burst = "Burst.txt";
     private final String Priority = "Priority.txt";
     private final String no_of_prob = "NumberOfProb.txt";

    /**
     * Creates new form test
     */
    public test() {
        initComponents();
        /*sim_jButton.addActionListener(new ActionListener(){
            public void ActionPerformed(ActionEvent e) throws IOException{
                try{
                    File file = new File("C:\\Users\\orginal\\Desktop");
                    if(!file.exists()){
                        file.createNewFile();
                    }
                
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                for(int i=0;i<jTable1.getColumnCount();i++)
                {
                    for(int j=0;j<jTable1.getRowCount();j++){
                        bw.write((String)jTable1.getModel().getValueAt(i, j)+"@");
                    }
                }
                bw.close();
                fw.close();
                //JOptionpane.showMassageDialog(null, "Data Exported");
                }
                
            
                catch(Exception ex){
                ex.printStackTrace();
                }
                }

           /* @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
*/
        
        
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add_jButton1 = new javax.swing.JButton();
        enter_jLabel1 = new javax.swing.JLabel();
        no_jTextField = new javax.swing.JTextField();
        reset_jButton = new javax.swing.JButton();
        sim_jButton = new javax.swing.JButton();
        load5_jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        sorry_j = new javax.swing.JLabel();
        sorry_j2 = new javax.swing.JLabel();
        load15jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel2.setText("jLabel2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Priority(Pre_emptive)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(530, 450));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Of Problem", "Arive Time", "Burst Time", "Priority"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        add_jButton1.setText("Add");
        add_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_jButton1ActionPerformed(evt);
            }
        });

        enter_jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        enter_jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enter_jLabel1.setText("Enter No. Of Processes");

        no_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_jTextFieldActionPerformed(evt);
            }
        });

        reset_jButton.setText("Reset");
        reset_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_jButtonActionPerformed(evt);
            }
        });

        sim_jButton.setText("Show Result");
        sim_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sim_jButtonActionPerformed(evt);
            }
        });

        load5_jButton2.setText("5 Processes");
        load5_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load5_jButton2ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Priority(non-Preemptive)" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        sorry_j.setBackground(new java.awt.Color(255, 255, 255));
        sorry_j.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sorry_j.setForeground(new java.awt.Color(255, 0, 0));
        sorry_j.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sorry_j.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        sorry_j2.setBackground(new java.awt.Color(255, 255, 255));
        sorry_j2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sorry_j2.setForeground(new java.awt.Color(255, 0, 0));
        sorry_j2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        sorry_j2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        load15jButton1.setText("15 Processes");
        load15jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load15jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Load Default Processes");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sorry_j, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sorry_j2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sim_jButton)
                        .addGap(56, 56, 56)
                        .addComponent(reset_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enter_jLabel1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(load5_jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(load15jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(no_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(add_jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enter_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(load5_jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load15jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sim_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sorry_j, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorry_j2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /* public void numofprob()
    {
        DefaultTableModel mode = (DefaultTableModel) jTable1.getModel();
        //numofproblems x = new numofproblems();
       int x =Integer.parseInt(no_jTextField.getText());
       for(int i=0;i<x;i++){
          mode.addRow(new Object[]{});
    }}*/

    public boolean write(String Query, String FilePath,boolean appendType) {

        PrintWriter writter = null;
        try {

            writter = new PrintWriter((new FileWriter(new File(FilePath),appendType)));
            writter.println(Query);
            return true;
        } catch (IOException ex) {
            System.out.println(ex);
            
        } finally {
            writter.close();
        }
        return false;
    }
    private void no_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_jTextFieldActionPerformed
        // TODO add your handling code here:
           // view job number in white on the label
        //setHorizontalAlignment(CENTER);  // view job number in the center of the label
    }//GEN-LAST:event_no_jTextFieldActionPerformed

    private void add_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_jButton1ActionPerformed
        //numofprob();
       // TODO add your handling code here:
        DefaultTableModel mode = (DefaultTableModel) jTable1.getModel();
       //int x =Integer.parseInt(no_jTextField.getText());
       if(no_jTextField.getText().isEmpty()){
           enter_jLabel1.setForeground(Color.red);
               enter_jLabel1.setText("Sorry, white box(no. of processes) is empty!");
       }
       else{if(Integer.parseInt(no_jTextField.getText())>0){
           //jTable1.setModel(new DefaultTableModel(null,new String[]{"No.Of Problem","Arive Time","Burst Time","Priority"}));
           for(int i=0;i<Integer.parseInt(no_jTextField.getText());i++){
               mode.addRow(new Object[]{});}
           enter_jLabel1.setForeground(Color.black);
       enter_jLabel1.setText("Enter No. Of Processes");}
       
          else{
           enter_jLabel1.setForeground(Color.red);
               enter_jLabel1.setText("Sorry, NO. Of Processes Must be Bigger Than Zero");  
           }}
    }//GEN-LAST:event_add_jButton1ActionPerformed

    private void reset_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_jButtonActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null,new String[]{"No.Of Problem","Arive Time","Burst Time","Priority"}));
        sorry_j.setText("");
        sorry_j2.setText("");
        enter_jLabel1.setForeground(Color.black);
        enter_jLabel1.setText("Enter No. Of Processes");
    }//GEN-LAST:event_reset_jButtonActionPerformed

    private void sim_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sim_jButtonActionPerformed
        // TODO add your handling code here:
        /*int x =Integer.parseInt(no_jTextField.getText());
        String ars[]= new String[x];*/
        
        String S="9999";
        String no="12345";
        int o, cr=0;
        int counter1=0;
        int counter2=0;
        int counter3=0;
        int counter4=0;
        boolean bb;
       
        cr = Integer.parseInt(jTable1.getModel().getValueAt(0,1)+"");
        for( int i =0 ; i<jTable1.getColumnCount(); i++)
        {
            for(int j=0; j<jTable1.getRowCount(); j++)
            {
                if(i==1)
                {
                    if(Integer.parseInt(jTable1.getModel().getValueAt(j,i)+"")<0)
                    {
                        counter2++;
                        //Integer.parseInt(jTable1.getModel().getValueAt(j,i)+""
                    }
                }
                else
                {
                if(Integer.parseInt(jTable1.getModel().getValueAt(j,i)+"")<=0)
                {
                    counter1++;
                }
                }
                if(cr > 0)
                {
                  sorry_j.setText("Sorry, arive time of first process");
                  sorry_j2.setText("must be equal Zero");
                    counter3=1;
                }
                if(jTable1.getModel().getValueAt(j,i).equals(""))
                {
                    sorry_j.setText("Sorry, xxxxxxxxxxxxxxxxx");
                    sorry_j2.setText("xxxxxxxxxxxxxxxxxxxxxxx");
                    counter4++;
                }
            }
        }
        
        if(counter1==0 && counter2==0 && counter3==0 && counter4==0){
          
             
        for( int i =0 ; i<jTable1.getColumnCount(); i++){
            if(i==0){
            for(int j=0; j<jTable1.getRowCount(); j++){
              no = (jTable1.getModel().getValueAt(j,i)+"");
              if(j==0)
                  write(no, no_of_prob, false);
              else{
                  write(no, no_of_prob, true);}
            }  
            }
            if(i==1){
            for(int j=0; j<jTable1.getRowCount(); j++){
              S = (jTable1.getModel().getValueAt(j,i)+"");
              if(j==0)
                  write(S, Arrive, false);
              else{
                  write(S, Arrive, true);}
            }}
            
            if(i==2){
            for(int j=0; j<jTable1.getRowCount(); j++){
              S = (jTable1.getModel().getValueAt(j,i)+"");
              if(j==0)
                  write(S, Burst, false);
              else{
                  write(S, Burst, true);}
            }  
            }
            
            if(i==3){
            for(int j=0; j<jTable1.getRowCount(); j++){
              S = (jTable1.getModel().getValueAt(j,i)+"");
              if(j==0)
                  write(S, Priority, false);
              else{
                  write(S, Priority, true);}
            }   
            } 
        
        }
        this.setVisible(false);
        new result().setVisible(true);
    }
    else
        {
            if(counter1!=0 && counter2!=0)
            {
                sorry_j.setText("Sorry, Numbers must be positive in No.of problem,Burst");
                sorry_j2.setText(" and Priority and bigger than or equal Zero in Arive");
            }
            else{
            if(counter1!=0)
            {
              sorry_j.setText("Sorry, all numbers in No.of problem,Burst");
              sorry_j2.setText("and Priority must be bigger than Zero");
            }
            else
            {
                if(counter2!=0)
            {
                sorry_j.setText("Sorry, any number in Arive time");
                sorry_j2.setText("must be bigger than or equal Zero");
            }
            }}
        }

    }//GEN-LAST:event_sim_jButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void load5_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load5_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mode = (DefaultTableModel) jTable1.getModel();
        String[] cols = {"No.Of Problem","Arive Time","Burst Time","Priority"};
        String[][] rows = {{"1","0","3","5"},
                           {"2","1","7","3"},
                           {"3","4","2","4"},
                           {"4","2","3","3"},
                           {"5","6","4","1"}};
        mode.setDataVector(rows, cols);
        sorry_j.setText("");
        sorry_j2.setText("");
        enter_jLabel1.setForeground(Color.black);
        enter_jLabel1.setText("Enter No. Of Processes");
    }//GEN-LAST:event_load5_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void load15jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load15jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mode = (DefaultTableModel) jTable1.getModel();
        String[] cols = {"No.Of Problem","Arive Time","Burst Time","Priority"};
        String[][] rows = {{"1","0","3","5"},
                           {"2","1","7","3"},
                           {"3","4","2","4"},
                           {"4","2","3","3"},
                           {"5","6","4","1"},
                           {"6","7","5","8"},
                           {"7","3","7","12"},
                           {"8","14","10","17"},
                           {"9","4","6","12"},
                           {"10","15","1","1"},
                           {"11","25","8","5"},
                           {"12","1","11","4"},
                           {"13","8","5","2"},
                           {"14","20","3","3"},
                           {"15","11","1","9"},

        };
        mode.setDataVector(rows, cols);
        sorry_j.setText("");
        sorry_j2.setText("");
        enter_jLabel1.setForeground(Color.black);
        enter_jLabel1.setText("Enter No. Of Processes");
    }//GEN-LAST:event_load15jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_jButton1;
    private javax.swing.JLabel enter_jLabel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton load15jButton1;
    private javax.swing.JButton load5_jButton2;
    private javax.swing.JTextField no_jTextField;
    private javax.swing.JButton reset_jButton;
    private javax.swing.JButton sim_jButton;
    private javax.swing.JLabel sorry_j;
    private javax.swing.JLabel sorry_j2;
    // End of variables declaration//GEN-END:variables
}
