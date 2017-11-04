package accesstoroutine.fall_2017;

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
    private String lab="";
    
    public RoutineBYSemesterGUI() {
        initComponents();
        cbLab1.setEnabled(false);
        cbLab2.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        semesterField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sectionComboBox = new javax.swing.JComboBox();
        btnFindRoutine = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbLab1 = new javax.swing.JCheckBox();
        cbLab2 = new javax.swing.JCheckBox();
        btnPrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        routineTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Access To Routine");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
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
        jLabel6.setText("Select Section");

        sectionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" }));
        sectionComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sectionComboBoxItemStateChanged(evt);
            }
        });

        btnFindRoutine.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnFindRoutine.setText("Find Routine");
        btnFindRoutine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindRoutineActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("Select Lab");

        buttonGroup1.add(cbLab1);
        cbLab1.setText("LAB1");

        buttonGroup1.add(cbLab2);
        cbLab2.setText("LAB2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFindRoutine))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(semesterField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(cbLab1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbLab2)
                                .addGap(14, 14, 14)))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbLab1)
                    .addComponent(cbLab2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindRoutine)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
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
        routineTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(routineTable);

        btnBack.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(397, 397, 397))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1013, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void semesterFieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semesterFieldMouseMoved
        if(firstTime==true){
            semesterField.setText("");
            firstTime=false;
        }
    }//GEN-LAST:event_semesterFieldMouseMoved

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        close();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        semesterField.setText("");
        sectionComboBox.setSelectedItem("Select");
        cbLab1.setSelected(false);
        cbLab2.setSelected(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFindRoutineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindRoutineActionPerformed
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
                if(cbLab1.isSelected()){
                    lab=cbLab1.getText();
                }else if(cbLab2.isSelected()){
                    lab=cbLab2.getText();
                }else{
                    lab="";
                }
                
                if(lab.equalsIgnoreCase("lab1")){
                    findRoutineWithSectionAndLab("lab2", 2); // send the reverse value
                }
                else if(lab.equalsIgnoreCase("lab2")){
                    findRoutineWithSectionAndLab("lab1", 1); // send the reverse value
                }else{
                    findRoutineWithSection();
                }
            } catch (Exception e) {
                DefaultTableModel model = (DefaultTableModel) routineTable.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(this, "Please Enter Only Integer Values", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            }
        
        }
        
        
    }//GEN-LAST:event_btnFindRoutineActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
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
    }//GEN-LAST:event_btnPrintActionPerformed

    private void sectionComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sectionComboBoxItemStateChanged
        String selectedGroup=sectionComboBox.getSelectedItem().toString();
        
        if(selectedGroup.equalsIgnoreCase("select")){
            cbLab1.setEnabled(false);
            cbLab2.setEnabled(false);
            buttonGroup1.clearSelection();
        }else{
            cbLab1.setEnabled(true);
            cbLab2.setEnabled(true);
        }
    }//GEN-LAST:event_sectionComboBoxItemStateChanged
           
    
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
    
    
    /*
     * @ Fidn Routine with section and lab 
    */
    
    private void findRoutineWithSectionAndLab(String revLabName, int revLabNo){
        DefaultTableModel model = (DefaultTableModel) routineTable.getModel();
        // set deafult row as 0 / zero !
        model.setRowCount(0);
        
        if(takeSemester==1){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE111"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE112"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("PHY114"+selectedSection).toLowerCase())){

                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE111"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE112"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("PHY114"+selectedSection + revLabNo).toLowerCase())
                      ){
                        
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
                }
            }
            if(flag==1){
                JOptionPane.showMessageDialog(this, "Sorry No Matched Subject Found !", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }else if(takeSemester==2){
            int flag=1;
            for(int i=0;i<Main.countRoutineInfo;i++){
                if(Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE121"+selectedSection).toLowerCase())||
                        Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE122"+selectedSection).toLowerCase())||
                            Main.routineInfo[i].getCourseCode().toLowerCase().contains(("MAT113"+selectedSection).toLowerCase())||
                                Main.routineInfo[i].getCourseCode().toLowerCase().contains(("ENG123"+selectedSection).toLowerCase())){
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE121"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE122"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("MAT113"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("ENG123"+selectedSection + revLabNo).toLowerCase())     
                      ){
                                    
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE133"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE231"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("MAT221"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("STA134"+selectedSection + revLabNo).toLowerCase())
                      ){
                        
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                   
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE132"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE213"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE211"+selectedSection + revLabNo).toLowerCase())
                      ){
                                    
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE223"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE222"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE224"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE233"+selectedSection + revLabNo).toLowerCase())
                      ){
                        
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE131"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE232"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("ACC124"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE212"+selectedSection + revLabNo).toLowerCase())
                      ){
                        
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE323"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE312"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE322"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE313"+selectedSection + revLabNo).toLowerCase())
                      ){
                     
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE321"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE333"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE413"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE311"+selectedSection + revLabNo).toLowerCase())
                      ){
                     
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE412"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE331"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE422"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE424"+selectedSection + revLabNo).toLowerCase())
                      ){
                     
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE423"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE425"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE426"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE332"+selectedSection + revLabNo).toLowerCase())
                      ){
                                    
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
                    
                    if(!Main.routineInfo[i].getCourseCode().toLowerCase().contains(revLabName.toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE435"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE421"+selectedSection + revLabNo).toLowerCase())&&
                       !Main.routineInfo[i].getCourseCode().toLowerCase().contains(("SWE439"+selectedSection + revLabNo).toLowerCase())
                      ){
                     
                                model.addRow(new Object[]{Main.routineInfo[i].getClassRoomNumber(),Main.routineInfo[i].getCourseCode(),Main.routineInfo[i].getTeacherInitial()
                                        ,Main.routineInfo[i].getDay(),Main.routineInfo[i].getTime()});
                                flag=0;
                    }
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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFindRoutine;
    private javax.swing.JButton btnPrint;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbLab1;
    private javax.swing.JCheckBox cbLab2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
