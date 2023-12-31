/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Recorrido;

import static Recorrido.Recorrido.creaR;
import static Recorrido.Recorrido.disR;
import static Recorrido.Recorrido.entregaR;
import static Recorrido.Recorrido.finalProR;
import static Recorrido.Recorrido.totalR;
import static Recorrido.Recorrido.veiR;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;//uygug
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Historial extends javax.swing.JFrame {
   // public static Registros[] registros=new Registros[3];
    public static ArrayList<Registros> registros = new ArrayList<Registros>();
    
    
    /**
     * Creates new form Historial
     */
    public Historial() {
        //guardarInformacion();
        initComponents();
        //mostrarHistorial();
    }
             //clase de degradado
  class jPanelGradient extends JPanel{

    jPanelGradient() {
    }
    protected void paintComponent(Graphics g){
      Graphics2D g2d=(Graphics2D) g;
      int width=getWidth();
      int height=getHeight();
      
      Color color1=new Color(33, 47, 61 );
      Color color2=new Color(51, 57, 255);
      GradientPaint gp=new GradientPaint(0,0,color1,180,height,color2);
      g2d.setPaint(gp);
      g2d.fillRect(0, 0, width, height);
    }
  }
  //clase de degradado

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jPanelGradient();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistorialTable = new javax.swing.JTable();
        Regresar4 = new javax.swing.JButton();
        RecetearTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historial");

        HistorialTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehiculo", "Distancia (km)", "Monto (Q.)", "Fecha y hora creacion", "Fecha y hora entrega", "Productos"
            }
        ));
        jScrollPane1.setViewportView(HistorialTable);

        Regresar4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regresar4.setText("Preparacion de Pedido");
        Regresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar4ActionPerformed(evt);
            }
        });

        RecetearTabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        RecetearTabla.setText("Reiniciar Tabla");
        RecetearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecetearTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RecetearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar4)
                    .addComponent(RecetearTabla))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Regresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar4ActionPerformed
        // TODO add your handling code here:
        Pedidos objet=new Pedidos();
        
        objet.show(true);
        this.show(false);
    }//GEN-LAST:event_Regresar4ActionPerformed

    private void RecetearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecetearTablaActionPerformed
        // TODO add your handling code here:
        registros.clear();
        DefaultTableModel modeloListado = (DefaultTableModel) HistorialTable.getModel();
        modeloListado.setRowCount(registros.size());
    }//GEN-LAST:event_RecetearTablaActionPerformed

    public void guardarInformacion(){
       
        //Registros ger=new Registros(veiR,disR,totalR,creaR,entregaR, finalProR);
        registros.add(new Registros(veiR,disR,totalR,creaR,entregaR, finalProR));
        
    }
    
    public void mostrarHistorial(){
       
        DefaultTableModel modeloListado = (DefaultTableModel) HistorialTable.getModel();
        modeloListado.setRowCount(registros.size());
        
        for(int i=0;i<registros.size();i++){
        modeloListado.setValueAt(registros.get(i).getVehiculo(), i, 0);
        modeloListado.setValueAt(registros.get(i).getDistancia(), i, 1);
        modeloListado.setValueAt(registros.get(i).getMonto(), i, 2);
        modeloListado.setValueAt(registros.get(i).getCreacion(), i, 3);
        modeloListado.setValueAt(registros.get(i).getEntrega(), i, 4);
        modeloListado.setValueAt(registros.get(i).getProductos(), i, 5);
        //System.out.println("Estos son los productos: "+registros.get(i).getProductos());
        }
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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HistorialTable;
    private javax.swing.JButton RecetearTabla;
    private javax.swing.JButton Regresar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
