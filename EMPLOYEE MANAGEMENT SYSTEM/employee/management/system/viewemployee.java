package employee.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;



public class viewemployee extends JFrame implements ActionListener{
Choice choiceEmp;
JTable table;
JButton searchbtn, print, update, back;

    public viewemployee() {
        getContentPane().setBackground(new Color(255,131,122));
        JLabel search = new JLabel("Search by employee id");
        search.setBounds(20, 20, 150, 20);
        add(search);
        choiceEmp = new Choice();
        choiceEmp.setBounds(180, 20, 150, 20);
        add(choiceEmp);
        try {
               conn c = new conn();
            ResultSet resultset = c.statement.executeQuery("select * from employee");
            while(resultset.next()){ 
// this while loop will run till my all emp_id not get fetched.
                choiceEmp.add(resultset.getString("emp_id"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();
        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jp = new JScrollPane(table);
        jp.setBounds(0, 100, 900, 600);
        add(jp);

        searchbtn = new JButton("search");
        searchbtn.setBounds(20, 70, 80, 20);
        
        searchbtn.addActionListener(this);
        add(searchbtn);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);       
        add(print);

        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        back.addActionListener(this);       
        add(back);










        setSize(900, 700);
        setLayout(null);
        setLocation(300, 100);
        setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if(e.getSource()==searchbtn){
       String query ="select * from employee where emp_id = '"+choiceEmp.getSelectedItem()+"'" ;
       try {
        conn c = new conn();
        ResultSet resultSet = c.statement.executeQuery(query);
        table.setModel(DbUtils.resultSetToTableModel(resultSet));
           
       } catch (Exception E) {
        E.printStackTrace();
       }
    }
       else if (e.getSource() == print){
           try {
            table.print();
               
           } catch (Exception E) {
            E.printStackTrace();
           }
       }
       else if(e.getSource()==update){
        try {
            setVisible(false);
            new updateemployee(choiceEmp.getSelectedItem());
        } catch (Exception E) {
            E.printStackTrace();
        }
       }
       else{
        setVisible(false);
        new Main_class();
       }
    
}
    public static void main(String[] args) {
        new viewemployee();
    }

}
