package test5;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RoutineBYSemesterGUI extends javax.swing.JFrame {
    boolean firstTime=true;
    
    String selectedSection="";
    int takeSemester=0;
    
    public RoutineBYSemesterGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        semesterField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sectionComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        routineTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Access To Routine");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("Daffodil International University");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Daffodil International University");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel4.setText("Access To Routine");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search By Semester", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 20))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("Enter Semester");

        semesterField.setText("Enter Integer Value");
        semesterField.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                semesterFieldMouseMoved(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("Enter Section");

        sectionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));

        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setText("Find Routine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semesterField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(semesterField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        routineTable.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        routineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class Room Number", "Course Code", "Teacher Initial", "Day", "Time"
            }
        ));
        jScrollPane1.setViewportView(routineTable);

        jButton3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton2))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semesterFieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semesterFieldMouseMoved
        if(firstTime==true){
            semesterField.setText("");
            firstTime=false;
        }
    }//GEN-LAST:event_semesterFieldMouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int choice =JOptionPane.showConfirmDialog(this, "Are You Really want to Close the Program?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        close();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        semesterField.setText("");
        sectionComboBox.setSelectedItem("Select");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selectedGroup=sectionComboBox.getSelectedItem().toString();
        
        if(semesterField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter a Semester", "Blank Input", JOptionPane.WARNING_MESSAGE);
        }
        else{ 
            try {
                takeSemester=Integer.parseInt(semesterField.getText());

                if(selectedGroup.equalsIgnoreCase("Select")){
                    selectedSection="";
                }else{
                    selectedSection=selectedGroup;
                }

                if(selectedSection.equals("")){
                    findRoutineWithoutSection();
                }
                else{
                    findRoutineWithSection();            
                }
            } catch (Exception e) {
                DefaultTableModel model = (DefaultTableModel) routineTable.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(this, "Please Enter Only Integer Values", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            }
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MessageFormat header = new MessageFormat("Result Printed");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        
        DefaultTableModel model = (DefaultTableModel) routineTable.getModel();
        try {
            if(model.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Nothing To Print", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                routineTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Can not Print The Result", "Internal Problem Occur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void findRoutineWithoutSection(){
        DefaultTableModel model = (DefaultTableModel) routineTable.getModel();
        // set deafult row as 0 / zero !
        model.setRowCount(0);
        
        if(takeSemester==1){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE111").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE112").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("PHY114").toLowerCase())){
                    
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==2){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE121").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE122").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("MAT113").toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("ENG123").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==3){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE133").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE231").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("MAT221").toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("STA134").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==4){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE132").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE213").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE211").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==5){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE223").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE222").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE224").toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE233").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==6){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE131").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE232").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("ACC124").toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE212").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==7){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE323").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE312").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE322").toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE313").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==8){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE321").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE333").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE413").toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE311").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==9){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE412").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE331").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE422").toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE424").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==10){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE423").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE425").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE426").toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE332").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==11){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE435").toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE421").toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE439").toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Sorry The System will not able to show the routine for this Semester", "Information", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    
    private void findRoutineWithSection(){
        DefaultTableModel model = (DefaultTableModel) routineTable.getModel();
        // set deafult row as 0 / zero !
        model.setRowCount(0);
        
        if(takeSemester==1){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE111"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE112"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("PHY114"+selectedSection).toLowerCase())){
                    
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==2){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE121"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE122"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("MAT113"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("ENG123"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==3){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE133"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE231"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("MAT221"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("STA134"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==4){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE132"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE213"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE211"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==5){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE223"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE222"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE224"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE233"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==6){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE131"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE232"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("ACC124"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE212"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==7){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE323"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE312"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE322"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE313"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==8){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE321"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE333"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE413"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE311"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==9){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE412"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE331"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE422"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE424"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==10){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE423"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE425"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE426"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE332"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(takeSemester==11){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE435"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE421"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE439"+selectedSection).toLowerCase())){
                    
                                    model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                    flag=0;
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Sorry The System will not able to show the routine for this Semester", "Information", JOptionPane.WARNING_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(RoutineBYSemesterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoutineBYSemesterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoutineBYSemesterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoutineBYSemesterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoutineBYSemesterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable routineTable;
    private javax.swing.JComboBox sectionComboBox;
    private javax.swing.JTextField semesterField;
    // End of variables declaration//GEN-END:variables
    
    private void close(){
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
}
