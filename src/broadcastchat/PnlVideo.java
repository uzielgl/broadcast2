/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package broadcastchat;

/**
 *
 * @author Dai
 */
public class PnlVideo extends javax.swing.JPanel {
    public MainWindow parent;
    /**
     * Creates new form PnlVideo
     */
    public PnlVideo() {
        initComponents();
                 jScrollPane1.getVerticalScrollBar().setValue(jScrollPane1.getVerticalScrollBar().getMaximum());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnviarVideo = new javax.swing.JButton();
        pnlHistorial = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecepcionTexto = new javax.swing.JTextArea();
        lblRecibiendoAudio = new javax.swing.JLabel();

        btnEnviarVideo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnviarVideo.setText("Enviar Video");
        btnEnviarVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarVideoActionPerformed(evt);
            }
        });

        pnlHistorial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recepción Texto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txtRecepcionTexto.setColumns(20);
        txtRecepcionTexto.setRows(5);
        jScrollPane1.setViewportView(txtRecepcionTexto);

        javax.swing.GroupLayout pnlHistorialLayout = new javax.swing.GroupLayout(pnlHistorial);
        pnlHistorial.setLayout(pnlHistorialLayout);
        pnlHistorialLayout.setHorizontalGroup(
            pnlHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        pnlHistorialLayout.setVerticalGroup(
            pnlHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        lblRecibiendoAudio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRecibiendoAudio.setText("Recibiendo Audio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarVideo)
                    .addComponent(lblRecibiendoAudio))
                .addGap(61, 61, 61)
                .addComponent(pnlHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblRecibiendoAudio)
                        .addGap(98, 98, 98)
                        .addComponent(btnEnviarVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarVideoActionPerformed
        // TODO add your handling code here:
        //parent.proceso.video.iniciarVideo();
        parent.proceso.video.start();
    }//GEN-LAST:event_btnEnviarVideoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarVideo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRecibiendoAudio;
    private javax.swing.JPanel pnlHistorial;
    public javax.swing.JTextArea txtRecepcionTexto;
    // End of variables declaration//GEN-END:variables
}
