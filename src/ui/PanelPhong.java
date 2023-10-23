package ui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPhong extends JPanel {
    public PanelPhong() {
        setLayout(new BorderLayout());
        add(new JLabel("Trang Phòng"), BorderLayout.CENTER);
    }
}
