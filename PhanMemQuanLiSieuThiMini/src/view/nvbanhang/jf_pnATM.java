package view.nvbanhang;

import controller.LuuAtm;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.DongHoaDon;
import model.InfoAtm;
import model.KhachHang;
import model.NhanVien;
import model.StringUtil;

public class jf_pnATM extends javax.swing.JFrame {
    String tenPTThanhToan;
    List<DongHoaDon> list;
    KhachHang kh;
    NhanVien nv;
    float tienKhuyenMai;
    float tienKhachTra;
    JPanel pnMain;
    float tongTienFull;
    public jf_pnATM(String tenPTThanhToan,List<DongHoaDon> list,KhachHang kh,NhanVien nv,
            float tienKhuyenMai,float tienKhachTra,JPanel pnMain,float tongTienFull) {
        initComponents();
        txtoaiThe.setEditable(false);
        this.tenPTThanhToan = tenPTThanhToan;
        this.list = list;
        this.kh = kh;
        this.nv = nv;
        this.tienKhachTra = tienKhachTra;
        this.tienKhuyenMai = tienKhuyenMai;
        this.pnMain = pnMain;
        this.tongTienFull = tongTienFull;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnATM = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDocThe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtTenTaiKhoan = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtChiNhanh = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        txtSoTaiKhoan = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtTenNganHang = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        txtoaiThe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnATM.setBackground(java.awt.Color.white);
        pnATM.setMaximumSize(new java.awt.Dimension(600, 600));
        pnATM.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Thông Tin Thẻ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(160, 20, 250, 50);

        btnDocThe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDocThe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-read-online-45.png"))); // NOI18N
        btnDocThe.setText("Đọc Thẻ");
        btnDocThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocTheActionPerformed(evt);
            }
        });
        jPanel2.add(btnDocThe);
        btnDocThe.setBounds(400, 10, 190, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-info-45.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 20, 50, 50);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Loại Thẻ ");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Tên Tài Khoản");

        txtTenTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenTaiKhoan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenTaiKhoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Chi Nhánh");

        txtChiNhanh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtChiNhanh.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtChiNhanh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLuu.setBackground(java.awt.Color.orange);
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-login-45.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        txtSoTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoTaiKhoan.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoTaiKhoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel42.setText("Số Tài Khoản");

        txtTenNganHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenNganHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenNganHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel43.setText("Tên Ngân Hàng");

        btnHuy.setBackground(java.awt.Color.orange);
        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-shutdown-45.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        txtoaiThe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtoaiThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtoaiTheMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnATMLayout = new javax.swing.GroupLayout(pnATM);
        pnATM.setLayout(pnATMLayout);
        pnATMLayout.setHorizontalGroup(
            pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnATMLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtSoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnATMLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnATMLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnATMLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtChiNhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnATMLayout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnATMLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(40, 40, 40)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenNganHang, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(txtoaiThe)))
        );
        pnATMLayout.setVerticalGroup(
            pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnATMLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnATMLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel37))
                    .addGroup(pnATMLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtoaiThe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtTenNganHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnATMLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel38))
                    .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtChiNhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnATM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnATM, javax.swing.GroupLayout.PREFERRED_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocTheActionPerformed
        JOptionPane.showConfirmDialog(rootPane, "Vui Lòng Đưa Thẻ Vào Để Quét", "Message", WIDTH);
    }//GEN-LAST:event_btnDocTheActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        InfoAtm info = new InfoAtm("", new LuuAtm().getIDByTen(tenPTThanhToan), txtoaiThe.getText(),
                 txtSoTaiKhoan.getText(), txtTenTaiKhoan.getText(), txtChiNhanh.getText(), txtTenNganHang.getText());
        jf_TaoHoaDon tdh = new jf_TaoHoaDon(list,kh,nv,info,tenPTThanhToan,tienKhuyenMai,tienKhachTra,pnMain,tongTienFull);
        this.dispose();
        tdh.setVisible(true);
//        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void txtoaiTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtoaiTheMouseClicked
        new jf_The(txtoaiThe,txtTenNganHang).setVisible(true);
    }//GEN-LAST:event_txtoaiTheMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocThe;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnATM;
    private javax.swing.JTextField txtChiNhanh;
    private javax.swing.JTextField txtSoTaiKhoan;
    private javax.swing.JTextField txtTenNganHang;
    private javax.swing.JTextField txtTenTaiKhoan;
    private javax.swing.JTextField txtoaiThe;
    // End of variables declaration//GEN-END:variables
}
