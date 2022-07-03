
package vaccinatedreport1;
//import java.awt.HeadlessException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import static vaccinatedreport1.Registration_Form.jTextAdhr;

public class Dose_1 extends javax.swing.JFrame {
    
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

//static JFrame jf;
    public Dose_1()
    {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        conn = DbConnection.ConnecrDb();
        jTextVacName.setVisible(false);
        
    }
    //for clearing all the fields after clicking submit button
private void clearField()
{
    jTextPName.setText(null);
    jTextAge.setText(null);
    jTextMobNo.setText(null);
    jTextHosDes.setText(null);
    jTextPrice.setText(null);
    jTextAdhr.setText(null);
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextPName = new javax.swing.JTextField();
        jComboBoxGen = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextAge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextAdhr = new javax.swing.JTextField();
        jTextMobNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonSub = new javax.swing.JButton();
        jTextHosDes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextVacName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxVacName = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();
        jTextNextDt = new javax.swing.JTextField();
        jTextDoseDt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PATIENT NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 204, 33));

        jTextPName.setEnabled(false);
        jTextPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPNameActionPerformed(evt);
            }
        });
        jTextPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPNameKeyTyped(evt);
            }
        });
        jPanel1.add(jTextPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 220, 33));

        jComboBoxGen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBoxGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS." }));
        jPanel1.add(jComboBoxGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 101, 33));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("AGE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 204, 33));

        jTextAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAgeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAgeKeyTyped(evt);
            }
        });
        jPanel1.add(jTextAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 220, 33));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("   VACCINATION DOSE I FORM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 380, 38));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("GENDER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 204, 33));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("AADHAR NUMBER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 204, 33));

        jTextAdhr.setEnabled(false);
        jTextAdhr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAdhrActionPerformed(evt);
            }
        });
        jTextAdhr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAdhrKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAdhrKeyTyped(evt);
            }
        });
        jPanel1.add(jTextAdhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 220, 33));

        jTextMobNo.setEnabled(false);
        jTextMobNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMobNoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextMobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 220, 33));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("CONTACT NUMBER");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 204, 33));

        jButtonSub.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSub.setText("SUBMIT");
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, 96, 33));

        jTextHosDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHosDesActionPerformed(evt);
            }
        });
        jPanel1.add(jTextHosDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 220, 33));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("HOSPITAL DESCRIPTION");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 204, 33));
        jPanel1.add(jTextVacName, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 104, 33));
        jTextVacName.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("VACCINE NAME");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 204, 33));

        jComboBoxVacName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBoxVacName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COVAXIN", "COVIDSHEILD", "SPUTNIK", "PFIZER", "OTHER" }));
        jComboBoxVacName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVacNameItemStateChanged(evt);
            }
        });
        jComboBoxVacName.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxVacNameMouseMoved(evt);
            }
        });
        jComboBoxVacName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxVacNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxVacName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxVacNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxVacNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBoxVacNameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxVacNameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxVacNameMouseReleased(evt);
            }
        });
        jComboBoxVacName.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jComboBoxVacNameComponentHidden(evt);
            }
        });
        jComboBoxVacName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVacNameActionPerformed(evt);
            }
        });
        jComboBoxVacName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxVacNamePropertyChange(evt);
            }
        });
        jComboBoxVacName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxVacNameKeyPressed(evt);
            }
        });
        jComboBoxVacName.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jComboBoxVacNameVetoableChange(evt);
            }
        });
        jPanel1.add(jComboBoxVacName, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 130, 33));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("PRICE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 204, 33));

        jTextPrice.setName(""); // NOI18N
        jTextPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPriceActionPerformed(evt);
            }
        });
        jTextPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPriceKeyTyped(evt);
            }
        });
        jPanel1.add(jTextPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 220, 33));
        jPanel1.add(jTextNextDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 43, -1));
        jPanel1.add(jTextDoseDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 42, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 70, -1, 38));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinatedreport1/Does.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 1350, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1443, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
        
        String sql="Insert into Tab_Dose1 values(?,?,?,?,?,?,?,?,?,?)";
        //jTextField1=jDatePicker1.getFormattedTextField();
        //for checking whether all the fields are filled or not
        if(jTextPName.getText().length()==0 ||jTextAdhr.getText().length()==0 || jTextAge.getText().length()==0|| jComboBoxGen.getSelectedItem().toString().length()==0 || jTextMobNo.getText().length()==0|| jTextHosDes.getText().length()==0 || jComboBoxVacName.getSelectedItem().toString().length()==0||jTextPrice.getText().length()==0)
            JOptionPane.showMessageDialog(null,"Please fill all the details");
        else
        {
            //for throwing all details into the database
            try
            {
                pst = conn.prepareStatement(sql);
                pst.setString(1,jTextPName.getText());
                pst.setString(2,jTextAge.getText());
                pst.setString(3,jComboBoxGen.getSelectedItem().toString());
                pst.setString(4,jTextMobNo.getText());
                pst.setString(5,jTextHosDes.getText());
                if("OTHER".equals(jComboBoxVacName.getSelectedItem().toString()))
                {   pst.setString(6,jTextVacName.getText()); }
                else
                {
                pst.setString(6,jComboBoxVacName.getSelectedItem().toString());}
                pst.setString(7,jTextPrice.getText());
                //pst.setDate(8,(Date)jDateChooser1.getDate());
                //pst.setString(8,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
                
                LocalDate currentDate7 = LocalDate.now();
                LocalDate currentDatePlus7 = currentDate7.plusDays(28);
                System.out.println(currentDatePlus7);
                
                String cd7=currentDate7.format(DateTimeFormatter.ISO_DATE);
                jTextDoseDt.setText(cd7);
                pst.setString(8,jTextDoseDt.getText());
                
                pst.setString(9,jTextAdhr.getText());
                String cdp7=currentDatePlus7.format(DateTimeFormatter.ISO_DATE);
                jTextNextDt.setText(cdp7);
                pst.setString(10,jTextNextDt.getText());
                //pst.setDate(8,jDatePicker1.getv);
                pst.execute();
                
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                //new Dose_1_Report().setVisible(true);    12/04/22 kpo kiye h ye
                new Bill().setVisible(true);
                clearField(); //for clearing all the fields after clicking submit button
                dispose();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }   

    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jTextPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPNameActionPerformed

    private void jTextPNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPNameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            jTextPName.setEditable(true);
        }
        else
        {
            jTextPName.setEditable(false);    
        }   
    }//GEN-LAST:event_jTextPNameKeyTyped

    private void jTextAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAgeKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String age=jTextAge.getText();
        int len=age.length();
        if(Character.isDigit(c)&&(len<3))
        {
            jTextAge.setEditable(true);
        }
        else
        {
            jTextAge.setEditable(false);
        }
    }//GEN-LAST:event_jTextAgeKeyTyped

    private void jTextAdhrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAdhrKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String adhr=jTextAdhr.getText();
        int len=adhr.length();
        if(Character.isDigit(c)&&(len<12))
        {
            jTextAdhr.setEditable(true);
        }
        else
        {
            jTextAdhr.setEditable(false);    
        }   
    }//GEN-LAST:event_jTextAdhrKeyTyped

    private void jTextMobNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMobNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String MobNo=jTextMobNo.getText();
        int len=MobNo.length();
        if((!(Character.isLetter(c)))&&(len<14))
        {
            jTextMobNo.setEditable(true);
        }
        else
        {
            jTextMobNo.setEditable(false);    
        }   
    }//GEN-LAST:event_jTextMobNoKeyTyped

    private void jTextPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPriceKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        
        if(!(Character.isLetter(c)))
        {
            jTextPrice.setEditable(true);
        }
        else
        {
            jTextPrice.setEditable(false);    
        }   
    }//GEN-LAST:event_jTextPriceKeyTyped

    private void jTextAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAgeKeyPressed
        // TODO add your handling code here:
        if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
        {
            jTextAge.setEditable(true);
        }
        else
        {
            jTextAge.setEditable(false);
        }
    }//GEN-LAST:event_jTextAgeKeyPressed

    private void jTextAdhrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAdhrKeyPressed
        // TODO add your handling code here:
        if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
        {   jTextAdhr.setEditable(true);    }
        else
        {   jTextAdhr.setEditable(false);   }
    }//GEN-LAST:event_jTextAdhrKeyPressed

    private void jTextAdhrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAdhrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAdhrActionPerformed

    private void jComboBoxVacNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVacNameActionPerformed
        // TODO add your handling code here:
        if(jComboBoxVacName.getSelectedItem().toString()=="OTHER")
        {   pack();
            jTextVacName.setVisible(true);  }
        else
        {   jTextVacName.setVisible(false);   }
    }//GEN-LAST:event_jComboBoxVacNameActionPerformed

    private void jComboBoxVacNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxVacNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNamePropertyChange

    private void jComboBoxVacNameVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jComboBoxVacNameVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNameVetoableChange

    private void jComboBoxVacNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxVacNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNameMouseClicked

    private void jComboBoxVacNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxVacNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNameMousePressed

    private void jComboBoxVacNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxVacNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNameKeyPressed

    private void jComboBoxVacNameComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxVacNameComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNameComponentHidden

    private void jComboBoxVacNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxVacNameMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxVacNameMouseReleased

    private void jComboBoxVacNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxVacNameMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxVacNameMouseExited

    private void jComboBoxVacNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVacNameItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNameItemStateChanged

    private void jComboBoxVacNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxVacNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNameMouseEntered

    private void jComboBoxVacNameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxVacNameMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVacNameMouseMoved

    private void jComboBoxVacNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxVacNamePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        //String tmp = (String)jComboBoxVacName.;
    }//GEN-LAST:event_jComboBoxVacNamePopupMenuWillBecomeInvisible

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jPanel1.setLocation(5000,0);
        jTextDoseDt.setVisible(false);
        jTextNextDt.setVisible(false);
        jTextAge.requestFocus();        
        String Adhar=UID_Form.jTextAdhr.getText();
        try{
            Connection reg_con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//Vaccination_Report.db");
            
            Statement reg_stmt = reg_con.createStatement();
            
            String reg_SQL = "SELECT * FROM Tab_Reg WHERE Adhr = '" + Adhar + "'";
            ResultSet reg_rs = reg_stmt.executeQuery(reg_SQL);
            if(reg_rs.next())
            {
                //JOptionPane.showMessageDialog(null,"again, This UID is already Registered!");
                jTextPName.setText(reg_rs.getString("PName"));
                jTextMobNo.setText(reg_rs.getString("MobNo"));
            }
            reg_rs.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        
        jTextAdhr.setText(UID_Form.jTextAdhr.getText());
        
    }//GEN-LAST:event_formWindowActivated

    private void jTextHosDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHosDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHosDesActionPerformed

    private void jTextPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPriceActionPerformed

    
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
            java.util.logging.Logger.getLogger(Dose_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dose_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dose_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dose_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dose_1().setVisible(true);
                
            }
        });
        //jTextField1.is;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSub;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JComboBox<String> jComboBoxGen;
    private javax.swing.JComboBox<String> jComboBoxVacName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAdhr;
    private javax.swing.JTextField jTextAge;
    private javax.swing.JTextField jTextDoseDt;
    private javax.swing.JTextField jTextHosDes;
    private javax.swing.JTextField jTextMobNo;
    private javax.swing.JTextField jTextNextDt;
    private javax.swing.JTextField jTextPName;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextVacName;
    // End of variables declaration//GEN-END:variables

    private String getText(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
