/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dashboard;

import classes.Configuracion;
import classes.EstudioAnimacion;
import javax.swing.JLabel;
import productores.TipoWorker;


public class CN_Dashboard extends javax.swing.JPanel {
    EstudioAnimacion CartoonNetwork;
    
    /**
     * Creates new form a
     */
    public CN_Dashboard() {
        initComponents();
    }
    
    public void setCartoonNetwork(EstudioAnimacion CartoonNetwork){
        this.CartoonNetwork = CartoonNetwork;
        setWorkersSpinners();
        setWorkersLeft();
        GlobalUI.getMainUI().getMainDashboard().getDeadlineSpinner().setValue(CartoonNetwork.entrega);
        //this.DeadlineSpinner.setValue();
    }
           
    public void setWorkersLeft(){
        int cantidadActual = Functions.calcWorkersQty(CartoonNetwork.emplxDep);
        int restan = CartoonNetwork.maxWorkerQty - cantidadActual;
        this.empleadosDispo.setText(Integer.toString(restan));
    }
    
    public void setWorkersSpinners(){
        this.qtyWGuion.setValue(CartoonNetwork.emplxDep[0]);
        this.qtyWAnimacion.setValue(CartoonNetwork.emplxDep[1]);
        this.qtyWDoblaje.setValue(CartoonNetwork.emplxDep[2]);
        this.qtyWPlo.setValue(CartoonNetwork.emplxDep[3]);
        this.qtyWEscenarios.setValue(CartoonNetwork.emplxDep[4]);
        this.qtyWEnsamblador.setValue(CartoonNetwork.emplxDep[5]);
    }
    
    public void setGuionQtyLabel(int num){
        String cant = Integer.toString(num);
        this.qtyGuion.setText(cant);
    }
    public void setAnimQtyLabel(int num){
        String cant = Integer.toString(num);
        this.qtyAnimacion.setText(cant);
    }
    public void setDoblajeQtyLabel(int num){
        String cant = Integer.toString(num);
        this.qtyDoblaje.setText(cant);
    }
    public void setEsceneriosQtyLabel(int num){
        String cant = Integer.toString(num);
        this.qtyEscenarios.setText(cant);
    }
    public void setPloQtyLabel(int num){
        String cant = Integer.toString(num);
        this.qtyPlo.setText(cant);
    }
    public void setQtyCapEmitidos(int num){
        String cant = Integer.toString(num);
        this.qtyCapEmitidos.setText(cant);
    }
    public void setQtyCapPloEmitidos(int num){
        String cant = Integer.toString(num);
        this.qtyCapPloEmitidos.setText(cant);
    }
    public void setFaltasLabel(int num){
        String cant = Integer.toString(num);
        this.faltasLabel.setText(cant);
    }
    public void setDirectorAccion(String accion){
        this.directorAccion.setText(accion);
    }
    public void setManagerAccion(String accion){
        this.gerenteAccion.setText(accion);
    }
    public void setDeadlineLabel(int num){
        String cant = Integer.toString(num);
        this.deadlineLabel.setText(cant);
    }
    public void setDiasTotales(int num){
        String cant = Integer.toString(num);
        //this.diasTotales.setText(cant);
    }
    public void setSueldoDescontado(int num){
        String cant = Integer.toString(num);
        this.sueldoDescontado.setText(cant + "$");
    }
    public DashboardInfo getDashboardInfo(){
        return this.dashboardInfo1;
    }
    public void setCapTransmitidos(int num) {
        String cant = Integer.toString(num);
        //this.carrosVendidos.setText(cant);
    }
    public void setValoresDrive(int guion, int escenario, int animacion, int doblaje, int plo){
        String newGuion = Integer.toString(guion);
        String newAnimacion = Integer.toString(animacion);
        String newDoblaje = Integer.toString(doblaje);
        String newEscenarios = Integer.toString(escenario);
        String newPlo = Integer.toString(plo);
        
        this.qtyGuion.setText(newGuion);
        this.qtyAnimacion.setText(newAnimacion);
        this.qtyDoblaje.setText(newDoblaje);
        this.qtyEscenarios.setText(newEscenarios);
        this.qtyPlo.setText(newPlo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        qtyWGuion = new javax.swing.JSpinner();
        workerGuion = new javax.swing.JLabel();
        workerAnimacion = new javax.swing.JLabel();
        qtyWDoblaje = new javax.swing.JSpinner();
        workerDoblaje = new javax.swing.JLabel();
        qtyWAnimacion = new javax.swing.JSpinner();
        workerEscenarios = new javax.swing.JLabel();
        qtyWEscenarios = new javax.swing.JSpinner();
        workerPlo = new javax.swing.JLabel();
        qtyWPlo = new javax.swing.JSpinner();
        workerEnsamblador = new javax.swing.JLabel();
        qtyWEnsamblador = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        directorAccion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        gerenteAccion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qtyGuion = new javax.swing.JLabel();
        qtyAnimacion = new javax.swing.JLabel();
        qtyDoblaje = new javax.swing.JLabel();
        qtyEscenarios = new javax.swing.JLabel();
        qtyPlo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        empleadosDispo = new javax.swing.JLabel();
        qtyCapEmitidos = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        qtyCapPloEmitidos = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        faltasLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        deadlineLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sueldoDescontado = new javax.swing.JLabel();
        dashboardInfo1 = new dashboard.DashboardInfo();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qtyWGuion.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        qtyWGuion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyWGuionStateChanged(evt);
            }
        });
        add(qtyWGuion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, 30));

        workerGuion.setText("Diseñador de Guiones");
        add(workerGuion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        workerAnimacion.setText("Animador de Personajes");
        add(workerAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        qtyWDoblaje.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        qtyWDoblaje.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyWDoblajeStateChanged(evt);
            }
        });
        add(qtyWDoblaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, 30));

        workerDoblaje.setText("Actores de Doblaje");
        add(workerDoblaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        qtyWAnimacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        qtyWAnimacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyWAnimacionStateChanged(evt);
            }
        });
        add(qtyWAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 30));

        workerEscenarios.setText("Diseñador de Escenarios");
        add(workerEscenarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        qtyWEscenarios.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        qtyWEscenarios.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyWEscenariosStateChanged(evt);
            }
        });
        add(qtyWEscenarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, 30));

        workerPlo.setText("Guionista de Plotwist");
        add(workerPlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        qtyWPlo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        qtyWPlo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyWPloStateChanged(evt);
            }
        });
        add(qtyWPlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, 30));

        workerEnsamblador.setText("Emsamblador(es)");
        add(workerEnsamblador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 30));

        qtyWEnsamblador.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        qtyWEnsamblador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyWEnsambladorStateChanged(evt);
            }
        });
        add(qtyWEnsamblador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, 30));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 30)); // NOI18N
        jLabel7.setText("Capitulos");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Animaciones");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Escenario");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Guiones");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Doblajes");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Plotwist");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel14.setText("Dias para la entrega:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, 30));

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel15.setText("Capitulos Producidos:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, 30));

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 2, 36)); // NOI18N
        jLabel18.setText("Cartoon Network");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setText("El Project Manager esta:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        directorAccion.setEditable(false);
        directorAccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        directorAccion.setText("Accion");
        directorAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorAccionActionPerformed(evt);
            }
        });
        add(directorAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 160, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel20.setText("El director esta:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));

        gerenteAccion.setEditable(false);
        gerenteAccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gerenteAccion.setText("Accion");
        gerenteAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenteAccionActionPerformed(evt);
            }
        });
        add(gerenteAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 160, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Empleados de Cartoon Network:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Máximo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 60, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Disponible");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        qtyGuion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtyGuion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtyGuion.setText("0");
        add(qtyGuion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 30, -1));

        qtyAnimacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtyAnimacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtyAnimacion.setText("0");
        add(qtyAnimacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 30, -1));

        qtyDoblaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtyDoblaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtyDoblaje.setText("0");
        add(qtyDoblaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 40, -1));

        qtyEscenarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtyEscenarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtyEscenarios.setText("0");
        add(qtyEscenarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 30, -1));

        qtyPlo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtyPlo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtyPlo.setText("0");
        add(qtyPlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 30, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("20");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 30, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("25");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 30, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("55");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 40, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("35");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 30, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("10");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 30, -1));

        empleadosDispo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empleadosDispo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empleadosDispo.setText("0");
        add(empleadosDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 30, -1));

        qtyCapEmitidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtyCapEmitidos.setText("0");
        add(qtyCapEmitidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 40, 20));

        jLabel25.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel25.setText("Plotwist");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 120, 30));

        jLabel26.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel26.setText("Estandar:");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 90, 20));

        qtyCapPloEmitidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qtyCapPloEmitidos.setText("0");
        add(qtyCapPloEmitidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 40, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel27.setText("Faltas:");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        faltasLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        faltasLabel.setText("0");
        add(faltasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 20, 20));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel30.setText("Empleados Importantes:");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        deadlineLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        deadlineLabel.setText("0");
        add(deadlineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 30, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Total descontado:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        sueldoDescontado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sueldoDescontado.setText("0");
        add(sueldoDescontado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 90, -1));
        add(dashboardInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 360, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void qtyWGuionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyWGuionStateChanged
        // TODO add your handling code here:
        int valor = Integer.parseInt(this.qtyWGuion.getValue().toString());
        // validar valor para ver si no excede limite de workers
        valor = Functions.validarCantEmpl(CartoonNetwork, TipoWorker.guion, valor);
        this.qtyWGuion.setValue(valor);
        this.setWorkersLeft();
    }//GEN-LAST:event_qtyWGuionStateChanged

    private void qtyWDoblajeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyWDoblajeStateChanged
        // TODO add your handling code here:
        int valor = Integer.parseInt(this.qtyWDoblaje.getValue().toString());
        // validar valor para ver si no excede limite de workers
        valor = Functions.validarCantEmpl(CartoonNetwork, TipoWorker.escenario, valor);
        this.qtyWDoblaje.setValue(valor);
        this.setWorkersLeft();
    }//GEN-LAST:event_qtyWDoblajeStateChanged

    private void qtyWAnimacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyWAnimacionStateChanged
        // TODO add your handling code here:
        int valor = Integer.parseInt(this.qtyWAnimacion.getValue().toString());
        // validar valor para ver si no excede limite de workers
        valor = Functions.validarCantEmpl(CartoonNetwork, TipoWorker.animador, valor);
        this.qtyWAnimacion.setValue(valor);
        this.setWorkersLeft();
    }//GEN-LAST:event_qtyWAnimacionStateChanged

    private void qtyWEscenariosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyWEscenariosStateChanged
        // TODO add your handling code here:
        int valor = Integer.parseInt(this.qtyWEscenarios.getValue().toString());
        // validar valor para ver si no excede limite de workers
        valor = Functions.validarCantEmpl(CartoonNetwork, TipoWorker.actor, valor);
        this.qtyWEscenarios.setValue(valor);
        this.setWorkersLeft();
    }//GEN-LAST:event_qtyWEscenariosStateChanged

    private void qtyWPloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyWPloStateChanged
        // TODO add your handling code here:
        int valor = Integer.parseInt(this.qtyWPlo.getValue().toString());
        // validar valor para ver si no excede limite de workers
        valor = Functions.validarCantEmpl(CartoonNetwork, TipoWorker.plotwist, valor);
        this.qtyWPlo.setValue(valor);
        this.setWorkersLeft();
    }//GEN-LAST:event_qtyWPloStateChanged

    private void qtyWEnsambladorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyWEnsambladorStateChanged
        // TODO add your handling code here:
        int valor = Integer.parseInt(this.qtyWEnsamblador.getValue().toString());
        // validar valor para ver si no excede limite de workers
        valor = Functions.validarCantEmpl(CartoonNetwork, TipoWorker.ensamblador, valor);
        this.qtyWEnsamblador.setValue(valor);
        this.setWorkersLeft();
    }//GEN-LAST:event_qtyWEnsambladorStateChanged

    private void directorAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorAccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorAccionActionPerformed

    private void gerenteAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenteAccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gerenteAccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dashboard.DashboardInfo dashboardInfo1;
    private javax.swing.JLabel deadlineLabel;
    private javax.swing.JTextField directorAccion;
    private javax.swing.JLabel empleadosDispo;
    private javax.swing.JLabel faltasLabel;
    private javax.swing.JTextField gerenteAccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel qtyAnimacion;
    private javax.swing.JLabel qtyCapEmitidos;
    private javax.swing.JLabel qtyCapPloEmitidos;
    private javax.swing.JLabel qtyDoblaje;
    private javax.swing.JLabel qtyEscenarios;
    private javax.swing.JLabel qtyGuion;
    private javax.swing.JLabel qtyPlo;
    private javax.swing.JSpinner qtyWAnimacion;
    private javax.swing.JSpinner qtyWDoblaje;
    private javax.swing.JSpinner qtyWEnsamblador;
    private javax.swing.JSpinner qtyWEscenarios;
    private javax.swing.JSpinner qtyWGuion;
    private javax.swing.JSpinner qtyWPlo;
    private javax.swing.JLabel sueldoDescontado;
    private javax.swing.JLabel workerAnimacion;
    private javax.swing.JLabel workerDoblaje;
    private javax.swing.JLabel workerEnsamblador;
    private javax.swing.JLabel workerEscenarios;
    private javax.swing.JLabel workerGuion;
    private javax.swing.JLabel workerPlo;
    // End of variables declaration//GEN-END:variables

    public JLabel getQtyGuion() {
        return qtyGuion;
    }
    public JLabel getQtyAnimacion() {
        return this.qtyAnimacion;
    } 
    public JLabel getQtyDoblaje() {
        return this.qtyDoblaje;
    }
    public JLabel getQtyEscenarios() {
        return this.qtyEscenarios;
    }
    public JLabel getQtyPlo() {
        return this.qtyPlo;
    }

}
