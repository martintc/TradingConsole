package TradingConsole.ui;

import java.awt.Dimension;
import javax.swing.JButton;

public class MenuButtons extends JButton {

    private final int WIDTH = 300;
    private final int HEIGHT = 50;

    public MenuButtons (String name) {
        super(name);
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

}
