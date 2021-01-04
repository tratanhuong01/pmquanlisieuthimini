package view.kho;

import controller.LoadTable_Kho;
import controller.XuatFile;
import javax.swing.JProgressBar;

public class pn_XuatHangTK extends javax.swing.JPanel {
    String idHoaDon = "";
    public pn_XuatHangTK() {
        initComponents();
        new LoadTable_Kho().loadXuat("WHERE HoaDon.LoaiHoaDon = 2 ", listHoaDon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbTinhTrang = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        btnLoc = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listHoaDon = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-xls-export-40.png"))); // NOI18N
        jButton1.setText("Xuất File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1140, 20, 190, 51);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Tình Trạng");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 25, 135, 40);

        cbTinhTrang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoàn Thành", "Chưa Hoàn Thành ", "Đang Xử Lí" }));
        jPanel1.add(cbTinhTrang);
        cbTinhTrang.setBounds(150, 20, 240, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tìm Kiếm");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(550, 20, 135, 50);

        input.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(input);
        input.setBounds(680, 20, 293, 50);

        btnLoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons8-search-client-45.png"))); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoc);
        btnLoc.setBounds(402, 19, 130, 51);

        btnTim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/search1.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        jPanel1.add(btnTim);
        btnTim.setBounds(980, 20, 120, 51);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        listHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listHoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        listHoaDon.setRowHeight(25);
        listHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listHoaDon);

        jPanel2.add(jScrollPane2);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void listHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listHoaDonMouseClicked
        int index = listHoaDon.getSelectedRow();
        new jf_XuLiPhieuXuat(listHoaDon.getModel().getValueAt(index, 0).toString()).setVisible(true);
    }//GEN-LAST:event_listHoaDonMouseClicked

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        int index = cbTinhTrang.getSelectedIndex();
        if (index == 0) 
            new LoadTable_Kho().loadXuat("WHERE HoaDon.TrangThai = 1 AND HoaDon.LoaiHoaDon = 2 ", listHoaDon);
        else if (index == 1)
            new LoadTable_Kho().loadXuat("WHERE HoaDon.TrangThai = 0 AND HoaDon.LoaiHoaDon = 2 ", listHoaDon);
        else 
            new LoadTable_Kho().loadXuat("WHERE HoaDon.TrangThai = 2 AND HoaDon.LoaiHoaDon = 2 ", listHoaDon);
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        new LoadTable_Kho().loadXuat("WHERE HoaDon.IDHoaDon LIKE N'%" + input.getText() + "%'", listHoaDon);
    }//GEN-LAST:event_btnTimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new XuatFile().execute(listHoaDon, new JProgressBar(), "XuatHang");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox<String> cbTinhTrang;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listHoaDon;
    // End of variables declaration//GEN-END:variables

}
