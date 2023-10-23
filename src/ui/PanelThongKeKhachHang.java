package ui;

import javax.swing.*;
import java.awt.*;

public class PanelThongKeKhachHang extends JPanel {
    public PanelThongKeKhachHang(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new BorderLayout());
        add(new JLabel("Trang thong ke khach hang"), BorderLayout.CENTER);
    }
}