import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JLabel jlb = new JLabel("0");
    private JPanel jpn = new JPanel();
    private JButton jbtn7 = new JButton("7");
    private JButton jbtn8 = new JButton("8");
    private JButton jbtn9 = new JButton("9");
    private JButton jbtnDiv = new JButton("/");
    private JButton jbtn4 = new JButton("4");
    private JButton jbtn5 = new JButton("5");
    private JButton jbtn6 = new JButton("6");
    private JButton jbtnMult = new JButton("*");
    private JButton jbtn1 = new JButton("1");
    private JButton jbtn2 = new JButton("2");
    private JButton jbtn3 = new JButton("3");
    private JButton jbtnSub = new JButton("-");
    private JButton jbtn0 = new JButton("0");
    private JButton jbtnDot = new JButton(".");
    private JButton jbtnEq = new JButton("=");
    private JButton jbtnAdd = new JButton("+");
    private ImageIcon icon0 = new ImageIcon("0.png");
    private ImageIcon icon1 = new ImageIcon("1.png");
    private ImageIcon icon2 = new ImageIcon("2.png");
    private ImageIcon icon3 = new ImageIcon("3.png");
    private ImageIcon icon4 = new ImageIcon("4.png");
    private ImageIcon icon5 = new ImageIcon("5.png");
    private ImageIcon icon6 = new ImageIcon("6.png");
    private ImageIcon icon7 = new ImageIcon("7.png");
    private ImageIcon icon8 = new ImageIcon("8.png");
    private ImageIcon icon9 = new ImageIcon("9.png");
    private ImageIcon iconadd = new ImageIcon("add.png");
    private ImageIcon iconsub = new ImageIcon("sub.png");
    private ImageIcon iconmult = new ImageIcon("mult.png");
    private ImageIcon icondiv = new ImageIcon("div.png");
    private ImageIcon icondot = new ImageIcon("dot.png");
    private ImageIcon iconeq = new ImageIcon("eq.png");
    private Container cp;

    public MainFrame() {
        init();
    }

    private void init() {
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(jlb, BorderLayout.NORTH);

        jpn.setLayout(new GridLayout(4, 4, 5, 5));
        cp.add(jpn, BorderLayout.CENTER);

        this.setBounds(200, 150, 300, 400);
        this.setTitle("Practice");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jlb.setHorizontalAlignment(JLabel.RIGHT);
        jlb.setOpaque(true);
        jlb.setBackground(new Color(255, 0, 255));
        jlb.setFont(new Font("Times New Roman", Font.BOLD, 22));
        
        jbtn7.setFont(new Font(null, Font.BOLD, 22));
        jbtn7.setIcon(icon7);
        jbtn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn7.getText());
            }
        });
        jbtn8.setFont(new Font(null, Font.BOLD, 22));
        jbtn8.setIcon(icon8);
        jbtn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn8.getText());
            }
        });
        jbtn9.setFont(new Font(null, Font.BOLD, 22));
        jbtn9.setIcon(icon9);
        jbtn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn9.getText());
            }
        });
        jbtn4.setFont(new Font(null, Font.BOLD, 22));
        jbtn4.setIcon(icon4);
        jbtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn4.getText());
            }
        });
        jbtn5.setFont(new Font(null, Font.BOLD, 22));
        jbtn5.setIcon(icon5);
        jbtn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn5.getText());
            }
        });
        jbtn6.setFont(new Font(null, Font.BOLD, 22));
        jbtn6.setIcon(icon6);
        jbtn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn6.getText());
            }
        });
        jbtn1.setFont(new Font(null, Font.BOLD, 22));
        jbtn1.setIcon(icon1);
        jbtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn1.getText());
            }
        });
        jbtn2.setFont(new Font(null, Font.BOLD, 22));
        jbtn2.setIcon(icon2);
        jbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn2.getText());
            }
        });
        jbtn3.setFont(new Font(null, Font.BOLD, 22));
        jbtn3.setIcon(icon3);
        jbtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn3.getText());
            }
        });
        jbtn0.setFont(new Font(null, Font.BOLD, 22));
        jbtn0.setIcon(icon0);
        jbtn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn0.getText());
            }
        });
        jbtnAdd.setFont(new Font(null, Font.BOLD, 22));
        jbtnAdd.setIcon(iconadd);
        jbtnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtnAdd.getText());
            }
        });
        jbtnSub.setFont(new Font(null, Font.BOLD, 22));
        jbtnSub.setIcon(iconsub);
        jbtnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtnSub.getText());
            }
        });
        jbtnMult.setFont(new Font(null, Font.BOLD, 22));
        jbtnMult.setIcon(iconmult);
        jbtnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtnMult.getText());
            }
        });
        jbtnDiv.setFont(new Font(null, Font.BOLD, 22));
        jbtnDiv.setIcon(icondiv);
        jbtnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtnDiv.getText());
            }
        });
        jbtnDot.setFont(new Font(null, Font.BOLD, 22));
        jbtnDot.setIcon(icondot);
        jbtnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtnDot.getText());
            }
        });
        jbtnEq.setFont(new Font(null, Font.BOLD, 22));
        jbtnEq.setIcon(iconeq);
        jbtnEq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlb.setText(jlb.getText() + jbtn7.getText());
            }
        });
        jpn.add(jbtn7);
        jpn.add(jbtn8);
        jpn.add(jbtn9);
        jpn.add(jbtnDiv);
        jpn.add(jbtn4);
        jpn.add(jbtn5);
        jpn.add(jbtn6);
        jpn.add(jbtnMult);
        jpn.add(jbtn1);
        jpn.add(jbtn2);
        jpn.add(jbtn3);
        jpn.add(jbtnSub);
        jpn.add(jbtn0);
        jpn.add(jbtnDot);
        jpn.add(jbtnEq);
        jpn.add(jbtnAdd);
        
    }
}