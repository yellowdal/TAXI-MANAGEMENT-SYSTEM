import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {


    public Connection c;
    public Statement s;

    public connection() {

        try {
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/taximanagement", "root", "12345");
            s = c.createStatement();
        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }
}
