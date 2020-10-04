package view.nhanvien;

import controller.ThemSanPhamVaoHoaDon;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modal.DAO;
import modal.NhomSanPham;
import modal.SanPham;

public class pnMain extends javax.swing.JPanel {

    int dem = -100;
    JPanel pnBanHang;
    float tien = 0;
    
    public pnMain(JPanel pnBanHang) {
        initComponents();
        this.pnBanHang = pnBanHang;
        loadNhomSanPham();
        loadSanPhamByNhomSanPham();
    }

    public void loadNhomSanPham() {
        List<NhomSanPham> list = new DAO().getNhomSanPham();
        for (int i = 0; i < list.size(); i++) {
            cbNhomSanPham.addItem(list.get(i).getTenNhomSanPham());
        }
    }
    public void loadSanPhamByNhomSanPham() {
        List<SanPham> list = new DAO().getSanPhamByNhomSanPham();
        List<SanPham> listSp = new ArrayList<>();

        int left = -200;
        int top = -150;
        for (int i = 0; i < list.size(); i++) {
            if (i % 5 == 0) {
                top += 160;
                left = 0;
            } else {
                left += 200;
                top += 0;
            }
            JPanel pn = new JPanel();
            JLabel lbTenSanPham = new JLabel();
            JLabel lbGiaSanPham = new JLabel();
            JLabel lbHinhSanPham = new JLabel();
            pn.setLayout(null);
            lbTenSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
            lbTenSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbTenSanPham.setText(list.get(i).getTenSanPham());
            pn.add(lbTenSanPham);
            lbTenSanPham.setBounds(0, 70, 190, 30);

            lbGiaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
            lbGiaSanPham.setForeground(java.awt.Color.red);
            lbGiaSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbGiaSanPham.setText(String.valueOf(list.get(i).getDonGia()) + " VNĐ");
            pn.add(lbGiaSanPham);
            lbGiaSanPham.setBounds(0, 100, 190, 30);

            lbHinhSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbHinhSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhsanpham/pay.png"))); // NOI18N
            pn.add(lbHinhSanPham);
            lbHinhSanPham.setBounds(30, 10, 120, 60);

            pnChonSanPham.add(pn);
            pn.setBounds(left, top, 190, 130);
            pnChonSanPham.setPreferredSize(new Dimension(left, top));
            SanPham sp = list.get(i);
            
            pn.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    dem += 100;
                    ThemSanPhamVaoHoaDon them = new ThemSanPhamVaoHoaDon();
                    pn.removeAll();
                    them.them(listSp, sp);
                    tien += sp.getDonGia();
                    txtTongTien.setText(String.valueOf(tien));
                    if (listSp.size() > 0) {
                        btnTaoHoaDon.setEnabled(true);
                        for (int j = 0 ; j <listSp.size() ; j++) {
                            them.load(pnSanPhamDaChon, listSp, dem, sp.getUrlSanPham(),
                                    sp.getTenSanPham(), sp.getDonGia(), j);
                        } 
                    } else {
                        btnTaoHoaDon.setEnabled(false);
                    }
                    pnSanPhamDaChon.setPreferredSize(new Dimension(410, dem));
                    jScrollPane2.getViewport().revalidate();
                    jScrollPane2.getViewport().setViewPosition(new Point(0,dem));
                }
            });
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSoDiemTich = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtTienKhachTra = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        ptThanhToan = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        btnTaoHoaDon = new javax.swing.JButton();
        txtTienKhuyenMai = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        cbNhomSanPham = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnChonSanPham = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnSanPhamDaChon = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 740));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 740));
        jPanel1.setLayout(null);

        jPanel19.setBackground(java.awt.Color.white);
        jPanel19.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel36.setText("Tên Khách Hàng");
        jPanel19.add(jLabel36);
        jLabel36.setBounds(10, 10, 141, 24);

        txtTenKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTenKhachHang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTenKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTenKhachHang.setEnabled(false);
        jPanel19.add(txtTenKhachHang);
        txtTenKhachHang.setBounds(160, 10, 250, 30);

        txtSoDiemTich.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDiemTich.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoDiemTich.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSoDiemTich.setEnabled(false);
        jPanel19.add(txtSoDiemTich);
        txtSoDiemTich.setBounds(160, 50, 250, 30);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel40.setText("Số Điểm Tích");
        jPanel19.add(jLabel40);
        jLabel40.setBounds(20, 50, 112, 24);

        jPanel1.add(jPanel19);
        jPanel19.setBounds(0, 0, 430, 90);

        jPanel21.setBackground(java.awt.Color.white);
        jPanel21.setLayout(null);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel37.setText("Khuyến Mãi");
        jPanel21.add(jLabel37);
        jLabel37.setBounds(40, 20, 140, 24);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel34.setText("Tiền Khách Trả");
        jPanel21.add(jLabel34);
        jLabel34.setBounds(40, 80, 160, 24);

        txtTienKhachTra.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTienKhachTra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhachTra.setText("0");
        txtTienKhachTra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.add(txtTienKhachTra);
        txtTienKhachTra.setBounds(210, 70, 230, 42);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Thanh Toán");
        jPanel21.add(jLabel41);
        jLabel41.setBounds(560, 20, 101, 24);

        ptThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ptThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel21.add(ptThanhToan);
        ptThanhToan.setBounds(710, 10, 230, 40);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel35.setText("Tổng Tiền");
        jPanel21.add(jLabel35);
        jLabel35.setBounds(560, 80, 86, 24);

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0");
        txtTongTien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.add(txtTongTien);
        txtTongTien.setBounds(710, 70, 230, 42);

        btnTaoHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnTaoHoaDon.setText("Tạo Hóa Đơn");
        btnTaoHoaDon.setEnabled(false);
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });
        jPanel21.add(btnTaoHoaDon);
        btnTaoHoaDon.setBounds(1070, 20, 320, 70);

        txtTienKhuyenMai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTienKhuyenMai.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhuyenMai.setText("0");
        txtTienKhuyenMai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.add(txtTienKhuyenMai);
        txtTienKhuyenMai.setBounds(210, 10, 230, 42);

        jPanel1.add(jPanel21);
        jPanel21.setBounds(0, 610, 1440, 120);

        jPanel23.setBackground(java.awt.Color.white);
        jPanel23.setLayout(null);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel38.setText("Nhập Tên Mặt Hàng Cần Thêm Hoặc Chọn Bên Dưới");
        jPanel23.add(jLabel38);
        jLabel38.setBounds(110, 0, 450, 30);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jPanel23.add(jTextField4);
        jTextField4.setBounds(110, 40, 450, 40);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/search1.png"))); // NOI18N
        jPanel23.add(jLabel39);
        jLabel39.setBounds(10, 10, 80, 60);

        jPanel24.setBackground(java.awt.Color.white);
        jPanel24.setLayout(null);

        cbNhomSanPham.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jPanel24.add(cbNhomSanPham);
        cbNhomSanPham.setBounds(20, 20, 360, 50);

        jPanel23.add(jPanel24);
        jPanel24.setBounds(610, 0, 450, 90);

        jPanel1.add(jPanel23);
        jPanel23.setBounds(440, 0, 1000, 90);

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Danh Sách Sản Phẩm Đã Chọn");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 110, 430, 40);

        pnChonSanPham.setBackground(java.awt.Color.white);
        pnChonSanPham.setLayout(null);
        jScrollPane1.setViewportView(pnChonSanPham);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(440, 110, 990, 490);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(430, 450));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(430, 450));
        jScrollPane2.setName(""); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(430, 450));

        pnSanPhamDaChon.setBackground(java.awt.Color.white);
        pnSanPhamDaChon.setMaximumSize(new java.awt.Dimension(4000, 4000));
        pnSanPhamDaChon.setMinimumSize(new java.awt.Dimension(4000, 4000));
        pnSanPhamDaChon.setPreferredSize(new java.awt.Dimension(0, 0));
        pnSanPhamDaChon.setLayout(null);
        jScrollPane2.setViewportView(pnSanPhamDaChon);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 150, 430, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        pnBanHang.removeAll();
        jpnTaoHoaDon pnM = new jpnTaoHoaDon(pnBanHang);
        pnM.setVisible(true);
        pnBanHang.setLayout(new BorderLayout());
        pnBanHang.add(pnM);
        pnBanHang.validate();
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JComboBox<String> cbNhomSanPham;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel pnChonSanPham;
    private javax.swing.JPanel pnSanPhamDaChon;
    private javax.swing.JComboBox<String> ptThanhToan;
    private javax.swing.JTextField txtSoDiemTich;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTienKhachTra;
    private javax.swing.JTextField txtTienKhuyenMai;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}