/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import Modelo.DTO.Persona;
import controlador.GestionPersona;

/**
 *
 * @author fragata
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        GestionPersona gp;
        gp = new GestionPersona();
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botomTipoDoc = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtfinal = new javax.swing.JTextArea();
        registrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumIdent = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        jLabelFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botomTipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione su tipo de documento", "Cedula de ciudadania", "Targeta de identidad", "Cedula de extrangeria", "Registro civil" }));
        getContentPane().add(botomTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 159, 278, -1));

        jLabel1.setText("Numero de Identificacion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 125, 131, 23));

        jLabel2.setText("Tipo de Documento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 159, 131, 20));

        jLabel3.setText("Nombres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 200, -1, 22));

        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 239, -1, 22));

        txtfinal.setColumns(20);
        txtfinal.setRows(5);
        jScrollPane6.setViewportView(txtfinal);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 413, 156));

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 279, 124, -1));

        jLabel5.setFont(new java.awt.Font("Freestyle Script", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 43, 208));
        jLabel5.setText("Servicios Empresariales");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 15, 422, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(26, 22, 142));
        jLabel6.setText("Registrar usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 78, 254, 29));

        txtNumIdent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumIdentActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumIdent, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 126, 278, -1));

        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 201, 155, -1));

        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 232, 155, 29));

        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 240, 164, -1));

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 201, 164, -1));

        jLabelFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wallpaper blue.jpg"))); // NOI18N
        getContentPane().add(jLabelFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
     
    }//GEN-LAST:event_registrarActionPerformed

    private void txtNumIdentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumIdentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumIdentActionPerformed

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void txtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2ActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed
    
    private void registro(){
        Persona p = new Persona();
        p.setNumident(Integer.parseInt(txtNumIdent.getText()));
        p.setTipoIdent(botomTipoDoc.getSelectedItem().toString());
        p.setNombre1(txtNombre1.getText());
        p.setNombre2(txtNombre2.getText());
        p.setApellido1(txtApellido1.getText());
        p.setApellido2(txtApellido2.getText());
        
        
    }
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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox botomTipoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFond;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNumIdent;
    private javax.swing.JTextArea txtfinal;
    // End of variables declaration//GEN-END:variables
}
