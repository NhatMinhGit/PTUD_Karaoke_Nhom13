package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PanelKhuyenMai extends JPanel implements ActionListener, KeyListener, ItemListener {
    private JLabel lblLabel_1;
	private JButton btnLamMoi;
	private JButton btnCapNhat;
	private JButton btnThem;
	private JTextField txtMoTa;
	private JLabel lblCm;
	private JTextField txtMaGiamGia;
	private JComponent btnTim;
	private JButton btnDau;
	private JButton btnTru1;
	private JLabel txtPage;
	private JButton btnCong1;
	private JButton btnCuoi;
	private JLabel txtTotolPage;
	private JLabel txtPage_1;
	private JButton btnTrV;
	private JComboBox<String> cbTrangThai;
	private JLabel MaGiamGia;
	private JLabel lblMaGiamGia;
	private JLabel lblMoTa;
	private JPanel pnPanel_2;
	private JPanel pnPanel_1;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tableModle;

	public PanelKhuyenMai(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new BorderLayout());
        JPanel pnPanel = new JPanel();
		pnPanel.setBackground(Color.WHITE);
        add(pnPanel, BorderLayout.NORTH);
        pnPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		
        lblLabel_1 = new JLabel("Quản Lý Khuyến Mãi");

		pnPanel.add(lblLabel_1);
		JLabel lblMaNV = new JLabel("Mã giảm giá: ");
		lblMaNV.setForeground(Color.BLACK);
		lblMaNV.setFont(new Font("Tahoma", Font.BOLD, 16));
		

		
		lblMaGiamGia = new JLabel("Mã giảm giá:");
		lblMaGiamGia.setForeground(Color.BLACK);
		lblMaGiamGia.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtMaGiamGia = new JTextField();
		txtMaGiamGia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMaGiamGia.setColumns(10);
		pnPanel.add(lblMaGiamGia);
		pnPanel.add(txtMaGiamGia);
		
		lblMoTa = new JLabel("Mô tả:");
		lblMoTa.setForeground(Color.BLACK);
		lblMoTa.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtMoTa = new JTextField();
		txtMoTa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMoTa.setColumns(10);
		txtMoTa.addKeyListener(this);
		pnPanel.add(lblMoTa);
		pnPanel.add(txtMoTa);
		
		lblCm = new JLabel("Ngày bắt đầu:");
		lblCm.setForeground(Color.BLACK);
		lblCm.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnPanel.add(lblCm);
		
		JLabel lblTrangThai = new JLabel("Trạng thái:");
		lblTrangThai.setForeground(Color.BLACK);
		lblTrangThai.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		cbTrangThai = new JComboBox<String>();
		cbTrangThai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbTrangThai.setBackground(Color.WHITE);
		cbTrangThai.addItem("Tất cả");
		cbTrangThai.addItem("Chờ");
		cbTrangThai.addItem("Hoạt động");
		cbTrangThai.addItem("Hết hạn");
		cbTrangThai.addItemListener(this);
		pnPanel.add(lblTrangThai);
		pnPanel.add(cbTrangThai);
		
		btnTim = new JButton("Tìm kiếm");
		btnTim.setForeground(Color.WHITE);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTim.setBackground(new Color(0, 128, 0));
		btnLamMoi = new JButton("Làm mới");
		btnLamMoi.setIcon(new ImageIcon(PanelKhuyenMai.class.getResource("/icon/clean.png")));
		btnLamMoi.addActionListener(this);
		btnLamMoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnPanel.add(btnTim);
		pnPanel.add(btnLamMoi);
		
		btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setMargin(new Insets(2, 0, 2, 0));
		btnCapNhat.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnCapNhat.setForeground(new Color(255, 255, 255));
		btnCapNhat.setBackground(new Color(255, 99, 71));
		btnCapNhat.setIconTextGap(10);
		btnCapNhat.setIcon(new ImageIcon(PanelKhuyenMai.class.getResource("/icon/sua.png")));
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnThem = new JButton("Tạo mới");
		btnThem.setMargin(new Insets(0, 0, 0, 0));
		btnThem.setForeground(new Color(255, 255, 255));
		btnThem.setBackground(new Color(30, 144, 255));
		btnThem.setIcon(new ImageIcon(PanelKhuyenMai.class.getResource("/icon/add.png")));
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnPanel.add(btnCapNhat);
		pnPanel.add(btnThem);
		
		// Center
		pnPanel_1 = new JPanel();
		add(pnPanel_1,BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		table = new JTable();
		table.setSelectionBackground(SystemColor.activeCaption);
		scrollPane.setColumnHeaderView(table);
		tableModle = new DefaultTableModel(new Object[][] {}, new String[] { "Mã giảm giá", "Mô tả", "Chiết khấu",
				"Ngày bắt đầu", "Ngày hết hạn", "Số lượng", "Đã sử dụng", "Trạng thái" });
//		table.addMouseListener(this);
		scrollPane.setViewportView(table);
		table.setModel(tableModle);
		scrollPane.setPreferredSize(new Dimension(1500,700));
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		
		pnPanel_1.add(scrollPane);
		
		// South
		pnPanel_2 = new JPanel();
		add(pnPanel_2,BorderLayout.SOUTH);
		
		btnDau = new JButton("");
		btnDau.setIcon(new ImageIcon(PanelKhuyenMai.class.getResource("/icon/previousEnd.png")));
		btnDau.setFont(new Font("Arial", Font.PLAIN, 16));
		btnDau.setEnabled(true);
		pnPanel_2.add(btnDau);

		btnTru1 = new JButton("");
		btnTru1.setIcon(new ImageIcon(PanelKhuyenMai.class.getResource("/icon/rewind-button.png")));
		btnTru1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTru1.setEnabled(true);
		pnPanel_2.add(btnTru1);

		txtPage = new JLabel("1");
		txtPage.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPage.setForeground(SystemColor.controlDkShadow);
		txtPage.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnPanel_2.add(txtPage);
		
		txtPage_1 = new JLabel("/");
		txtPage_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPage_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		pnPanel_2.add(txtPage_1);
		
		txtTotolPage = new JLabel("3");
		txtTotolPage.setHorizontalAlignment(SwingConstants.LEFT);
		txtTotolPage.setFont(new Font("Tahoma", Font.BOLD, 17));
		pnPanel_2.add(txtTotolPage);

		btnCong1 = new JButton("");
		btnCong1.setIcon(new ImageIcon(PanelKhuyenMai.class.getResource("/icon/forward-button.png")));
		btnCong1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCong1.setEnabled(true);
		pnPanel_2.add(btnCong1);

		btnCuoi = new JButton("");
		btnCuoi.setIcon(new ImageIcon(PanelKhuyenMai.class.getResource("/icon/next.png")));
		btnCuoi.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCuoi.setEnabled(true);
		pnPanel_2.add(btnCuoi);



		
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
