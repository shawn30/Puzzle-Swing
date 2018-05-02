package puzzle;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.*;
public class UI extends JFrame {
    private java.util.Timer timer;
    ArrayList<JButton> buttons=new ArrayList<JButton>();
    private String highscore;
    private String imageidd;
    public UI(String imageid,String high) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        imageidd=imageid;
        highscore=high;
        initializer();
        seticons();
        counter();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CLOSE = new javax.swing.JButton();
        MINIMISE = new javax.swing.JButton();
        RESTART = new javax.swing.JButton();
        ORIGINAL = new javax.swing.JButton();
        CHOOSE = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TIMER = new javax.swing.JLabel();
        HIGH = new javax.swing.JLabel();
        solve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 204));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1.setText("1");
        B1.setBorderPainted(false);
        B1.setContentAreaFilled(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        panel.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 120));

        B4.setText("4");
        B4.setContentAreaFilled(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        panel.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 120));

        B7.setText("7");
        B7.setContentAreaFilled(false);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        panel.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 120));

        B2.setText("2");
        B2.setContentAreaFilled(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        panel.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 120));

        B5.setText("5");
        B5.setContentAreaFilled(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        panel.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 120, 120));

        B8.setText("8");
        B8.setContentAreaFilled(false);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        panel.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 120, 120));

        B3.setText("3");
        B3.setContentAreaFilled(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        panel.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 120, 120));

        B6.setText("6");
        B6.setContentAreaFilled(false);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        panel.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, 120));

        B9.setText("9");
        B9.setContentAreaFilled(false);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        panel.add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 120, 120));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Puzzle");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 30));

        CLOSE.setBackground(new java.awt.Color(255, 255, 255));
        CLOSE.setText("X");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        jPanel2.add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 40, 30));

        MINIMISE.setBackground(new java.awt.Color(255, 255, 255));
        MINIMISE.setText("-");
        MINIMISE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINIMISEActionPerformed(evt);
            }
        });
        jPanel2.add(MINIMISE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 40, 30));

        RESTART.setBackground(new java.awt.Color(255, 255, 255));
        RESTART.setText("RESTART");
        RESTART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTARTActionPerformed(evt);
            }
        });

        ORIGINAL.setBackground(new java.awt.Color(255, 255, 255));
        ORIGINAL.setText("ORIGINAL");
        ORIGINAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORIGINALActionPerformed(evt);
            }
        });

        CHOOSE.setBackground(new java.awt.Color(255, 255, 255));
        CHOOSE.setText("CHOOSE");
        CHOOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHOOSEActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HIGH SCORE");

        TIMER.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TIMER.setForeground(new java.awt.Color(255, 255, 255));

        HIGH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HIGH.setForeground(new java.awt.Color(255, 255, 255));

        solve.setText("jButton1");
        solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HIGH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RESTART, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ORIGINAL, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(CHOOSE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TIMER, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(solve)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(RESTART)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ORIGINAL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CHOOSE)
                        .addGap(44, 44, 44)
                        .addComponent(solve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TIMER, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HIGH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ab kar runo 
    // khel le thoda sahi hai naa itna ???
    private void initializer(){
        buttons.add(B1);
        buttons.add(B2);
        buttons.add(B3);
        buttons.add(B4);
        buttons.add(B5);
        buttons.add(B6);
        buttons.add(B7);
        buttons.add(B8);
        HIGH.setText(highscore);
        //solve.setVisible(false);
        solve.setOpaque(false);
        solve.setContentAreaFilled(false);
        solve.setBorderPainted(false);
        //panel.setLayout(new GridLayout(3,3,0,0));
    }
    
    private void counter(){
        timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask(){ 
            int count=-1;
            public void run() { 
            count++; 
            TIMER.setText(String.valueOf(count)); 
        }
        }, new Date(), 1000); 
    }
    
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        String s=B1.getLabel();
        Icon temp=B1.getIcon();
        if(B2.getLabel().equals("9")){
            B1.setIcon(B2.getIcon());  
            B2.setIcon(temp);
            B1.setLabel(B2.getLabel());
            B2.setLabel(s);
        }else if(B4.getLabel().equals("9")){
            B1.setIcon(B4.getIcon());  
            B4.setIcon(temp);
            B1.setLabel(B4.getLabel());
            B4.setLabel(s);
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CLOSEActionPerformed

    private void MINIMISEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINIMISEActionPerformed
        this.setExtendedState(ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_MINIMISEActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        String s=B8.getLabel();
        Icon temp=B8.getIcon();
        if(B9.getLabel().equals("9")){
            B8.setIcon(B9.getIcon());  
            B9.setIcon(temp);
            B8.setLabel(B9.getLabel());
            B9.setLabel(s);
        }else if(B7.getLabel().equals("9")){
            B8.setIcon(B7.getIcon());  
            B7.setIcon(temp);
            B8.setLabel(B7.getLabel());
            B7.setLabel(s);
        }else if(B5.getLabel().equals("9")){
            B8.setIcon(B5.getIcon());  
            B5.setIcon(temp);
            B8.setLabel(B5.getLabel());
            B5.setLabel(s);
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        String s=B3.getLabel();
        Icon temp=B3.getIcon();
        if(B2.getLabel().equals("9")){
            B3.setIcon(B2.getIcon());  
            B2.setIcon(temp);
            B3.setLabel(B2.getLabel());
            B2.setLabel(s);
        }else if(B6.getLabel().equals("9")){
            B3.setIcon(B6.getIcon());  
            B6.setIcon(temp);
            B3.setLabel(B6.getLabel());
            B6.setLabel(s);
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        String s=B7.getLabel();
        Icon temp=B7.getIcon();
        if(B4.getLabel().equals("9")){
            B7.setIcon(B4.getIcon());  
            B4.setIcon(temp);
            B7.setLabel(B4.getLabel());
            B4.setLabel(s);
        }else if(B8.getLabel().equals("9")){
            B7.setIcon(B8.getIcon());  
            B8.setIcon(temp);
            B7.setLabel(B8.getLabel());
            B8.setLabel(s);
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        String s=B2.getLabel();
        Icon temp=B2.getIcon();
        if(B1.getLabel().equals("9")){
            B2.setIcon(B1.getIcon());  
            B1.setIcon(temp);
            B2.setLabel(B1.getLabel());
            B1.setLabel(s);
        }else if(B3.getLabel().equals("9")){
            B2.setIcon(B3.getIcon());  
            B3.setIcon(temp);
            B2.setLabel(B3.getLabel());
            B3.setLabel(s);
        }else if(B5.getLabel().equals("9")){
            B2.setIcon(B5.getIcon());  
            B5.setIcon(temp);
            B2.setLabel(B5.getLabel());
            B5.setLabel(s);
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        String s=B4.getLabel();
        Icon temp=B4.getIcon();
        if(B1.getLabel().equals("9")){
            B4.setIcon(B1.getIcon());  
            B1.setIcon(temp);
            B4.setLabel(B1.getLabel());
            B1.setLabel(s);
        }else if(B7.getLabel().equals("9")){
            B4.setIcon(B7.getIcon());  
            B7.setIcon(temp);
            B4.setLabel(B7.getLabel());
            B7.setLabel(s);
        }else if(B5.getLabel().equals("9")){
            B4.setIcon(B5.getIcon());  
            B5.setIcon(temp);
            B4.setLabel(B5.getLabel());
            B5.setLabel(s);
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        String s=B6.getLabel();
        Icon temp=B6.getIcon();
        if(B9.getLabel().equals("9")){
            B6.setIcon(B9.getIcon());  
            B9.setIcon(temp);
            B6.setLabel(B9.getLabel());
            B9.setLabel(s);
        }else if(B3.getLabel().equals("9")){
            B6.setIcon(B3.getIcon());  
            B3.setIcon(temp);
            B6.setLabel(B3.getLabel());
            B3.setLabel(s);
        }else if(B5.getLabel().equals("9")){
            B6.setIcon(B5.getIcon());  
            B5.setIcon(temp);
            B6.setLabel(B5.getLabel());
            B5.setLabel(s);
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        String s=B5.getLabel();
        Icon temp=B5.getIcon();
        if(B2.getLabel().equals("9")){
            B5.setIcon(B2.getIcon());  
            B2.setIcon(temp);
            B5.setLabel(B2.getLabel());
            B2.setLabel(s);
        }else if(B4.getLabel().equals("9")){
            B5.setIcon(B4.getIcon());  
            B4.setIcon(temp);
            B5.setLabel(B4.getLabel());
            B4.setLabel(s);
        }else if(B6.getLabel().equals("9")){
            B5.setIcon(B6.getIcon());  
            B6.setIcon(temp);
            B5.setLabel(B6.getLabel());
            B6.setLabel(s);
        }else if(B8.getLabel().equals("9")){
            B5.setIcon(B8.getIcon());  
            B8.setIcon(temp);
            B5.setLabel(B8.getLabel());
            B8.setLabel(s);
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        String s=B9.getLabel();
        Icon temp=B9.getIcon();
        if(B6.getLabel().equals("9")){
            B9.setIcon(B6.getIcon());  
            B6.setIcon(temp);
            B9.setLabel(B6.getLabel());
            B6.setLabel(s);
        }else if(B8.getLabel().equals("9")){
            B9.setIcon(B8.getIcon());  
            B8.setIcon(temp);
            B9.setLabel(B8.getLabel());
            B8.setLabel(s);
        }
        if(B1.getLabel().equals("1")&&B2.getLabel().equals("2")&&B3.getLabel().equals("3")&&B4.getLabel().equals("4")&&B5.getLabel().equals("5")&&B6.getLabel().equals("6")&&B7.getLabel().equals("7")&&B8.getLabel().equals("8")&&B9.getLabel().equals("9")){
            won();
        }
    }//GEN-LAST:event_B9ActionPerformed
    
    private void won(){
        timer.cancel();
        JDialog.setDefaultLookAndFeelDecorated(false);
        if(HIGH.getText().equals("0")){
            JOptionPane.showMessageDialog(null,"Congratulations!\nNew High Score : "+TIMER.getText());
            highscore=TIMER.getText();
            HIGH.setText(highscore);
        }
        else if(Integer.valueOf(TIMER.getText())<Integer.valueOf(HIGH.getText())){
            JOptionPane.showMessageDialog(null,"Congratulations!\nNew High Score : "+TIMER.getText());
            highscore=TIMER.getText();
            HIGH.setText(highscore);
        }else{
            JOptionPane.showMessageDialog(null,"Congratulations!\nYou Win \nScore: "+TIMER.getText());
        }
    }
    
    private void ORIGINALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORIGINALActionPerformed
        original or=new original(imageidd);
        or.setVisible(true);
        or.setLocationRelativeTo(this);
    }//GEN-LAST:event_ORIGINALActionPerformed

    private void RESTARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTARTActionPerformed
        //JOptionPane.showMessageDialog(null, B1.getLabel()+B2.getLabel()+B3.getLabel()+B4.getLabel()+B5.getLabel()+B6.getLabel()+B7.getLabel()+B8.getLabel()+B9.getLabel());
        timer.cancel();
        counter();
        seticons();
    }//GEN-LAST:event_RESTARTActionPerformed

    private void CHOOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOOSEActionPerformed
        choose ch=new choose(imageidd,highscore);
        ch.setVisible(true);
        ch.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_CHOOSEActionPerformed

    private void solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveActionPerformed
        won();
    }//GEN-LAST:event_solveActionPerformed
    
    public void seticons(){
        ImageIcon B1i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_001.jpg"));
        ImageIcon B2i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_002.jpg"));
        ImageIcon B3i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_003.jpg"));
        ImageIcon B4i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_004.jpg"));
        ImageIcon B5i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_005.jpg"));
        ImageIcon B6i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_006.jpg"));
        ImageIcon B7i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_007.jpg"));
        ImageIcon B8i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_008.jpg"));
        ImageIcon B9i = new ImageIcon(this.getClass().getResource("images/"+imageidd+"/image_part_009.jpg"));
        Collections.shuffle(buttons);
        buttons.get(0).setIcon(B1i);
        buttons.get(1).setIcon(B2i);
        buttons.get(2).setIcon(B3i);
        buttons.get(3).setIcon(B4i);
        buttons.get(4).setIcon(B5i);
        buttons.get(5).setIcon(B6i);
        buttons.get(6).setIcon(B7i);
        buttons.get(7).setIcon(B8i);
        B9.setIcon(B9i);
        buttons.get(0).setText("1");
        buttons.get(1).setText("2");
        buttons.get(2).setText("3");
        buttons.get(3).setText("4");
        buttons.get(4).setText("5");
        buttons.get(5).setText("6");
        buttons.get(6).setText("7");
        buttons.get(7).setText("8");
        B9.setText("9");    
    }
    
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UI lol=new UI("1","0");
                FrameDragListener frameDragListener = new FrameDragListener(lol);
                lol.addMouseListener(frameDragListener);
                lol.addMouseMotionListener(frameDragListener);
            }
        });
        //SwingUtilities.invokeLater(runnable);
    }
    
    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton CHOOSE;
    private javax.swing.JButton CLOSE;
    private javax.swing.JLabel HIGH;
    private javax.swing.JButton MINIMISE;
    private javax.swing.JButton ORIGINAL;
    private javax.swing.JButton RESTART;
    private javax.swing.JLabel TIMER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel;
    private javax.swing.JButton solve;
    // End of variables declaration//GEN-END:variables
}
