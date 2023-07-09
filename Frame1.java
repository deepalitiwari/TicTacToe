
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/*
 * @author riyan
 */
public class Frame1 extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
        btn1.addActionListener((ActionListener) this);
        btn2.addActionListener((ActionListener) this);
        btn3.addActionListener((ActionListener) this);
        btn4.addActionListener((ActionListener) this);
        btn5.addActionListener((ActionListener) this);
        btn6.addActionListener((ActionListener) this);
        btn7.addActionListener((ActionListener) this);
        btn8.addActionListener((ActionListener) this);
        btn9.addActionListener((ActionListener) this);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 142, 142));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("Tic Tac Toe");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 6, 220, 60));

        btn3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 142, 142));

        btn7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 142, 142));

        btn1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 142, 142));

        btn4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 142, 142));

        reset.setBackground(new java.awt.Color(0, 204, 255));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 90, 50));

        btn6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 142, 142));

        btn2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 142, 142));

        btn9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 142, 142));

        btn5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 142, 142));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public int count=0;
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
if(count%2==0){
    btn1.setText("X");
    count++;
}
else{
    btn1.setText("O");  
    count++;
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
res();
// TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
if(count%2==0){
    btn2.setText("X");
    count++;
}
else{
    btn2.setText("O");  
    count++;
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
if(count%2==0){
    btn3.setText("X");
    count++;
}
else{
    btn3.setText("O");    
    count++;
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
if(count%2==0){
    btn4.setText("X");
    count++;
}
else{
    btn4.setText("O");   
    count++;
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
if(count%2==0){
    btn5.setText("X");
    count++;
}
else{
    btn5.setText("O");   
    count++;
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
if(count%2==0){
    btn6.setText("X");
    count++;
}
else{
    btn6.setText("O");    
    count++;
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
if(count%2==0){
    btn7.setText("X");
    count++;
}
else{
    btn7.setText("O");    
    count++;
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
if(count%2==0){
    btn8.setText("X");
    count++;
}
else{
    btn8.setText("O");
count++;    
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
if(count%2==0){
    btn9.setText("X");
    count++;
}
else{
    btn9.setText("O");    
    count++;
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
    if(("X".equals(btn1.getText())&&"X".equals(btn2.getText())&&"X".equals(btn3.getText()))||
       ("X".equals(btn1.getText())&&"X".equals(btn5.getText())&&"X".equals(btn9.getText()))||
       ("X".equals(btn1.getText())&&"X".equals(btn4.getText())&&"X".equals(btn7.getText()))||
       ("X".equals(btn2.getText())&&"X".equals(btn5.getText())&&"X".equals(btn8.getText()))||
       ("X".equals(btn3.getText())&&"X".equals(btn6.getText())&&"X".equals(btn9.getText()))||
       ("X".equals(btn4.getText())&&"X".equals(btn5.getText())&&"X".equals(btn6.getText()))||
       ("X".equals(btn1.getText())&&"X".equals(btn4.getText())&&"X".equals(btn7.getText()))){
        JOptionPane.showMessageDialog(this, "X Won");
        dispose();  // Dispose the current JFrame
               Frame1 f= new Frame1();
               f.setVisible(true);
               }
    else if(("O".equals(btn1.getText())&&"O".equals(btn2.getText())&&"O".equals(btn3.getText()))||
       ("O".equals(btn1.getText())&&"O".equals(btn5.getText())&&"O".equals(btn9.getText()))||
       ("O".equals(btn1.getText())&&"O".equals(btn4.getText())&&"O".equals(btn7.getText()))||
       ("O".equals(btn2.getText())&&"O".equals(btn5.getText())&&"O".equals(btn8.getText()))||
       ("O".equals(btn3.getText())&&"O".equals(btn6.getText())&&"O".equals(btn9.getText()))||
       ("O".equals(btn4.getText())&&"O".equals(btn5.getText())&&"O".equals(btn6.getText()))||
       ("O".equals(btn1.getText())&&"O".equals(btn4.getText())&&"O".equals(btn7.getText()))){
        JOptionPane.showMessageDialog(this, "O Won");
    dispose();  // Dispose the current JFrame
               Frame1 f= new Frame1();
               f.setVisible(true);
        }
    else if(count==8){
    JOptionPane.showMessageDialog(this, "DRAW");    
    dispose();  // Dispose the current JFrame
               Frame1 f= new Frame1();
               f.setVisible(true);
        }
    }
    

    private void res() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
    }
}

