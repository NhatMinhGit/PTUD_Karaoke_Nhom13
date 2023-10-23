package ui;

import javax.swing.*;
import java.awt.*;

public class PanelDichVu extends JPanel {
    public PanelDichVu(CardLayout cardLayout, JPanel cardPanel) {
        setLayout(new BorderLayout());
        add(new JLabel("Trang Dịch Vụ"), BorderLayout.CENTER);
    }
}
