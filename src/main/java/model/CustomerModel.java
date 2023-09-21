package model;


import db.dbConnection;
import dto.CustomerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerModel {

    public static boolean SavCustomer(CustomerDTO customer){
        Connection con;
        try {
            con= dbConnection.getInstance().getConnection();
            PreparedStatement ps= con.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,customer.getFirstName());
            ps.setString(2,customer.getLastName());
            ps.setString(3,customer.getAddress());
            ps.setString(4,customer.getDob());
            ps.setString(5,customer.getNic());
            ps.setString(6,customer.getLic());
            ps.setString(7,customer.getWrkAs());
            ps.setString(8,customer.getMail());
            ps.setString(9,customer.getDate());
            ps.setString(10,customer.getUrl());

            int aff=ps.executeUpdate();
            return aff>0;

        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return false;

    }
    public static ArrayList<CustomerDTO> getAllCustomer(){
        ArrayList<CustomerDTO> ar=new ArrayList<>();

        try {
            Connection connection=dbConnection.getInstance().getConnection();
            PreparedStatement ps=connection.prepareStatement("SELECT * FROM Customer;");
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                CustomerDTO cd=new CustomerDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10) );
                ar.add(cd);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return ar;

    }

}
