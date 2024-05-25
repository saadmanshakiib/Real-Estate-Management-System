package PROPERTY_LIST;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import HOME_PAGE.*;
//import LOGINPAGE.*;
//import NEWACCOUNTHOMEPAGE.newacchomepage;
//import images.*;
//import NEW_ACCOUNT_PAGE.*;

public class DFA3 extends JFrame implements ActionListener, MouseListener {

    DFA3() {
        Container c = new Container();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(2000, 1600);
        setLocationRelativeTo(null);
        setTitle("DETAILS 3");
        setLayout(null);

        Color lightblue = new Color(51, 204, 255);
        Font font = new Font("Roboto", Font.BOLD, 35);
        Font font2 = new Font("Serif", Font.BOLD, 28);
        Font font3 = new Font("Serif", Font.BOLD, 35);

        c = this.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);

        

        // Buy

        ImageIcon i = new ImageIcon("images\\b3.png");
        JLabel i1 = new JLabel(i);
        i1.setBounds(100, 50, 350, 350);
        c.add(i1);
        JLabel ad = new JLabel();
        ad.setText("Agent Details  ");
        ad.setBounds(1400, 350, 500, 40);
        ad.setFont(font);
        c.add(ad);

        JPanel agent = new JPanel();
        agent.setBounds(1300, 400, 500, 500);
        agent.setBackground(Color.WHITE);
        agent.setLayout(null);
        c.add(agent);
        agent.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent a) {
                agent.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                agent.setBackground(Color.WHITE);
            }
        });
        ImageIcon agentimage = new ImageIcon("images\\login.png");
        JLabel agnetImagLabel = new JLabel(agentimage);
        agnetImagLabel.setBounds(95, 5, 250, 220);
        agent.add(agnetImagLabel);

        JLabel an = new JLabel();
        an.setText("Marof");
        an.setFont(font2);
        an.setBounds(180, 240, 160, 40);
        agent.add(an);

        JLabel ae = new JLabel();
        ae.setText("marof21@gmail.com");
        ae.setFont(font2);
        ae.setBounds(120, 280, 610, 40);
        agent.add(ae);

        JLabel ac = new JLabel();
        ac.setText("Contact : 01828222990");
        ac.setFont(font2);
        ac.setBounds(120, 320, 810, 40);
        agent.add(ac);

        JLabel ap = new JLabel();
        ap.setText("Posted on March 6,2024");
        ap.setFont(font2);
        ap.setBounds(120, 360, 810, 40);
        agent.add(ap);

        JPanel d = new JPanel();
        d.setBounds(250, 350, 700, 500);
        d.setBackground(Color.WHITE);
        d.setLayout(null);
        c.add(d);

        /*JButton interested = new JButton();
        interested.setText("Add to list");
        interested.setBounds(250, 860, 220, 40);
        interested.setFont(font2);
        interested.setBackground(lightblue);
        c.add(interested);*/

        d.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent a) {
                d.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                d.setBackground(Color.WHITE);
            }
        });

        // buy

        JButton buy = new JButton();
        buy.setText("REMOVE");
        buy.setBounds(500, 860, 220, 40);
        buy.setFont(font2);
        buy.setBackground(lightblue);
        c.add(buy);
        buy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                JOptionPane.showMessageDialog(null,"Property Removed");
            }
        });

        buy.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent a) {
                buy.setBackground(Color.BLACK);
                buy.setForeground(Color.WHITE);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                buy.setBackground(lightblue);
                buy.setForeground(Color.BLACK);
            }
        });

        JLabel p = new JLabel();
        p.setText("Property Details");
        p.setBounds(10, 10, 250, 40);
        p.setFont(font3);
        d.add(p);

        JLabel area = new JLabel();
        area.setText("Ghulshan, Dhaka , Bangladesh");
        area.setBounds(10, 60, 1300, 40);
        area.setFont(font2);
        d.add(area);
        // after details

        JLabel t = new JLabel();
        t.setText("Area : 1320 sq ft");
        t.setBounds(10, 110, 500, 40);
        t.setFont(font2);
        d.add(t);

        JLabel f = new JLabel();
        f.setText("Room : 5 bedrooms,4 bathrooms and 1 kitchen");
        f.setBounds(10, 160, 1000, 40);
        f.setFont(font2);
        d.add(f);

        JLabel a = new JLabel();
        a.setText("Locaton : D block,11 no. road");
        a.setBounds(10, 210, 1000, 40);
        a.setFont(font2);
        d.add(a);

        JLabel x = new JLabel();
        x.setText("Facilities : Generator,Lift,Prepaid Meter ");
        x.setBounds(10, 270, 1000, 40);
        x.setFont(font2);
        d.add(x);

        JLabel o = new JLabel();
        o.setText("Property Code : gu78k");
        o.setBounds(10, 320, 1000, 40);
        o.setFont(font2);
        d.add(o);
        JLabel price = new JLabel();
        price.setText("Price : 4.00cr");
        price.setBounds(10, 370, 1000, 40);
        price.setFont(font2);
        d.add(price);

        JButton back = new JButton();
        back.setText("<-Back");
        back.setBackground(lightblue);
        back.setFont(font2);
        c.add(back);
        back.setBounds(20, 50, 120, 40);
        back.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent m) {
                back.setBackground(Color.BLACK);
                back.setForeground(Color.white);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                back.setBackground(lightblue);
                back.setForeground(Color.BLACK);
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                PFA p =new PFA();
                p.setVisible(true);
                setVisible(false);
            }
        });

    }

    public static void main(String[] ad) {
        DFA3 d = new DFA3();
        d.setVisible(true);
}

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}    
    public void mouseExited(MouseEvent e) {}
    @Override
    public void actionPerformed(ActionEvent e) {}

}
