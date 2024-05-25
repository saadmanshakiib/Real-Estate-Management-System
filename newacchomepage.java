package NEWACCOUNTHOMEPAGE;
import PROPERTY_LIST.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ADD_PROPERTY.*;
import LOGINPAGE.*;

public class newacchomepage extends JFrame implements ActionListener , MouseListener{
    public newacchomepage(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(2000,1600);
        this.setLocationRelativeTo(null);
        this.setTitle("AFTER LOG IN");

        Container c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.white);
        c.setLayout(null);

        Font font = new Font("Roboto",Font.BOLD,35);
        Font backfont = new Font("Roboto",Font.BOLD,25);
        

        Color lightblue = new Color(51,204,255);

        JLabel waylf = new JLabel();
        waylf.setText("What Are You Looking For ?");
        waylf.setFont(font);
        waylf.setBounds(360,250,1000,50);
        waylf.setForeground(Color.WHITE);
        c.add(waylf);

        JButton view =  new JButton();
        view.setText("View Property Lists");
        view.setFont(backfont);
        view.setBackground(lightblue);
        view.setBounds(420,350,280,50);
        c.add(view);

        view.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent me){
                view.setBackground(Color.BLACK);
                view.setForeground(Color.WHITE);
            }

            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override

            public void mouseExited(MouseEvent e) {
               view.setBackground(lightblue);
               view.setForeground(Color.BLACK);
            }
    });
            view.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    PropertyList pl = new PropertyList();
                    pl.setVisible(true);
                    setVisible(false);
                }
            });

            //
            JButton add =  new JButton();
        add.setText("Buy a Property ");
        add.setFont(backfont);
        add.setBackground(lightblue);
        add.setBounds(420,425,280,50);
        c.add(add);

        add.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent me){
                add.setBackground(Color.BLACK);
                add.setForeground(Color.WHITE);
            }

            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            
            public void mouseExited(MouseEvent e) {
               add.setBackground(lightblue);
               add.setForeground(Color.BLACK);
            }
    });
    add.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent a){
            PropertyList pl = new PropertyList();
            pl.setVisible(true);
            setVisible(false);
        }
    });
            //
            JButton sell =  new JButton();
        sell.setText("Sell a Property ");
        sell.setFont(backfont);
        sell.setBackground(lightblue);
        sell.setBounds(420,495,280,50);
        c.add(sell);

        sell.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent me){
                sell.setBackground(Color.BLACK);
                sell.setForeground(Color.WHITE);
            }

            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            
            public void mouseExited(MouseEvent e) {
               sell.setBackground(lightblue);
               sell.setForeground(Color.BLACK);
            }
    });
            sell.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    Sell s = new Sell();
                    s.setVisible(true);
                    setVisible(false);
                }
            });

            /*ImageIcon img = new ImageIcon("images\\easerent.png");
            JLabel image = new JLabel(img);
            image.setBounds(1050,200,500,500);
            c.add(image);*/
           /*  ImageIcon img = new ImageIcon("images\\ms2.jpg");
            JLabel image = new JLabel(img);
            image.setBounds(0,0,1900,1100);
            c.add(image);
*/
            JButton del =  new JButton();
        del.setText("Exit");
        del.setFont(backfont);
        del.setBackground(lightblue);
        del.setBounds(420,570,280,50);
        c.add(del);

        del.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent me){
                del.setBackground(Color.BLACK);
                del.setForeground(Color.WHITE);
            }

            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            
            public void mouseExited(MouseEvent e) {
               del.setBackground(lightblue);
               del.setForeground(Color.BLACK);
            }
    });
            del.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    System.exit(0);
                }
            });
            /////////\
            JButton back = new JButton();
    back.setText("<-Back");
    back.setBackground(lightblue);
    back.setFont(backfont);
    back.setBounds(50,160,140,40);
    c.add(back);
    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a){
            Login l = new Login();
            l.setVisible(true);
            setVisible(false);

            //done
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
    ImageIcon img = new ImageIcon("images\\ms2.jpg");
            JLabel image = new JLabel(img);
            image.setBounds(0,0,1900,1100);
            c.add(image);
        }


    public static void main(String[] args){
        newacchomepage  nah = new newacchomepage();
        nah.setVisible(true);
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
    

