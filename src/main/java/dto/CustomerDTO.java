package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CustomerDTO {
  private String firstName;
  private String lastName;
  private String address;
  private String dob;
  private String nic;
  private String lic;
  private String wrkAs;
  private String mail;
  private String date;
  private String url;

}

