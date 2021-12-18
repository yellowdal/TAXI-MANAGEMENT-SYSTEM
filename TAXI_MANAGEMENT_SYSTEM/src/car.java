import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class car extends JFrame
{
    car()
    {
        super("CAR DETAILS");
        setBackground(Color.white);
        setSize(1000,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel dest = new JLabel("CAR DETAILS");
        dest.setForeground(Color.BLACK);
        dest.setBounds(500,40,1000,80);
        dest.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(dest);

        JLabel D_ID = new JLabel("Driver ID");
        D_ID.setFont(new Font("Tahoma",Font.PLAIN,17));
        D_ID.setBounds(60,110,150,27);
        add(D_ID);
        JTextField t1= new JTextField();
        t1.setBounds(300,110,150,27);
        add(t1);

        JLabel DrName = new JLabel("Driver Name");
        DrName.setFont(new Font("Tahoma",Font.PLAIN,17));
        DrName.setBounds(60,150,150,27);
        add(DrName);
        JTextField t2= new JTextField();
        t2.setBounds(300,150,150,27);
        add(t2);

       /* JLabel DrPhno = new JLabel("Driver Phone Number");
        DrPhno.setFont(new Font("Tahoma",Font.PLAIN,17));
        DrPhno.setBounds(60,200,180,27);
        add(DrPhno);
        JTextField t3= new JTextField();
        t3.setBounds(300,200,150,27);
        add(t3);*/

        JLabel DrCC = new JLabel("Car Class");
        DrCC.setFont(new Font("Tahoma",Font.PLAIN,17));
        DrCC.setBounds(60,200,150,27);
        add(DrCC);
        JTextField t4= new JTextField();
        t4.setBounds(300,200,150,27);
        add(t4);

        JLabel DrCN = new JLabel("Driver Car Number");
        DrCN.setFont(new Font("Tahoma",Font.PLAIN,17));
        DrCN.setBounds(60,250,150,27);
        add(DrCN);
        JTextField t5= new JTextField();
        t5.setBounds(300,250,150,27);
        add(t5);

       /* JLabel DrLN = new JLabel("Driver License Number");
        DrLN.setFont(new Font("Tahoma",Font.PLAIN,17));
        DrLN.setBounds(60,350,180,27);
        add(DrLN);
        JTextField t6= new JTextField();
        t6.setBounds(300,350,150,27);
        add(t6);

        JLabel DrLoc = new JLabel("Driver Location");
        DrLoc.setFont(new Font("Tahoma",Font.PLAIN,17));
        DrLoc.setBounds(60,400,150,27);
        add(DrLoc);
        JTextField t7= new JTextField();
        t7.setBounds(300,400,150,27);
        add(t7);*/

        JLabel DrAvail = new JLabel("Driver Availability");
        DrAvail.setFont(new Font("Tahoma",Font.PLAIN,17));
        DrAvail.setBounds(60,300,150,27);
        add(DrAvail);
        JTextField t8= new JTextField();
        t8.setBounds(300,300,150,27);
        add(t8);

        JButton bt = new JButton("SAVE");
        bt.setFont(new Font("Tahoma",Font.PLAIN,15));
        bt.setBounds(500,500,150,25);
        bt.setBackground(Color.BLACK);
        bt.setForeground(Color.white);
        add(bt);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String d_id = t1.getText();
                String drname = t2.getText();
                //String drPhno = t3.getText();
                String drCC = t4.getText();
                String drCN = t5.getText();
              //  String drLN = t6.getText();
               // String drloc= t7.getText();
                String dravail= t8.getText();

                String str="Insert into cars_table values('"+d_id+"','"+drname+"','"+drCC+"','"+drCN+"','"+dravail+"')";
                connection con=new connection();
                try {
                    con.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Car Details Added");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton b3 = new JButton("VIEW");
        b3.setFont(new Font("Tahoma",Font.PLAIN,15));
        b3.setBounds(700,500,150,25);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.white);
        add(b3);

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewcar();

            }
        });
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setUndecorated(true);

        setVisible(true);



    }
    public static void main(String[] args)
    {
        new car();
    }

}
