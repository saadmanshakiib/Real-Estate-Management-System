package LOGINPAGE;

import javax.swing.*;
import Account.*;
import java.awt.*;
import java.awt.event.*;
import HOME_PAGE.*;
import NEWACCOUNTHOMEPAGE.newacchomepage;
import NEW_ACCOUNT_PAGE.*;



public class Login extends JFrame implements ActionListener,MouseListener{
   public Login(){
        Container container = new Container();

        Color lightblue = new Color(51,204,255);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(2000,1600);
        this.setLocationRelativeTo(null);
        this.setTitle("EASY ESTATE");

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.WHITE);
        
        Font usernameFont = new Font("Roboto",Font.PLAIN+Font.BOLD,25);
        Font minifont = new Font("Roboto",Font.BOLD,16);
        Font minifont2 = new Font("Roboto",Font.BOLD,12);
        Font search_font = new Font("Arial",Font.BOLD+Font.ITALIC,100);
        Font erfont = new Font("Serif",Font.BOLD+Font.ITALIC,70);

            JLabel er = new JLabel();
            er.setText("EASY ESTATE");
            er.setBounds(800,50,500,100);
            er.setFont(erfont);
            container.add(er);

        /*JLabel title2 = new JLabel();
        title2.setText("RENT EASILY ONLINE!");
        title2.setBounds(200,170,1000,50);
        title2.setFont(titlefont2);*/

        JLabel name = new JLabel();
        name.setText("User Email : ");
        name.setBounds(720,400,500,50);
        name.setFont(usernameFont);

        JLabel pass = new JLabel();
        pass.setText("Password  : ");
        pass.setBounds(720,490,200,50);
        pass.setFont(usernameFont);

        JTextField name_tf = new JTextField();
        name_tf.setBounds(890,400,300,50);
        name_tf.setHorizontalAlignment(JTextField.CENTER);
        name_tf.setFont(minifont);

        
        JTextField pass_tf = new JPasswordField();
        pass_tf.setBounds(890,490,300,50);
        pass_tf.setHorizontalAlignment(JTextField.CENTER);
        pass_tf.setFont(minifont);

        JLabel mini = new JLabel();
        mini.setText("Doesn`t have an account ? ");
        mini.setBounds(720,530,200,50);
        mini.setFont(minifont2);
        mini.setToolTipText("Press the Create New Account Button");

        JLabel search = new JLabel();;
        search.setText("Search");
        search.setFont(search_font);
        search.setBounds(120,410,500,100);

        JLabel find = new JLabel();
        find.setText("Find & ");
        find.setBounds(210,530,500,100);
        find.setFont(search_font);

        JLabel confirm = new JLabel();
        confirm.setText("Confirm");
        confirm.setBounds(290,640,500,100);
        confirm.setFont(search_font);

        //login button
        JButton login = new JButton();
        login.setBounds(890,580,300,40);
        login.setText("Log in");
        login.setFont(minifont);
        login.setOpaque(true);
        login.setBackground(lightblue);
        login.setForeground(Color.BLACK);

        login.addMouseListener(new MouseListener(){
                public void mouseEntered(MouseEvent me){
                    login.setBackground(Color.BLACK);
                    login.setForeground(Color.WHITE);
                }

                @Override
                public void mouseClicked(MouseEvent e){}

                @Override
                public void mousePressed(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {}

                @Override
                public void mouseExited(MouseEvent e) {
                    login.setBackground(lightblue);
                    login.setForeground(Color.BLACK);
                }
        });
        login.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae1){
        JOptionPane.showConfirmDialog(null,"Are you sure to continue?");
        if(name_tf.getText().equals("saadman102002@gmail.com") && pass_tf.getText().equals("950211")){
        JOptionPane.showMessageDialog(null,"Log in successfull");
        setVisible(false);
        AdminHomePage h = new AdminHomePage();
        h.setVisible(true);
            }
            else if(name_tf.getText().isEmpty()==false && pass_tf.getText().isEmpty()==false){
                String name = name_tf.getText();
                String password = pass_tf.getText();

                Account acc = new Account(name,password);

                if(acc.CheckAccount(name,password)==true){
                    newacchomepage n = new newacchomepage();
                    n.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Enter the details correctly");
                }
            }
           /*  else{
                JOptionPane.showMessageDialog(null,"Enter the details correctly");
            }*/

    //empty
    if(name_tf.getText().isEmpty()==true){
    JOptionPane.showMessageDialog(null,"Name field cant be empty");
    }
    if(pass_tf.getText().isEmpty()==true){
    JOptionPane.showMessageDialog(null,"Password field cant be empty");
    }
}
    });

    //create new account button
        JButton createnewaccountbutton = new JButton();
        createnewaccountbutton.setBounds(890,640,300,40);
        createnewaccountbutton.setText("Create New Account");
        createnewaccountbutton.setFont(minifont);
        createnewaccountbutton.setBackground(lightblue);
        createnewaccountbutton.setForeground(Color.BLACK);
        createnewaccountbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae4){
                    CreateNewAccount cna = new CreateNewAccount();
                    cna.setVisible(true);
                    setVisible(false);
            }
        });
        //createnewaccountbutton.addActionListener(this);
            
        createnewaccountbutton.addMouseListener(new MouseListener(){
                public void mouseEntered(MouseEvent me){
                    createnewaccountbutton.setBackground(Color.BLACK);
                    createnewaccountbutton.setForeground(Color.WHITE);
                }

                @Override
                public void mouseClicked(MouseEvent e) {}
                @Override
                public void mousePressed(MouseEvent e) {}
                @Override
                public void mouseReleased(MouseEvent e) {}
                @Override
                public void mouseExited(MouseEvent e) {
                    createnewaccountbutton.setBackground(lightblue);
                    createnewaccountbutton.setForeground(Color.BLACK);
                }
        });

        //image 

        ImageIcon image = new ImageIcon("images\\main.png");
        JLabel img = new JLabel(image);
        img.setBounds(1250,300,500,500);
        container.add(img);

        ImageIcon loginimage = new ImageIcon("images\\login.png");
        JLabel img2 = new JLabel(loginimage);
        img2.setBounds(900,150,300,280);
        container.add(img2);


       // container.add(title2);
        container.add(name);
        container.add(pass);
        container.add(name_tf);
        container.add(pass_tf);
        container.add(mini);
        container.add(login);
        container.add(createnewaccountbutton);
        container.add(search);
        container.add(find);
        container.add(confirm);

    }
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void actionPerformed(ActionEvent e) {
        }
        public static void main(String[] a){
            Login l = new Login();
            l.setVisible(true);
        }
    }
    
    
    


