package ui;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class PanelKhachHang extends JPanel implements ActionListener, ItemListener, KeyListener, MouseListener {
	private JButton btnLamMoi;
	private JButton btnSua;
	private JButton btnThem;
	private DefaultTableModel tableModle;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField txtChietKhau;
	private JLabel lblCm;
	private JTextField txtMaGiamGia;
	private JLabel lblLabel_1;
	private JLabel lblChitKhu;
	private JComboBox cbHoatDong;
	private JButton btnTrV;
	private Component lblNewLabel;
	private JLabel lblTn;
	private JTextField txtTen;
	private JTextField txtSDT;
	private Component lblNhpSdt;
	private AbstractButton btnTim;
	private JTextField txtMa;
	private int limit = 20;
	private JComboBox cbioiTinh;
	private JLabel txtPage;
	private JButton btnDau;
	private JButton btnTru1;
	private JButton btnCong1;
	private JButton btnCuoi;
	private JLabel lblTongTrang;

    public PanelKhachHang(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new BorderLayout());
    		        JPanel panel = new JPanel();
    		        panel.setBackground(Color.WHITE);
    		        add(panel, BorderLayout.NORTH);
    		        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));

    		        

    		        lblNewLabel = new JLabel("Mã KH: ");
    		        lblNewLabel.setForeground(Color.BLACK);
    		        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
    		        panel.add(lblNewLabel);

    		        txtMa = new JTextField();
    		        txtMa.setFont(new Font("Tahoma", Font.PLAIN, 16));
    		        txtMa.setColumns(10);
    		        panel.add(txtMa);
    		        
    		        lblTn = new JLabel("Tên: ");
    		        lblTn.setForeground(Color.BLACK);
    		        lblTn.setFont(new Font("Tahoma", Font.BOLD, 16));
    		        panel.add(lblTn);

    		        txtTen = new JTextField();
    		        txtTen.setFont(new Font("Tahoma", Font.PLAIN, 16));
    		        txtTen.setColumns(10);
    		        panel.add(txtTen);

    		        lblCm = new JLabel("SDT: ");
    		        lblCm.setForeground(Color.BLACK);
    		        lblCm.setFont(new Font("Tahoma", Font.BOLD, 16));
    		        panel.add(lblCm);

    		        txtSDT = new JTextField();
    		        txtSDT.setFont(new Font("Tahoma", Font.PLAIN, 16));
    		        txtSDT.setColumns(10);
    		        panel.add(txtSDT);
    		        
    		        lblNhpSdt = new JLabel("Giới tính: ");
    		        lblNhpSdt.setForeground(Color.BLACK);
    		        lblNhpSdt.setFont(new Font("Tahoma", Font.BOLD, 16));
    		        panel.add(lblNhpSdt);
    		        
    		        cbioiTinh = new JComboBox<>();
    		        cbioiTinh.setBackground(new Color(255, 248, 220));
    		        cbioiTinh.setModel(new DefaultComboBoxModel<>(new String[]{"Giới Tính", "Nam", "Nữ"}));
    		        cbioiTinh.setToolTipText("");
    		        cbioiTinh.setName("Loại");
    		        cbioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
    		        panel.add(cbioiTinh);

    		        btnTim = new JButton("Tìm");
    		        btnTim.setIcon(new ImageIcon(PanelKhachHang.class.getResource("/icon/search.png")));
    		        btnTim.setIconTextGap(20);
    		        btnTim.setForeground(Color.WHITE);
    		        btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
    		        btnTim.setBackground(new Color(60, 179, 113));
    		        panel.add(btnTim);
    		        
    		        btnSua = new JButton("Sửa");
    		        btnSua.setMargin(new Insets(2, 9, 2, 9));
    		        btnSua.setBackground(new Color(169, 169, 169));
    		        btnSua.setForeground(new Color(255, 255, 255));
    		        btnSua.setIconTextGap(20);
    		        btnSua.setIcon(new ImageIcon(PanelKhachHang.class.getResource("/icon/sua.png")));
    		        btnSua.addActionListener(new ActionListener() {
    		            public void actionPerformed(ActionEvent e) {
    		                // Xử lý khi nút "Sửa" được nhấn
    		            }
    		        });
    		        btnSua.setFont(new Font("Tahoma", Font.PLAIN, 20));
    		        panel.add(btnSua);

    		        btnThem = new JButton("Thêm");
    		        btnThem.setMargin(new Insets(2, 9, 2, 9));
    		        btnThem.setForeground(new Color(255, 255, 255));
    		        btnThem.setIconTextGap(15);
    		        btnThem.setBackground(new Color(30, 144, 255));
    		        btnThem.setIcon(new ImageIcon(PanelKhachHang.class.getResource("/icon/add.png")));
    		        btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
    		        panel.add(btnThem);

    		        btnLamMoi = new JButton("Làm mới");
    		        btnLamMoi.setIcon(new ImageIcon(PanelKhachHang.class.getResource("/icon/clean.png")));
    		        btnLamMoi.setMargin(new Insets(2, 2, 2, 2));
    		        btnLamMoi.setIconTextGap(10);
    		        btnLamMoi.setForeground(Color.WHITE);
    		        btnLamMoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
    		        btnLamMoi.setBackground(new Color(107, 142, 35));
    		        panel.add(btnLamMoi);
    		        
    		        // Center
    		        JPanel panel_1 = new JPanel();
    		        panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
    		        add(panel_1);
    		        
    		        lblLabel_1 = new JLabel("Danh Sách Khách Hàng");
    		        lblLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
    		        lblLabel_1.setBackground(new Color(72, 209, 204));
    		        panel_1.add(lblLabel_1);

    		        
//    		        add(scrollPane, BorderLayout.CENTER);	        
    		        
    		        table = new JTable();
//    		        scrollPane.setColumnHeaderView(table);
    		        scrollPane = new JScrollPane(table);
    		        tableModle = new DefaultTableModel(new Object[][]{}, new String[]{"Mã KH ", "Họ tên", "SĐT", "Ngày sinh", "Giới tính", "Địa chỉ"});
    		        table.setRowHeight(50);
    		        scrollPane.setViewportView(table);
    		        table.setModel(tableModle);
    		        table.setFont(new Font("Tahoma", Font.PLAIN, 16));

    		        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    		        table.getColumnModel().getColumn(0).setPreferredWidth(50);
    		        table.getColumnModel().getColumn(1).setPreferredWidth(160);
    		        table.getColumnModel().getColumn(2).setPreferredWidth(100);
    		        table.getColumnModel().getColumn(3).setPreferredWidth(100);
    		        table.getColumnModel().getColumn(4).setPreferredWidth(50);
    		        table.getColumnModel().getColumn(5).setPreferredWidth(250);
    		        table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    		        panel_1.add(scrollPane);

//    		        JTableHeader h = table.getTableHeader();
//    		        h.setPreferredSize(new Dimension(40, 40));
//    		        ((DefaultTableCellRenderer) h.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

    		        JPanel panel_2 = new JPanel();
    		        panel_2.setBackground(Color.WHITE);
    		        add(panel_2, BorderLayout.SOUTH);

    		        btnDau = new JButton("");
    		        btnDau.setIcon(new ImageIcon(PanelKhachHang.class.getResource("/icon/previousEnd.png")));
    		        btnDau.setFont(new Font("Arial", Font.PLAIN, 16));
    		        panel_2.add(btnDau);

    		        btnTru1 = new JButton("");
    		        btnTru1.setIcon(new ImageIcon(PanelKhachHang.class.getResource("/icon/rewind-button.png")));
    		        btnTru1.setFont(new Font("Arial", Font.PLAIN, 16));
    		        panel_2.add(btnTru1);

    		        txtPage = new JLabel("1 /");
    		        txtPage.setFont(new Font("Tahoma", Font.BOLD, 16));
    		        panel_2.add(txtPage);
    		        
    		        lblTongTrang = new JLabel("1");
    		        lblTongTrang.setFont(new Font("Tahoma", Font.BOLD, 16));
    		        lblTongTrang.setAlignmentY(0.0f);
    		        panel_2.add(lblTongTrang);

    		        btnCong1 = new JButton("");
    		        btnCong1.setIcon(new ImageIcon(PanelKhachHang.class.getResource("/icon/forward-button.png")));
    		        btnCong1.setFont(new Font("Arial", Font.PLAIN, 16));
    		        panel_2.add(btnCong1);

    		        btnCuoi = new JButton("");
    		        btnCuoi.setIcon(new ImageIcon(PanelKhachHang.class.getResource("/icon/next.png")));
    		        btnCuoi.setFont(new Font("Arial", Font.PLAIN, 16));
    		        panel_2.add(btnCuoi);
//    	    		btnCong1.addActionListener(this);
//    	    		btnTru1.addActionListener(this);
//    	    		btnDau.addActionListener(this);
//    	    		btnCuoi.addActionListener(this);
//    	    		btnLamMoi.addActionListener(this);
//    	    		cbioiTinh.addActionListener(this);
//    	    		btnThem.addActionListener(this);
//    	    		btnTim.addActionListener(this);
//    	    		textMa.addActionListener(this);
//    	    		textSDT.addActionListener(this);
//    	    		textTen.addKeyListener(this);
//    	    		table.addMouseListener(this);

    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
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
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

