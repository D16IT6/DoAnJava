/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
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

/**
 *
 * @author admin
 */
public class Quanlymonhoc1 extends javax.swing.JPanel {
    private DefaultTableModel table = null;
    private ButtonGroup bd = null;
    /**
     * Creates new form Quanlymonhoc1
     */
    public Quanlymonhoc1() {
        try {
            initComponents();     
            groupradio();
            table = (DefaultTableModel) tableData.getModel();
            doc();
        } catch (SQLException ex) {
            Logger.getLogger(Quanlymonhoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        txtNameSubjectSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumOfLesSubjectMin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumOfLesSubjectMax = new javax.swing.JTextField();
        rbSearchSubjectByName = new javax.swing.JRadioButton();
        rbSearchSubjectByNumOfLes = new javax.swing.JRadioButton();
        btnSearchSubject = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnDeleteSubject = new javax.swing.JButton();
        btnEditSubject = new javax.swing.JButton();
        btnAddNewSubject = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMamh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenmh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLoaiMonhoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSotiet = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        rbSortSubjectNumOfLesDesc = new javax.swing.JRadioButton();
        rbSortSubjectNumOfLesASC = new javax.swing.JRadioButton();
        btnSort = new javax.swing.JButton();

        jPanel6.setBackground(new java.awt.Color(235, 253, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm môn học", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setText("Từ");

        jLabel2.setText("Đến");

        rbSearchSubjectByName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSearchSubjectByName.setText("Theo tên");

        rbSearchSubjectByNumOfLes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSearchSubjectByNumOfLes.setText("Theo số tiết");

        btnSearchSubject.setBackground(new java.awt.Color(51, 51, 51));
        btnSearchSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(rbSearchSubjectByName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameSubjectSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rbSearchSubjectByNumOfLes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumOfLesSubjectMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumOfLesSubjectMax, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)))
                .addGap(51, 51, 51))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnSearchSubject)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(235, 253, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DANH SÁCH MÔN HỌC", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tableData.setBackground(new java.awt.Color(204, 255, 204));
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(235, 253, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin môn học", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setToolTipText("");

        btnDeleteSubject.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnDeleteSubject.setText("Xóa");
        btnDeleteSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSubjectActionPerformed(evt);
            }
        });

        btnEditSubject.setBackground(new java.awt.Color(51, 51, 51));
        btnEditSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnEditSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/set.png"))); // NOI18N
        btnEditSubject.setText("Sửa ");
        btnEditSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSubjectActionPerformed(evt);
            }
        });

        btnAddNewSubject.setBackground(new java.awt.Color(51, 51, 51));
        btnAddNewSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddNewSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_16px.png"))); // NOI18N
        btnAddNewSubject.setText("Thêm");
        btnAddNewSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewSubjectActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Mã môn học");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tên môn học");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Loại môn học");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Số tiết học");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnAddNewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnEditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnDeleteSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTenmh)
                                .addComponent(txtSotiet)
                                .addComponent(txtLoaiMonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMamh, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMamh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenmh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoaiMonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSotiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteSubject)
                    .addComponent(btnEditSubject)
                    .addComponent(btnAddNewSubject))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(235, 253, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sắp xếp danh sách môn học", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        rbSortSubjectNumOfLesDesc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSortSubjectNumOfLesDesc.setText("Theo số tiết giảm dần");

        rbSortSubjectNumOfLesASC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbSortSubjectNumOfLesASC.setText("Theo số tiết tăng dần");

        btnSort.setBackground(new java.awt.Color(51, 51, 51));
        btnSort.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSort.setForeground(new java.awt.Color(255, 255, 255));
        btnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sort.png"))); // NOI18N
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
                        .addGap(17, 17, 17)
                        .addComponent(rbSortSubjectNumOfLesDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbSortSubjectNumOfLesASC, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSortSubjectNumOfLesDesc)
                    .addComponent(rbSortSubjectNumOfLesASC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnSort)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnEditSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSubjectActionPerformed

    }//GEN-LAST:event_btnEditSubjectActionPerformed

    private void btnAddNewSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewSubjectActionPerformed
        new frmThemMonHoc().setVisible(true);
    }//GEN-LAST:event_btnAddNewSubjectActionPerformed

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewSubject;
    private javax.swing.JButton btnDeleteSubject;
    private javax.swing.JButton btnEditSubject;
    private javax.swing.JButton btnSearchSubject;
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbSearchSubjectByName;
    private javax.swing.JRadioButton rbSearchSubjectByNumOfLes;
    private javax.swing.JRadioButton rbSortSubjectNumOfLesASC;
    private javax.swing.JRadioButton rbSortSubjectNumOfLesDesc;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtLoaiMonhoc;
    private javax.swing.JTextField txtMamh;
    private javax.swing.JTextField txtNameSubjectSearch;
    private javax.swing.JTextField txtNumOfLesSubjectMax;
    private javax.swing.JTextField txtNumOfLesSubjectMin;
    private javax.swing.JTextField txtSotiet;
    private javax.swing.JTextField txtTenmh;
    // End of variables declaration//GEN-END:variables
}