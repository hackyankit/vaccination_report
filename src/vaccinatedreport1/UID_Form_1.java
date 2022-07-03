package vaccinatedreport1;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static vaccinatedreport1.UID_Form.jTextAdhr;
import static vaccinatedreport1.Registration_Form.jTextAdhr;
import static vaccinatedreport1.Registration_Form.jTextMobNo;
import static vaccinatedreport1.Registration_Form.jTextPName;


public class UID_Form_1 extends javax.swing.JFrame {

    public UID_Form_1() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextAdhr1 = new javax.swing.JTextField();
        jButtonGo1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("AADHAR NUMBER :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, 39));

        jTextAdhr1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAdhr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAdhr1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAdhr1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextAdhr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 232, 38));

        jButtonGo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonGo1.setText("GO");
        jButtonGo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 65, 38));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinatedreport1/jaha tera man part 2.png"))); // NOI18N
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel5KeyTyped(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 1350, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGo1ActionPerformed
        // TODO add your handling code here:
                
        String Adhar1 = jTextAdhr1.getText();
        try{
            if(jTextAdhr1.getText().length()!=12)
                JOptionPane.showMessageDialog(null,"Please Check Aadhar Number!");
            else{
            Connection reg_con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//Vaccination_Report.db");
            
            Statement reg_stmt = reg_con.createStatement();
            
            String reg_SQL = "SELECT Adhr FROM Tab_Reg WHERE Adhr = '" + Adhar1 + "'";
            ResultSet reg_rs = reg_stmt.executeQuery(reg_SQL);
            if(reg_rs.next())
            {
                JOptionPane.showMessageDialog(null,"This UID is already Registered!");
                try{
                Connection d1_con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//Vaccination_Report.db");
                
                Statement d1_stmt = d1_con.createStatement();
            
                String d1_SQL = "SELECT Adhr FROM Tab_Dose1 WHERE Adhr = '" + Adhar1 + "'";
                ResultSet d1_rs = d1_stmt.executeQuery(d1_SQL);
                if(d1_rs.next())
                {
                    JOptionPane.showMessageDialog(null,"You've taken 1st Dose!");
                    Statement d2_stmt = d1_con.createStatement();
            
                    String d2_SQL = "SELECT Adhr FROM Tab_Dose2 WHERE Adhr = '" + Adhar1 + "'";
                    ResultSet d2_rs = d2_stmt.executeQuery(d2_SQL);
                    if(d2_rs.next())
                    {
                        JOptionPane.showMessageDialog(null,"You've taken 2nd / final Dose!");
                        Statement b_stmt = d1_con.createStatement();

                        String b_SQL = "SELECT Adhr FROM Tab_Booster WHERE Adhr = '" + Adhar1 + "'";
                        ResultSet b_rs = b_stmt.executeQuery(b_SQL);
                        if(b_rs.next())
                        {
                            JOptionPane.showMessageDialog(null,"You've taken Booster Dose!");
                            int Repoinput1 = JOptionPane.showConfirmDialog(null, "Do you want to generate report?");
                            if(Repoinput1==0)
                                new Booster_dose_Report().setVisible(true);
                            else
                                dispose();
                        }  
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Booster dose not taken, please go ahead!");
                            reg_rs.close();
                            d1_rs.close();
                            d2_rs.close();

                            int Doseinput = JOptionPane.showConfirmDialog(null, "Do you want to take Booster dose?");
                            // 0=yes, 1=no, 2=cancel
                            System.out.println(Doseinput);
                            if(Doseinput==0)
                                new Booster_dose().setVisible(true);
                            else if(Doseinput==1)
                            {
                                int Repoinput = JOptionPane.showConfirmDialog(null, "Do you want to generate report?");
                                if(Repoinput==0)
                                    new Dose_2_Report().setVisible(true);
                                else
                                    dispose();
                            }
                            else
                                dispose();
                        }
                        
                    }  
                    else
                    {
                        JOptionPane.showMessageDialog(null,"2nd dose not taken, please go ahead!");
                        reg_rs.close();
                        d1_rs.close();
                        
                        int Doseinput = JOptionPane.showConfirmDialog(null, "Do you want to take 2nd dose?\nClick No if want to generate report!");
                        // 0=yes, 1=no, 2=cancel
                        System.out.println(Doseinput);
                        if(Doseinput==0)
                            new Dose_2().setVisible(true);
                        else if(Doseinput==1)
                        {
                            int Repoinput = JOptionPane.showConfirmDialog(null, "Do you want to generate report?");
                            if(Repoinput==0)
                                new Dose_1_Report().setVisible(true);
                            else
                                dispose();
                        }
                        else
                            dispose();
                    } 
                }  
                else
                {
                    JOptionPane.showMessageDialog(null,"1st dose not taken, please go ahead!");
                    reg_rs.close();
                    new Dose_1().setVisible(true);
                }}
                catch (Exception e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
            }  
            else
            {
                JOptionPane.showMessageDialog(null,"Not Registered UID, please go ahead!");
                new Registration_Form().setVisible(true);
            }
        }}
        catch (HeadlessException | SQLException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonGo1ActionPerformed

    private void jLabel5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5KeyTyped

    private void jTextAdhr1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAdhr1KeyPressed
        // TODO add your handling code here:
        if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
        {   jTextAdhr1.setEditable(true);    }
        else
        {   jTextAdhr1.setEditable(false);   }
    }//GEN-LAST:event_jTextAdhr1KeyPressed

    private void jTextAdhr1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAdhr1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String adhr=jTextAdhr1.getText();
        int len=adhr.length();
        if(Character.isDigit(c)&&(len<12))
        {
            jTextAdhr1.setEditable(true);
        }
        else
        {
            jTextAdhr1.setEditable(false);    
        }
    }//GEN-LAST:event_jTextAdhr1KeyTyped
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UID_Form_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UID_Form_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UID_Form_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UID_Form_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UID_Form_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextAdhr1;
    // End of variables declaration//GEN-END:variables
}
