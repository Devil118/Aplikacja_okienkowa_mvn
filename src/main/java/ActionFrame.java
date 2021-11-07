import javax.swing.*;
import java.awt.*;

public class ActionFrame extends JFrame{
    public ActionFrame() {
        super("Test akcji");
        setLayout(new GridLayout());


        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
