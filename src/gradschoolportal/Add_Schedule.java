/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradschoolportal;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Sundar
 */
public class Add_Schedule extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_Schedule
     */
    public Add_Schedule() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_title_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        schedule_year = new javax.swing.JTextField();
        add_schedule = new javax.swing.JButton();
        cancel_schedule = new javax.swing.JButton();
        term_error = new javax.swing.JLabel();
        year_error = new javax.swing.JLabel();
        schedule_term = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(480, 440));

        login_title_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login_title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_title_label.setText("Oklahoma Christian University");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Schedule");

        jLabel2.setText("Term:");

        jLabel3.setText("Year");

        schedule_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                schedule_yearKeyReleased(evt);
            }
        });

        add_schedule.setText("Add");
        add_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_scheduleActionPerformed(evt);
            }
        });

        cancel_schedule.setText("Cancel");
        cancel_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_scheduleActionPerformed(evt);
            }
        });

        term_error.setForeground(new java.awt.Color(255, 0, 0));

        year_error.setForeground(new java.awt.Color(255, 0, 0));

        schedule_term.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Fall", "Spring", "Summer" }));
        schedule_term.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                schedule_termPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_title_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(add_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(schedule_year, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(schedule_term, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(term_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(year_error, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(schedule_term)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(term_error)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schedule_year, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_error))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(223, 223, 223))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void schedule_yearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schedule_yearKeyReleased
        // TODO add your handling code here:
        if (schedule_year.getText().equals("")) {

        } else {
            year_error.setText("");
        }
    }//GEN-LAST:event_schedule_yearKeyReleased

    private void add_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_scheduleActionPerformed
        // TODO add your handling code here:
        String term = schedule_term.getSelectedItem().toString();
        if (term.equals(" ")) {
            term_error.setText("*Required");
        } else {
            String year = schedule_year.getText();
            if (year.equals("")) {
                year_error.setText("*Required");
            } else {
                Generate_Schedule_Class gscObj = new Generate_Schedule_Class();
                if (gscObj.check(term, year)) {
                    JOptionPane.showMessageDialog(rootPane, "Schedule for this term and year is already generated.");
                } else {
                    JOptionPane.showMessageDialog(null, "Generating Schedule. Please wait...");
                    if (gscObj.add_schedule(term, year)) {
                        JOptionPane.showMessageDialog(null, "Schedule generated. Please refresh.");
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error while generating schedule.");
                    }
                }
            }
        }
    }//GEN-LAST:event_add_scheduleActionPerformed

    private void cancel_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_scheduleActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancel_scheduleActionPerformed

    private void schedule_termPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_schedule_termPropertyChange
        // TODO add your handling code here:
        if (schedule_term.getSelectedItem().toString().equals(" ")) {

        } else {
            term_error.setText("");
        }
    }//GEN-LAST:event_schedule_termPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add_schedule;
    public javax.swing.JButton cancel_schedule;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel login_title_label;
    public javax.swing.JComboBox schedule_term;
    public javax.swing.JTextField schedule_year;
    public javax.swing.JLabel term_error;
    public javax.swing.JLabel year_error;
    // End of variables declaration//GEN-END:variables
}
