package identity.model;

import java.time.LocalDate;
import java.util.UUID;

public class User {
    private final UUID id;
    private final String name;
    private final String email;
    private final String phoneNo;
    private final LocalDate dateOfBirth;
    private final String passwordhash;

    // getter and setters

    public UUID getId(int id){
        return this.id;
    }
    public String getName(){
        return this.name;
    } 
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
    public LocalDate getdateOfBirth(){
       return this.dateOfBirth;
    }
    public String getPasswordHash(){
        return this.passwordhash;
    }

    // constructor
    public User(String name,String email,String phoneNo,LocalDate dateOfBirth,String passwordhash){
        this.id=UUID.randomUUID();
        this.name=name;
        this.email=email;
        this.phoneNo=phoneNo;
        this.dateOfBirth=dateOfBirth;
        this.passwordhash=passwordhash;

    }

    
}
