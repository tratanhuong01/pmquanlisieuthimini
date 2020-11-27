package view.nvbanhang;

import controller.SuaKhachHang;
import controller.ThemKhachHang;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.KhachHang;
import view.jf_DiaChi;
import static view.nvbanhang.pn_pnMain.txtTenKhachHang;

public class jf_SuaKhachHang extends javax.swing.JFrame {
    
    public jf_SuaKhachHang() {
        initComponents();
    }

    public jf_SuaKhachHang(KhachHang kh) {
        initComponents();
        kh = new ThemKhachHang().getKhachHang(kh.getIdKhachHang());
        cbNhomKhachHang.setEditable(false);
        txtIDKhachHang.setEditable(false);
        cbNhomKhachHang.setText(kh.getIdNhomKhachHang());
        txtIDKhachHang.setText(kh.getIdKhachHang());
        txtHoTen.setText(kh.getHoTen());
        txtSoDienThoai.setText(kh.getSoDienThoai());
        txtDiaChi.setText(kh.getDiaChi());
        cbGioiTinh.setSelectedItem(kh.getGioiTinh().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnVeTrangChu = new javax.swing.JButton();
        cbGioiTinh = new javax.swing.JComboBox<>();
        btnLuu = new javax.swing.JButton();
        cbNhomKhachHang = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtIDKhachHang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 700));
        jPanel1.setLayout(null);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("   Sửa Khách Hàng");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 20, 260, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-info-45.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(130, 20, 50, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 90);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Nhóm Khách Hàng");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(40, 130, 157, 24);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Họ Tên");
        jPanel1.add(jLabel38);
        jLabel38.setBounds(40, 270, 63, 24);

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtHoTen);
        txtHoTen.setBounds(220, 260, 330, 40);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel39.setText("Giới Tính");
        jPanel1.add(jLabel39);
        jLabel39.setBounds(40, 340, 100, 24);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điện Thoại");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(40, 420, 130, 24);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSoDienThoai);
        txtSoDienThoai.setBounds(220, 410, 330, 40);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setText("Địa Chỉ");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(40, 500, 130, 24);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiaChi.setEnabled(false);
        txtDiaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiaChiMouseClicked(evt);
            }
        });
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(220, 490, 330, 40);

        btnVeTrangChu.setBackground(java.awt.Color.orange);
        btnVeTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnVeTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-delete-40.png"))); // NOI18N
        btnVeTrangChu.setText("Thoát");
        btnVeTrangChu.setToolTipText("");
        btnVeTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeTrangChuActionPerformed(evt);
            }
        });
        jPanel1.add(btnVeTrangChu);
        btnVeTrangChu.setBounds(70, 570, 200, 70);

        cbGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        jPanel1.add(cbGioiTinh);
        cbGioiTinh.setBounds(220, 330, 330, 40);

        btnLuu.setBackground(java.awt.Color.orange);
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-login-45.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(330, 570, 200, 70);

        cbNhomKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cbNhomKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cbNhomKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(cbNhomKhachHang);
        cbNhomKhachHang.setBounds(220, 120, 330, 40);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("IDKhachHang");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(40, 200, 140, 24);

        txtIDKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtIDKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIDKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtIDKhachHang);
        txtIDKhachHang.setBounds(220, 190, 330, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaChiMouseClicked
        new jf_DiaChi(txtDiaChi).setVisible(true);
    }//GEN-LAST:event_txtDiaChiMouseClicked

    private void btnVeTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeTrangChuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVeTrangChuActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (new SuaKhachHang().Sua(txtIDKhachHang.getText(), txtHoTen.getText(),
                cbGioiTinh.getSelectedItem().toString(), txtSoDienThoai.getText(), txtDiaChi.getText()) == true) {
            this.dispose();
            pn_pnMain.txtTenKhachHang.setText(txtHoTen.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui Lòng Thử Lại");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_SuaKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnVeTrangChu;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JTextField cbNhomKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtIDKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
