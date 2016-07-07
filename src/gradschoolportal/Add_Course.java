/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradschoolportal;

import javax.swing.JOptionPane;

/**
 *
 * @author muham
 */

public class Add_Course extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_Course
     */
    public Add_Course() {
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
        course_code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        course_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        course_description = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        course_hours = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        course_capacity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        course_prereq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        add_course = new javax.swing.JButton();
        cancel_course = new javax.swing.JButton();
        course_semester = new javax.swing.JComboBox();
        code_error = new javax.swing.JLabel();
        name_error = new javax.swing.JLabel();
        description_error = new javax.swing.JLabel();
        hours_error = new javax.swing.JLabel();
        capacity_error = new javax.swing.JLabel();
        prereq_error = new javax.swing.JLabel();
        semester_error = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(480, 440));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
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

        login_title_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login_title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_title_label.setText("Oklahoma Christian University");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Courses");

        jLabel2.setText("Code: ");

        course_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_codeKeyReleased(evt);
            }
        });

        jLabel3.setText("Name: ");

        course_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_nameKeyReleased(evt);
            }
        });

        jLabel4.setText("Description: ");

        course_description.setColumns(20);
        course_description.setRows(5);
        course_description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_descriptionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(course_description);

        jLabel5.setText("Credit Hours: ");

        course_hours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_hoursKeyReleased(evt);
            }
        });

        jLabel6.setText("Capacity: ");

        course_capacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_capacityKeyReleased(evt);
            }
        });

        jLabel7.setText("Prerequisites: ");

        course_prereq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_prereqKeyReleased(evt);
            }
        });

        jLabel8.setText("Semester Offered: ");

        add_course.setText("Add");
        add_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_courseActionPerformed(evt);
            }
        });

        cancel_course.setText("Cancel");
        cancel_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_courseActionPerformed(evt);
            }
        });

        course_semester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Fall", "Spring", "Summer", "Fall & Spring", "Fall & Summer", "Spring & Summer", "All" }));
        course_semester.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                course_semesterPropertyChange(evt);
            }
        });

        code_error.setForeground(new java.awt.Color(255, 0, 0));

        name_error.setForeground(new java.awt.Color(255, 0, 0));

        description_error.setForeground(new java.awt.Color(255, 0, 0));

        hours_error.setForeground(new java.awt.Color(255, 0, 0));

        capacity_error.setForeground(new java.awt.Color(255, 0, 0));

        prereq_error.setForeground(new java.awt.Color(255, 0, 0));

        semester_error.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_title_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(course_capacity))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(course_hours, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course_prereq)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_course, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancel_course, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(course_semester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(code_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name_error, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(description_error, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(hours_error, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(capacity_error, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(prereq_error, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(semester_error, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code_error, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_error, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(description_error, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_hours, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hours_error, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacity_error, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_prereq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prereq_error, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semester_error, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(course_semester))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_course, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_course, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void add_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_courseActionPerformed
        // TODO add your handling code here:
        String fall = "";
        String spring = "";
        String summer = "";
        String teachers = "None";
        String code = course_code.getText();
        if (code.equals("")) {
            code_error.setText("*Required");
        } else {
            String name = course_name.getText();
            if (name.equals("")) {
                name_error.setText("*Required");
            } else {
                String desc = course_description.getText();
                if (desc.equals("")) {
                    description_error.setText("*Required");
                } else {
                    String hours = course_hours.getText();
                    if (hours.equals("")) {
                        hours_error.setText("*Required");
                    } else {
                        String capacity = course_capacity.getText();
                        if (capacity.equals("")) {
                            capacity_error.setText("*Required");
                        } else {
                            String prereq = course_prereq.getText();
                            if (prereq.equals("")) {
                                prereq_error.setText("*Required");
                            } else {
                                String semester = course_semester.getSelectedItem().toString();
                                if (semester.equals(" ")) {
                                    semester_error.setText("*Required");
                                } else {
                                    switch (semester) {
                                        case "Fall":
                                            fall = "Y";
                                            spring = "N";
                                            summer = "N";
                                            break;
                                        case "Spring":
                                            fall = "N";
                                            spring = "Y";
                                            summer = "N";
                                            break;
                                        case "Summer":
                                            fall = "N";
                                            spring = "N";
                                            summer = "Y";
                                            break;
                                        case "Fall & Spring":
                                            fall = "Y";
                                            spring = "Y";
                                            summer = "N";
                                            break;
                                        case "Fall & Summer":
                                            fall = "Y";
                                            spring = "N";
                                            summer = "Y";
                                            break;
                                        case "Spring & Summer":
                                            fall = "N";
                                            spring = "Y";
                                            summer = "Y";
                                            break;
                                        case "All":
                                            fall = "Y";
                                            spring = "Y";
                                            summer = "Y";
                                            break;
                                    }
                                    Courses_Info_Class cicObj = new Courses_Info_Class();
                                    if(cicObj.add_course(code, name, desc, hours, capacity, prereq, fall, spring, summer, teachers)){
                                        JOptionPane.showMessageDialog(rootPane, "Course added successfully.");
                                        course_code.setText("");
                                        course_name.setText("");
                                        course_description.setText("");
                                        course_hours.setText("");
                                        course_capacity.setText("");
                                        course_prereq.setText("");
                                        course_semester.setSelectedIndex(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_add_courseActionPerformed

    private void course_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_codeKeyReleased
        // TODO add your handling code here:
        if(course_code.getText().equals("")){
            
        } else{
            code_error.setText("");
        }
    }//GEN-LAST:event_course_codeKeyReleased

    private void course_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_nameKeyReleased
        // TODO add your handling code here:
        if(course_name.getText().equals("")){
            
        } else{
            name_error.setText("");
        }
    }//GEN-LAST:event_course_nameKeyReleased

    private void course_descriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_descriptionKeyReleased
        // TODO add your handling code here:
        if(course_description.getText().equals("")){
            
        } else{
            description_error.setText("");
        }
    }//GEN-LAST:event_course_descriptionKeyReleased

    private void course_hoursKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_hoursKeyReleased
        // TODO add your handling code here:
        if(course_hours.getText().equals("")){
            
        } else{
            hours_error.setText("");
        }
    }//GEN-LAST:event_course_hoursKeyReleased

    private void course_capacityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_capacityKeyReleased
        // TODO add your handling code here:
        if(course_capacity.getText().equals("")){
            
        } else{
            capacity_error.setText("");
        }
    }//GEN-LAST:event_course_capacityKeyReleased

    private void course_prereqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_prereqKeyReleased
        // TODO add your handling code here:
        if(course_prereq.getText().equals("")){

        } else{
            prereq_error.setText("");
        }
    }//GEN-LAST:event_course_prereqKeyReleased

    private void course_semesterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_course_semesterPropertyChange
        // TODO add your handling code here:
        if(course_semester.getSelectedItem().toString().equals(" ")){

        } else{
            semester_error.setText("");
        }
    }//GEN-LAST:event_course_semesterPropertyChange

    private void cancel_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_courseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancel_courseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add_course;
    public javax.swing.JButton cancel_course;
    public javax.swing.JLabel capacity_error;
    public javax.swing.JLabel code_error;
    public javax.swing.JTextField course_capacity;
    public javax.swing.JTextField course_code;
    public javax.swing.JTextArea course_description;
    public javax.swing.JTextField course_hours;
    public javax.swing.JTextField course_name;
    public javax.swing.JTextField course_prereq;
    public javax.swing.JComboBox course_semester;
    public javax.swing.JLabel description_error;
    public javax.swing.JLabel hours_error;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel login_title_label;
    public javax.swing.JLabel name_error;
    public javax.swing.JLabel prereq_error;
    public javax.swing.JLabel semester_error;
    // End of variables declaration//GEN-END:variables
}
