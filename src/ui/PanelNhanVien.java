package ui;
import javax.swing.*;
import java.awt.*;

public class PanelNhanVien extends JPanel {
    public PanelNhanVien() {
        setLayout(new BorderLayout());
        add(new JLabel("Trang Nhân Viên"), BorderLayout.CENTER);
    }
}
