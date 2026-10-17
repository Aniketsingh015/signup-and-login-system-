package identity.dto;

import java.time.LocalDate;

public class RegisterRequest {
    private final String name;
    private final String email;
    private final String phoneNo;
    private final LocalDate dateOfBirth;
    private final String password;
    private final String confirmPassword;

    // constructor
    public RegisterRequest(String name,String email,String phoneNo,LocalDate dateOfBirth,String password,String confirmPassword){
        this.name=name;
        this.email=email;
        this.phoneNo=phoneNo;
        this.dateOfBirth=dateOfBirth;
        this.password=password;
        this.confirmPassword=confirmPassword;
    }

    // getters
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    public String getPassword(){
        return this.password;
    }
    public String getConfirmPassword(){
        return this.confirmPassword;
    }


}
