/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Swing_ConLayout;

import java.awt.FlowLayout;

/**
 *
 * @author lirio
 */
public class GeneradorDeNumeros extends javax.swing.JFrame {

    /**
     * Creates new form GeneradorDeNumeros
     */
    public GeneradorDeNumeros() {
        initComponents();
        jTextField1.setEditable(false);
        this.setTitle("Generador de Numeros");
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(607, 253));
        getContentPane().setLayout(new java.awt.GridLayout(0, 1));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1);

        jPanel3.setMinimumSize(new java.awt.Dimension(200, 60));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 60));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanel3.setLayout(flowLayout1);

        jLabel1.setText("Numero 1");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 25));
        jLabel1.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 25));
        jPanel3.add(jLabel1);

        jLabel2.setText("Numero 2");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(90, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(115, 25));
        jPanel3.add(jLabel2);

        jLabel3.setText("Numero Generado");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMinimumSize(new java.awt.Dimension(104, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(104, 25));
        jLabel3.setRequestFocusEnabled(false);
        jPanel3.add(jLabel3);

        getContentPane().add(jPanel3);

        jPanel2.setMinimumSize(new java.awt.Dimension(200, 60));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 60));

        jSpinner2.setMinimumSize(new java.awt.Dimension(120, 25));
        jSpinner2.setPreferredSize(new java.awt.Dimension(120, 25));
        jPanel2.add(jSpinner2);

        jSpinner1.setMinimumSize(new java.awt.Dimension(110, 25));
        jSpinner1.setPreferredSize(new java.awt.Dimension(115, 25));
        jPanel2.add(jSpinner1);

        jTextField1.setMinimumSize(new java.awt.Dimension(100, 25));
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 25));
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
        });
        jPanel2.add(jTextField1);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int jspinnerValue1 =(int)jSpinner1.getValue();
        int jspinnerValue2 =(int)jSpinner2.getValue();
        
        if(jspinnerValue1 < jspinnerValue2){
            jTextField1.setText(String.valueOf(jspinnerValue2));
        }
        else{
            jTextField1.setText(String.valueOf(jspinnerValue1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

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
            java.util.logging.Logger.getLogger(GeneradorDeNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneradorDeNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneradorDeNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneradorDeNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneradorDeNumeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
