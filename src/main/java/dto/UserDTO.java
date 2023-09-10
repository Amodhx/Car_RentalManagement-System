package dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private String UserId;
    private String UserName;
    private String password;
}