package view.quanli.nhanvien;

import controller.LoadTable;
import controller.ThemNhanVien;
import controller.XuatFile;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;
import model.FormatScroll;

public class pn_QLNhanVien extends javax.swing.JPanel {
    
    String id = "";
    LoadTable loadTable = new LoadTable();
    
    public pn_QLNhanVien() {
        initComponents();    
        FormatScroll.format(jScrollPane1);
        loadTable.NhanVien("", listNhanVien);
    }
    public String switchs(String chon,String value) {
        String text = "";
        switch (chon) {
            case "Theo Họ Tên":
                text = "  WHERE NhanVien.HoTen LIKE N'%" + value + "%' ";
                break;
            case "Theo Số Điện Thoại":
                text = " WHERE NhanVien.SoDienThoai LIKE N'%" + value + "%' ";
                break;
            case "Theo Địa Chỉ":
                text = " WHERE NhanVien.DiaChi LIKE N'%" + value + "%'  ";
                break;       
            case "Theo Mã Nhân Viên":
                text = " WHERE NhanVien.IDNhanVien LIKE N'%" + value + "%' ";
                break;   
            case "Theo Giới Tính":
                text = " WHERE NhanVien.GioiTinh LIKE N'%" + value + "%' ";
                break;   
        }
        return text;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        cbChon = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnTaoTaiKhoan = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnTinhLuong = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        process = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listNhanVien = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(350, 100));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(335, 598));
        jPanel1.setLayout(null);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 261, 350, 340);

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20))); // NOI18N

        txtInput.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btnTim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        cbChon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Họ Tên", "Theo Số Điện Thoại", "Theo Mã Khách Hàng", "Theo Địa Chỉ", "Theo Giới Tính" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(cbChon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(7, 7, 7)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(cbChon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(2, 10, 340, 240);

        jScrollPane1.setViewportView(jPanel1);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setPreferredSize(new java.awt.Dimension(101, 100));
        jPanel3.setLayout(null);

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-edit-45.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua);
        btnSua.setBounds(160, 20, 120, 63);

        btnTaoTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTaoTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-add-new-45.png"))); // NOI18N
        btnTaoTaiKhoan.setText("Tạo Tài Khoản");
        btnTaoTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoTaiKhoanActionPerformed(evt);
            }
        });
        jPanel3.add(btnTaoTaiKhoan);
        btnTaoTaiKhoan.setBounds(300, 20, 200, 63);

        btnXuatFile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXuatFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-export-40.png"))); // NOI18N
        btnXuatFile.setText("Xuất File");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });
        jPanel3.add(btnXuatFile);
        btnXuatFile.setBounds(710, 20, 150, 63);

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-plus-45.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel3.add(btnThem);
        btnThem.setBounds(10, 20, 130, 63);

        btnTinhLuong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTinhLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-payroll-40.png"))); // NOI18N
        btnTinhLuong.setText("Tính Lương");
        jPanel3.add(btnTinhLuong);
        btnTinhLuong.setBounds(520, 20, 170, 63);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Time");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(880, 20, 130, 30);

        process.setForeground(new java.awt.Color(51, 255, 51));
        jPanel3.add(process);
        process.setBounds(880, 50, 130, 30);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane2.setBackground(java.awt.Color.white);

        listNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listNhanVien.setRowHeight(25);
        listNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listNhanVien);

        jPanel4.add(jScrollPane2);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel6, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoTaiKhoanActionPerformed
        new pn_TaoTaiKhoan().setVisible(true);
    }//GEN-LAST:event_btnTaoTaiKhoanActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new pn_ThemNhanVien(listNhanVien).setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        new pn_SuaNhanVien(new ThemNhanVien().getNhanVien(id),listNhanVien).setVisible(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        listNhanVien.removeAll();
        loadTable.NhanVien(switchs(cbChon.getSelectedItem().toString(), txtInput.getText()),listNhanVien);
    }//GEN-LAST:event_btnTimActionPerformed

    private void listNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNhanVienMouseClicked
        int index = listNhanVien.getSelectedRow();
        id = listNhanVien.getModel().getValueAt(index, 0).toString();
    }//GEN-LAST:event_listNhanVienMouseClicked

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        new XuatFile().execute(listNhanVien, process,"Nhân Viên");
    }//GEN-LAST:event_btnXuatFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTinhLuong;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JComboBox<String> cbChon;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listNhanVien;
    private javax.swing.JProgressBar process;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
