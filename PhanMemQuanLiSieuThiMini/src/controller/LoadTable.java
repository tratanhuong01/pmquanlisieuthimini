package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ConnectDAO;
import model.SanPham;

public class LoadTable {
    public void SanPham(String text,JTable jTable) {
        String query = "SELECT SanPham.IDSanPham,SanPham.TenSanPham,SanPham.IDDonViTinh,\n"
                + "SanPham.NgaySanXuat,SanPham.HanSuDung,SanPham.UrlImage , NhomSanPham.TenNhom,BangGia.DonGia,\n"
                + "BangGia.Giam,BangGia.GiaVonSP,KhachHang.HoTen ,\n"
                + "SanPham.TinhTrang , SanPham.SKU,Kho.NgayNhap,Kho.NgayXuat FROM SanPham\n"
                + "INNER JOIN NhomSanPham ON SanPham.IDNhomSanPham = NhomSanPham.IDNhomSanPham\n"
                + "INNER JOIN KhachHang ON SanPham.IDKhachHang = KhachHang.IDKhachHang\n"
                + "INNER JOIN Kho ON SanPham.SKU = Kho.SKU\n"
                + "INNER JOIN BangGia ON SanPham.IDBangGia = BangGia.IDBangGia\n" + text;
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            jTable.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                vData.add(rs.getString(9));
                vData.add(rs.getString(10));
                vData.add(rs.getString(11));
                vData.add(rs.getString(12));
                vData.add(rs.getString(13));
                vData.add(rs.getString(14));
                vData.add(rs.getString(15));
                tableMode.addRow(vData);
            }
            jTable.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void PhieuNhapLeft(String text, JTable table) {
        DecimalFormat format = new DecimalFormat("###,###,###");
        List<SanPham> list = new Kho().getSanPhamBy(text);
        table.removeAll();
        Vector vTitle = null;
        Vector vData = null;
        DefaultTableModel tableMode;
        vTitle = new Vector(10);
        vTitle.add("IDSanPham");
        vTitle.add("TenNhom");
        vTitle.add("TenSanPham");
        vTitle.add("DonViTinh");
        vTitle.add("NgaySanXuat");
        vTitle.add("NgayHetHan");
        vTitle.add("DonGia");
        vTitle.add("Giam");
        vTitle.add("GiaVonSP");
        vTitle.add("TenNhaCungCap");
        tableMode = new DefaultTableModel(vTitle, 0);
        for (SanPham sp : list) {
            vData = new Vector();
            vData.add(sp.getIdSanPham());
            vData.add(sp.getTenNhom());
            vData.add(sp.getTenSanPham());
            vData.add(sp.getIdDonViTinh());
            vData.add(sp.getNgaySanXuat());
            vData.add(sp.getHanSuDung());
            vData.add(format.format(sp.getDonGia()) + " VNĐ");
            vData.add(format.format(sp.getGiam()));
            vData.add(format.format(sp.getGiaVonSP()) + " VNĐ");
            vData.add(sp.getTenNhaCungCap());
            tableMode.addRow(vData);
        }
        table.setModel(tableMode);
    }
    public void PhieuNhapRight(List<String[]> list,JTable table) {
        table.removeAll();
        Vector vTitle = null;
        Vector vData = null;
        DefaultTableModel tableMode;
        vTitle = new Vector(11);
        vTitle.add("IDSanPham");
        vTitle.add("TenNhom");
        vTitle.add("TenSanPham");
        vTitle.add("DonViTinh");
        vTitle.add("NgaySanXuat");
        vTitle.add("NgayHetHan");
        vTitle.add("DonGia");
        vTitle.add("Giam");
        vTitle.add("GiaVonSP");
        vTitle.add("TenNhaCungCap");
        vTitle.add("SoLuong");
        tableMode = new DefaultTableModel(vTitle, 0);
        for (int i = 0; i < list.size(); i++) {
            vData = new Vector();
            for (int j = 0; j < list.get(i).length; j++) {
                vData.add(list.get(i)[j]);
            }
            tableMode.addRow(vData);
        }
        table.setModel(tableMode);
    }
    public void NhaCungCap(String text, JTable listNhaCungCap) {
        String query = "SELECT KhachHang.IDKhachHang ,NhomKhachHang.TenNhom,KhachHang.HoTen,\n"
                + "KhachHang.SoDienThoai,KhachHang.DiaChi,NhomKhachHang.TenNhom,KhachHang.MaSoThue,\n"
                + "KhachHang.TraDK,KhachHang.ThuDK\n"
                + "FROM KhachHang INNER JOIN NhomKhachHang ON KhachHang.IDNhomKH = NhomKhachHang.IDNhomKH \n"
                + "WHERE NhomKhachHang.IDNhomKH = 'NKH10003' " + text;
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listNhaCungCap.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                vData.add(rs.getString(9));
                tableMode.addRow(vData);
            }
            listNhaCungCap.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DiemTieuDung(String text, JTable table1) {
        String query = "SELECT KhachHang.IDKhachHang ,KhachHang.HoTen,TichDiem.SoDiem ,TichDiem.QuyDoiDiem,"
                + "TichDiem.TienQuyDoi FROM KhachHang\n"
                + "INNER JOIN TichDiem ON KhachHang.IDKhachHang = TichDiem.IDKhachHang \n"
                + "WHERE KhachHang.IDKhachHang LIKE N'%" + text + "%' OR KhachHang.HoTen LIKE N'%" + text + "%' ";
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            table1.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            table1.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            table1.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            table1.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                tableMode.addRow(vData);
            }
            table1.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void KhachHang(String text, JTable listKhachHang) {
        String query = "SELECT KhachHang.IDKhachHang ,NhomKhachHang.TenNhom,KhachHang.HoTen,KhachHang.GioiTinh,\n"
                + "KhachHang.SoDienThoai,KhachHang.DiaChi,NhomKhachHang.TenNhom,KhachHang.MaSoThue,\n"
                + "KhachHang.TraDK,KhachHang.ThuDK,TichDiem.SoDiem\n"
                + "FROM KhachHang INNER JOIN NhomKhachHang ON KhachHang.IDNhomKH = NhomKhachHang.IDNhomKH \n"
                + "INNER JOIN TichDiem ON KhachHang.IDKhachHang = TichDiem.IDKhachHang " + text;
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listKhachHang.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            listKhachHang.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            listKhachHang.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listKhachHang.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                vData.add(rs.getString(9));
                vData.add(rs.getString(10));
                vData.add(rs.getString(11));
                tableMode.addRow(vData);
            }
            listKhachHang.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void NhanVien(String text, JTable listNhanVien) {
        String query = "SELECT NhanVien.IDNhanVien AS 'ID Nhân Viên' , BoPhan.TenBoPhan,\n"
                + "NhanVien.HoTen, NhanVien.GioiTinh, NhanVien.SoDienThoai ,\n"
                + "NhanVien.DiaChi ,TaiKhoan.TaiKhoan,TaiKhoan.MatKhau, \n"
                + "CASE \n"
                + "	WHEN NhanVien.TinhTrang = '1' THEN  N'Đang Làm'\n"
                + "	WHEN NhanVien.TinhTrang = '0' THEN N'Nghĩ Việc'\n"
                + "	WHEN NhanVien.TinhTrang = '2' THEN N'Nghĩ Phép'\n"
                + "	ELSE N'Đình Chỉ'\n"
                + "END AS TinhTrang\n"
                + "FROM NhanVien FULL JOIN TaiKhoan ON NhanVien.IDNhanVien = TaiKhoan.IDNhanVien "
                + "INNER JOIN BoPhan ON NhanVien.IDBoPhan = BoPhan.IDBoPhan " + text;
        try (Connection conn = new ConnectDAO().getConnection()) {
            Vector vTitle = null;
            Vector vData = null;
            DefaultTableModel tableMode;
            listNhanVien.getTableHeader().setPreferredSize(new Dimension(WIDTH, 30));
            listNhanVien.getTableHeader().setFont(new Font("Time New Roman", 1, 14));
            listNhanVien.getTableHeader().setBackground(Color.WHITE);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int soCot = rsm.getColumnCount();
            vTitle = new Vector(soCot);
            for (int i = 1; i <= soCot; i++) {
                vTitle.add(rsm.getColumnLabel(i));
            }
            tableMode = new DefaultTableModel(vTitle, 0);
            listNhanVien.removeAll();
            while (rs.next()) {
                vData = new Vector();
                vData.add(rs.getString(1));
                vData.add(rs.getString(2));
                vData.add(rs.getString(3));
                vData.add(rs.getString(4));
                vData.add(rs.getString(5));
                vData.add(rs.getString(6));
                vData.add(rs.getString(7));
                vData.add(rs.getString(8));
                vData.add(rs.getString(9));
                tableMode.addRow(vData);
            }
            listNhanVien.setModel(tableMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
