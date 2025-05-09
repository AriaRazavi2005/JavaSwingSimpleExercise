import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThemeColorSelectorApp extends JFrame implements ActionListener {

    private JPanel mainPanel;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;
    private JButton yellowButton;
    private JButton pinkButton;  

    public ThemeColorSelectorApp() {
        setTitle("Theme Color Selector");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();

        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        yellowButton = new JButton("Yellow");
        pinkButton = new JButton("Pink");

        redButton.setActionCommand("RED");
        greenButton.setActionCommand("GREEN");
        blueButton.setActionCommand("BLUE");
        yellowButton.setActionCommand("YELLOW");
        pinkButton.setActionCommand("PINK");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        yellowButton.addActionListener(this);
        pinkButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(pinkButton);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "RED":   mainPanel.setBackground(Color.RED); break;
            case "GREEN": mainPanel.setBackground(Color.GREEN); break;
            case "BLUE":  mainPanel.setBackground(Color.BLUE); break;
            case "YELLOW": mainPanel.setBackground(Color.YELLOW); break;
            case "PINK": mainPanel.setBackground(Color.PINK); break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ThemeColorSelectorApp().setVisible(true));
    }
}
