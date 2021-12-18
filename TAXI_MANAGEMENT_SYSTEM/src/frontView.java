import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frontView extends JFrame {
    public frontView()
    {   super("frontView");
        setSize(1000,800);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton b1=new JButton("Book_the_taxi");
        b1.setBounds(400,200,200,50);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new bookthetaxi();
            }
        });



        JButton b2 = new JButton("Customer Information");
        b2.setBounds(700,200,200,50);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new customerdetails();
            }
        });



        JButton b3 = new JButton("Cars Information");
        b3.setBounds(400,300,200,50);
        add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new car();
            }
        });

        JButton b4 = new JButton("Destination Price table");
        b4.setBounds(700,300,200,50);
        add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new destination();
            }
        });

        JButton b5 = new JButton("Drivers Information");
        b5.setBounds(550,400,200,50);
        add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new driver();
            }
        });


        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setUndecorated(true);

        setVisible(true);




    }
    public static void main(String args[])
    {
        new frontView();


    }
}
