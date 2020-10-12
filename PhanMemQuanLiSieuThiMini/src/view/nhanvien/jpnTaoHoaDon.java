package view.nhanvien;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import modal.DongHoaDon;
import modal.HoaDon;

public class jpnTaoHoaDon extends javax.swing.JPanel {
    JPanel pnBanHang;
    public jpnTaoHoaDon(JPanel pnBanHang,List<DongHoaDon> list,float tienKhachDua,float tienKhuyenMai) {
        initComponents();
        this.pnBanHang = pnBanHang;
        
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        int a = 250;
        float tongTienFull = 0;
        float tienTraLai = 0;
        JLabel tenSPTitle = new JLabel();
        JLabel donGiaTitle = new JLabel("CenterLeft",SwingConstants.CENTER);
        JLabel soLuongTitle = new JLabel("CenterLeft",SwingConstants.CENTER);
        JLabel tongTienTitle = new JLabel("CenterLeft",SwingConstants.CENTER);
        tenSPTitle.setText("Tên Sản Phẩm");
        donGiaTitle.setText("Đơn Giá");
        soLuongTitle.setText("SL");
        tongTienTitle.setText("Tổng Tiền");
        tenSPTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tenSPTitle.setForeground(java.awt.Color.blue);
        donGiaTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        donGiaTitle.setForeground(java.awt.Color.blue);
        soLuongTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        soLuongTitle.setForeground(java.awt.Color.blue);
        tongTienTitle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tongTienTitle.setForeground(java.awt.Color.blue);
        tenSPTitle.setBounds(10, a, 250, 25);
        donGiaTitle.setBounds(260, a, 100, 25);
        soLuongTitle.setBounds(360, a, 80, 25);
        tongTienTitle.setBounds(440, a, 140, 25);
        pnHoaDon.add(tenSPTitle);
        pnHoaDon.add(donGiaTitle);
        pnHoaDon.add(soLuongTitle);
        pnHoaDon.add(tongTienTitle);
        for (int i = 0; i < list.size(); i++) {
            lbidHoaDon.setText(list.get(i).getIdHoaDon());
            datetimeHoaDon.setText(list.get(i).getNgayTao());
            JLabel tenSP = new JLabel();
            JLabel donGia = new JLabel("CenterLeft",SwingConstants.CENTER);
            JLabel soLuong = new JLabel("CenterLeft",SwingConstants.CENTER);
            JLabel tongTien = new JLabel("CenterLeft",SwingConstants.CENTER);
            tenSP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            tenSP.setForeground(java.awt.Color.blue);
            donGia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            donGia.setForeground(java.awt.Color.blue);
            soLuong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            soLuong.setForeground(java.awt.Color.blue);
            tongTien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
            tongTien.setForeground(java.awt.Color.blue);
            tenSP.setText(list.get(i).getTenSanPham());
            donGia.setText((formatter.format(list.get(i).getDonGia())+ " VNĐ"));
            soLuong.setText(String.valueOf(list.get(i).getSoLuong()));
            float rs = (float)list.get(i).getDonGia() * list.get(i).getSoLuong();
            tongTien.setText((formatter.format(rs)) + " VNĐ");
            a += 50;
            tenSP.setBounds(10, a, 250, 25);
            donGia.setBounds(260, a, 120, 25);
            soLuong.setBounds(360, a, 60, 25);
            tongTien.setBounds(440, a, 140, 25);
            txtTenKH.setText(list.get(i).getTenKhachHang());
            txtTenNV.setText(list.get(i).getTenNhanVien());
            pnHoaDon.add(tenSP);
            pnHoaDon.add(donGia);
            pnHoaDon.add(soLuong);
            pnHoaDon.add(tongTien);
            pnHoaDon.setPreferredSize(new Dimension(550, a));
            tongTienFull += (list.get(i).getDonGia() * list.get(i).getSoLuong());
        }
        JLabel br = new JLabel("------------------------------------------------"
                + "---------------------------------------------------------------"
                + "--------------------------");
        JLabel br1 = new JLabel("------------------------------------------------"
                + "---------------------------------------------------------------"
                + "--------------------------");
        JLabel tongTienF = new JLabel("Tổng Tiền Phải Thanh Toán :  " + formatter.format(tongTienFull - tienKhuyenMai) + " VNĐ");
        JLabel tienDaGiam = new JLabel("Tiền Đã Giảm :  :   " +  formatter.format(tienKhuyenMai) + " VNĐ");
        JLabel tongSl = new JLabel("Tiền Khách Trả  :   " +  formatter.format(tienKhachDua) + " VNĐ");
        JLabel tienTl = new JLabel("Tiền Trả Lại :  " + formatter.format((tienKhachDua - (tongTienFull - tienKhuyenMai))) + " VNĐ");
        JLabel camOn = new JLabel("CenterLeft",SwingConstants.CENTER);
        camOn.setText("Cảm Ơn Quý Khách - Hẹn Gặp Lại!!");
        br.setForeground(Color.blue);
        br1.setForeground(Color.blue);
        camOn.setForeground(Color.blue);
        tienDaGiam.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tienDaGiam.setForeground(java.awt.Color.blue);
        tongTienF.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tongTienF.setForeground(java.awt.Color.blue);
        tongSl.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tongSl.setForeground(java.awt.Color.blue);
        tienTl.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tienTl.setForeground(java.awt.Color.blue);
        br.setBounds(10, a + 50, 590, 25);
        tongTienF.setBounds(10, a + 100, 590, 25);
        tienDaGiam.setBounds(10, a + 150, 590, 25);
        tongSl.setBounds(10, a + 200, 590, 25);
        tienTl.setBounds(10, a + 250, 590, 25);
        br1.setBounds(10, a + 300, 590, 25);
        camOn.setBounds(10, a + 350, 590, 25);
        pnHoaDon.add(tienDaGiam);
        pnHoaDon.add(br);
        pnHoaDon.add(tongTienF);
        pnHoaDon.add(tongSl);
        pnHoaDon.add(tienTl);
        pnHoaDon.add(br1);
        pnHoaDon.add(camOn);
        pnHoaDon.setPreferredSize(new Dimension(550, a + 380));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnHoaDon = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lbidHoaDon = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        datetimeHoaDon = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTaoHoaDonVaThanhToan = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1440, 740));
        setMinimumSize(new java.awt.Dimension(1440, 740));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel3.setLayout(null);

        pnHoaDon.setBackground(java.awt.Color.white);
        pnHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnHoaDon.setMaximumSize(new java.awt.Dimension(40000, 40000));
        pnHoaDon.setMinimumSize(new java.awt.Dimension(40000, 40000));
        pnHoaDon.setPreferredSize(new java.awt.Dimension(0, 0));
        pnHoaDon.setLayout(null);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel47.setForeground(java.awt.Color.blue);
        jLabel47.setText("Cầu Tuyên Sơn  P. Khuê Mỹ ");
        pnHoaDon.add(jLabel47);
        jLabel47.setBounds(340, 10, 230, 20);

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel48.setForeground(java.awt.Color.blue);
        jLabel48.setText("Q. Ngũ Hành Sơn ");
        pnHoaDon.add(jLabel48);
        jLabel48.setBounds(390, 40, 140, 20);

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel49.setForeground(java.awt.Color.blue);
        jLabel49.setText("TP Đà Nẵng");
        pnHoaDon.add(jLabel49);
        jLabel49.setBounds(400, 70, 100, 20);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setForeground(java.awt.Color.blue);
        jLabel35.setText("0354114665");
        pnHoaDon.add(jLabel35);
        jLabel35.setBounds(400, 100, 100, 20);

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel50.setForeground(java.awt.Color.blue);
        jLabel50.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
        pnHoaDon.add(jLabel50);
        jLabel50.setBounds(10, 120, 560, 16);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel51.setForeground(java.awt.Color.blue);
        jLabel51.setText("-----------------------------------------------------------------------------------------------------------------------------------------");
        pnHoaDon.add(jLabel51);
        jLabel51.setBounds(10, 230, 560, 16);

        lbidHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbidHoaDon.setForeground(java.awt.Color.blue);
        lbidHoaDon.setText("HD0001");
        pnHoaDon.add(lbidHoaDon);
        lbidHoaDon.setBounds(130, 200, 140, 20);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel53.setForeground(java.awt.Color.blue);
        jLabel53.setText("IDHoaDon : ");
        pnHoaDon.add(jLabel53);
        jLabel53.setBounds(10, 200, 110, 20);

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel54.setForeground(java.awt.Color.blue);
        jLabel54.setText("Ngày Bán :");
        pnHoaDon.add(jLabel54);
        jLabel54.setBounds(10, 170, 90, 20);

        datetimeHoaDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        datetimeHoaDon.setForeground(java.awt.Color.blue);
        datetimeHoaDon.setText("25/09/2020 - 19:30:12");
        pnHoaDon.add(datetimeHoaDon);
        datetimeHoaDon.setBounds(100, 170, 170, 20);

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel56.setForeground(java.awt.Color.blue);
        jLabel56.setText("HÓA ĐƠN BÁN HÀNG");
        pnHoaDon.add(jLabel56);
        jLabel56.setBounds(180, 140, 220, 20);

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel57.setForeground(java.awt.Color.blue);
        jLabel57.setText("Tên KH");
        pnHoaDon.add(jLabel57);
        jLabel57.setBounds(280, 200, 90, 20);

        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenKH.setForeground(java.awt.Color.blue);
        pnHoaDon.add(txtTenKH);
        txtTenKH.setBounds(380, 200, 170, 20);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel59.setForeground(java.awt.Color.blue);
        jLabel59.setText("Tên NV");
        pnHoaDon.add(jLabel59);
        jLabel59.setBounds(280, 170, 90, 20);

        txtTenNV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenNV.setForeground(java.awt.Color.blue);
        pnHoaDon.add(txtTenNV);
        txtTenNV.setBounds(380, 170, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/logo.png"))); // NOI18N
        pnHoaDon.add(jLabel1);
        jLabel1.setBounds(10, 0, 280, 130);

        jScrollPane1.setViewportView(pnHoaDon);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(190, 0, 590, 740);

        btnTaoHoaDonVaThanhToan.setBackground(java.awt.Color.orange);
        btnTaoHoaDonVaThanhToan.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTaoHoaDonVaThanhToan.setText("Tạo Hóa Đơn Và Thanh Toán");
        btnTaoHoaDonVaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonVaThanhToanActionPerformed(evt);
            }
        });
        jPanel3.add(btnTaoHoaDonVaThanhToan);
        btnTaoHoaDonVaThanhToan.setBounds(940, 300, 300, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoHoaDonVaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonVaThanhToanActionPerformed
        JOptionPane.showMessageDialog(pnHoaDon, "Vui Lòng Nhận Hóa Đơn Tại Máy");
        this.setVisible(false);
        new pnMain(pnBanHang).setVisible(true);
    }//GEN-LAST:event_btnTaoHoaDonVaThanhToanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoHoaDonVaThanhToan;
    private javax.swing.JLabel datetimeHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbidHoaDon;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JLabel txtTenKH;
    private javax.swing.JLabel txtTenNV;
    // End of variables declaration//GEN-END:variables
}
