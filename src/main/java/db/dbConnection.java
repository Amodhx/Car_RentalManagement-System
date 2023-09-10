package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    private static dbConnection bConnection;
    private Connection connection;

    private dbConnection() throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/inn","root","amodh1234");

    }
    public static dbConnection getInstance() throws SQLException,ClassNotFoundException{
        return bConnection==null ? bConnection=new dbConnection() : bConnection;

    }
    public Connection getConnection(){return connection;}
}