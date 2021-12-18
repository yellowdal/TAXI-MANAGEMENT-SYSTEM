import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class viewcustomer  extends JFrame{
viewcustomer()
{
    super(" CUSTOMER VIEW");
    setBackground(Color.white);
    setSize(1000,800);
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
   // JTable table = new JTable();
    String str = "select * from customer_info";
    connection con=new connection();
    try {
        ResultSet rs = con.s.executeQuery(str);
        //JTable table = new JTable(buildTableModel(rs));
       // table.setBounds(0,20,1440,800);
       // add(table);
        JScrollPane jsp = new JScrollPane(new JTable(buildTableModel(rs)));
        jsp.setBounds(0,0,1400,800);
        add(jsp);
        // JOptionPane.showMessageDialog(null,"User Added");
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    setSize(1000,800);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
   // setUndecorated(true);

    setVisible(true);
}

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        Vector<String> columnNames = new Vector<String>();

        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }
public static void main(String[] args)
{
    new viewcustomer();

}

}
