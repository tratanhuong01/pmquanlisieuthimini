
USE [QuanLiSieuThiMini]

CREATE TABLE [dbo].[BangGia](
	[IDBangGia] [varchar](10) NOT NULL,
	[IDSanPham] [varchar](10) NULL,
	[DonGia] [float] NULL,
	[Giam] [float] NULL,
	CONSTRAINT PK_BG PRIMARY KEY(IDBangGia)
)
CREATE TABLE [dbo].[BoPhan](
	[IDBoPhan] [varchar](10) NOT NULL,
	[TenBoPhan] [nvarchar](50) NULL,
	CONSTRAINT PK_BP PRIMARY KEY(IDBoPhan)
) 
CREATE TABLE [dbo].[DiaChi](
	[STT] [int] IDENTITY(1,1) NOT NULL Primary Key, 
	[TenTinh] [nvarchar](100) NULL
)
CREATE TABLE [dbo].[DongHoaDon](
	[IDDongHoaDon] [varchar](10) NOT NULL Primary Key,
	[IDHoaDon] [varchar](10) NULL,
	[IDSanPham] [varchar](10) NULL,
	[IDDonViTinh] [nvarchar](20) NULL,
	[SoLuong] [int] NULL,

)
CREATE TABLE [dbo].[DonViTinh](
	[IDDonViTinh] [nvarchar](20) NOT NULL Primary Key,
	[MacDinh] [int] NULL,

)
CREATE TABLE [dbo].[HoaDon](
	[IDHoaDon] [varchar](10) NOT NULL Primary Key,
	[NgayTao] [datetime] NULL,
	[IDKhachHang] [varchar](10) NULL,
	[IDNhanVien] [varchar](10) NULL,
	[TongTien] [float] NULL,
	[TrangThai] [int] NULL,
	[IDThongTin] [varchar](10) NULL,
)
CREATE TABLE [dbo].[KhachHang](
	[IDKhachHang] [varchar](10) NOT NULL Primary Key,
	[IDNhomKH] [varchar](10) NULL,
	[HoTen] [nvarchar](150) NULL,
	[GioiTinh] [nvarchar](5) NULL,
	[SoDienThoai] [char](10) NULL,
	[DiaChi] [nvarchar](max) NULL,

)
CREATE TABLE [dbo].[Kho](
	[STT] [int] NOT NULL Primary Key,
	[IDNhomSanPham] [varchar](10) NULL,
	[IDSanPham] [varchar](10) NULL,
	[NgayNhap] [date] NULL,
	[NgayXuat] [date] NULL,
	[SoLuong] [int] NULL,
)
/****** Object:  Table [dbo].[KhuVuc]    Script Date: 10/19/2020 1:12:30 PM ******/

CREATE TABLE [dbo].[KhuVuc](
	[IDKhuVuc] [varchar](10) NOT NULL Primary Key,
	[TenKhuVuc] [nvarchar](100) NULL,

) 
CREATE TABLE [dbo].[NhanVien](
	[IDNhanVien] [varchar](10) NOT NULL Primary Key,
	[IDBoPhan] [varchar](10) NULL,
	[HoTen] [nvarchar](150) NULL,
	[GioiTinh] [nvarchar](5) NULL,
	[SoDienThoai] [char](10) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[LoaiNhanVien] [int] NULL,
)
CREATE TABLE [dbo].[NhomKhachHang](
	[IDNhomKH] [varchar](10) NOT NULL Primary Key,
	[TenNhom] [nvarchar](100) NULL,
	[LoaiNhom] [int] NULL,

)
CREATE TABLE [dbo].[NhomSanPham](
	[IDNhomSanPham] [varchar](10) NOT NULL Primary Key,
	[TenNhom] [nvarchar](100) NULL,
	[LoaiNhom] [int] NULL,
	[IDKhuVuc] [varchar](10) NULL,

)
CREATE TABLE [dbo].[PhuongThucThanhToan](
	[IDPTThanhToan] [varchar](10) NOT NULL Primary Key,
	[TenPTThanhToan] [nvarchar](100) NULL,
)

CREATE TABLE [dbo].[SanPham](
	[IDSanPham] [varchar](10) NOT NULL Primary Key,
	[IDNhomSanPham] [varchar](10) NULL,
	[TenSanPham] [nvarchar](100) NULL,
	[IDDonViTinh] [nvarchar](20) NULL,
	[NgaySanXuat] [date] NULL,
	[HanSuDung] [date] NULL,
	[UrlImage] [varchar](20) NULL,
	[IDBangGia] [varchar](10) NULL,

) 
CREATE TABLE [dbo].[TaiKhoan](
	[ID] [int] IDENTITY(1,1) NOT NULL Primary Key,
	[TaiKhoan] [varchar](20) NULL,
	[MatKhau] [varchar](20) NULL,
	[IDBoPhan] [varchar](10) NULL,

)
CREATE TABLE [dbo].[ThongTinThanhToan](
	[IDThongTin] [varchar](10) NOT NULL Primary Key,
	[IDPTThanhToan] [varchar](10) NULL,
	[LoaiThe] [varchar](40) NULL,
	[SoTaiKhoan] [varchar](20) NULL,
	[TenTaiKhoan] [varchar](100) NULL,
	[ChiNhanh] [nvarchar](100) NULL,
	[TenNganHang] [nvarchar](100) NULL,
)

ALTER TABLE [dbo].[BangGia]  WITH CHECK ADD  CONSTRAINT [FK_BangGia_SanPham] FOREIGN KEY([IDSanPham])
REFERENCES [dbo].[SanPham] ([IDSanPham])
GO
ALTER TABLE [dbo].[BangGia] CHECK CONSTRAINT [FK_BangGia_SanPham]
GO
ALTER TABLE [dbo].[DongHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_DongHoaDon_DonViTinh] FOREIGN KEY([IDDonViTinh])
REFERENCES [dbo].[DonViTinh] ([IDDonViTinh])
GO
ALTER TABLE [dbo].[DongHoaDon] CHECK CONSTRAINT [FK_DongHoaDon_DonViTinh]
GO
ALTER TABLE [dbo].[DongHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_DongHoaDon_HoaDon] FOREIGN KEY([IDHoaDon])
REFERENCES [dbo].[HoaDon] ([IDHoaDon])
GO
ALTER TABLE [dbo].[DongHoaDon] CHECK CONSTRAINT [FK_DongHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[DongHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_DongHoaDon_SanPham] FOREIGN KEY([IDSanPham])
REFERENCES [dbo].[SanPham] ([IDSanPham])
GO
ALTER TABLE [dbo].[DongHoaDon] CHECK CONSTRAINT [FK_DongHoaDon_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([IDKhachHang])
REFERENCES [dbo].[KhachHang] ([IDKhachHang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([IDNhanVien])
REFERENCES [dbo].[NhanVien] ([IDNhanVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_NhomKhachHang] FOREIGN KEY([IDNhomKH])
REFERENCES [dbo].[NhomKhachHang] ([IDNhomKH])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_NhomKhachHang]
GO
ALTER TABLE [dbo].[Kho]  WITH CHECK ADD  CONSTRAINT [FK_Kho_NhomSanPham] FOREIGN KEY([IDNhomSanPham])
REFERENCES [dbo].[NhomSanPham] ([IDNhomSanPham])
GO
ALTER TABLE [dbo].[Kho] CHECK CONSTRAINT [FK_Kho_NhomSanPham]
GO
ALTER TABLE [dbo].[Kho]  WITH CHECK ADD  CONSTRAINT [FK_Kho_SanPham] FOREIGN KEY([IDSanPham])
REFERENCES [dbo].[SanPham] ([IDSanPham])
GO
ALTER TABLE [dbo].[Kho] CHECK CONSTRAINT [FK_Kho_SanPham]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_BoPhan] FOREIGN KEY([IDBoPhan])
REFERENCES [dbo].[BoPhan] ([IDBoPhan])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_BoPhan]
GO
ALTER TABLE [dbo].[NhomSanPham]  WITH CHECK ADD  CONSTRAINT [FK_NhomSanPham_KhuVuc] FOREIGN KEY([IDKhuVuc])
REFERENCES [dbo].[KhuVuc] ([IDKhuVuc])
GO
ALTER TABLE [dbo].[NhomSanPham] CHECK CONSTRAINT [FK_NhomSanPham_KhuVuc]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_BangGia] FOREIGN KEY([IDBangGia])
REFERENCES [dbo].[BangGia] ([IDBangGia])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_BangGia]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_DonViTinh] FOREIGN KEY([IDDonViTinh])
REFERENCES [dbo].[DonViTinh] ([IDDonViTinh])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_DonViTinh]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_NhomSanPham] FOREIGN KEY([IDNhomSanPham])
REFERENCES [dbo].[NhomSanPham] ([IDNhomSanPham])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_NhomSanPham]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_BoPhan] FOREIGN KEY([IDBoPhan])
REFERENCES [dbo].[BoPhan] ([IDBoPhan])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_BoPhan]
GO

INSERT [dbo].[BangGia] ([IDBangGia], [IDSanPham], [DonGia], [Giam]) VALUES (N'BG00001', N'SP000001', 100000, 2.8)
INSERT [dbo].[BangGia] ([IDBangGia], [IDSanPham], [DonGia], [Giam]) VALUES (N'BG00002', N'SP000002', 98000, 3.2)
INSERT [dbo].[BangGia] ([IDBangGia], [IDSanPham], [DonGia], [Giam]) VALUES (N'BG00003', N'SP000003', 123000, 3)
INSERT [dbo].[BangGia] ([IDBangGia], [IDSanPham], [DonGia], [Giam]) VALUES (N'BG00004', N'SP000004', 112000, 1.5)
INSERT [dbo].[BangGia] ([IDBangGia], [IDSanPham], [DonGia], [Giam]) VALUES (N'BG00005', N'SP000005', 102000, 1.2)
INSERT [dbo].[BangGia] ([IDBangGia], [IDSanPham], [DonGia], [Giam]) VALUES (N'BG00006', N'SP000006', 99000, 1.6)
GO
INSERT [dbo].[BoPhan] ([IDBoPhan], [TenBoPhan]) VALUES (N'BP000001', N'Quản Lí')
INSERT [dbo].[BoPhan] ([IDBoPhan], [TenBoPhan]) VALUES (N'BP000002', N'Thủ Kho')
INSERT [dbo].[BoPhan] ([IDBoPhan], [TenBoPhan]) VALUES (N'BP000003', N'Nhân Viên Bán Hàng')
INSERT [dbo].[BoPhan] ([IDBoPhan], [TenBoPhan]) VALUES (N'BP000004', N'Bảo Vệ')
GO
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100000', N'HD1000000', NULL, NULL, NULL)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100001', N'HD1000001', N'SP000001', N'Bịch', 3)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100002', N'HD1000001', N'SP000002', N'Hộp', 4)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100003', N'HD1000001', N'SP000002', N'Hộp', 3)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100004', N'HD1000001', N'SP000003', N'Hộp', 100)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100005', N'HD1000002', N'SP000001', N'Bịch', 4)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100006', N'HD1000003', N'SP000001', N'Bịch', 4)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100007', N'HD1000003', N'SP000002', N'Hộp', 3)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100008', N'HD1000004', N'SP000001', N'Bịch', 4)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100009', N'HD1000005', N'SP000001', N'Bịch', 3)
INSERT [dbo].[DongHoaDon] ([IDDongHoaDon], [IDHoaDon], [IDSanPham], [IDDonViTinh], [SoLuong]) VALUES (N'DHD100010', N'HD1000005', N'SP000002', N'Hộp', 3)
GO
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Bát', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Bịch', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Bình', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Cốc', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Đôi', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Gói', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Hộp', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Hủ', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Ly', 0)
INSERT [dbo].[DonViTinh] ([IDDonViTinh], [MacDinh]) VALUES (N'Thùng', 0)
GO
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [PTThanhToan]) VALUES (N'HD1000000', NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [PTThanhToan]) VALUES (N'HD1000001', CAST(N'2020-10-09T18:16:58.000' AS DateTime), N'KH1000001', N'NV000003', NULL, 1, 0)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [PTThanhToan]) VALUES (N'HD1000002', CAST(N'2020-10-09T19:37:27.000' AS DateTime), N'KH1000002', N'NV000003', NULL, 1, 0)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [PTThanhToan]) VALUES (N'HD1000003', CAST(N'2020-10-09T19:42:34.000' AS DateTime), N'KH1000003', N'NV000003', NULL, 1, 0)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [PTThanhToan]) VALUES (N'HD1000004', CAST(N'2020-10-09T19:51:05.000' AS DateTime), N'KH1000004', N'NV000003', NULL, 1, 0)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [PTThanhToan]) VALUES (N'HD1000005', CAST(N'2020-10-09T19:52:45.000' AS DateTime), N'KH1000005', N'NV000003', NULL, 1, 0)
INSERT [dbo].[HoaDon] ([IDHoaDon], [NgayTao], [IDKhachHang], [IDNhanVien], [TongTien], [TrangThai], [PTThanhToan]) VALUES (N'HD1000006', CAST(N'2020-10-09T19:54:08.000' AS DateTime), N'KH1000006', N'NV000003', NULL, 1, 0)
GO
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi]) VALUES (N'KH1000000', N'NKH00001', N'DEFAULT', N'Nam', N'DEFAULT   ', N'DEFAULT')
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi]) VALUES (N'KH1000001', N'NKH00002', N'Hồ Bích Trâm', N'Nữ', N'0354114665', N'Nghệ An')
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi]) VALUES (N'KH1000002', N'NKH00002', N'Hoàng Thị Nhật', N'Nữ', N'KH1000002 ', N'Khánh Hòa')
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi]) VALUES (N'KH1000003', N'NKH00002', N'Đỗ Mỹ Duyên', N'Nữ', N'0394731231', N'Tam Kì')
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi]) VALUES (N'KH1000004', N'NKH00002', N'Cao Thái Nguyên', N'Nam', N'0963524312', N'Cà Mau')
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi]) VALUES (N'KH1000005', N'NKH00002', N'Khổng Tú Thanh', N'Nữ', N'0999981212', N'Thành Phố Hồ Chí Minh')
INSERT [dbo].[KhachHang] ([IDKhachHang], [IDNhomKH], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi]) VALUES (N'KH1000006', N'NKH00002', N'Hoàng Xuân Vinh', N'Nam', N'0928364734', N'Đồng Tháp')
GO
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV001', N'A')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV002', N'B')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV003', N'C')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV004', N'D')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV005', N'E')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV006', N'F')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV007', N'G')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV008', N'H')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV009', N'J')
INSERT [dbo].[KhuVuc] ([IDKhuVuc], [TenKhuVuc]) VALUES (N'KV010', N'K')
GO
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [LoaiNhanVien]) VALUES (N'NV000001', N'BP000001', N'Hoàng Xuân Vinh', N'Nam', N'0318462531', N'Quảng Nam', NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [LoaiNhanVien]) VALUES (N'NV000002', N'BP000002', N'Trà Tấn Hưởng', N'Nam', N'0354114665', N'Quảng Nam', NULL)
INSERT [dbo].[NhanVien] ([IDNhanVien], [IDBoPhan], [HoTen], [GioiTinh], [SoDienThoai], [DiaChi], [LoaiNhanVien]) VALUES (N'NV000003', N'BP000003', N'Huỳnh Phương', N'Nam', N'0978363453', N'Đồng Tháp', NULL)
GO
INSERT [dbo].[NhomKhachHang] ([IDNhomKH], [TenNhom], [LoaiNhom]) VALUES (N'NKH00001', N'Khách VIP', 1)
INSERT [dbo].[NhomKhachHang] ([IDNhomKH], [TenNhom], [LoaiNhom]) VALUES (N'NKH00002', N'Khách Defa', 1)
INSERT [dbo].[NhomKhachHang] ([IDNhomKH], [TenNhom], [LoaiNhom]) VALUES (N'NKH00003', N'Nhà Cung Cấp', 2)
GO
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'BANKEO1', N'Bánh Kẹo', 5, N'KV005')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'HHMP01', N'Hàng Hóa Mỹ Phẩm', 1, N'KV001')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'NHTHVU1', N'Thời Vụ', 7, N'KV007')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'RBNGK0', N'Rượu Bia Nước Giải Khát', 3, N'KV003')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'SVSPVS1', N'Sữa Và Các Sản Phẩm Về Sữa', 4, N'KV004')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'TCFTUDD', N'Trà Cà Phê Thức Uống Dinh Dưỡng', 4, N'KV004')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'TPCBSDL', N'Thực Phẩm Chế Biến Sẵn Đông Lạnh', 6, N'KV006')
INSERT [dbo].[NhomSanPham] ([IDNhomSanPham], [TenNhom], [LoaiNhom], [IDKhuVuc]) VALUES (N'TPKVCB1', N'Thực Phẩm Khô Và Chế Biến', 2, N'KV002')
GO
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia]) VALUES (N'SP000001', N'HHMP01', N'Bột Giặt OMO 6KG', N'Bịch', NULL, NULL, NULL, N'BG00001')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia]) VALUES (N'SP000002', N'HHMP01', N'Nước Giặt OMO ', N'Hộp', NULL, NULL, NULL, N'BG00002')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia]) VALUES (N'SP000003', N'HHMP01', N'Nước Lau Sàn', N'Hộp', NULL, NULL, NULL, N'BG00003')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia]) VALUES (N'SP000004', N'HHMP01', N'Nước Rửa Chén', N'Hộp', NULL, NULL, NULL, N'BG00004')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia]) VALUES (N'SP000005', N'HHMP01', N'Xịt Côn Trùng', N'Bình', NULL, NULL, NULL, N'BG00005')
INSERT [dbo].[SanPham] ([IDSanPham], [IDNhomSanPham], [TenSanPham], [IDDonViTinh], [NgaySanXuat], [HanSuDung], [UrlImage], [IDBangGia]) VALUES (N'SP000006', N'HHMP01', N'Dầu Thơm', N'Bình', NULL, NULL, NULL, N'BG00006')
GO

insert into SanPham (IDSanPham,IDNhomSanPham, TenSanPham, IDDonViTinh, UrlImage, IDBangGia) values 
('SP00050','SVSPVS1',N'Sữa tươi nguyên kem',N'Hộp', 'SP00050SVSPVS1.png','BG00050'),
('SP00051', 'SVSPVS1',N'Sữa Dừa Hạnh Nhân Cocoxim', N'Hộp', 'SP00051SVSPVS1.png', 'BG00051'),
('SP00052', 'SVSPVS1', N'Sữa Yomost', N'Hộp', 'SP00052SVSPVS1.png', 'BG00052'),
('SP00053', 'SVSPVS1', N'Sữa Bột Nguyên Kem Nutifood', N'Gói', 'SP00053SVSPVS1.png', 'BG00053'),
('SP00054', 'SVSPVS1', N'Sữa Nestle Milo Úc', N'Lon', 'SP00054SVSPVS1.png', 'BG00054'),
('SP00055', 'SVSPVS1', N'Sữa Lúa Mạch Overtine', N'Thùng', 'SP00055SVSPVS1.png', 'BG00055'),
('SP00056', 'SVSPVS1', N'Sữa Ensure Original', N'Thùng', 'SP00056SVSPVS1.png', 'BG00056'),
('SP00057', 'SVSPVS1', N'Nước uống trái cây TH True Milk', N'Thùng', 'SP00057SVSPVS1.png', 'BG00057'),
('SP00058', 'SVSPVS1', N'Bột Cacao sữa Terry', N'Gói', 'SP00058SVSPVS1.png', 'BG00058'),
('SP00059', 'SVSPVS1', N'Lon Soda Vị sữa chua', N'Đôi', 'SP00059SVSPVS1.png', 'BG00059'),
('SP00060', 'TCFTUDD', N'Trà OOlong nguyên chất Bảo Lộc Vũ Gia', N'Hủ', 'SP00060TCFTUDD.png', 'BG00060'),
('SP00061', 'TCFTUDD', N'Cà phê hòa tan vị sữa và Hồng trà Macca', N'Hộp', 'SP00061TCFTUDD.png', 'BG00061'),
('SP00062', 'TCFTUDD', N'Cà phê sữa Anni', N'Gói', 'SP00062TCFTUDD.png', 'BG00062'),
('SP00063', 'TCFTUDD', N'Cà Phê Arabica và Robusta Rang Xay Nguyên Chất', N'Gói', 'SP00063TCFTUDD.png', 'BG00063'),
('SP00064', 'TCFTUDD', N'Trà Lipton', N'Hộp', 'SP00064TCFTUDD.png', 'BG00064'),
('SP00065', 'TCFTUDD', N'Trà Mầm Ngũ cốc', N'Bịch', 'SP00065TCFTUDD.png', 'BG00065'),
('SP00066', 'TCFTUDD', N'Trà Đen Vị đào', N'Chai', 'SP00066TCFTUDD.png', 'BG00066'),
('SP00067', 'TCFTUDD', N'Trà Hòa Tan vị Chanh Mật Ong', N'Hộp', 'SP00067TCFTUDD.png', 'BG00067'),
('SP00068', 'TCFTUDD', N'Trà Lipton Bá Tước Helium Earl Grey', N'Hộp', 'SP00068TCFTUDD.png', 'BG00068'),
('SP00069', 'TCFTUDD', N'Cà phê bột Nescafe Gold Blend', N'Bình', 'SP00069TCFTUDD.png', 'BG00069'),
('SP00070', 'TPCBSDL', N'Chả lụa bì ớt xiêm xanh G Kitchen', N'Cây', 'SP00070TPCBSDL.png', 'BG00070'),
('SP00071', 'TPCBSDL', N'Chân giò muối Life Good', N'Bịch', 'SP00071TPCBSDL.png', 'BG00071'),
('SP00072', 'TPCBSDL', N'Ba rọi hun khói', N'Bịch', 'SP00072TPCBSDL.png', 'BG00072'),
('SP00073', 'TPCBSDL', N'Chả cá chiên', N'Bịch', 'SP00073TPCBSDL.png', 'BG00073'),
('SP00074', 'TPCBSDL', N'Kim chi cải thảo Bibigo', N'Hộp', 'SP00074TPCBSDL.png', 'BG00074'),
('SP00075', 'TPCBSDL', N'Thịt càng ghẹ đông lạnh ', N'Gói', 'SP00075TPCBSDL.png', 'BG00075'),
('SP00076', 'TPCBSDL', N'Thịt bò Mỹ đông lạnh ', N'Khay', 'SP00076TPCBSDL.png', 'BG00076'),
('SP00077', 'TPCBSDL', N'Bạch tuộc làm sạch ', N'Khay', 'SP00077TPCBSDL.png', 'BG00077'),
('SP00078', 'TPCBSDL', N'Cá trứng ', N'Khay', 'SP00078TPCBSDL.png', 'BG00078'),
('SP00079', 'TPCBSDL', N'Cá bống đông lạnh ', N'Khay', 'SP00079TPCBSDL.png', 'BG00079'),
('SP00080', 'TPKVCB1', N'Gà rán 99 Poultry', N'Gói', 'SP00080TPKVCB1.png', 'BG00080'),
('SP00081', 'TPKVCB1', N'Viên thả lẩu Nhất Tâm ', N'Gói', 'SP00081TPKVCB1.png', 'BG00081'),
('SP00082', 'TPKVCB1', N'Bánh cuộn xúc xích phô mai', N'Gói', 'SP00082TPKVCB1.png', 'BG00082'),
('SP00083', 'TPKVCB1', N'Miến khoai lang Miwon ', N'Gói', 'SP00083TPKVCB1.png', 'BG00083'),
('SP00084', 'TPKVCB1', N'Cơm chiên hải sản', N'Gói', 'SP00084TPKVCB1.png', 'BG00084'),
('SP00085', 'TPKVCB1', N'Mì ý xúc xích kiểu Nhật ', N'Gói', 'SP00085TPKVCB1.png', 'BG00085'),
('SP00086', 'TPKVCB1', N'Bánh bột lọc Huế ', N'Gói', 'SP00086TPKVCB1.png', 'BG00086'),
('SP00087', 'TPKVCB1', N'Bánh khoai', N'Gói', 'SP00087TPKVCB1.png', 'BG00087'),
('SP00088', 'TPKVCB1', N'Cá basa tẩm bột  ', N'Gói', 'SP00088TPKVCB1.png', 'BG00088'),
('SP00089', 'TPKVCB1', N'Nấm đông cô ', N'Gói', 'SP00089TPKVCB1.png', 'BG00089'),
select * from NhomSanPham
insert into BangGia(IDBangGia,DonGia,Giam) values 
('BG00050', '26000','1'),
('BG00051', '32000', '1'),
('BG00052', '29000', '1'),
('BG00053', '69000', '1'),
('BG00054', '290000', '1'),
('BG00055', '279000', '1'),
('BG00056', '1109000', '1'),
('BG00057', '267000', '1'),
('BG00058', '30000', '1'),
('BG00059', '33500', '1'),
('BG00060', '199000', '1'),
('BG00061', '53000', '1'),
('BG00062', '103000', '1'),
('BG00063', '165000', '1'),
('BG00064', '36000', '1'),
('BG00065', '149000', '1'),
('BG00066', '8000', '1'),
('BG00067', '35000', '1'),
('BG00068', '60000', '1'),
('BG00069', '145000', '1'),
('BG00070', '115000', '1'),
('BG00071', '74000', '1'),
('BG00072', '44000', '1'),
('BG00073', '39000', '1'),
('BG00074', '44000', '1'),
('BG00075', '118000', '1'),
('BG00076', '134000', '1'),
('BG00077', '99000', '1'),
('BG00078', '77500', '1'),
('BG00079', '62000', '1'),
('BG00080', '66000', '1'),
('BG00081', '45000', '1'),
('BG00082', '55000', '1'),
('BG00083', '107000', '1'),
('BG00084', '25000', '1'),
('BG00085', '29500', '1'),
('BG00086', '32000', '1'),
('BG00087', '40000', '1'),
('BG00088', '41000', '1'),
('BG00089', '26500', '1'),


