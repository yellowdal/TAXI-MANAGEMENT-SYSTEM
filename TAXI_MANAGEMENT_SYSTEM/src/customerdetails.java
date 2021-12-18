import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class customerdetails extends JFrame {

    String Car_Class=null;

     customerdetails ()
    {
        super("customerdetails");
        setBackground(Color.white);
        setSize(1000,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JLabel custo = new JLabel("CUSTOMER DETAILS");
        custo.setForeground(Color.GREEN);
        custo.setBounds(500,40,1000,50);
        custo.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(custo);

        JLabel C_ID = new JLabel("Customer ID");
        C_ID.setFont(new Font("Tahoma",Font.PLAIN,17));
        C_ID.setBounds(60,110,150,27);
        add(C_ID);
        JTextField t= new JTextField();
        t.setBounds(200,110,150,27);
        add(t);

        JLabel Name = new JLabel("NAME");
        Name.setFont(new Font("Tahoma",Font.PLAIN,17));
        Name.setBounds(60,150,150,27);
        add(Name);
        JTextField t1= new JTextField();
        t1.setBounds(200,150,150,27);
        add(t1);

        JLabel Location1 = new JLabel("Starting Location");
        Location1.setFont(new Font("Tahoma",Font.PLAIN,17));
        Location1.setBounds(60,200,150,27);
        add(Location1);
        JTextField t2= new JTextField();
        t2.setBounds(200,200,150,27);
        add(t2);

        JLabel Location2 = new JLabel("Ending Location");
        Location2.setFont(new Font("Tahoma",Font.PLAIN,17));
        Location2.setBounds(60,250,150,27);
        add(Location2);
        JTextField t3= new JTextField();
        t3.setBounds(200,250,150,27);
        add(t3);

        JLabel CPno = new JLabel("Contact Number");
        CPno.setFont(new Font("Tahoma",Font.PLAIN,17));
        CPno.setBounds(60,300,150,27);
        add(CPno);
        JTextField t4= new JTextField();
        t4.setBounds(200,300,150,27);
        add(t4);

        JLabel CAcc = new JLabel("Account Number");
        CAcc.setFont(new Font("Tahoma",Font.PLAIN,17));
        CAcc.setBounds(60,350,150,27);
        add(CAcc);
        JTextField t5= new JTextField();
        t5.setBounds(200,350,150,27);
        add(t5);

        JLabel Date = new JLabel("Date of Journey");
        Date.setFont(new Font("Tahoma",Font.PLAIN,17));
        Date.setBounds(60,400,150,27);
        add(Date);
        JTextField t6= new JTextField();
        t6.setBounds(200,400,150,27);
        add(t6);

        JLabel Cc = new JLabel("CAR CLASS");
        Cc.setFont(new Font("Tahoma",Font.PLAIN,17));
        Cc.setBounds(60,450,150,27);
        add(Cc);

        JRadioButton r1 = new JRadioButton("MICRO");
        Cc.setFont(new Font("Tahoma",Font.PLAIN,15));
        r1.setBounds(200,450,100,27);
        add(r1);

        JRadioButton r2 = new JRadioButton("MINI");
        Cc.setFont(new Font("Tahoma",Font.PLAIN,15));
        r2.setBounds(300,450,100,27);
        add(r2);

        JRadioButton r3 = new JRadioButton("SEDAN");
        r3.setFont(new Font("Tahoma",Font.PLAIN,15));
        r3.setBounds(400,450,100,27);
        add(r3);

        JButton bt = new JButton("SAVE");
        bt.setFont(new Font("Tahoma",Font.PLAIN,15));
        bt.setBounds(500,500,150,25);
        bt.setBackground(Color.GREEN);
        add(bt);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String c_id= t.getText();
              String name = t1.getText();
              String sl = t2.getText();
              String el = t3.getText();
              String cno = t4.getText();
              String acc = t5.getText();
              String date = t6.getText();

              if(r1.isSelected())
              {
                 Car_Class= "Micro";
              }
              else if (r2.isSelected())
              {
                   Car_Class ="Mini";
              }
              else if(r3.isSelected())
                {
                    Car_Class="Sedan";
              }else
                    {
                    JOptionPane.showMessageDialog(null,"No Class Selected");
                }
                String str="Insert into customer_info values('"+c_id+"','"+name+"','"+sl+"','"+el+"','"+cno+"','"+acc+"','"+Car_Class+"','"+date+"')";
                connection con=new connection();
                try {
                    con.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Customer Added");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton b2 = new JButton("VIEW");
        b2.setFont(new Font("Tahoma",Font.PLAIN,15));
        b2.setBounds(800,500,150,25);
        b2.setBackground(Color.yellow);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new viewcustomer();
            }
        });
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setUndecorated(true);

        setVisible(true);
    }
    public static void main(String[] args)
    {
        new customerdetails();
    }
}
