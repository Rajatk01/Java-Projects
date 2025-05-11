package employee.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login extends JFrame implements ActionListener{
       JTextField tusername;
       JPasswordField tPassword;
       JButton login,back;
    public login() {
        JLabel Username = new JLabel("Username");
        Username.setBounds(40, 20, 100, 30);
        add(Username);

        tusername = new JTextField();
        tusername.setBounds(150, 20, 150, 30);
        add(tusername);

        JLabel Password = new JLabel("Password");
        Password.setBounds(40, 100, 100, 30);
        add(Password);

        tPassword = new JPasswordField();
        tPassword.setBounds(150, 100, 150, 30);
        add(tPassword);

        login = new JButton("LOGIN");
        login.setBounds(150,200, 150, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        back = new JButton("BACK");
        back.setBounds(300,200, 150, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("ICON/Second.jpg"));
        Image i22 = i11.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imgg = new JLabel(i33);
        imgg.setBounds(400, 10, 400,250 );
        add(imgg);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/LoginB.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 600,300 );
        add(img);

        setSize(600, 300);
        setLocation(450, 200);
        setLayout(null);
        setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e){
    if (e.getSource() == login){
        try {
            String username = tusername.getText();
            String Password = tPassword.getText();

            conn conn = new conn();

            String query = "select * from login where username = '"+username +"' and password = '"+Password+"'";
            ResultSet resultset = conn.statement.executeQuery(query);
            if(resultset.next()){
                setVisible(false);
                new Main_class();
            }else{
                JOptionPane.showMessageDialog(null,"Invalid username or password");
            }
        } catch (Exception E) {
            E.printStackTrace();
            
        }

    }
   else if (e.getSource() == back){
     System.exit(90);
   }
}
    public static void main(String[] args) {
        new login();
    }

    

}
