import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
public class sign_up extends JFrame {
    public sign_up()
    {
        super("Sign_Up Page");
        setBackground(Color.white);
        setSize(1000,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel signup_please = new JLabel("SIGN UP PLEASE");
        signup_please.setForeground(Color.GREEN);
        signup_please.setBounds(500,40,1000,50);
        signup_please.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(signup_please);

        JLabel  Name = new JLabel("Name");
        Name.setFont(new Font("Tahoma",Font.PLAIN,17));
        Name.setBounds(60,110,150,27);
        add(Name);
        JTextField t= new JTextField();
        t.setBounds(200,110,150,27);
        add(t);

        JLabel U_ID = new JLabel("User Name");
        U_ID.setFont(new Font("Tahoma",Font.PLAIN,17));
        U_ID.setBounds(60,150,150,27);
        add(U_ID);
        JTextField t1= new JTextField();
        t1.setBounds(200,150,150,27);
        add(t1);

        JLabel Pd  = new JLabel("Password");
        Pd.setFont(new Font("Tahoma",Font.PLAIN,17));
        Pd.setBounds(60,200,150,27);
        add(Pd);

        JPasswordField t2= new JPasswordField();
        t2.setBounds(200,200,150,27);
        add(t2);

        JButton b3 = new JButton("SAVE");
        b3.setFont(new Font("Tahoma",Font.PLAIN,15));
        b3.setBounds(500,400,150,25);
        b3.setBackground(Color.GREEN);
        add(b3);

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t.getText();
                String u_id = t1.getText();
                String pd = t2.getText();


                String str="Insert into login_page values('"+name+"','"+u_id+"','"+pd+"')";
                connection con=new connection();
                try {
                    int rs = con.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"User Added");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setUndecorated(true);

        setVisible(true);


    }
    public static void main(String[] args)
    {

        new sign_up();
    }


}
