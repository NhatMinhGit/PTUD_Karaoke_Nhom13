package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GiaoDienChinh extends JPanel {
    private JLabel lblTrangChinh;

	public GiaoDienChinh(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new BorderLayout());
        lblTrangChinh = new JLabel();
        lblTrangChinh.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/karaoke.jpg")));
        add(lblTrangChinh, BorderLayout.CENTER);
    }
}