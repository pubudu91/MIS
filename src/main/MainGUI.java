/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import view.student.AddStudent;

/**
 *
 * @author Mampitiya
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mainTabPane = new javax.swing.JTabbedPane();
        studentPane = new javax.swing.JPanel();
        btnPane1 = new javax.swing.JPanel();
        addStudentBtn = new javax.swing.JButton();
        searchStudentBtn = new javax.swing.JButton();
        updateStudentBtn = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        studentDesktopPane = new javax.swing.JDesktopPane();
        examPane = new javax.swing.JPanel();
        btnPane2 = new javax.swing.JPanel();
        addExamBtn = new javax.swing.JButton();
        updateExamBtn = new javax.swing.JButton();
        deleteExamBtn = new javax.swing.JButton();
        detailLbl1 = new javax.swing.JLabel();
        examDesktopPane = new javax.swing.JDesktopPane();
        paymentPane = new javax.swing.JPanel();
        btnPane3 = new javax.swing.JPanel();
        addPaymentBtn = new javax.swing.JButton();
        updateExamBtn1 = new javax.swing.JButton();
        deletePaymentBtn = new javax.swing.JButton();
        detailLbl2 = new javax.swing.JLabel();
        examDesktopPane1 = new javax.swing.JDesktopPane();
        employeePane = new javax.swing.JPanel();
        btnPane4 = new javax.swing.JPanel();
        addEmployeeBtn = new javax.swing.JButton();
        searchEmployeeBtn = new javax.swing.JButton();
        updateEmployeeBtn = new javax.swing.JButton();
        deleteEmployeeBtn = new javax.swing.JButton();
        workDetailBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        helpBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setPreferredSize(new java.awt.Dimension(670, 433));

        mainTabPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        studentPane.setToolTipText("Student");

        addStudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/student_images/addStudent.png"))); // NOI18N
        addStudentBtn.setText("Add");
        addStudentBtn.setIconTextGap(33);
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });

        searchStudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/student_images/searchStudent.png"))); // NOI18N
        searchStudentBtn.setText("Search");
        searchStudentBtn.setIconTextGap(20);

        updateStudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/student_images/updateStudent.png"))); // NOI18N
        updateStudentBtn.setText("Update");
        updateStudentBtn.setIconTextGap(20);

        deleteStudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/student_images/deleteStudent.png"))); // NOI18N
        deleteStudentBtn.setText("Delete");
        deleteStudentBtn.setIconTextGap(23);

        javax.swing.GroupLayout btnPane1Layout = new javax.swing.GroupLayout(btnPane1);
        btnPane1.setLayout(btnPane1Layout);
        btnPane1Layout.setHorizontalGroup(
            btnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addStudentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchStudentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateStudentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteStudentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnPane1Layout.setVerticalGroup(
            btnPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudentBtn)
                .addGap(18, 18, 18)
                .addComponent(searchStudentBtn)
                .addGap(18, 18, 18)
                .addComponent(updateStudentBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteStudentBtn)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        studentDesktopPane.setOpaque(false);

        javax.swing.GroupLayout studentDesktopPaneLayout = new javax.swing.GroupLayout(studentDesktopPane);
        studentDesktopPane.setLayout(studentDesktopPaneLayout);
        studentDesktopPaneLayout.setHorizontalGroup(
            studentDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        studentDesktopPaneLayout.setVerticalGroup(
            studentDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout studentPaneLayout = new javax.swing.GroupLayout(studentPane);
        studentPane.setLayout(studentPaneLayout);
        studentPaneLayout.setHorizontalGroup(
            studentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentDesktopPane)
                .addGap(14, 14, 14))
        );
        studentPaneLayout.setVerticalGroup(
            studentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
            .addComponent(studentDesktopPane)
        );

        mainTabPane.addTab("Student", new javax.swing.ImageIcon(getClass().getResource("/resources/student_images/student.png")), studentPane); // NOI18N

        examPane.setToolTipText("Exam");

        addExamBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exam_images/add_Exam.png"))); // NOI18N
        addExamBtn.setText("Add");
        addExamBtn.setIconTextGap(33);
        addExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExamBtnActionPerformed(evt);
            }
        });

        updateExamBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exam_images/update_Exam.png"))); // NOI18N
        updateExamBtn.setText("Update");
        updateExamBtn.setIconTextGap(20);

        deleteExamBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exam_images/delete_Exam.png"))); // NOI18N
        deleteExamBtn.setText("Delete");
        deleteExamBtn.setIconTextGap(23);

        javax.swing.GroupLayout btnPane2Layout = new javax.swing.GroupLayout(btnPane2);
        btnPane2.setLayout(btnPane2Layout);
        btnPane2Layout.setHorizontalGroup(
            btnPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addExamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateExamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteExamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnPane2Layout.setVerticalGroup(
            btnPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addExamBtn)
                .addGap(18, 18, 18)
                .addComponent(updateExamBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteExamBtn)
                .addGap(81, 81, 81)
                .addComponent(detailLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        examDesktopPane.setOpaque(false);

        javax.swing.GroupLayout examDesktopPaneLayout = new javax.swing.GroupLayout(examDesktopPane);
        examDesktopPane.setLayout(examDesktopPaneLayout);
        examDesktopPaneLayout.setHorizontalGroup(
            examDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        examDesktopPaneLayout.setVerticalGroup(
            examDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout examPaneLayout = new javax.swing.GroupLayout(examPane);
        examPane.setLayout(examPaneLayout);
        examPaneLayout.setHorizontalGroup(
            examPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(examDesktopPane)
                .addGap(14, 14, 14))
        );
        examPaneLayout.setVerticalGroup(
            examPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(examPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(examPaneLayout.createSequentialGroup()
                        .addComponent(btnPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addComponent(examDesktopPane))
                .addContainerGap())
        );

        mainTabPane.addTab("Exam", new javax.swing.ImageIcon(getClass().getResource("/resources/exam_images/exam.png")), examPane); // NOI18N

        paymentPane.setToolTipText("Payment");

        btnPane3.setToolTipText("Payment");

        addPaymentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/payment_images/add_Payment.png"))); // NOI18N
        addPaymentBtn.setText("Add");
        addPaymentBtn.setIconTextGap(33);
        addPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPaymentBtnActionPerformed(evt);
            }
        });

        updateExamBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/payment_images/update_Payment.png"))); // NOI18N
        updateExamBtn1.setText("Update");
        updateExamBtn1.setIconTextGap(20);

        deletePaymentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/payment_images/delete_Payment.png"))); // NOI18N
        deletePaymentBtn.setText("Delete");
        deletePaymentBtn.setIconTextGap(23);

        javax.swing.GroupLayout btnPane3Layout = new javax.swing.GroupLayout(btnPane3);
        btnPane3.setLayout(btnPane3Layout);
        btnPane3Layout.setHorizontalGroup(
            btnPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPaymentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateExamBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePaymentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnPane3Layout.setVerticalGroup(
            btnPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPaymentBtn)
                .addGap(18, 18, 18)
                .addComponent(updateExamBtn1)
                .addGap(18, 18, 18)
                .addComponent(deletePaymentBtn)
                .addGap(60, 60, 60)
                .addComponent(detailLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        examDesktopPane1.setOpaque(false);

        javax.swing.GroupLayout examDesktopPane1Layout = new javax.swing.GroupLayout(examDesktopPane1);
        examDesktopPane1.setLayout(examDesktopPane1Layout);
        examDesktopPane1Layout.setHorizontalGroup(
            examDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        examDesktopPane1Layout.setVerticalGroup(
            examDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paymentPaneLayout = new javax.swing.GroupLayout(paymentPane);
        paymentPane.setLayout(paymentPaneLayout);
        paymentPaneLayout.setHorizontalGroup(
            paymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(examDesktopPane1)
                .addGap(14, 14, 14))
        );
        paymentPaneLayout.setVerticalGroup(
            paymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paymentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examDesktopPane1)
                    .addGroup(paymentPaneLayout.createSequentialGroup()
                        .addComponent(btnPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );

        mainTabPane.addTab("Payment", new javax.swing.ImageIcon(getClass().getResource("/resources/payment_images/payment.png")), paymentPane); // NOI18N

        employeePane.setToolTipText("Employee");

        addEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/employee_images/addEmpoloyee.png"))); // NOI18N
        addEmployeeBtn.setText("Add");
        addEmployeeBtn.setIconTextGap(33);
        addEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeBtnActionPerformed(evt);
            }
        });

        searchEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/employee_images/searchEmpoloyee.png"))); // NOI18N
        searchEmployeeBtn.setText("Search");
        searchEmployeeBtn.setIconTextGap(20);

        updateEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/employee_images/updateEmpoloyee.png"))); // NOI18N
        updateEmployeeBtn.setText("Update");
        updateEmployeeBtn.setIconTextGap(20);

        deleteEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/employee_images/deleteEmpoloyee.png"))); // NOI18N
        deleteEmployeeBtn.setText("Delete");
        deleteEmployeeBtn.setIconTextGap(23);

        workDetailBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/employee_images/employeeWorkDet.png"))); // NOI18N
        workDetailBtn.setText("Working Details");

        javax.swing.GroupLayout btnPane4Layout = new javax.swing.GroupLayout(btnPane4);
        btnPane4.setLayout(btnPane4Layout);
        btnPane4Layout.setHorizontalGroup(
            btnPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workDetailBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        btnPane4Layout.setVerticalGroup(
            btnPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addEmployeeBtn)
                .addGap(18, 18, 18)
                .addComponent(searchEmployeeBtn)
                .addGap(18, 18, 18)
                .addComponent(updateEmployeeBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteEmployeeBtn)
                .addGap(18, 18, 18)
                .addComponent(workDetailBtn)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout employeePaneLayout = new javax.swing.GroupLayout(employeePane);
        employeePane.setLayout(employeePaneLayout);
        employeePaneLayout.setHorizontalGroup(
            employeePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(633, Short.MAX_VALUE))
        );
        employeePaneLayout.setVerticalGroup(
            employeePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainTabPane.addTab("Employee", new javax.swing.ImageIcon(getClass().getResource("/resources/employee_images/employee.png")), employeePane); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTabPane)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other_images/home.png"))); // NOI18N
        homeBtn.setToolTipText("Home");

        helpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other_images/help.png"))); // NOI18N
        helpBtn.setToolTipText("Help");

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other_images/shut_down.png"))); // NOI18N
        logoutBtn.setToolTipText("Logout");

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other_images/refresh.png"))); // NOI18N
        refreshBtn.setToolTipText("Refresh");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(helpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshBtn)
                    .addComponent(logoutBtn)
                    .addComponent(helpBtn)
                    .addComponent(homeBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other_images/strip.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Sasip");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        JInternalFrame frames[] = studentDesktopPane.getAllFrames();
        
        AddStudent addStudent = new AddStudent();
        studentDesktopPane.add(addStudent);
        //addStudent.setLocation(350, 150);
        addStudent.setVisible(true);        
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void addExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExamBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addExamBtnActionPerformed

    private void addPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPaymentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPaymentBtnActionPerformed

    private void addEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                MainGUI mainGUI = new MainGUI();
                mainGUI.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                System.out.println(mainGUI.getWidth()+ " "+mainGUI.getHeight());
                mainGUI.setVisible(true);               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeBtn;
    private javax.swing.JButton addExamBtn;
    private javax.swing.JButton addPaymentBtn;
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JPanel btnPane1;
    private javax.swing.JPanel btnPane2;
    private javax.swing.JPanel btnPane3;
    private javax.swing.JPanel btnPane4;
    private javax.swing.JButton deleteEmployeeBtn;
    private javax.swing.JButton deleteExamBtn;
    private javax.swing.JButton deletePaymentBtn;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JLabel detailLbl1;
    private javax.swing.JLabel detailLbl2;
    private javax.swing.JPanel employeePane;
    private javax.swing.JDesktopPane examDesktopPane;
    private javax.swing.JDesktopPane examDesktopPane1;
    private javax.swing.JPanel examPane;
    private javax.swing.JButton helpBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTabbedPane mainTabPane;
    private javax.swing.JPanel paymentPane;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searchEmployeeBtn;
    private javax.swing.JButton searchStudentBtn;
    private javax.swing.JDesktopPane studentDesktopPane;
    private javax.swing.JPanel studentPane;
    private javax.swing.JButton updateEmployeeBtn;
    private javax.swing.JButton updateExamBtn;
    private javax.swing.JButton updateExamBtn1;
    private javax.swing.JButton updateStudentBtn;
    private javax.swing.JButton workDetailBtn;
    // End of variables declaration//GEN-END:variables
}
