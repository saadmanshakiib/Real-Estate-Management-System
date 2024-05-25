package PROPERTY_LIST;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import HOME_PAGE.*;


public class PFA extends JFrame implements ActionListener,MouseListener{

public PFA(){
    Container c = new Container();
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(2000,1600);
    setLocationRelativeTo(null);
    setTitle("LIST");
    setLayout(null);

    Color lightblue = new Color(51,204,255);
    Font font = new Font("Roboto",Font.BOLD,35);
    Font font2 = new Font("Serif",Font.BOLD,25);
    Font bfont = new Font("Roboto",Font.BOLD,30);


    c = this.getContentPane();
    c.setBackground(Color.WHITE);
    c.setLayout(null);

    JLabel list = new JLabel();
    list.setText("List Of Available Properties ");
    list.setFont(font);
    list.setBounds(300,100,500,50);
    c.add(list);
    JButton back = new JButton();
    back.setText("<-Back");
    back.setBackground(lightblue);
    back.setFont(bfont);
    back.setBounds(50,160,140,40);
    c.add(back);
    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a){
             AdminHomePage ad = new AdminHomePage();
             ad.setVisible(true);
             setVisible(false);
        }
    });
    back.addMouseListener(new MouseListener(){
        public void mouseEntered(MouseEvent m){
            back.setBackground(Color.BLACK);
            back.setForeground(Color.white);
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {
            back.setBackground(lightblue);
            back.setForeground(Color.BLACK);
        }
    });

    JButton details = new JButton();
    details.setText("Details");
    details.setBackground(lightblue);
    details.setFont(bfont);
    details.setBounds(1500,320,150,40);
    c.add(details);
    
    details.addMouseListener(new MouseListener(){
        public void mouseEntered(MouseEvent m){
            details.setBackground(Color.BLACK);
            details.setForeground(Color.white);
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {
            details.setBackground(lightblue);
            details.setForeground(Color.BLACK);
        }
    });
    details.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent a){
            DFA1 d  = new DFA1();
            d.setVisible(true);
            setVisible(false);
        }
    });

    
    JLabel address = new JLabel();
    address.setText("Basundhara R/A");
    address.setBounds(500,260,500,40);
    address.setFont(font2);
    c.add(address);

    JLabel address2 = new JLabel();
    address2.setText("Dhaka , Bangladesh");
    address2.setBounds(500,300,500,40);
    address2.setFont(font2);
    c.add(address2);

    JLabel sf = new JLabel();
    sf.setText("2410.00 Square Feet");
    sf.setBounds(500,340,500,40);
    sf.setFont(font2);
    c.add(sf);
    JLabel sr = new JLabel();
    sr.setText("For Sale");
    sr.setBounds(500,380,500,40);
    sr.setFont(font2);
    c.add(sr);

    ImageIcon b1 = new ImageIcon("images\\b1.png");
    JLabel b1i = new JLabel(b1);
    b1i.setBounds(200,250,250,220);
    c.add(b1i);

    //img 2
    JButton details2 = new JButton();
    details2.setText("Details");
    details2.setBackground(lightblue);
    details2.setFont(bfont);
    details2.setBounds(1500,540,150,40);
    c.add(details2);

    details2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent a){
            DFA2 d  = new DFA2();
            d.setVisible(true);
            setVisible(false);
        }
    });
    
    details2.addMouseListener(new MouseListener(){
        public void mouseEntered(MouseEvent m){
            details2.setBackground(Color.BLACK);
            details2.setForeground(Color.white);
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {
            details2.setBackground(lightblue);
            details2.setForeground(Color.BLACK);
        }
    });

    JLabel address21 = new JLabel();
    address21.setText("Jamalkhan Chittagong");
    address21.setBounds(500,510,500,40);
    address21.setFont(font2);
    c.add(address21);

    JLabel address22 = new JLabel();
    address22.setText("Chittagong , Bangladesh");
    address22.setBounds(500,520,500,40);
    address22.setFont(font2);
    c.add(address2);

    JLabel sf2 = new JLabel();
    sf2.setText("1890.00 Square Feet");
    sf2.setBounds(500,560,500,40);
    sf2.setFont(font2);
    c.add(sf2);

    JLabel sr2 = new JLabel();
    sr2.setText("Ready Flat For Sale");
    sr2.setBounds(500,600,500,40);
    sr2.setFont(font2);
    c.add(sr2);

    ImageIcon b2 = new ImageIcon("images\\b2.png");
    JLabel b2i = new JLabel(b2);
    b2i.setBounds(200,470,250,220);
    c.add(b2i);
/////////////

    ImageIcon b3 = new ImageIcon("images\\b3.png");
    JLabel b3i = new JLabel(b3);
    b3i.setBounds(200,720,250,220);
    c.add(b3i); 

    JLabel address31 = new JLabel();
    address31.setText("Gulshan");
    address31.setBounds(500,740,500,40);
    address31.setFont(font2);
    c.add(address31);

    JLabel address32 = new JLabel();
    address32.setText("Dhaka , Bangladesh");
    address32.setBounds(500,780,500,40);
    address32.setFont(font2);
    c.add(address32);

    JLabel sf3 = new JLabel();
    sf3.setText("1320.00 Square Feet");
    sf3.setBounds(500,820,500,40);
    sf3.setFont(font2);
    c.add(sf3);

    JLabel sr3 = new JLabel();
    sr3.setText("Ready Flat For Sale");
    sr3.setBounds(500,860,500,40);
    sr3.setFont(font2);
    c.add(sr3);

    JButton details3 = new JButton();
    details3.setText("Details");
    details3.setBackground(lightblue);
    details3.setFont(bfont);
    details3.setBounds(1500,760,150,40);
    c.add(details3);
    details3.addMouseListener(new MouseListener(){
        public void mouseEntered(MouseEvent m){
            details3.setBackground(Color.BLACK);
            details3.setForeground(Color.white);
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {
            details3.setBackground(lightblue);
            details3.setForeground(Color.BLACK);
        }
    });
    details3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a){
            DFA3 d = new DFA3();
            d.setVisible(true);
            setVisible(false);
        }
    });

    JButton next = new JButton();
    next.setText("Next->");
    next.setBackground(lightblue);
    next.setFont(bfont);
    next.setBounds(1650,950,150,40);
    c.add(next);

    next.addMouseListener(new MouseListener(){
        public void mouseEntered(MouseEvent m){
            next.setBackground(Color.BLACK);
            next.setForeground(Color.white);
        }

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {
            next.setBackground(lightblue);
            next.setForeground(Color.BLACK);
        }
    });
    next.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent a){
            PFA2 p2 = new PFA2();
            p2.setVisible(true);
            setVisible(false);

        }
    });
    ImageIcon img = new ImageIcon("images\\msb.png");
            JLabel image = new JLabel(img);
            image.setBounds(0,0,1900,1100);
            c.add(image);
        }
//}    
public static void main(String[] as){
    PFA p = new PFA();
    p.setVisible(true);
}
@Override
public void mouseClicked(MouseEvent e) {}
@Override
public void mousePressed(MouseEvent e) {}
@Override
public void mouseReleased(MouseEvent e) {}
@Override
public void mouseEntered(MouseEvent e) {}
@Override
public void mouseExited(MouseEvent e) {}
@Override
public void actionPerformed(ActionEvent e) {}
}

