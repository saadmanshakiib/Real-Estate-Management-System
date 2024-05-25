package NEW_ACCOUNT_PAGE;
import javax.swing.*;

import LOGINPAGE.*;
import Account.*;
import NEWACCOUNTHOMEPAGE.*;


import java.awt.*;
import java.awt.event.*;

public class CreateNewAccount extends JFrame implements ActionListener{
    private Container container;
    Color lightblue = new Color(51,204,255);
    Font titlefont = new Font("Roboto",Font.CENTER_BASELINE,35);

   public CreateNewAccount(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(2000,1600);
        this.setLocationRelativeTo(null);
        this.setTitle("SIGN UP");

        Color lightblue = new Color(51,204,255);

        container = this.getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(null);

        Font nameFont = new Font("Roboto",Font.PLAIN+Font.BOLD,20);
        Font minifont = new Font("Roboto",Font.BOLD,18);
        Font signfont = new Font("Optima",Font.BOLD,30);
        Font minifont2 = new Font("Roboto",Font.BOLD,15);


        JLabel create = new JLabel();
        create.setText("Welcome New User"); 
        create.setBounds(475,50,500,50);
        create.setFont(titlefont);
        container.add(create);

        JLabel firstname = new JLabel();
        firstname.setText("Name         : ");
        firstname.setFont(nameFont);
        firstname.setBounds(350,180,200,80);
        container.add(firstname);

        JTextField firstname_tf = new JTextField();
        firstname_tf.setBounds(500,200,280,50);
        firstname_tf.setHorizontalAlignment(JTextField.CENTER);
        firstname_tf.setFont(nameFont);
        container.add(firstname_tf);

        JLabel lastname = new JLabel();
        lastname.setText("Phone Number : ");
        lastname.setFont(nameFont);
        lastname.setBounds(310,250,200,80);
        container.add(lastname);

        JTextField number_tf = new JTextField();
        number_tf.setBounds(500,270,280,50);
        number_tf.setHorizontalAlignment(JTextField.CENTER);
        number_tf.setFont(nameFont);
        container.add(number_tf);

        JLabel emailL = new JLabel();
        emailL.setText("Email         :");
        emailL.setBounds(350,320,240,80);
        emailL.setFont(nameFont);
        container.add(emailL);

        JTextField email_tf = new JTextField();
        email_tf.setBounds(500,340,280,50);
        email_tf.setHorizontalAlignment(JTextField.CENTER);
        email_tf.setFont(nameFont);
        container.add(email_tf);

        JLabel gender = new JLabel();
        gender.setText("Select Your Gender  : ");
        gender.setFont(nameFont);
        gender.setBounds(280,390,300,80);
        container.add(gender);

        JRadioButton malebutton = new JRadioButton();
        malebutton.setBounds(530,420,100,30);
        malebutton.setText("Male");
        malebutton.setBackground(Color.white);
        malebutton.setFont(minifont);
        container.add(malebutton);

        JRadioButton femalebutton = new JRadioButton();
        femalebutton.setBounds(690,420,100,30);
        femalebutton.setText("Female");
        femalebutton.setBackground(Color.WHITE);
        femalebutton.setFont(minifont);
        container.add(femalebutton);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(malebutton);
        bg1.add(femalebutton);
        
        String area[] = new String[]{" ","Chittagong","Dhaka","Rajshahi","Khulna","Cumillah","Mymensingh","Cox`s Bazar"};
        JLabel areastatus = new JLabel();
        areastatus.setText("Select Your Area : ");
        areastatus.setBounds(280,510,300,50);
        areastatus.setFont(nameFont);
        container.add(areastatus);

        @SuppressWarnings({ "rawtypes", "unchecked" })
        JComboBox a = new JComboBox(area);
        a.setBounds(560,520,150,40);
        a.setBackground(Color.WHITE);
        a.setFont(minifont2);
        container.add(a);

        JLabel signup = new JLabel();
        signup.setText("Sign Up With Us ");
        signup.setBounds(520,100,250,50);
        signup.setFont(signfont);
        container.add(signup);

        ImageIcon houseimage = new ImageIcon("images\\su.png");
        JLabel img1 = new JLabel(houseimage);
        img1.setBounds(1000,220,700,700);
        container.add(img1);

        JLabel pass = new JLabel();
        pass.setText("Password   : ");
        pass.setBounds(350,600,140,30);
        pass.setFont(nameFont);
        container.add(pass);
         
        JPasswordField pass_tf = new JPasswordField();
        pass_tf.setBounds(500,590,280,50);
        pass_tf.setHorizontalAlignment(JTextField.CENTER);
        container.add(pass_tf);

        JLabel confirmpass = new JLabel();
        confirmpass.setText("Confirm Password  : ");
        confirmpass.setBounds(280,670,220,30);
        confirmpass.setFont(nameFont);
        container.add(confirmpass);

        JPasswordField confirmpass_tf = new JPasswordField();
        confirmpass_tf.setBounds(500,660,280,50);
        confirmpass_tf.setHorizontalAlignment(JTextField.CENTER);
        container.add(confirmpass_tf);

        
        JButton signin = new JButton();
        signin.setText("Sign in");
        signin.setBounds(450,800,160,50);
        signin.setBackground(lightblue);
        signin.setFont(signfont);
        container.add(signin);
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

        signin.addActionListener(new ActionListener(){
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent ae){
    if(firstname_tf.getText().isEmpty()==false && number_tf.getText().isEmpty()==false && email_tf.getText().isEmpty()==false && pass_tf.getText().isEmpty()==false && confirmpass_tf.getText().isEmpty()==false && pass_tf.getText().compareTo(confirmpass_tf.getText())==0){
        String name = firstname_tf.getText();
        String password = pass_tf.getText();

        Account account = new Account(name,password);

    if(account.CheckAccount(name,password) == false){
    JOptionPane.showMessageDialog(null,"New Account Has Been Created");
    account.addAccount();
    newacchomepage in = new newacchomepage();
    in.setVisible(true);
    setVisible(false);
                            }   
                    //}

    else if(firstname_tf.getText().isEmpty()==false && number_tf.getText().isEmpty()==false && email_tf.getText().isEmpty()==false && pass_tf.getText().isEmpty()==false && confirmpass_tf.getText().isEmpty()==false && pass_tf.getText().compareTo(confirmpass_tf.getText())==0){
    
    Account account2 = new Account(name,password);

    if(account2.CheckAccount(name,password)==true){
    JOptionPane.showMessageDialog(null,"Account Already Exists");
                        }
                    //}
                    else{
                        JOptionPane.showMessageDialog(null,"Please enter all the details correctly");
                    }
            }
        }
        }
        });
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
                Login backtologin = new Login();
                backtologin.setVisible(true);
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
    public static void main(String[] a){
        CreateNewAccount c = new CreateNewAccount();
        c.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {}
}

