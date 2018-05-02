package puzzle;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author SHRAVAN
 */
public class choose extends JFrame{
    String high;
    String prev;
    public choose(String before,String hi) {
        initComponents();
        prev=before;
        high=hi;
        initializer();
        seticons();
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setLayout(new javax.swing.OverlayLayout(panel));

        b1.setActionCommand("1");
        b1.setContentAreaFilled(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        panel.add(b1);

        b4.setActionCommand("4");
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b4.setIconTextGap(0);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        panel.add(b4);

        b7.setActionCommand("7");
        b7.setContentAreaFilled(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        panel.add(b7);

        b9.setActionCommand("9");
        b9.setContentAreaFilled(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        panel.add(b9);

        b6.setActionCommand("6");
        b6.setContentAreaFilled(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        panel.add(b6);

        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setActionCommand("2");
        b2.setContentAreaFilled(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        panel.add(b2);

        b8.setActionCommand("8");
        b8.setContentAreaFilled(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        panel.add(b8);

        b5.setActionCommand("5");
        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b5.setHideActionText(true);
        b5.setIconTextGap(0);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        panel.add(b5);

        b3.setActionCommand("3");
        b3.setContentAreaFilled(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        panel.add(b3);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UI ui=new UI(prev,high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void seticons(){
        ImageIcon B1i = new ImageIcon(this.getClass().getResource("images/10/1.jpg"));
        ImageIcon B2i = new ImageIcon(this.getClass().getResource("images/10/2.jpg"));
        ImageIcon B3i = new ImageIcon(this.getClass().getResource("images/10/3.jpg"));
        ImageIcon B4i = new ImageIcon(this.getClass().getResource("images/10/4.jpg"));
        ImageIcon B5i = new ImageIcon(this.getClass().getResource("images/10/5.jpg"));
        ImageIcon B6i = new ImageIcon(this.getClass().getResource("images/10/6.jpg"));
        ImageIcon B7i = new ImageIcon(this.getClass().getResource("images/10/7.jpg"));
        ImageIcon B8i = new ImageIcon(this.getClass().getResource("images/10/8.jpg"));
        ImageIcon B9i = new ImageIcon(this.getClass().getResource("images/10/9.jpg"));
        b1.setIcon(B1i);
        b2.setIcon(B2i);
        b3.setIcon(B3i);
        b4.setIcon(B4i);
        b5.setIcon(B5i);
        b6.setIcon(B6i);
        b7.setIcon(B7i);
        b8.setIcon(B8i);
        b9.setIcon(B9i);
    }
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
UI ui=new UI(evt.getActionCommand(),high);
        ui.setVisible(true);
        ui.setLocationRelativeTo(this);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed
    
    private void initializer(){
        panel.setLayout(new GridLayout(3,3));
    }
    
    public void actionPerformed(ActionEvent e){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
