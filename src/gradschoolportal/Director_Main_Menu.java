package gradschoolportal;

import java.awt.Dimension;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.*;

public class Director_Main_Menu extends javax.swing.JInternalFrame {

    int user_id;
    
    /**
     * Creates new form Director_Main_Menu
     */
    public Director_Main_Menu() {
        initComponents();
    }
    
    public Director_Main_Menu(int user_id){
        initComponents();
        this.user_id = user_id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        director_logout = new javax.swing.JLabel();
        login_title_label = new javax.swing.JLabel();
        maintenance = new javax.swing.JButton();
        user_information = new javax.swing.JButton();
        generate_schedule = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Main Menu");
        setPreferredSize(new java.awt.Dimension(640, 480));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        director_logout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        director_logout.setText("<HTML><a href=\"\">User : Sign Out</a></HTML>");
        director_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        director_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                director_logoutMouseClicked(evt);
            }
        });

        login_title_label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        login_title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_title_label.setText("Oklahoma Christian University");

        maintenance.setBackground(new java.awt.Color(51, 153, 255));
        maintenance.setText("Maintenance");
        maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceActionPerformed(evt);
            }
        });

        user_information.setBackground(new java.awt.Color(51, 153, 255));
        user_information.setText("User Information");
        user_information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_informationActionPerformed(evt);
            }
        });

        generate_schedule.setBackground(new java.awt.Color(51, 153, 255));
        generate_schedule.setText("Generate Schedule");
        generate_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_scheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_title_label, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(director_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(generate_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(user_information, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 464, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(director_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_information, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generate_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void director_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_director_logoutMouseClicked
        // TODO add your handling code here:
        Window win[] = java.awt.Window.getWindows();
        for (Window win1 : win) {
            win1.dispose();
        }
        Login_Form lfObj = new Login_Form();
        lfObj.setLocationRelativeTo(null);
        lfObj.pack();
        lfObj.setVisible(true);
    }//GEN-LAST:event_director_logoutMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void maintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceActionPerformed
        // TODO add your handling code here:
        Director_Maintenance dmObj = new Director_Maintenance(user_id);
        JDesktopPane desktop = this.getDesktopPane();
        desktop.add(dmObj);
        Dimension dt = desktop.getSize();
        Dimension dm = dmObj.getSize();
        dmObj.setLocation((dt.width - dm.width) / 2, (dt.height - dm.height) / 2);
        dmObj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_maintenanceActionPerformed

    private void user_informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_informationActionPerformed
        // TODO add your handling code here:
        User_Info uiObj = new User_Info(user_id);
        JDesktopPane desktop = this.getDesktopPane();
        desktop.add(uiObj);
        Dimension dt = desktop.getSize();
        Dimension dm = uiObj.getSize();
        uiObj.setLocation((dt.width - dm.width) / 2, (dt.height - dm.height) / 2);
        uiObj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_user_informationActionPerformed

    private void generate_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_scheduleActionPerformed
        // TODO add your handling code here:
        Generate_Schedule gsObj = new Generate_Schedule(user_id);
        JDesktopPane desktop = this.getDesktopPane();
        desktop.add(gsObj);
        Dimension dt = desktop.getSize();
        Dimension dm = gsObj.getSize();
        gsObj.setLocation((dt.width - dm.width) / 2, (dt.height - dm.height) / 2);
        gsObj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_generate_scheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel director_logout;
    public javax.swing.JButton generate_schedule;
    public javax.swing.JFileChooser jFileChooser1;
    public javax.swing.JLabel login_title_label;
    public javax.swing.JButton maintenance;
    public javax.swing.JButton user_information;
    // End of variables declaration//GEN-END:variables
}