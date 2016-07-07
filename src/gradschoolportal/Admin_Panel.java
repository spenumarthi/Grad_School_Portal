/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradschoolportal;

import java.awt.Dimension;

/**
 *
 * @author muham
 */
public class Admin_Panel extends javax.swing.JFrame {

    int user_id;
    
    public Admin_Panel() {
        initComponents();
    }
    
    public Admin_Panel(int user_id){
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

        admin_desktop = new javax.swing.JDesktopPane();
        admin_panel_menu = new javax.swing.JMenuBar();
        admin_panel_menu_file = new javax.swing.JMenu();
        admin_panel_menu_file_main_menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        admin_desktop.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout admin_desktopLayout = new javax.swing.GroupLayout(admin_desktop);
        admin_desktop.setLayout(admin_desktopLayout);
        admin_desktopLayout.setHorizontalGroup(
            admin_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        admin_desktopLayout.setVerticalGroup(
            admin_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        admin_panel_menu_file.setText("File");

        admin_panel_menu_file_main_menu.setText("Main Menu");
        admin_panel_menu_file_main_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_panel_menu_file_main_menuActionPerformed(evt);
            }
        });
        admin_panel_menu_file.add(admin_panel_menu_file_main_menu);

        admin_panel_menu.add(admin_panel_menu_file);

        setJMenuBar(admin_panel_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin_desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin_desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_panel_menu_file_main_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_panel_menu_file_main_menuActionPerformed
        // TODO add your handling code here:
        Admin_Main_Menu ammObj = new Admin_Main_Menu(user_id);
        admin_desktop.add(ammObj);
        Dimension at = admin_desktop.getSize();
        Dimension amm = ammObj.getSize();
        ammObj.setLocation((at.width - amm.width) / 2, (at.height - amm.height) / 2);
        ammObj.setVisible(true);
    }//GEN-LAST:event_admin_panel_menu_file_main_menuActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane admin_desktop;
    public javax.swing.JMenuBar admin_panel_menu;
    public javax.swing.JMenu admin_panel_menu_file;
    public javax.swing.JMenuItem admin_panel_menu_file_main_menu;
    // End of variables declaration//GEN-END:variables
}
