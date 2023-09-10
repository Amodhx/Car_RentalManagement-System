package Control;


import dto.CustomerDTO;
import javafx.scene.control.TextArea;
import model.CustomerModel;

import java.sql.SQLException;
import java.util.ArrayList;

import static java.lang.String.*;

public class CustomerFormController {

    public void SaveCustomer() throws SQLException{
        String id = "C001";
        String name = "Amodh";
        String addrss = "Kaluthara";
        String NIC = "200227000940";
        String date = "2023/08/24";
        String status="Going";

        CustomerDTO customer=new CustomerDTO(id,name,addrss,NIC,date,status);

        boolean isAdd= CustomerModel.SavCustomer(customer);

        System.out.println(isAdd);

    }
    public static void setStudentGoing(TextArea area){
        ArrayList<CustomerDTO> allCustomer=CustomerModel.getOnGoingCustomer();

        for (int i = 0; i < allCustomer.size(); i++) {
            area.appendText(" "+allCustomer.get(i).getName()+"                         "+allCustomer.get(i).getAddress()+"                            "+allCustomer.get(i).getDate()+"                    "+allCustomer.get(i).getNIC()+"\n ");
        }

    }

    public  static void setStudentButtonTable(TextArea area){
        ArrayList<CustomerDTO> allCustomer = CustomerModel.getAllCustomer();

        for (int i = 0; i < allCustomer.size(); i++) {
            area.appendText(" "+allCustomer.get(i).getName()+"                         "+allCustomer.get(i).getAddress()+"                            "+allCustomer.get(i).getDate()+"                    "+allCustomer.get(i).getNIC()+"\n ");
        }


    }
}
