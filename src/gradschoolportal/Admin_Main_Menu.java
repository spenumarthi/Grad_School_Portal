/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradschoolportal;

import java.awt.Dimension;
import java.awt.Window;
import javax.swing.JDesktopPane;

/**
 *
 * @author muham
 */
public class Admin_Main_Menu extends javax.swing.JInternalFrame {

    int user_id;
    
    public Admin_Main_Menu() {
        initComponents();
    }
    
    public Admin_Main_Menu(int user_id) {
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

        director_logout = new javax.swing.JLabel();
        login_title_label = new javax.swing.JLabel();
        maintenance = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(640, 480));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_title_label, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(director_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addContainerGap(265, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel director_logout;
    public javax.swing.JLabel login_title_label;
    public javax.swing.JButton maintenance;
    // End of variables declaration//GEN-END:variables
}
