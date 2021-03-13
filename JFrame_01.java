
import java.awt.BorderLayout;
import ni.edu.uni.programacion.views.panels.PnlCalculadora;

public class JFrame_01 extends javax.swing.JFrame {

    private PnlCalculadora pnlCalculadora;
    
    public JFrame_01() {
        
        pnlCalculadora = new PnlCalculadora();
        
        initComponents();
    }

    private void initComponents() {

        PnlLeftButtons = new javax.swing.JPanel();
        btnCakc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My JFrame");

        PnlLeftButtons.setBackground(new java.awt.Color(102, 255, 255));
        PnlLeftButtons.setLayout(new java.awt.GridLayout(3, 3, 0, 3));

        btnCakc.setBackground(new java.awt.Color(204, 204, 255));
        btnCakc.setLabel("Calcculadora");
        btnCakc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCakcActionPerformed(evt);
            }
        });
        PnlLeftButtons.add(btnCakc);

        jButton2.setText("jButton2");
        PnlLeftButtons.add(jButton2);

        jButton3.setText("jButton3");
        PnlLeftButtons.add(jButton3);

        getContentPane().add(PnlLeftButtons, java.awt.BorderLayout.LINE_START);

        PnlContent.setBackground(new java.awt.Color(255, 255, 255));
        PnlContent.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PnlContent, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCakcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCakcActionPerformed
       if(pnlCalculadora == null)
       {
           pnlCalculadora = new PnlCalculadora();
       }
       if(PnlContent.getComponentCount() > 0){
           PnlContent.remove(0);
       }
        PnlContent.add(pnlCalculadora, BorderLayout.CENTER);
        this.validate();
        
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_01().setVisible(true);
            }
        });
    }


    private javax.swing.JPanel PnlContent;
    private javax.swing.JPanel PnlLeftButtons;
    private javax.swing.JButton btnCakc;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;

}
