import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Locale;


public class Frame extends JFrame implements KeyListener {
    private final JLabel translatet = new JLabel("");

    private final JTextField input = new JTextField(" ");

    private final List list;

    public Frame(List list){
        this.list = list;
        setSize(500,300);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\janni\\IdeaProjects\\MorseUbersetzer\\src\\Icon.png");
        setIconImage(icon);
        setTitle("Übersetzer");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        Color dark = new Color(0x202021);
        panel.setBackground(dark);

        input.setBounds(10,20, 465, 20);
        Color dark2 = new Color(0xC0202022, true);
        input.setBackground(dark2);
        Color color1 = new Color(0xAEB0B3);
        input.setForeground(color1);
        input.addKeyListener(this);
        input.setBorder(null);

        JLabel iLable = new JLabel("Eingabe");
        iLable.setBounds(10, 0, 80, 20);
        iLable.setForeground(color1);

        JLabel tLable = new JLabel("Übersetzung:");
        tLable.setBounds(10, 40, 80, 20);
        tLable.setForeground(color1);

        translatet.setBounds(10, 60, 450, 20);
        translatet.setForeground(color1);
        translatet.setBackground(dark2);


        panel.add(translatet);
        panel.add(tLable);
        panel.add(iLable);
        panel.add(input);
        this.add(panel);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }


    @Override
    public void keyReleased(KeyEvent e) {
        String input = this.input.getText();
        input = input.toLowerCase(Locale.ROOT);
        input = input.replace(" ", "|");
        Toolkit.getDefaultToolkit().beep();
        translatet.setText(list.translating(input));
    }

}
