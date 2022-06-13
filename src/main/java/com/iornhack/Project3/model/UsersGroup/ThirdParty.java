package com.iornhack.Project3.model.UsersGroup;


import javax.persistence.Entity;

@Entity
public class ThirdParty extends User{

    private String hashedKey;


    public ThirdParty() {
    }


    public ThirdParty(String name, String hashedKey) {
        super(name);
        this.hashedKey = hashedKey;
    }





    public String getHashedKey() {
        return hashedKey;
    }

    public void setHashedKey(String hashedKey) {
        this.hashedKey = hashedKey;
    }
}
