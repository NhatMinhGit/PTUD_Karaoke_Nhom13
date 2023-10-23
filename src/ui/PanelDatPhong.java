package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatPhong extends JPanel {
	private javax.swing.JButton btnHienThiChiTietHoaDon;
    private javax.swing.JButton btnHienThiChiTietHoaDon1;
    private javax.swing.JCheckBox chkTrangThaiThanhToan;
    private javax.swing.JFormattedTextField ftxtNgayLapHoaDon;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGioTraPhong;
    private javax.swing.JLabel lblGioTraPhong1;
    private javax.swing.JLabel lblMaHoaDon;
    private javax.swing.JLabel lblNgayLapHoaDon;
    private javax.swing.JLabel lblQuanLiThongTinHoaDon;
    private javax.swing.JLabel lblTrangThaiThanhToan;
    private javax.swing.JMenu mnDanhMuc;
    private javax.swing.JMenu mnDatPhong;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenu mnThanhToan;
    private javax.swing.JMenu mnThongKe;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDatPhong;
    private javax.swing.JMenuItem mniDatPhongCho;
    private javax.swing.JMenuItem mniDichVu;
    private javax.swing.JMenuItem mniHoaDon;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniKhuyenMai;
    private javax.swing.JMenuItem mniThongKeDoanhThu;
    private javax.swing.JMenuItem mniThongKeDoanhThuTheoKhachHang;
    private javax.swing.JMenuItem mniTrangChu;
    private javax.swing.JMenuItem mniTroGiup;
    private javax.swing.JPanel pnlChucNangThongTinHoaDon;
    private javax.swing.JPanel pnlDanhSachHoaDon;
    private javax.swing.JPanel pnlThongTinHoaDon;
    private javax.swing.JTable tblDanhSachHoaDon;
    private javax.swing.JTextField txtGioTraPhong;
    private javax.swing.JTextField txtGioTraPhong1;
    private javax.swing.JTextField txtMaHoaDon;

	public PanelDatPhong(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new BorderLayout());
        jMenuItem1 = new javax.swing.JMenuItem();
        lblQuanLiThongTinHoaDon = new javax.swing.JLabel();
        pnlThongTinHoaDon = new javax.swing.JPanel();
        lblMaHoaDon = new javax.swing.JLabel();
        lblNgayLapHoaDon = new javax.swing.JLabel();
        lblTrangThaiThanhToan = new javax.swing.JLabel();
        lblGioTraPhong = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        txtGioTraPhong = new javax.swing.JTextField();
        ftxtNgayLapHoaDon = new javax.swing.JFormattedTextField();
        chkTrangThaiThanhToan = new javax.swing.JCheckBox();
        txtGioTraPhong1 = new javax.swing.JTextField();
        lblGioTraPhong1 = new javax.swing.JLabel();
        pnlDanhSachHoaDon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachHoaDon = new javax.swing.JTable();
        pnlChucNangThongTinHoaDon = new javax.swing.JPanel();
        btnHienThiChiTietHoaDon = new javax.swing.JButton();
        btnHienThiChiTietHoaDon1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mniTrangChu = new javax.swing.JMenuItem();
        mniTroGiup = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mnDanhMuc = new javax.swing.JMenu();
        mniHoaDon = new javax.swing.JMenuItem();
        mniDichVu = new javax.swing.JMenuItem();
        mniKhuyenMai = new javax.swing.JMenuItem();
        mniKhachHang = new javax.swing.JMenuItem();
        mnDatPhong = new javax.swing.JMenu();
        mniDatPhong = new javax.swing.JMenuItem();
        mniDatPhongCho = new javax.swing.JMenuItem();
        mnThongKe = new javax.swing.JMenu();
        mniThongKeDoanhThu = new javax.swing.JMenuItem();
        mniThongKeDoanhThuTheoKhachHang = new javax.swing.JMenuItem();
        mnThanhToan = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblQuanLiThongTinHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuanLiThongTinHoaDon.setText("QUẢN LÍ THÔNG TIN HOÁ ĐƠN");

        pnlThongTinHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN HOÁ ĐƠN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblMaHoaDon.setText("Mã hoá đơn:");

        lblNgayLapHoaDon.setText("Tên khách hàng:");

        lblTrangThaiThanhToan.setText("Trạng thái thanh toán:");

        lblGioTraPhong.setText("Ngày thanh toán:");

        txtMaHoaDon.setText("HD001");

        ftxtNgayLapHoaDon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));
        ftxtNgayLapHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtNgayLapHoaDonActionPerformed(evt);
            }

			private void ftxtNgayLapHoaDonActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });

        chkTrangThaiThanhToan.setText("Trạng thái thanh toán");
        chkTrangThaiThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTrangThaiThanhToanActionPerformed(evt);
            }

			private void chkTrangThaiThanhToanActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });

        lblGioTraPhong1.setText("Ngày thanh toán:");

        javax.swing.GroupLayout pnlThongTinHoaDonLayout = new javax.swing.GroupLayout(pnlThongTinHoaDon);
        pnlThongTinHoaDon.setLayout(pnlThongTinHoaDonLayout);
        pnlThongTinHoaDonLayout.setHorizontalGroup(
            pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayLapHoaDon)
                    .addComponent(lblMaHoaDon)
                    .addComponent(lblGioTraPhong)
                    .addComponent(lblTrangThaiThanhToan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinHoaDonLayout.createSequentialGroup()
                        .addComponent(chkTrangThaiThanhToan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongTinHoaDonLayout.createSequentialGroup()
                        .addGroup(pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlThongTinHoaDonLayout.createSequentialGroup()
                                .addGroup(pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGioTraPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(ftxtNgayLapHoaDon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addComponent(lblGioTraPhong1)
                                .addGap(18, 18, 18)
                                .addComponent(txtGioTraPhong1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMaHoaDon))
                        .addGap(22, 22, 22))))
        );
        pnlThongTinHoaDonLayout.setVerticalGroup(
            pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinHoaDonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaHoaDon)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayLapHoaDon)
                    .addComponent(ftxtNgayLapHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioTraPhong)
                    .addComponent(txtGioTraPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGioTraPhong1)
                    .addComponent(txtGioTraPhong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(pnlThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThaiThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTrangThaiThanhToan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDanhSachHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH HOÁ ĐƠN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblDanhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hoá đơn", "Giờ trả phòng", "Ngày lập hoá đơn", "Trạng thái thanh toán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDanhSachHoaDon);
        if (tblDanhSachHoaDon.getColumnModel().getColumnCount() > 0) {
            tblDanhSachHoaDon.getColumnModel().getColumn(0).setMinWidth(30);
            tblDanhSachHoaDon.getColumnModel().getColumn(3).setMinWidth(100);
            tblDanhSachHoaDon.getColumnModel().getColumn(4).setMinWidth(180);
        }

        btnHienThiChiTietHoaDon.setBackground(new java.awt.Color(255, 0, 51));
        btnHienThiChiTietHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHienThiChiTietHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnHienThiChiTietHoaDon.setText("Huỷ xác nhận");
        btnHienThiChiTietHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHienThiChiTietHoaDon.setMaximumSize(new java.awt.Dimension(50, 24));
        btnHienThiChiTietHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiChiTietHoaDonActionPerformed(evt);
            }

			private void btnHienThiChiTietHoaDonActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });

        btnHienThiChiTietHoaDon1.setBackground(new java.awt.Color(51, 255, 102));
        btnHienThiChiTietHoaDon1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHienThiChiTietHoaDon1.setForeground(new java.awt.Color(255, 255, 255));
        btnHienThiChiTietHoaDon1.setText("Xác nhận");
        btnHienThiChiTietHoaDon1.setMaximumSize(new java.awt.Dimension(50, 24));
        btnHienThiChiTietHoaDon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiChiTietHoaDon1ActionPerformed(evt);
            }

			private void btnHienThiChiTietHoaDon1ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });

        javax.swing.GroupLayout pnlChucNangThongTinHoaDonLayout = new javax.swing.GroupLayout(pnlChucNangThongTinHoaDon);
        pnlChucNangThongTinHoaDon.setLayout(pnlChucNangThongTinHoaDonLayout);
        pnlChucNangThongTinHoaDonLayout.setHorizontalGroup(
            pnlChucNangThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangThongTinHoaDonLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlChucNangThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHienThiChiTietHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienThiChiTietHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlChucNangThongTinHoaDonLayout.setVerticalGroup(
            pnlChucNangThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangThongTinHoaDonLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnHienThiChiTietHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnHienThiChiTietHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout pnlDanhSachHoaDonLayout = new javax.swing.GroupLayout(pnlDanhSachHoaDon);
        pnlDanhSachHoaDon.setLayout(pnlDanhSachHoaDonLayout);
        pnlDanhSachHoaDonLayout.setHorizontalGroup(
            pnlDanhSachHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachHoaDonLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlChucNangThongTinHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnlDanhSachHoaDonLayout.setVerticalGroup(
            pnlDanhSachHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlDanhSachHoaDonLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(pnlChucNangThongTinHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        mnHeThong.setText("Hệ Thống");

        mniTrangChu.setText("Trang chủ");
        mnHeThong.add(mniTrangChu);

        mniTroGiup.setText("Trợ giúp");
        mniTroGiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTroGiupActionPerformed(evt);
            }

			private void mniTroGiupActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        mnHeThong.add(mniTroGiup);

        mniDangXuat.setText("Đăng xuất");
        mnHeThong.add(mniDangXuat);

        jMenuBar1.add(mnHeThong);

        mnDanhMuc.setText("Danh Mục");

        mniHoaDon.setText("Hóa đơn");
        mniHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonActionPerformed(evt);
            }

			private void mniHoaDonActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        mnDanhMuc.add(mniHoaDon);

        mniDichVu.setText("Dịch vụ");
        mniDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDichVuActionPerformed(evt);
            }

			private void mniDichVuActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        mnDanhMuc.add(mniDichVu);

        mniKhuyenMai.setText("Khuyến mãi");
        mniKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhuyenMaiActionPerformed(evt);
            }

			private void mniKhuyenMaiActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        mnDanhMuc.add(mniKhuyenMai);

        mniKhachHang.setText("Khách hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }

			private void mniKhachHangActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        mnDanhMuc.add(mniKhachHang);

        jMenuBar1.add(mnDanhMuc);

        mnDatPhong.setText("Đặt Phòng");

        mniDatPhong.setText("Đặt phòng");
        mniDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDatPhongActionPerformed(evt);
            }

			private void mniDatPhongActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        mnDatPhong.add(mniDatPhong);

        mniDatPhongCho.setText("Đặt phòng chờ");
        mnDatPhong.add(mniDatPhongCho);

        jMenuBar1.add(mnDatPhong);

        mnThongKe.setText("Thống Kê");
        mnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThongKeActionPerformed(evt);
            }

			private void mnThongKeActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });

        mniThongKeDoanhThu.setText("Thống kê doanh thu");
        mnThongKe.add(mniThongKeDoanhThu);

        mniThongKeDoanhThuTheoKhachHang.setText("Thống kê doanh thu theo khách hàng");
        mniThongKeDoanhThuTheoKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeDoanhThuTheoKhachHangActionPerformed(evt);
            }

			private void mniThongKeDoanhThuTheoKhachHangActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        mnThongKe.add(mniThongKeDoanhThuTheoKhachHang);

        jMenuBar1.add(mnThongKe);

        mnThanhToan.setText("Thanh toán");
        mnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThanhToanActionPerformed(evt);
            }

			private void mnThanhToanActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        jMenuBar1.add(mnThanhToan);

        setJMenuBar(jMenuBar1);


        

    }

	private AbstractButton getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setJMenuBar(JMenuBar jMenuBar12) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}

