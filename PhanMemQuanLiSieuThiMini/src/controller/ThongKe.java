package controller;

import java.sql.*;
import model.ConnectDAO;

public class ThongKe {

    final String NGAY = "WHERE NgayTao >= CONCAT(FORMAT(GETDATE(),'yyyy-MM-dd'),' 00:00:00.000') \n"
            + "AND NgayTao <= GETDATE() AND HoaDon.LoaiHoaDon = 0";
    final String NGAY_TRUOC = "WHERE NgayTao < CONCAT(FORMAT(GETDATE(),'yyyy-MM-dd'),' 00:00:00.000') \n"
            + "AND NgayTao >= CONCAT(FORMAT(GETDATE() - 1,'yyyy-MM-dd'),' 00:00:00.000') AND HoaDon.LoaiHoaDon = 0";
    final String TUAN = "WHERE NgayTao >= CONCAT(FORMAT(GETDATE() - \n"
            + "(SELECT CASE \n"
            + "When (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) < 0 THEN 6\n"
            + "	ELSE (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) \n"
            + "END AS RS)\n"
            + ",'yyyy-MM-dd'),' 00:00:00.000')\n"
            + "AND NgayTao <= GETDATE() AND HoaDon.LoaiHoaDon = 0";
    final String TUAN_TRUOC = "WHERE NgayTao < CONCAT(FORMAT(GETDATE() - (SELECT DATEPART(WEEKDAY, GETDATE()) + \n"
            + "(SELECT CASE \n"
            + "When (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) < 0 THEN 6\n"
            + "	ELSE (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) \n"
            + "END AS RS)),'yyyy-MM-dd'),' 00:00:00.000') \n"
            + "AND NgayTao >= CONVERT(datetime,CONCAT(FORMAT(GETDATE() - (SELECT DATEPART(WEEKDAY, GETDATE()) + \n"
            + "(SELECT CASE \n"
            + "When (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) < 0 THEN 6\n"
            + "	ELSE (SELECT DATEPART(WEEKDAY, GETDATE()) - 2) \n"
            + "END AS RS)),'yyyy-MM-dd'),' 00:00:00.000')) - 7\n"
            + "AND HoaDon.LoaiHoaDon = 0";
    final String THANG = "WHERE NgayTao >= CONCAT(FORMAT(GETDATE() - DAY(GETDATE() - 1),'yyyy-MM-dd'),' 00:00:00.000')\n"
            + "AND NgayTao <= GETDATE() AND HoaDon.LoaiHoaDon = 0";
    final String THANG_TRUOC = "WHERE NgayTao < CONCAT(FORMAT(GETDATE() - DAY(GETDATE() - 1),'yyyy-MM-dd'),' 00:00:00.000')\n"
            + "AND NgayTao >= CONVERT(Datetime,CONCAT(FORMAT(GETDATE() - DAY(GETDATE()) - DAY(EOMONTH(GETDATE() - DAY(GETDATE())))"
            + " + 1,'yyyy-MM-dd'),' 00:00:00')) AND HoaDon.LoaiHoaDon = 0";
    final String NAM = "";
    final String NAM_TRUOC = "";

    public int LocHoaDon(String query) {
        int count = 0;
        try {
            Connection conn = new ConnectDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int LocSanPham(String query) {
        int count = 0;
        try {
            Connection conn = new ConnectDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int LocTien(String query) {
        int count = 0;
        try {
            Connection conn = new ConnectDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int switchTien(int i) {
        int count = 0;
        switch (i) {
            case 1:
                String q1 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + NGAY;
                count = LocTien(q1);
                break;
            case 2:
                String q2 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + NGAY_TRUOC;
                count = LocTien(q2);
                break;
            case 3:
                String q3 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + TUAN;
                count = LocTien(q3);
                break;
            case 4:
                String q4 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + TUAN_TRUOC;
                count = LocTien(q4);
                break;
            case 5:
                String q5 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + THANG;
                count = LocTien(q5);
                break;
            case 6:
                String q6 = "SELECT  SUM(TongTien) FROM HoaDon \n"
                        + THANG_TRUOC;
                count = LocTien(q6);
                break;
        }
        return count;
    }

    public int switchSanPham(int i) {
        int count = 0;
        switch (i) {
            case 1:
                String q1 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                        + NGAY;
                count = LocSanPham(q1);
                break;
            case 2:
                String q2 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                        + NGAY_TRUOC;
                count = LocSanPham(q2);
                break;
            case 3:
                String q3 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                        + TUAN;
                count = LocSanPham(q3);
                break;
            case 4:
                String q4 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon\n"
                        + TUAN_TRUOC;
                count = LocSanPham(q4);
                break;
            case 5:
                String q5 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon \n"
                        + THANG;
                count = LocSanPham(q5);
                break;
            case 6:
                String q6 = "SELECT  SUM(SoLuong) FROM DongHoaDon \n"
                        + "INNER JOIN HoaDon ON HoaDon.IDHoaDon = DongHoaDon.IDHoaDon \n"
                        + THANG_TRUOC;
                count = LocSanPham(q6);
                break;
        }
        return count;
    }

    public int switchHoaDon(int i) {
        int count = 0;
        switch (i) {
            case 1:
                String q1 = "SELECT  COUNT(*) FROM HoaDon " + NGAY;
                count = LocHoaDon(q1);
                break;
            case 2:
                String q2 = "SELECT COUNT(*) FROM HoaDon " + NGAY_TRUOC;
                count = LocHoaDon(q2);
                break;
            case 3:
                String q3 = "SELECT  COUNT(*) FROM HoaDon " + TUAN;
                count = LocHoaDon(q3);
                break;
            case 4:
                String q4 = "SELECT  COUNT(*) FROM HoaDon " + TUAN_TRUOC;
                count = LocHoaDon(q4);
                break;
            case 5:
                String q5 = "SELECT  COUNT(*) FROM HoaDon " + THANG;
                count = LocHoaDon(q5);
                break;
            case 6:
                String q6 = "SELECT  COUNT(*) FROM HoaDon " + THANG_TRUOC;
                count = LocHoaDon(q6);
                break;
        }
        return count;
    }
}
