import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginpage extends JFrame {
    loginpage()
    {
        super("Login Page");
        setBackground(Color.white);
        setSize(1000,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel login_please = new JLabel("LOGIN PLEASE");
        login_please.setForeground(Color.GREEN);
        login_please.setBounds(500,40,1000,50);
        login_please.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(login_please);

        JLabel U_ID = new JLabel("User Name");
        U_ID.setFont(new Font("Tahoma",Font.PLAIN,17));
        U_ID.setBounds(60,110,150,27);
        add(U_ID);
        JTextField t= new JTextField();
        t.setBounds(200,110,150,27);
        add(t);

        JLabel Pd  = new JLabel("Password");
        Pd.setFont(new Font("Tahoma",Font.PLAIN,17));
        Pd.setBounds(60,150,150,27);
        add(Pd);
        JPasswordField t1= new JPasswordField();
        t1.setBounds(200,150,150,27);
        add(t1);


        JButton b1 = new JButton("Sign in");
        b1.setFont(new Font("Tahoma",Font.PLAIN,15));
        b1.setBounds(500,300,150,25);
        b1.setBackground(Color.GREEN);
        add(b1);

        JButton b2 = new JButton("Sign up");
        b2.setFont(new Font("Tahoma",Font.PLAIN,15));
        b2.setBounds(700,300,150,25);
        b2.setBackground(Color.yellow);
        add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t.getText();
                String pd = t1.getText();
                String str ="select user_id , password from login_page where user_id= '"+name+"' and password = '"+pd+"'";
                connection con=new connection();
                try {
                    ResultSet rs = con.s.executeQuery(str);
                    if(rs.next()==false)
                    {
                        JOptionPane.showMessageDialog(null,"INCORRECT DETAILS");
                    }
                    else
                    {
                        new frontView();
                    }


                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,ex);
                }

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new sign_up();

            }
        });
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setUndecorated(true);

        setVisible(true);
    }
    public static void main(String[] args)
    {
        new loginpage();
    }
}
