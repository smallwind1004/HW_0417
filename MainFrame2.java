import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class MainFrame2 extends JFrame {
    private JButton jbtnExit = new JButton("Exit");
    private JButton jbtnApply = new JButton("Apply");
    private JTextField jtfR = new JTextField();
    private JTextField jtfG = new JTextField();
    private JTextField jtfB = new JTextField();
    private JLabel jlbR = new JLabel("Red");
    private JLabel jlbG = new JLabel("Green");
    private JLabel jlbB = new JLabel("Blue");
    private JPanel jpn = new JPanel();
    private JLabel jlb = new JLabel();
    private Container cp;

    public MainFrame2() {
        init();
    }

    public void init() {
        cp = this.getContentPane();

        this.setTitle("調色盤");
        this.setBounds(500, 150, 600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp.setLayout(new BorderLayout());
        cp.add(jpn, BorderLayout.NORTH);
        jpn.setLayout(new GridLayout(2, 4, 5, 10));
        jpn.add(jlbR);
        jpn.add(jlbG);
        jpn.add(jlbB);
        jpn.add(jbtnApply);
        jpn.add(jtfR);
        jpn.add(jtfG);
        jpn.add(jtfB);
        jpn.add(jbtnExit);
        cp.add(jlb, BorderLayout.CENTER);
        jlb.setOpaque(true);
        jlbR.setFont(new Font(null, Font.BOLD, 18));
        jlbG.setFont(new Font(null, Font.BOLD, 18));
        jlbB.setFont(new Font(null, Font.BOLD, 18));
        jtfR.setFont(new Font(null, Font.BOLD, 18));
        jtfG.setFont(new Font(null, Font.BOLD, 18));
        jtfB.setFont(new Font(null, Font.BOLD, 18));
        jbtnApply.setFont(new Font(null, Font.BOLD, 18));
        jbtnExit.setFont(new Font(null, Font.BOLD, 18));

        jbtnApply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setBackground(new Color(Integer.parseInt(jtfR.getText()), Integer.parseInt(jtfG.getText()), Integer.parseInt(jtfB.getText())));
            }
        });
        jbtnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }
}