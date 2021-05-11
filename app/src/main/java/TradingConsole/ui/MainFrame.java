package TradingConsole.ui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

    private final int vGap = 10;
    private final int hGap = 10;
    private final int HEIGHT = 400;
    private final int WIDTH = 750;
    private MenuPanel menu;
    private JPanel centralPanel;

    public MainFrame () {
        centralPanel = new JPanel();
        menu = new MenuPanel(centralPanel);

        JPanel bufferPanel = new JPanel();

        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(new BorderLayout(vGap, hGap));
        this.add(menu, BorderLayout.WEST);
        this.add(bufferPanel, BorderLayout.NORTH);
        this.add(centralPanel, BorderLayout.CENTER);
    }

}
