package employee.management.system;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class updateemployee extends JFrame implements ActionListener{
        JTextField teducation,tname, tfname, taddress, taadhar,tphone,temail,tsalary,tposition;
        JButton add,back;
        JLabel tempid;
        String number;

     updateemployee(String number) {
        this.number = number;
        getContentPane().setBackground(new Color(163,255,188));

      JLabel heading = new JLabel("Add Employee Detail");
      heading.setBounds(320, 30, 500, 50);
      heading.setFont(new Font("serif",Font.BOLD,25));
      add(heading);

      JLabel name = new JLabel("Enter Name");
      name.setBounds(50, 150, 150, 30);
      name.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(name);
      JLabel tname = new JLabel();
      tname.setBounds(200, 150, 150, 30);
      tname.setBackground(new Color(177,252,197));
      add(tname);

      
      JLabel fname = new JLabel("Father's Name");
      fname.setBounds(400, 150, 150, 30);
      fname.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(fname);
      tfname = new JTextField();
      tfname.setBounds(600, 150, 150, 30);
      tfname.setBackground(new Color(177,252,197));
      add(tfname);

      JLabel dob = new JLabel("Date of Birth");
      dob.setBounds(50, 200, 150, 30);
      dob.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(dob);
      JLabel tdob = new JLabel();
      tdob.setBounds(200,200,150,30);
      tdob.setFont(new Font("Tahoma",Font.BOLD,20));
     // tdob.setBackground(new Color(177,252,197));
      add(tdob);

      JLabel address = new JLabel("Address");
      address.setBounds(400, 200, 150, 30);
      address.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(address);
      taddress = new JTextField();
      taddress.setBounds(600, 200, 150, 30);
      taddress.setBackground(new Color(177,252,197));
      add(taddress);

      JLabel phone = new JLabel("Phone Number");
      phone.setBounds(50, 250, 150, 30);
      phone.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(phone);
      tphone = new JTextField();
      tphone.setBounds(200, 250, 150, 30);
      tphone.setBackground(new Color(177,252,197));
      add(tphone);

      JLabel email = new JLabel("E-mail Id");
      email.setBounds(400, 250, 150, 30);
      email.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(email);
      temail = new JTextField();
      temail.setBounds(600, 250, 150, 30);
      temail.setBackground(new Color(177,252,197));
      add(temail);

      JLabel aadhar = new JLabel("Aadhar Number");
      aadhar.setBounds(50, 300, 150, 30);
      aadhar.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(aadhar);
      JLabel taadhar = new JLabel();
      taadhar.setBounds(200, 300, 150, 30);
      taadhar.setBackground(new Color(177,252,197));
      add(taadhar);

      JLabel salary = new JLabel("Salary");
      salary.setBounds(400, 300, 150, 30);
      salary.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(salary);
      tsalary = new JTextField();
      tsalary.setBounds(600, 300, 150, 30);
      tsalary.setBackground(new Color(177,252,197));
      add(tsalary);

      JLabel position = new JLabel("Position");
      position.setBounds(50, 350, 150, 30);
      position.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(position);
      tposition = new JTextField();
      tposition.setBounds(200, 350, 150, 30);
      tposition.setBackground(new Color(177,252,197));
      add(tposition);
      
      JLabel education = new JLabel("HIGEST EDUCATION");
      education.setBounds(400, 350, 250, 30);
      education.setFont(new Font("SAN_SERIF",Font.BOLD,20));
      add(education);
      JLabel teducation = new JLabel();
      teducation.setBounds(600, 350, 150, 30);
      teducation.setBackground(new Color(177,252,197));
      add(teducation);
      
      

      JLabel empid = new JLabel("EMPLOYEE ID");
      empid.setBounds(50, 400, 200, 30);
      empid.setFont(new Font("SAN SERIF",Font.BOLD,20));
      add(empid);
      tempid = new JLabel();
      tempid.setBounds(200, 400, 150, 30);
      tempid.setFont(new Font("SAN_SARIF", Font.BOLD,20));
      tempid.setForeground(Color.RED); 
      add(tempid);
      try {
        conn c = new conn();
        String query = "select * from employee where emp_id = '"+number+"'";
        ResultSet resultSet = c.statement.executeQuery(query);
        while(resultSet.next()){
            tname.setText(resultSet.getString("name"));
            tfname.setText(resultSet.getString("fname"));
            tdob.setText(resultSet.getString("dob"));
            taddress.setText(resultSet.getString("address"));
            tsalary.setText(resultSet.getString("salary"));
            tphone.setText(resultSet.getString("phone"));
            teducation.setText(resultSet.getString("education"));
            temail.setText(resultSet.getString("email"));
            taadhar.setText(resultSet.getString("aadhar"));
            tempid.setText(resultSet.getString("emp_id"));
           
            } 
        } 
          
       catch (Exception e) {
        e.printStackTrace();
      }

      add = new JButton("UPDATE");
      add.setBounds(250, 550, 150, 40);
      add.setBackground(Color.BLACK);
      add.setForeground(Color.white);
      add.addActionListener(this);
      add(add);


      back = new JButton("Back");
      back.setBounds(450, 550, 150, 40);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.white);
      back.addActionListener(this);
      add(back);
     

      





      
      setSize(900, 700);
      setLayout(null);
      setLocation(300, 50);
      setVisible(true);
 }
    @Override
    
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       if(e.getSource()==add){
          String fname = tfname.getText();
          String salary = tsalary.getText();
          String address = taddress.getText();
          String phone = tphone.getText();
          String email = temail.getText();
          String position = tposition.getText();

          try {
                  conn c = new conn();
                  String query = "update employee set fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"', position = '"+position+"' where emp_id = '"+number+"'";
                  c.statement.executeUpdate(query);
                  JOptionPane.showMessageDialog(null, "Details Update Sucessfully");
                  setVisible(false);
                  new Main_class();
          } 
          catch (Exception E) 
          {
            E.printStackTrace();
          }
       }else {
        setVisible(false);
        new Main_class();
       }

    }
public static void main(String[] args) {
    new updateemployee("");
    
}


}
