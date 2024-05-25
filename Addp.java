package ADD_PROPERTY;
import javax.swing.*;

//import Account.*;
import HOME_PAGE.*;
//import LOGINPAGE.*;
//import NEWACCOUNTHOMEPAGE.*;

import java.awt.*;
import java.awt.event.*;
//import images.*;

public class Addp extends JFrame implements ActionListener{
    private Container container;
    Color lightblue = new Color(51,204,255);
    Font titlefont = new Font("Roboto",Font.CENTER_BASELINE,35);

   public Addp(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(2000,1600);
        this.setLocationRelativeTo(null);
        this.setTitle("SIGN UP");

        Color lightblue = new Color(51,204,255);

        container = this.getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(null);

        Font nameFont = new Font("Roboto",Font.PLAIN+Font.BOLD,20);
        Font signfont = new Font("Optima",Font.BOLD,30);


        JLabel create = new JLabel();
        create.setText("ADD NEW PROPERTY"); 
        create.setBounds(475,50,500,50);
        create.setFont(titlefont);
        container.add(create);

        JLabel firstname = new JLabel();
        firstname.setText("Property Code  : ");
        firstname.setFont(nameFont);
        firstname.setBounds(330,180,200,80);
        container.add(firstname);

        JTextField firstname_tf = new JTextField();
        firstname_tf.setBounds(500,200,280,50);
        firstname_tf.setHorizontalAlignment(JTextField.CENTER);
        firstname_tf.setFont(nameFont);
        container.add(firstname_tf);

       // String code = firstname_tf.getText();


        JLabel lastname = new JLabel();
        lastname.setText("Area              : ");
        lastname.setFont(nameFont);
        lastname.setBounds(350,250,200,80);
        container.add(lastname);
        

        JTextField number_tf = new JTextField();
        number_tf.setBounds(500,270,280,50);
        number_tf.setHorizontalAlignment(JTextField.CENTER);
        number_tf.setFont(nameFont);
        container.add(number_tf);
       // String area = number_tf.getText();

        JLabel emailL = new JLabel();
        emailL.setText("Details          :");
        emailL.setBounds(350,320,240,80);
        emailL.setFont(nameFont);
        container.add(emailL);

        JTextField email_tf = new JTextField();
        email_tf.setBounds(500,340,280,50);
        email_tf.setHorizontalAlignment(JTextField.CENTER);
        email_tf.setFont(nameFont);
        container.add(email_tf);
        //String details = email_tf.getText();

        
        JLabel signup = new JLabel();
        signup.setText("Price             : ");
        signup.setBounds(350,400,250,50);
        signup.setFont(nameFont);
        container.add(signup);

        JTextField p_tf = new JTextField();
        p_tf.setBounds(500,400,280,50);
        p_tf.setHorizontalAlignment(JTextField.CENTER);
        p_tf.setFont(nameFont);
        container.add(p_tf);
       // String price = p_tf.getText();

        ImageIcon houseimage = new ImageIcon("images\\Re.png");
        JLabel img1 = new JLabel(houseimage);
        img1.setBounds(1000,220,500,500);
        container.add(img1);

        JLabel pass = new JLabel();
        pass.setText("Agent Name       : ");
        pass.setBounds(320,480,200,30);
        pass.setFont(nameFont);
        container.add(pass);
         
        JTextField pass_tf = new JTextField();
        pass_tf.setBounds(500,480,280,50);
        pass_tf.setHorizontalAlignment(JTextField.CENTER);
        pass_tf.setFont(nameFont);
        container.add(pass_tf);
        //String agentname = pass_tf.getText();

        JLabel confirmpass = new JLabel();
        confirmpass.setText("Email        : ");
        confirmpass.setBounds(370,670,220,30);
        confirmpass.setFont(nameFont);
        container.add(confirmpass);

        JTextField confirmpass_tf = new JTextField();
        confirmpass_tf.setBounds(500,660,280,50);
        confirmpass_tf.setHorizontalAlignment(JTextField.CENTER);
        confirmpass_tf.setFont(nameFont);
        container.add(confirmpass_tf);
        //String email = confirmpass_tf.getText();

        JLabel contact = new JLabel();
        contact.setText("Contact             : ");
        contact.setBounds(320,560,220,30);
        contact.setFont(nameFont);
        container.add(contact);

        JTextField contact_tf = new JTextField();
        contact_tf.setBounds(500,560,280,50);
        contact_tf.setHorizontalAlignment(JTextField.CENTER);
        contact_tf.setFont(nameFont);
        container.add(contact_tf);

        
        JButton signin = new JButton();
        signin.setText("Submit");
        signin.setBounds(450,800,160,50);
        signin.setBackground(lightblue);
        signin.setFont(signfont);
        container.add(signin);
        signin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                if(firstname_tf.getText().isEmpty()==false && number_tf.getText().isEmpty()==false && email_tf.getText().isEmpty()==false && p_tf.getText().isEmpty()==false && pass_tf.getText().isEmpty()==false && confirmpass_tf.getText().isEmpty()==false && contact_tf.getText().isEmpty()==false){
                    
                    String contactp= contact_tf.getText();
                    String email = confirmpass_tf.getText();
                    String agentname = pass_tf.getText();
                    String price = p_tf.getText();
                    String details = email_tf.getText();
                    String area = number_tf.getText();
                    String code = firstname_tf.getText();

                Add add = new Add(code, area, details, price, agentname, email, contactp);
                add.addProperty(code, area, details, price, agentname, email, contactp);

                JOptionPane.showMessageDialog(null,"Property Added to the list");
                AdminHomePage a1 = new AdminHomePage();
                a1.setVisible(true);
                setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Enter all the details");
                }
            }
        });
        signin.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent m){
                signin.setBackground(Color.BLACK);
                signin.setForeground(Color.white);
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {}
    
            @Override
            public void mousePressed(MouseEvent e) {}
    
            @Override
            public void mouseReleased(MouseEvent e) {}
    
            @Override
            public void mouseExited(MouseEvent e) {
                signin.setBackground(lightblue);
                signin.setForeground(Color.BLACK);
            }
        });

        JButton close = new JButton();
        close.setText("Exit");
        close.setFont(signfont);
        close.setBounds(650,800,160,50);
        close.setBackground(lightblue);
        container.add(close);

        
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae8){
                System.exit(ABORT);
       }
        });
        close.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent m){
                close.setBackground(Color.BLACK);
                close.setForeground(Color.white);
            }
    
            @Override
            public void mouseClicked(MouseEvent e) {}
    
            @Override
            public void mousePressed(MouseEvent e) {}
    
            @Override
            public void mouseReleased(MouseEvent e) {}
    
            @Override
            public void mouseExited(MouseEvent e) {
                close.setBackground(lightblue);
                close.setForeground(Color.BLACK);
            }
        });

        JButton back = new JButton();
        back.setText("<-Back");
        back.setBackground(lightblue);
        back.setBounds(100,100,100,40);
        back.setFont(nameFont);
        container.add(back);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                AdminHomePage a = new AdminHomePage();
                a.setVisible(true);
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
    }
    public static void main(String[] dd){
        Addp v = new Addp();
        v.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {}
    
    
}

