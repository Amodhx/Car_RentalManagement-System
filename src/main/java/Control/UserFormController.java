package Control;


import dto.UserDTO;
import lombok.NoArgsConstructor;
import model.UserModel;

import java.util.ArrayList;

@NoArgsConstructor
 public class UserFormController {
    private String id;
    private String name;
    private String pswrd;



    public void saveStudent(){
        id="U002";
        name="Amodh";
        pswrd="amo";

        UserDTO user=new UserDTO(id,name,pswrd);

        boolean isAdd=UserModel.savUser(user);
        System.out.println(isAdd);

    }
    public static boolean setUserTable(String x,String y){

        ArrayList<UserDTO> allUsers=UserModel.getAllUsers();
        for (int i = 0; i < allUsers.size(); i++){
            if(  allUsers.get(i).getUserName().equals(x) && allUsers.get(i).getPassword().equals(y)){
                return true;
            }

        }
        return false;
    }
    public static boolean setUser(String x){

        ArrayList<UserDTO> allUsers= UserModel.getAllUsers();
        for (int i = 0; i < allUsers.size(); i++){
            if(  allUsers.get(i).getUserName().equals(x)){
                return true;
            }

        }
        return false;
    }

}

