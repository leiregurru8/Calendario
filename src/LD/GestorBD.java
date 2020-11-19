package LD;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GestorBD {
	/**
     * Connect to a sample database
     *
     * @param fileName the database file name
     */
    public static void createNewDatabase(String fileName)
    {

        String url = "jdbc:sqlite:" + fileName;//calendar

        try (Connection conn = DriverManager.getConnection(url))
        {
            if (conn != null)
            {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Create a new table in the test database
     *
     */
    public static void createNewTable()
    {
        // SQLite connection string
        String name = "HelloWorld.db"; //tendremos que cambiar el nombre (Calendar.db)
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS warehouses(\n" //usuario
                + "    id integer PRIMARY KEY,\n"//nombre,apellido,usuario,contraseña,email
                + "    name text NOT NULL,\n"
                + "    capacity real\n"
                + ");";

        try
                (
                        Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()
                )
        {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
   

}
