import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class destination extends JFrame{
    destination()
    {
        super("DESTINATION");
        setBackground(Color.white);
        setSize(1000,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel dest = new JLabel("DESTINATION DETAILS");
        dest.setForeground(Color.RED);
        dest.setBounds(500,40,1000,50);
        dest.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(dest);

        JLabel Dest_ID = new JLabel("Destination ID");
        Dest_ID.setFont(new Font("Tahoma",Font.PLAIN,17));
        Dest_ID.setBounds(60,110,150,27);
        add(Dest_ID);
        JTextField t= new JTextField();
        t.setBounds(200,110,150,27);
        add(t);

        JLabel Dname1 = new JLabel("Destination1");
        Dname1.setFont(new Font("Tahoma",Font.PLAIN,17));
        Dname1.setBounds(60,150,150,27);
        add(Dname1);
        JTextField t1= new JTextField();
        t1.setBounds(200,150,150,27);
        add(t1);

        JLabel Dname2 = new JLabel("Destination2");
        Dname2.setFont(new Font("Tahoma",Font.PLAIN,17));
        Dname2.setBounds(60,200,150,27);
        add(Dname2);
        JTextField t2= new JTextField();
        t2.setBounds(200,200,150,27);
        add(t2);

        JLabel Distance = new JLabel("Distance");
        Distance.setFont(new Font("Tahoma",Font.PLAIN,17));
        Distance.setBounds(60,250,150,27);
        add(Distance);
        JTextField t3= new JTextField();
        t3.setBounds(200,250,150,27);
        add(t3);

        JLabel MPrice = new JLabel("Micro Price");
        MPrice.setFont(new Font("Tahoma",Font.PLAIN,17));
        MPrice.setBounds(60,300,150,27);
        add(MPrice);
        JTextField t4= new JTextField();
        t4.setBounds(200,300,150,27);
        add(t4);

        JLabel MiPrice = new JLabel("Mini Price");
        MiPrice.setFont(new Font("Tahoma",Font.PLAIN,17));
        MiPrice.setBounds(60,350,150,27);
        add(MiPrice);
        JTextField t5= new JTextField();
        t5.setBounds(200,350,150,27);
        add(t5);

        JLabel SPrice = new JLabel("Sedan Price");
        SPrice.setFont(new Font("Tahoma",Font.PLAIN,17));
        SPrice.setBounds(60,400,150,27);
        add(SPrice);
        JTextField t6= new JTextField();
        t6.setBounds(200,400,150,27);
        add(t6);

        JButton bt = new JButton("SAVE");
        bt.setFont(new Font("Tahoma",Font.PLAIN,15));
        bt.setBounds(500,500,150,25);
        bt.setBackground(Color.RED);
        bt.setForeground(Color.white);
        add(bt);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dest_ID= t.getText();
                String dname1 =t1.getText();
                String dname2 = t2.getText();
                String distance = t3.getText();
                String mprice = t4.getText();
                String miprice = t5.getText();
                String sprice = t6.getText();

            String str="Insert into destination values('"+dest_ID+"','"+dname1+"','"+dname2+"','"+distance+"','"+mprice+"','"+miprice+"','"+sprice+"')";
                connection con=new connection();
                try {
                    con.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Destination Added");
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
               new viewdestination();

            }
        });
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setUndecorated(true);

        setVisible(true);

    }
    public static void main(String[] args)
    {
        new destination();
    }


}
