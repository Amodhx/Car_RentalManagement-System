package model;


import db.dbConnection;
import dto.UserDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserModel {

    public static boolean changePass(String x,String y){
        Connection con=null;
        try {
            con=dbConnection.getInstance().getConnection();
            PreparedStatement ps=con.prepareStatement("UPDATE User set Password=? where UserName=?;");
            ps.setString(1,y);
            ps.setString(2,x);
            int af=ps.executeUpdate();
            return  af>0;
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return false;


    }

    public static boolean savUser(UserDTO user){
        Connection con=null;
        try {
            con = dbConnection.getInstance().getConnection();
            PreparedStatement ps= con.prepareStatement("insert into User values (?,?,?)");
            ps.setString(1,user.getUserId());
            ps.setString(2,user.getUserName());
            ps.setString(3,user.getPassword());

            int aff=ps.executeUpdate();
            return aff>0;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<UserDTO> getAllUsers(){
        ArrayList<UserDTO> ar=new ArrayList<>();

        try {
            Connection connection=dbConnection.getInstance().getConnection();
            PreparedStatement ps=connection.prepareStatement("SELECT * FROM User");
            ResultSet rs=ps.executeQuery();

            while (rs.next()){
                UserDTO ut=new UserDTO(rs.getString(1),rs.getString(2),rs.getString(3));
                ar.add(ut);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return  ar;

    }
}
