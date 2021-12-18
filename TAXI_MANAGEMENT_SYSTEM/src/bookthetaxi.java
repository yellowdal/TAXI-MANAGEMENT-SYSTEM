import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class bookthetaxi extends JFrame
{
    bookthetaxi ()
    {
        super("Book The Taxi");
        setBackground(Color.white);
        setSize(1000,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel custo = new JLabel("TAXI BOOKING");
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
        JTextField t7= new JTextField();
        t7.setBounds(200,450,150,27);
        add(t7);

        JButton bt = new JButton("BOOK");
        bt.setFont(new Font("Tahoma",Font.PLAIN,15));
        bt.setBounds(500,500,150,25);
        bt.setBackground(Color.GREEN);
        add(bt);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Congrats, YOUR TAXI iS BOOKED");
            }
        });



        t.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String c_id = t.getText();

                String str = "select C_Name,SLocation,ELocation,C_Pho,C_AccNo,Car_Class,Date_Of_Journey from customer_info where C_ID='"+c_id+"'";
                connection con=new connection();
                try {
                    ResultSet rs = con.s.executeQuery(str);
                    rs.next();
                    t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    t5.setText(rs.getString(5));
                    t6.setText(rs.getString(6));
                    t7.setText(rs.getString(7));



                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });

       //JRadioButton r1 = new JRadioButton("MICRO");
        /*Cc.setFont(new Font("Tahoma",Font.PLAIN,15));
        r1.setBounds(200,450,100,27);
        add(r1);
        JRadioButton r2 = new JRadioButton("MINI");
        Cc.setFont(new Font("Tahoma",Font.PLAIN,15));
        r2.setBounds(300,450,100,27);
        add(r2);
        JRadioButton r3 = new JRadioButton("SEDAN");
        r3.setFont(new Font("Tahoma",Font.PLAIN,15));
        r3.setBounds(400,450,100,27);
        add(r3);*/


        //public static  void main(String[] args)

    }
    public static void main(String[] args)
    {
        new bookthetaxi();
    }

}
