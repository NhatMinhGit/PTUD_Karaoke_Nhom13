package ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class MainFrame extends JFrame{
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JMenuBar menuBar;
    private JMenu menuHeThong;
    private JMenu menuDanhMuc;
    private JMenu menuXuLy;
    private JMenu menuThongKe;
    private JMenuItem menuItemTrangChinh;
    private JMenuItem menuItemTaiKhoan;
    private JMenuItem menuItemTroGiup;
    private JMenuItem menuItemDangXuat;
    private JMenuItem menuItemNhanVien;
    private JMenuItem menuItemPhong;
    private JMenuItem menuItemKhachHang;
    private JMenuItem menuItemKhuyenMai;
    private JMenuItem menuItemHoaDon;
    private JMenuItem menuItemDichVu;
    private JMenuItem menuItemDatPhong;
    private JMenuItem menuItemThongKeDoanhThu;
    private JMenuItem menuItemThongKeKhachHang;
    private JButton backButton;
	private JLabel lblTrangChinh;

    public MainFrame() {
        setTitle("Quản lý Karaoke MMM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Trang chính
        GiaoDienChinh pnTrangChinh = new GiaoDienChinh(cardLayout, cardPanel);
        cardPanel.add(pnTrangChinh, "trangchinh");
        
        // Trang Nhân viên
        PanelNhanVien pnNhanVien = new PanelNhanVien();
        cardPanel.add(pnNhanVien, "nhanvien");

        // Trang Phòng
        PanelPhong phongPage = new PanelPhong();
        cardPanel.add(phongPage, "phong");

        // Trang Khách hàng
        PanelKhachHang khachHangPage = new PanelKhachHang(cardLayout, cardPanel);
        cardPanel.add(khachHangPage, "khachhang");

        // Trang Khuyến mãi
        PanelKhuyenMai khuyenMaiPage = new PanelKhuyenMai(cardLayout, cardPanel);
        cardPanel.add(khuyenMaiPage, "khuyenmai");

        // Trang Hóa đơn
        PanelHoaDon hoaDonPage = new PanelHoaDon(cardLayout, cardPanel);
        cardPanel.add(hoaDonPage, "hoadon");

        // Trang Dịch vụ
        PanelDichVu dichVuPage = new PanelDichVu(cardLayout, cardPanel);
        cardPanel.add(dichVuPage, "dichvu");

        // Trang Đặt phòng
        PanelDatPhong datPhongPage = new PanelDatPhong(cardLayout, cardPanel);
        cardPanel.add(datPhongPage, "datphong");

        // Trang Thống kê doanh thu
        PanelThongKeDoanhThu thongKeDoanhThu = new PanelThongKeDoanhThu();
        cardPanel.add(thongKeDoanhThu, "thongkedoanhthu");

        // Trang Thống kê khách hàng
        PanelThongKeKhachHang thongKeKhachHang = new PanelThongKeKhachHang(cardLayout, cardPanel);
        cardPanel.add(thongKeKhachHang, "thongkekhachhang");

     // Menu Bar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        // Menu Hệ thống
        menuHeThong = new JMenu("Hệ thống");
        menuBar.add(menuHeThong);
        menuHeThong.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/system.png")));
        menuHeThong.setBackground(Color.WHITE);
		menuHeThong.setForeground(Color.BLACK);
		menuHeThong.setFont(new Font("Times New Roman", Font.BOLD, 18));

        menuItemTrangChinh = new JMenuItem("Trang chính");
        menuHeThong.add(menuItemTrangChinh);
        menuItemTrangChinh.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/home.png")));
        menuItemTrangChinh.setBackground(Color.WHITE);
        menuItemTrangChinh.setForeground(Color.BLACK);
        menuItemTrangChinh.setFont(new Font("Times New Roman", Font.BOLD, 18));

        menuItemTaiKhoan = new JMenuItem("Tài khoản");
        menuHeThong.add(menuItemTaiKhoan);

        menuItemTroGiup = new JMenuItem("Trợ giúp");
        menuHeThong.add(menuItemTroGiup);

        menuItemDangXuat = new JMenuItem("Đăng Xuất");
        menuHeThong.add(menuItemDangXuat);
        
		// Xử lý sự kiện menu Item danh mục
        menuDanhMuc = new JMenu("Danh Mục");
        menuDanhMuc.setBackground(Color.WHITE);
		menuDanhMuc.setForeground(Color.BLACK);
		menuDanhMuc.setFont(new Font("Times New Roman", Font.BOLD, 18));
		menuBar.add(menuDanhMuc);

        menuItemNhanVien = new JMenuItem("Nhân viên");
        menuDanhMuc.add(menuItemNhanVien);

        menuItemPhong = new JMenuItem("Phòng");
        menuDanhMuc.add(menuItemPhong);

        menuItemKhachHang = new JMenuItem("Khách Hàng");
        menuDanhMuc.add(menuItemKhachHang);
        menuItemKhachHang.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/khachHang.png")));
        menuItemKhachHang.setBackground(Color.WHITE);
        menuItemKhachHang.setForeground(Color.BLACK);
        menuItemKhachHang.setFont(new Font("Times New Roman", Font.BOLD, 18));

        menuItemKhuyenMai = new JMenuItem("Khuyến Mãi");
        menuDanhMuc.add(menuItemKhuyenMai);
        menuItemKhuyenMai.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/khuyenmai.png")));
        menuItemKhuyenMai.setBackground(Color.WHITE);
        menuItemKhuyenMai.setForeground(Color.BLACK);
        menuItemKhuyenMai.setFont(new Font("Times New Roman", Font.BOLD, 18));

        menuItemHoaDon = new JMenuItem("Hóa Đơn");
        menuDanhMuc.add(menuItemHoaDon);

        menuItemDichVu = new JMenuItem("Dịch Vụ");
        menuDanhMuc.add(menuItemDichVu);
        menuDanhMuc.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/danhmuc.png")));
        
        // Menu Xử lý
        menuXuLy = new JMenu("Xử lý");
        menuBar.add(menuXuLy);
        menuXuLy.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/room.png")));
        menuXuLy.setBackground(Color.WHITE);
        menuXuLy.setForeground(Color.BLACK);
        menuXuLy.setFont(new Font("Times New Roman", Font.BOLD, 18));
        

        // Sự kiện cho menu items
        menuItemTrangChinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "trangchinh");
            }
        });

        menuItemNhanVien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "nhanvien");
            }
        });

        menuItemPhong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "phong");
            }
        });

        menuItemKhachHang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "khachhang");
            }
        });

        menuItemKhuyenMai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "khuyenmai");
            }
        });

        menuItemHoaDon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "hoadon");
            }
        });

        menuItemDichVu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "dichvu");
            }
        });

        add(cardPanel);
        cardLayout.show(cardPanel, "trangchinh");

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}
