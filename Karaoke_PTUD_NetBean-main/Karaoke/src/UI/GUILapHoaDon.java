/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author Duong Ngo Manh
 */
public class GUILapHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form GUIThongTinNhanVien
     */
    public GUILapHoaDon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThongTinKhachHang = new javax.swing.JPanel();
        lblTenKhachHang = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        lblSoCCCD = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        txtMaNhanVien = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSoCCCD = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnCapNhatKhachHang = new javax.swing.JButton();
        btnHienThiChiTietHoaDon = new javax.swing.JButton();
        pnlDanhSachKhachHang = new javax.swing.JPanel();
        scrDanhSachNhanVien = new javax.swing.JScrollPane();
        tblDanhSachNhanVien = new javax.swing.JTable();
        lblTieuDe = new javax.swing.JLabel();
        mnuTong = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mniTrangChu = new javax.swing.JMenuItem();
        mniTroGiup = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mnuPhong = new javax.swing.JMenu();
        mniCapNhatPhong = new javax.swing.JMenuItem();
        mniCapNhatLoaiPhong = new javax.swing.JMenuItem();
        mniTimKiemPhong = new javax.swing.JMenuItem();
        mniDatPhong = new javax.swing.JMenuItem();
        mniDatPhongCho = new javax.swing.JMenuItem();
        mnuNhanVien = new javax.swing.JMenu();
        mniCapNhatNhanVien = new javax.swing.JMenuItem();
        mniTimKiemNhanVien = new javax.swing.JMenuItem();
        mnuKhachHang = new javax.swing.JMenu();
        mniCapNhatKhachHang = new javax.swing.JMenuItem();
        mniTimKiemKhachHang = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniThongKeDoanhThu = new javax.swing.JMenuItem();
        mniThongKeDoanhThuTheoKhachHang = new javax.swing.JMenuItem();
        mnuHoaDon = new javax.swing.JMenu();
        mniLapHoaDon = new javax.swing.JMenuItem();
        mniThanhToan = new javax.swing.JMenuItem();
        mnuDichVu = new javax.swing.JMenu();
        mniCapNhatDichVu = new javax.swing.JMenuItem();
        mniTimKiemDichVu = new javax.swing.JMenuItem();
        mnuKhuyenMai = new javax.swing.JMenu();
        mniCapNhatKhuyenMai = new javax.swing.JMenuItem();
        mniTimKiemKhuyenMai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Design by MMM");
        setResizable(false);

        pnlThongTinKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN HOÁ ĐƠN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblTenKhachHang.setText("Tên khách hàng:");

        lblSoDT.setText("Số điện thoại:");

        lblSoCCCD.setText("Số CCCD:");

        lblNgaySinh.setText("Ngày sinh:");

        lblDiaChi.setText("Địa chỉ:");

        lblGioiTinh.setText("Giới tính:");

        radNam.setSelected(true);
        radNam.setText("Nam");

        radNu.setText("Nữ");
        radNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNuActionPerformed(evt);
            }
        });

        txtMaNhanVien.setText("Bùi Tất Nhựt Minh");
        txtMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhanVienActionPerformed(evt);
            }
        });

        txtSoDT.setText("0938533438");

        txtNgaySinh.setText("08/01/2003");
        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });

        txtSoCCCD.setText("072203004088");

        txtDiaChi.setText("Tây Ninh");
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnCapNhatKhachHang.setText("Lập hoá đơn");
        btnCapNhatKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatKhachHangActionPerformed(evt);
            }
        });

        btnHienThiChiTietHoaDon.setText("Hiển thị chi tiết hoá đơn");
        btnHienThiChiTietHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiChiTietHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlThongTinKhachHangLayout = new javax.swing.GroupLayout(pnlThongTinKhachHang);
        pnlThongTinKhachHang.setLayout(pnlThongTinKhachHangLayout);
        pnlThongTinKhachHangLayout.setHorizontalGroup(
            pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
                        .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
                                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDiaChi)
                                    .addComponent(lblGioiTinh))
                                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(radNu)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinKhachHangLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
                                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSoDT)
                                    .addComponent(lblTenKhachHang)
                                    .addComponent(lblNgaySinh)
                                    .addComponent(lblSoCCCD))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
                                        .addComponent(radNam)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtNgaySinh)
                                    .addComponent(txtMaNhanVien)
                                    .addComponent(txtSoDT)
                                    .addComponent(txtSoCCCD))))
                        .addContainerGap())
                    .addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHienThiChiTietHoaDon)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhatKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlThongTinKhachHangLayout.setVerticalGroup(
            pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKhachHangLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKhachHang)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoDT)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radNam)
                        .addComponent(radNu)))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnlThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienThiChiTietHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDanhSachKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH HOÁ ĐƠN\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblDanhSachNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Giới tính", "Số điện thoại", "Số CCCD", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrDanhSachNhanVien.setViewportView(tblDanhSachNhanVien);

        javax.swing.GroupLayout pnlDanhSachKhachHangLayout = new javax.swing.GroupLayout(pnlDanhSachKhachHang);
        pnlDanhSachKhachHang.setLayout(pnlDanhSachKhachHangLayout);
        pnlDanhSachKhachHangLayout.setHorizontalGroup(
            pnlDanhSachKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachKhachHangLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(scrDanhSachNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
        );
        pnlDanhSachKhachHangLayout.setVerticalGroup(
            pnlDanhSachKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrDanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
        );

        lblTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTieuDe.setText("LẬP HOÁ ĐƠN");

        mnHeThong.setText("Hệ Thống");

        mniTrangChu.setText("Trang chủ");
        mniTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTrangChuActionPerformed(evt);
            }
        });
        mnHeThong.add(mniTrangChu);

        mniTroGiup.setText("Trợ giúp");
        mniTroGiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTroGiupActionPerformed(evt);
            }
        });
        mnHeThong.add(mniTroGiup);

        mniDangXuat.setText("Đăng xuất");
        mnHeThong.add(mniDangXuat);

        mnuTong.add(mnHeThong);

        mnuPhong.setText("Phòng");
        mnuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPhongActionPerformed(evt);
            }
        });

        mniCapNhatPhong.setText("Cập nhật phòng");
        mniCapNhatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatPhongActionPerformed(evt);
            }
        });
        mnuPhong.add(mniCapNhatPhong);

        mniCapNhatLoaiPhong.setText("Cập nhật loại phòng");
        mniCapNhatLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatLoaiPhongActionPerformed(evt);
            }
        });
        mnuPhong.add(mniCapNhatLoaiPhong);

        mniTimKiemPhong.setText("Tìm kiếm phòng");
        mniTimKiemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemPhongActionPerformed(evt);
            }
        });
        mnuPhong.add(mniTimKiemPhong);

        mniDatPhong.setText("Đặt phòng");
        mniDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDatPhongActionPerformed(evt);
            }
        });
        mnuPhong.add(mniDatPhong);

        mniDatPhongCho.setText("Đặt phòng chờ");
        mniDatPhongCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDatPhongChoActionPerformed(evt);
            }
        });
        mnuPhong.add(mniDatPhongCho);

        mnuTong.add(mnuPhong);

        mnuNhanVien.setText("Nhân viên");

        mniCapNhatNhanVien.setText("Cập nhật nhân viên");
        mniCapNhatNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatNhanVienActionPerformed(evt);
            }
        });
        mnuNhanVien.add(mniCapNhatNhanVien);

        mniTimKiemNhanVien.setText("Tìm kiếm nhân viên");
        mniTimKiemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemNhanVienActionPerformed(evt);
            }
        });
        mnuNhanVien.add(mniTimKiemNhanVien);

        mnuTong.add(mnuNhanVien);

        mnuKhachHang.setText("Khách hàng");

        mniCapNhatKhachHang.setText("Cập nhật khách hàng");
        mniCapNhatKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatKhachHangActionPerformed(evt);
            }
        });
        mnuKhachHang.add(mniCapNhatKhachHang);

        mniTimKiemKhachHang.setText("Tìm kiếm khách hàng");
        mniTimKiemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemKhachHangActionPerformed(evt);
            }
        });
        mnuKhachHang.add(mniTimKiemKhachHang);

        mnuTong.add(mnuKhachHang);

        mnuThongKe.setText("Thống Kê");
        mnuThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThongKeActionPerformed(evt);
            }
        });

        mniThongKeDoanhThu.setText("Thống kê doanh thu");
        mniThongKeDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniThongKeDoanhThu);

        mniThongKeDoanhThuTheoKhachHang.setText("Thống kê doanh thu theo khách hàng");
        mniThongKeDoanhThuTheoKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeDoanhThuTheoKhachHangActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniThongKeDoanhThuTheoKhachHang);

        mnuTong.add(mnuThongKe);

        mnuHoaDon.setText("Hoá đơn");

        mniLapHoaDon.setText("Lập hoá đơn");
        mniLapHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLapHoaDonActionPerformed(evt);
            }
        });
        mnuHoaDon.add(mniLapHoaDon);

        mniThanhToan.setText("Thanh toán");
        mniThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThanhToanActionPerformed(evt);
            }
        });
        mnuHoaDon.add(mniThanhToan);

        mnuTong.add(mnuHoaDon);

        mnuDichVu.setText("Dịch vụ");

        mniCapNhatDichVu.setText("Cập nhật dịch vụ");
        mniCapNhatDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatDichVuActionPerformed(evt);
            }
        });
        mnuDichVu.add(mniCapNhatDichVu);

        mniTimKiemDichVu.setText("Tìm kiếm dịch vụ");
        mniTimKiemDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemDichVuActionPerformed(evt);
            }
        });
        mnuDichVu.add(mniTimKiemDichVu);

        mnuTong.add(mnuDichVu);

        mnuKhuyenMai.setText("Khuyến mãi");
        mnuKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKhuyenMaiActionPerformed(evt);
            }
        });

        mniCapNhatKhuyenMai.setText("Cập nhật khuyến mãi");
        mniCapNhatKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatKhuyenMaiActionPerformed(evt);
            }
        });
        mnuKhuyenMai.add(mniCapNhatKhuyenMai);

        mniTimKiemKhuyenMai.setText("Tìm kiếm khuyến mãi");
        mniTimKiemKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemKhuyenMaiActionPerformed(evt);
            }
        });
        mnuKhuyenMai.add(mniTimKiemKhuyenMai);

        mnuTong.add(mnuKhuyenMai);

        setJMenuBar(mnuTong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(pnlThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(635, 635, 635)
                .addComponent(lblTieuDe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTieuDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDanhSachKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(pnlThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnlThongTinKhachHang.getAccessibleContext().setAccessibleName("THÔNG TIN KHÁCH HÀNG\n\n");
        pnlDanhSachKhachHang.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radNuActionPerformed

    private void txtMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhanVienActionPerformed
                                       
    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void btnCapNhatKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatKhachHangActionPerformed

    private void mniTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTrangChuActionPerformed
        // TODO add your handling code here:
        TrangChu tc = new TrangChu();
        tc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTrangChuActionPerformed

    private void mniTroGiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTroGiupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniTroGiupActionPerformed

    private void mniCapNhatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniCapNhatPhongActionPerformed

    private void mniCapNhatLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatLoaiPhongActionPerformed
        // TODO add your handling code here:
        GUICapNhatLoaiPhong cnlp = new GUICapNhatLoaiPhong();
        cnlp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatLoaiPhongActionPerformed

    private void mniTimKiemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemPhongActionPerformed
        // TODO add your handling code here:
        GUITimKiemPhong tkp = new GUITimKiemPhong();
        tkp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemPhongActionPerformed

    private void mniDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDatPhongActionPerformed
        GUIDatPhong dp = new GUIDatPhong();
        dp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniDatPhongActionPerformed

    private void mniDatPhongChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDatPhongChoActionPerformed
        // TODO add your handling code here:
        GUIDatPhongCho dpc = new GUIDatPhongCho();
        dpc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniDatPhongChoActionPerformed

    private void mnuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPhongActionPerformed

    private void mniCapNhatNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatNhanVienActionPerformed
        // TODO add your handling code here:
        GUICapNhatNhanVien cnnv = new GUICapNhatNhanVien();
        cnnv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatNhanVienActionPerformed

    private void mniTimKiemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemNhanVienActionPerformed
        // TODO add your handling code here:
        GUITimKiemNhanVien tknv = new GUITimKiemNhanVien();
        tknv.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_mniTimKiemNhanVienActionPerformed

    private void mniCapNhatKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatKhachHangActionPerformed
        // TODO add your handling code here:
        GUITimKiemKhachHang cnkh = new GUITimKiemKhachHang();
        cnkh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatKhachHangActionPerformed

    private void mniTimKiemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemKhachHangActionPerformed
        // TODO add your handling code here:
        GUICapNhatKhachHang tkkh = new GUICapNhatKhachHang();
        tkkh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemKhachHangActionPerformed

    private void mniThongKeDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeDoanhThuActionPerformed
        // TODO add your handling code here:
        GUIThongKeKhachHang tkdt = new GUIThongKeKhachHang();
        tkdt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniThongKeDoanhThuActionPerformed

    private void mniThongKeDoanhThuTheoKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeDoanhThuTheoKhachHangActionPerformed
        // TODO add your handling code here:
        GUIThongKeDoanhThu tkdttkh = new GUIThongKeDoanhThu();
        tkdttkh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniThongKeDoanhThuTheoKhachHangActionPerformed

    private void mnuThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThongKeActionPerformed

    }//GEN-LAST:event_mnuThongKeActionPerformed

    private void mniLapHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLapHoaDonActionPerformed
        // TODO add your handling code here:
        GUILapHoaDon lhd = new GUILapHoaDon();
        lhd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniLapHoaDonActionPerformed

    private void mniThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThanhToanActionPerformed
        // TODO add your handling code here:
        GUILapHoaDon lhd = new GUILapHoaDon();
        lhd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniThanhToanActionPerformed

    private void mniCapNhatDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatDichVuActionPerformed
        // TODO add your handling code here:
        GUITimKiemDichVu cndv = new GUITimKiemDichVu();
        cndv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatDichVuActionPerformed

    private void mniTimKiemDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemDichVuActionPerformed
        // TODO add your handling code here:
        GUICapNhatDichVu tkdv = new GUICapNhatDichVu();
        tkdv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemDichVuActionPerformed

    private void mniCapNhatKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatKhuyenMaiActionPerformed
        // TODO add your handling code here:
        GUICapNhatKhuyenMai1 cnkm = new GUICapNhatKhuyenMai1();
        cnkm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatKhuyenMaiActionPerformed

    private void mniTimKiemKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemKhuyenMaiActionPerformed
        // TODO add your handling code here:
        GUITimKiemKhuyenMai tkkm = new GUITimKiemKhuyenMai();
        tkkm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemKhuyenMaiActionPerformed

    private void mnuKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuKhuyenMaiActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnHienThiChiTietHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiChiTietHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHienThiChiTietHoaDonActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUILapHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILapHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILapHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILapHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILapHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatKhachHang;
    private javax.swing.JButton btnHienThiChiTietHoaDon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoCCCD;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblTenKhachHang;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenuItem mniCapNhatDichVu;
    private javax.swing.JMenuItem mniCapNhatKhachHang;
    private javax.swing.JMenuItem mniCapNhatKhuyenMai;
    private javax.swing.JMenuItem mniCapNhatLoaiPhong;
    private javax.swing.JMenuItem mniCapNhatNhanVien;
    private javax.swing.JMenuItem mniCapNhatPhong;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDatPhong;
    private javax.swing.JMenuItem mniDatPhongCho;
    private javax.swing.JMenuItem mniLapHoaDon;
    private javax.swing.JMenuItem mniThanhToan;
    private javax.swing.JMenuItem mniThongKeDoanhThu;
    private javax.swing.JMenuItem mniThongKeDoanhThuTheoKhachHang;
    private javax.swing.JMenuItem mniTimKiemDichVu;
    private javax.swing.JMenuItem mniTimKiemKhachHang;
    private javax.swing.JMenuItem mniTimKiemKhuyenMai;
    private javax.swing.JMenuItem mniTimKiemNhanVien;
    private javax.swing.JMenuItem mniTimKiemPhong;
    private javax.swing.JMenuItem mniTrangChu;
    private javax.swing.JMenuItem mniTroGiup;
    private javax.swing.JMenu mnuDichVu;
    private javax.swing.JMenu mnuHoaDon;
    private javax.swing.JMenu mnuKhachHang;
    private javax.swing.JMenu mnuKhuyenMai;
    private javax.swing.JMenu mnuNhanVien;
    private javax.swing.JMenu mnuPhong;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenuBar mnuTong;
    private javax.swing.JPanel pnlDanhSachKhachHang;
    private javax.swing.JPanel pnlThongTinKhachHang;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JScrollPane scrDanhSachNhanVien;
    private javax.swing.JTable tblDanhSachNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoCCCD;
    private javax.swing.JTextField txtSoDT;
    // End of variables declaration//GEN-END:variables
}