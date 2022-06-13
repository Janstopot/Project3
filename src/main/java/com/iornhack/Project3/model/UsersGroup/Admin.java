package com.iornhack.Project3.model.UsersGroup;

import javax.persistence.Entity;

@Entity
public class Admin extends User{
    public Admin() {
    }

    public Admin(String name) {
        super(name);
    }


}
