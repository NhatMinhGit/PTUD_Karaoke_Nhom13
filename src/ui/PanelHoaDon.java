package ui;

import javax.swing.*;
import java.awt.*;

public class PanelHoaDon extends JPanel {
    public PanelHoaDon(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new BorderLayout());
        add(new JLabel("Trang Hóa Đơn"), BorderLayout.CENTER);
    }
}
