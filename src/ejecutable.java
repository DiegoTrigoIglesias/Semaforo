
/**
 * @author DIEGOT
 */
public class ejecutable extends javax.swing.JFrame {
    public ejecutable() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto = new javax.swing.JTextField();
        rojo = new javax.swing.JButton();
        amarillo = new javax.swing.JButton();
        verde = new javax.swing.JButton();
        boton_activar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActionPerformed(evt);
            }
        });

        boton_activar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        boton_activar.setText("Activar semaforo");
        boton_activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_activarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(texto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rojo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amarillo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton_activar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(boton_activar)
                .addGap(18, 18, 18)
                .addComponent(rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_activarActionPerformed
         proceso objeto = new proceso(rojo,amarillo,verde,texto);
        objeto.inicio_hilo();
    }//GEN-LAST:event_boton_activarActionPerformed

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
  
    }//GEN-LAST:event_textoActionPerformed

    private void rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rojoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejecutable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amarillo;
    private javax.swing.JButton boton_activar;
    private javax.swing.JButton rojo;
    private javax.swing.JTextField texto;
    private javax.swing.JButton verde;
    // End of variables declaration//GEN-END:variables
}
