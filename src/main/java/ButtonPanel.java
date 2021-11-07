import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonPanel extends JPanel implements ActionListener{

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton greenButton;
    private JButton blueButton;
    private JButton redButton;
    private JButton textButton;
    private JTextField poleTxt;
    private int counter = 0;
    private String userInput = "";
    private final String secret = "secret";

    public ButtonPanel() {
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        textButton = new JButton(("Text Button"));
        poleTxt = new JTextField("Pole Tekstowe");

        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        textButton.addActionListener(this);

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(greenButton);
        add(blueButton);
        add(redButton);
        add (textButton);
        add(poleTxt);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == greenButton)
            setBackground(Color.GREEN);

        else if(source == blueButton)
            setBackground(Color.BLUE);

        else if(source == redButton)
            setBackground(Color.RED);
        else if (source == textButton)
            System.out.println("Testing button");
    }
}