package model;


import db.dbConnection;
import dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeModel {

    public static boolean SavEmployee(EmployeeDTO employee){
        Connection con;
        try {
            con= dbConnection.getInstance().getConnection();
            PreparedStatement ps= con.prepareStatement("INSERT INTO Employee VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1,employee.getFname());
            ps.setString(2,employee.getSname());
            ps.setString(3,employee.getAd());
            ps.setString(4,employee.getBday());
            ps.setString(5,employee.getNationIC());
            ps.setString(6,employee.getDid());
            ps.setString(7,employee.getEm());
            ps.setString(8,employee.getUrl());

            int aff=ps.executeUpdate();
            return aff>0;

        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return false;

    }
    public static ArrayList<EmployeeDTO> getAllEmployee(){
        ArrayList<EmployeeDTO> ar=new ArrayList<>();

        try {
            Connection connection=dbConnection.getInstance().getConnection();
            PreparedStatement ps=connection.prepareStatement("SELECT * FROM Employee;");
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                EmployeeDTO ed=new EmployeeDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8));
                ar.add(ed);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return ar;

    }
}

