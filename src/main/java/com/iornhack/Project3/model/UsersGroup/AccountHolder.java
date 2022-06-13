package com.iornhack.Project3.model.UsersGroup;


import com.iornhack.Project3.model.AccountsGroup.Account;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class AccountHolder extends User{
    private Date dateOfBirth;
    @Embedded
    Address primaryAddress;
    String mailingAddress;

    @OneToMany(mappedBy = "primaryOwner")
    List<Account> primaryAccounts = new ArrayList<>();
    @OneToMany(mappedBy = "secondaryOwner")
    List<Account> secondaryAccounts = new ArrayList<>();

    public AccountHolder(){

    }


    public AccountHolder(String name, Date dateOfBirth, Address primaryAddress, String mailingAddress) {
        super(name);
        this.dateOfBirth = dateOfBirth;
        this.primaryAddress = primaryAddress;
        this.mailingAddress = mailingAddress;

    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public List<Account> getPrimaryAccounts() {
        return primaryAccounts;
    }

    public void setPrimaryAccounts(Account account) {
        primaryAccounts.add(account);
    }

    public List<Account> getSecondaryAccounts() {
        return secondaryAccounts;
    }

    public void setSecondaryAccounts(Account account) {
        secondaryAccounts.add(account);
    }
}
