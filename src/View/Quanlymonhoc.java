package View;

import Controller.SubjectDB;
import Model.Subject;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Quanlymonhoc extends javax.swing.JFrame {

    private DefaultTableModel table = null;
    private ButtonGroup bd = null;

    public Quanlymonhoc() {
        try {
            initComponents();
            this.setLocationRelativeTo(this);
            groupradio();
            table = (DefaultTableModel) tableData.getModel();
            doc();
        } catch (SQLException ex) {
            Logger.getLogger(Quanlymonhoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        rbSortSubjectNumOfLesDesc = new javax.swing.JRadioButton();
        rbSortSubjectNumOfLesASC = new javax.swing.JRadioButton();
        btnSort = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtNameSubjectSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumOfLesSubjectMin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumOfLesSubjectMax = new javax.swing.JTextField();
        rbSearchSubjectByName = new javax.swing.JRadioButton();
        rbSearchSubjectByNumOfLes = new javax.swing.JRadioButton();
        btnSearchSubject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnRefreshSubject = new javax.swing.JButton();
        btnAddNewSubject = new javax.swing.JButton();
        btnEditSubject = new javax.swing.JButton();
        btnDeleteSubject = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp xếp danh sách môn học", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        rbSortSubjectNumOfLesDesc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSortSubjectNumOfLesDesc.setText("Theo số tiết giảm dần");

        rbSortSubjectNumOfLesASC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSortSubjectNumOfLesASC.setText("Theo số tiết tăng dần");

        btnSort.setBackground(new java.awt.Color(204, 255, 255));
        btnSort.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSort.setText("Sắp xếp");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(rbSortSubjectNumOfLesDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbSortSubjectNumOfLesASC, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSortSubjectNumOfLesDesc)
                    .addComponent(rbSortSubjectNumOfLesASC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSort))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm môn học", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setText("Từ");

        jLabel2.setText("Đến");

        rbSearchSubjectByName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSearchSubjectByName.setText("Theo tên");

        rbSearchSubjectByNumOfLes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSearchSubjectByNumOfLes.setText("Theo số tiết");

        btnSearchSubject.setBackground(new java.awt.Color(204, 255, 255));
        btnSearchSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchSubject.setText("Tìm kiếm");
        btnSearchSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbSearchSubjectByName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSearchSubjectByNumOfLes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameSubjectSearch)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSearchSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumOfLesSubjectMin, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumOfLesSubjectMax, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameSubjectSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSearchSubjectByName))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumOfLesSubjectMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumOfLesSubjectMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSearchSubjectByNumOfLes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnSearchSubject))
        );

        tableData.setBackground(new java.awt.Color(204, 255, 255));
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã môn học", "Tên môn học", "Loại môn học", "Tổng số tiết "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.setAutoscrolls(false);
        jScrollPane1.setViewportView(tableData);

        btnRefreshSubject.setBackground(new java.awt.Color(204, 255, 255));
        btnRefreshSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefreshSubject.setText("Làm mới");
        btnRefreshSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshSubjectActionPerformed(evt);
            }
        });

        btnAddNewSubject.setBackground(new java.awt.Color(204, 255, 255));
        btnAddNewSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddNewSubject.setText("Thêm môn học");
        btnAddNewSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewSubjectActionPerformed(evt);
            }
        });

        btnEditSubject.setBackground(new java.awt.Color(204, 255, 255));
        btnEditSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditSubject.setText("Sửa môn học");
        btnEditSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSubjectActionPerformed(evt);
            }
        });

        btnDeleteSubject.setBackground(new java.awt.Color(204, 255, 255));
        btnDeleteSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteSubject.setText("Xóa môn học");
        btnDeleteSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSubjectActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 255, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(51, 0, 51));
        btnExit.setText("< Trở về");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(btnRefreshSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(btnAddNewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(btnEditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefreshSubject)
                    .addComponent(btnAddNewSubject)
                    .addComponent(btnEditSubject)
                    .addComponent(btnDeleteSubject))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUẢN LÝ MÔN HỌC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshSubjectActionPerformed
            deleteDataTable();
            bd.clearSelection();
            txtNameSubjectSearch.setText("");
            txtNumOfLesSubjectMax.setText("");
            txtNumOfLesSubjectMin.setText("");
            try {
                doc();
            } catch (SQLException ex) {
                Logger.getLogger(Quanlymonhoc.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnRefreshSubjectActionPerformed

    private void btnAddNewSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewSubjectActionPerformed
        new frmThemMonHoc().setVisible(true);
    }//GEN-LAST:event_btnAddNewSubjectActionPerformed

    private void btnEditSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSubjectActionPerformed

    }//GEN-LAST:event_btnEditSubjectActionPerformed

    private void btnDeleteSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSubjectActionPerformed
        int row = tableData.getSelectedRow();
        Subject sub = new Subject(table.getValueAt(row, 0).toString(), table.getValueAt(row, 1).toString(), Integer.parseInt(table.getValueAt(row, 3).toString()), table.getValueAt(row, 2).toString());
        int check = JOptionPane.showConfirmDialog(null, "ban co muon xoa :" + sub);
        if (check == 0) {
            new SubjectDB().delete(sub);
            table.removeRow(row);
        }
        tableData.repaint();//cap nhat lai hien thi
    }//GEN-LAST:event_btnDeleteSubjectActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            homeFrm home = new homeFrm();
            home.dangnhap(true);
            home.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Quanlymonhoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        deleteDataTable();
        if (rbSortSubjectNumOfLesASC.isSelected() == true) {
            List<Subject> list = new SubjectDB().SortByNumOfLessASC();
            for (Subject sub : list) {
                showInfomation(sub);
            }
        } else if (rbSortSubjectNumOfLesDesc.isSelected()) {
            List<Subject> list = new SubjectDB().SortByNumOfLessDESC();
            for (Subject sub : list) {
                showInfomation(sub);
            }
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSearchSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSubjectActionPerformed
        if (rbSearchSubjectByName.isSelected() == true) {
            var textInput = txtNameSubjectSearch.getText();
            List<Subject> list = new SubjectDB().SearchByName(textInput);
            deleteDataTable();
            for (Subject sub : list) {
                showInfomation(sub);
            }
        } else if (rbSearchSubjectByNumOfLes.isSelected() == true) {
            var min = txtNumOfLesSubjectMin.getText();
            var max = txtNumOfLesSubjectMax.getText();
            List<Subject> list = new SubjectDB().SearchByNumLess(min, max);
            deleteDataTable();
            for (Subject sub : list) {
                showInfomation(sub);
            }
        }
    }//GEN-LAST:event_btnSearchSubjectActionPerformed

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
            java.util.logging.Logger.getLogger(Quanlymonhoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanlymonhoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanlymonhoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanlymonhoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quanlymonhoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewSubject;
    private javax.swing.JButton btnDeleteSubject;
    private javax.swing.JButton btnEditSubject;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefreshSubject;
    private javax.swing.JButton btnSearchSubject;
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbSearchSubjectByName;
    private javax.swing.JRadioButton rbSearchSubjectByNumOfLes;
    private javax.swing.JRadioButton rbSortSubjectNumOfLesASC;
    private javax.swing.JRadioButton rbSortSubjectNumOfLesDesc;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtNameSubjectSearch;
    private javax.swing.JTextField txtNumOfLesSubjectMax;
    private javax.swing.JTextField txtNumOfLesSubjectMin;
    // End of variables declaration//GEN-END:variables
    public void showInfomation(Subject sub) {
        var row = new Object[]{
            sub.getMamh(), sub.getTenmh(), sub.getLoaimh(), sub.getSotiet()
        };
        table.addRow(row);
        table.fireTableDataChanged();
    }

    public void doc() throws SQLException {
        List<Subject> ds = new SubjectDB().showAll();
        for (Subject sub : ds) {
            showInfomation(sub);
        }
    }

    private void groupradio() {
        bd = new ButtonGroup();
        bd.add(rbSortSubjectNumOfLesDesc);
        bd.add(rbSortSubjectNumOfLesASC);
        bd.add(rbSearchSubjectByName);
        bd.add(rbSearchSubjectByNumOfLes);
    }

    private void deleteDataTable() {
        for (int i = table.getRowCount() - 1; i >= 0; i--) {
            table.removeRow(i);
            tableData.repaint();
        }
    }
}
