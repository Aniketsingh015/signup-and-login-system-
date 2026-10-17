package identity.dto;

public class LoginRequest {
    private final String identifier;
    private final String password;


    // constructor
    public LoginRequest(String identifier,String password){
        this.identifier=identifier;
        this.password=password;
    }

    public String getIdentifier(){
        return this.identifier;
    }
    public String getPassword(){
        return this.password;
    }


}
