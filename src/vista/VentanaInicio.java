package vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import funcionalidades.Parqueadero;
import funcionalidades.Vehiculo;
import javax.swing.JOptionPane;



/**
 *
 * @author Vinni
 */
public class VentanaInicio extends javax.swing.JFrame {
    private Parqueadero p1 = new Parqueadero();

    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio() {
        initComponents();
        this.actualizar();
        
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
        cjPlaca = new javax.swing.JTextField();
        btAddMoto = new javax.swing.JButton();
        btAddCarro = new javax.swing.JButton();
        btSalidaMoto = new javax.swing.JButton();
        btsalidaCarro = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbRecaudo = new javax.swing.JLabel();
        lbCuposMoto = new javax.swing.JLabel();
        lbCuposCarro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("PARQUEADERO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 10, 110, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("VALOR REACUDADO $");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 10, 130, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("PLACA :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 70, 70, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Espacios disponibles para Motos: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 230, 190, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Espacios disponibles para Carro: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 250, 190, 15);
        getContentPane().add(cjPlaca);
        cjPlaca.setBounds(130, 70, 120, 20);

        btAddMoto.setText("Adicionar Moto");
        btAddMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMotoActionPerformed(evt);
            }
        });
        getContentPane().add(btAddMoto);
        btAddMoto.setBounds(430, 60, 130, 23);

        btAddCarro.setText("Adicionar Carro");
        btAddCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCarroActionPerformed(evt);
            }
        });
        getContentPane().add(btAddCarro);
        btAddCarro.setBounds(430, 90, 130, 23);

        btSalidaMoto.setText("Sallida de Moto");
        btSalidaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalidaMotoActionPerformed(evt);
            }
        });
        getContentPane().add(btSalidaMoto);
        btSalidaMoto.setBounds(430, 130, 130, 23);

        btsalidaCarro.setText("Salida de Carro");
        btsalidaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalidaCarroActionPerformed(evt);
            }
        });
        getContentPane().add(btsalidaCarro);
        btsalidaCarro.setBounds(430, 160, 130, 23);

        btSalir.setText("Cerrar aplicacion");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir);
        btSalir.setBounds(460, 240, 120, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Desarrollado por grupo de Mintic \"Los juiciosos\" 8/2021");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 290, 290, 14);

        lbRecaudo.setText("66666");
        getContentPane().add(lbRecaudo);
        lbRecaudo.setBounds(500, 10, 70, 14);

        lbCuposMoto.setText("10");
        getContentPane().add(lbCuposMoto);
        lbCuposMoto.setBounds(240, 230, 30, 20);

        lbCuposCarro.setText("18");
        getContentPane().add(lbCuposCarro);
        lbCuposCarro.setBounds(240, 250, 34, 20);

        setSize(new java.awt.Dimension(608, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        this.salir();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btAddMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMotoActionPerformed
        // TODO add your handling code here:
        this.addMoto();
    }//GEN-LAST:event_btAddMotoActionPerformed

    private void btAddCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCarroActionPerformed
        // TODO add your handling code here:
        this.addCarro();
    }//GEN-LAST:event_btAddCarroActionPerformed

    private void btSalidaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalidaMotoActionPerformed
        // TODO add your handling code here:
        this.retirarMoto();
    }//GEN-LAST:event_btSalidaMotoActionPerformed

    private void btsalidaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalidaCarroActionPerformed
        // TODO add your handling code here:
        this.retirarCarro();
    }//GEN-LAST:event_btsalidaCarroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }
    private void addMoto(){
        //Parqueadero p1 = new Parqueadero();
        if (cjPlaca.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Señor usuario, comedidamente le solicito no dañar mi programa, digite una placa ");
            return ;
        }
        Vehiculo v = new Vehiculo(cjPlaca.getText(), "MOTO");
        boolean rta = p1.registraM(v);  
        if (rta == true){
            this.actualizar();
            JOptionPane.showMessageDialog(this, "Se adicionó una moto con placa "+v.getPlaca());
        }else {
           JOptionPane.showMessageDialog(this, "No se adicionó una moto con placa "+v.getPlaca()); 
        }
    }
    private void addCarro(){
        if (cjPlaca.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Señor usuario, comedidamente le solicito no dañar mi programa, digite una placa ");
            return ;
        }
        //Parqueadero p1 = new Parqueadero();
        Vehiculo v = new Vehiculo(cjPlaca.getText(), "CARRO");
        boolean rta = p1.registraC(v);  
        if (rta == true){
            this.actualizar();
            JOptionPane.showMessageDialog(this, "Se adicionó un carro con placa "+v.getPlaca());
        }else {
            JOptionPane.showMessageDialog(this, "No se adicionó un carro con placa "+v.getPlaca());
        }
        
    }
    private void retirarMoto(){
        if (cjPlaca.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Señor usuario, comedidamente le solicito no dañar mi programa, digite una placa ");
            return ;
        }
        //Parqueadero p1 = new Parqueadero();
        Vehiculo v = new Vehiculo(cjPlaca.getText(), "CARRO");
        long valor = p1.salidaM(v);
        this.actualizar();
        if (valor > 0){
            JOptionPane.showMessageDialog(this, "Debe cancelar "+valor);
        }else if (valor == 0){
            JOptionPane.showMessageDialog(this, "No presenta cobro");
        }else{
            JOptionPane.showMessageDialog(this, "Este vehículo no esta en el parqueadero");
        }
        
    }
    private void retirarCarro(){
        if (cjPlaca.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Señor usuario, comedidamente le solicito no dañar mi programa, digite una placa ");
            return ;
        }
        
        Vehiculo v = new Vehiculo(cjPlaca.getText(), "CARRO");
        long valor = p1.salidaC(v);
        this.actualizar();
        if (valor > 0){
            JOptionPane.showMessageDialog(this, "Debe cancelar "+valor);
            
        }else if (valor == 0){
            JOptionPane.showMessageDialog(this, "No presenta cobro");
            
        }else{
            JOptionPane.showMessageDialog(this, "Este vehículo no esta en el parqueadero");
        }
        
    }
    private void actualizar(){
        //Parqueadero p1 = new Parqueadero();
        lbRecaudo.setText(""+p1.getTotalRecaudado());
        //Parqueadero p1 = new Parqueadero();
        lbCuposMoto.setText(""+p1.cuposDisponiblesM());
        //Parqueadero p1 = new Parqueadero();
        lbCuposCarro.setText(""+p1.cuposDisponiblesC());
        
    }
    
    private void salir(){
       System.exit(0);
    }


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCarro;
    private javax.swing.JButton btAddMoto;
    private javax.swing.JButton btSalidaMoto;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btsalidaCarro;
    private javax.swing.JTextField cjPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbCuposCarro;
    private javax.swing.JLabel lbCuposMoto;
    private javax.swing.JLabel lbRecaudo;
    // End of variables declaration//GEN-END:variables
}
