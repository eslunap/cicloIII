/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45.vistas;

import co.com.G2M2E1.redflix45.SpringContext;
import co.com.G2M2E1.redflix45.modelos.Serie;
import co.com.G2M2E1.redflix45.repositorios.SerieRepositorio;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ESLUNAP
 */
public class JPanelSerie extends javax.swing.JPanel {

    SerieRepositorio serieRepositorio;
    /**
     * Creates new form JPanelSerie
     */
    public JPanelSerie() {
        initComponents();
        serieRepositorio = SpringContext.getBean(SerieRepositorio.class);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jTextFieldTituloSerie = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNoCaps = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNoTemp = new javax.swing.JTextField();
        jButtonGuardarS = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();

        jLabel10.setText("Título Serie");

        jLabel11.setText("No. Capítulos");

        jLabel12.setText("No. Temporadas");

        jButtonGuardarS.setText("Crear");
        jButtonGuardarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarSActionPerformed(evt);
            }
        });

        jButtonLimpiarCampos.setText("Limpiar Campos");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel10)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonGuardarS)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNoTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNoCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTituloSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiarCampos))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldTituloSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNoCaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldNoTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarS)
                    .addComponent(jButtonLimpiarCampos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarSActionPerformed
        // TODO add your handling code here:
        try{
            Serie s = new Serie();
            s.setTituloSerie(jTextFieldTituloSerie.getText());
            s.setNumEpisodios(Integer.parseInt(jTextFieldNoCaps.getText()));
            s.setNumTemporadas(Integer.parseInt(jTextFieldNoTemp.getText()));
            serieRepositorio.save(s);
            jTextFieldTituloSerie.requestFocus();
            System.out.println("Se registró correctamente la serie "+s.getTituloSerie());
            JOptionPane.showMessageDialog(null, "Se registró correctamente la serie "+ s.getTituloSerie(),"Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.out.println("Error al ingresar la serie");
            JOptionPane.showMessageDialog(null,"Error al ingresar la serie","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarSActionPerformed

    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed
        // TODO add your handling code here:
        JTextField caja;
        for (int i = 0; i< this.getComponentCount();i++){
            if(this.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja = (JTextField)this.getComponent(i);
                caja.setText("");            
            }        
        }
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarS;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JTextField jTextFieldNoCaps;
    private javax.swing.JTextField jTextFieldNoTemp;
    private javax.swing.JTextField jTextFieldTituloSerie;
    // End of variables declaration//GEN-END:variables
}
