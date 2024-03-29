/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dashboard;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;

public class MainDashboard extends javax.swing.JPanel {

    /**
     * Creates new form MainDashboard
     */
    public MainDashboard() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deadlineSpinner = new javax.swing.JSpinner();
        dayDurationSpinner = new javax.swing.JSpinner();
        dashboardInfoLg = new dashboard.DashboardInfo();
        dashboardInfoRr = new dashboard.DashboardInfo();
        confirmarDatos = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estudios de animación en Venezuela");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 800, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel2.setText("Cartoon Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setText("Disney Channel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Dias para la entrega:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Duracion del dia (s):");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        deadlineSpinner.setModel(new javax.swing.SpinnerNumberModel(7, 7, null, 1));
        add(deadlineSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 70, 30));

        dayDurationSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        add(dayDurationSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 70, 30));
        add(dashboardInfoLg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 350, 220));
        add(dashboardInfoRr, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 360, 220));

        confirmarDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmarDatos.setText("Actualizar Datos");
        confirmarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarDatosActionPerformed(evt);
            }
        });
        add(confirmarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarDatosActionPerformed
        // TODO add your handling code here:
        int valorDeadline = Integer.parseInt(this.deadlineSpinner.getValue().toString());
        int valorDurationMs = Integer.parseInt(this.dayDurationSpinner.getValue().toString()) * 1000;
        
        if (valorDurationMs >= 1){
            Functions.saveDatosIniciales(valorDurationMs, valorDeadline);
        }
    }//GEN-LAST:event_confirmarDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarDatos;
    private dashboard.DashboardInfo dashboardInfoLg;
    private dashboard.DashboardInfo dashboardInfoRr;
    private javax.swing.JSpinner dayDurationSpinner;
    private javax.swing.JSpinner deadlineSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    public DashboardInfo getDashboardInfoLg() {
        return this.dashboardInfoLg;
    }    
    public DashboardInfo getDashboardInfoRr() {
        return this.dashboardInfoRr;
    }
    public JSpinner getDeadlineSpinner() {
        return this.deadlineSpinner;
    }
    public JSpinner getDayDurationSpinner() {
        return this.dayDurationSpinner;
    }
    public void setDeadlineSpinner(int num){
        this.deadlineSpinner.setValue(num);
    }
    public void setDayDurationSpinner(int num){
        this.dayDurationSpinner.setValue(num);
    }
    
}
