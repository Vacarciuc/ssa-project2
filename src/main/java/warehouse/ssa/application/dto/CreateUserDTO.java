package warehouse.ssa.application.dto;


import lombok.Getter;
import lombok.Setter;
import warehouse.ssa.domain.entity.RoleEnum;

@Getter
@Setter
public class CreateUserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RoleEnum role;


    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public RoleEnum getRole(){
        return this.role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
}
