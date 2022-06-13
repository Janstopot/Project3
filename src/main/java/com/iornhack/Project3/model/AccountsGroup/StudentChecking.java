package com.iornhack.Project3.model.AccountsGroup;

import com.iornhack.Project3.model.AccountsGroup.enums.Status;
import com.iornhack.Project3.model.UsersGroup.User;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class StudentChecking extends Account{
    private Date creationDate;
    private Status status;

    public StudentChecking(Money balance, String secretKey, User primaryOwner, User secondaryOwner, Date creationDate, Status status) {
        super(balance, secretKey, primaryOwner, secondaryOwner);
        this.creationDate = creationDate;
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
