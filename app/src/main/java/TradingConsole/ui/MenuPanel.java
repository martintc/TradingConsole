package TradingConsole.ui;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {

    private JButton accountButton;
    private JButton setStockButton;
    private JButton orderButton;
    private JPanel centralPanel;

    public MenuPanel (JPanel initCentralPanel) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        centralPanel = initCentralPanel;

        accountButton = new MenuButtons("Account");

        setStockButton = new MenuButtons("Set stocks");

        orderButton = new MenuButtons("Order");

        this.add(accountButton);
        this.add(setStockButton);
        this.add(orderButton);
    }

}
