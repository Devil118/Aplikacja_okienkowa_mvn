import javax.swing.*;

public class MyFrame  extends JFrame{
        public MyFrame() {
            super("Hello World");
            setSize(640,480);
            JPanel buttonPanel = new ButtonPanel();
            add(buttonPanel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);


        }
    }

