package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDTO {
   private String fname;
    private String sname;
   private String ad;
    private String bday;
    private String NationIC;
    private String Did;
    private String em;
    private String url="profile.png";
}
