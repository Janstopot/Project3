package com.iornhack.Project3.model.AccountsGroup;

import com.iornhack.Project3.model.AccountsGroup.enums.Status;
import com.iornhack.Project3.model.UsersGroup.User;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Savings extends Account{


    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="amount", column= @Column(name="minimumBalanceAmount")),
            @AttributeOverride(name="currency", column = @Column(name = "minimumBalanceCurrency"))
    })
    private Money minimumBalance;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="amount", column= @Column(name="interestRateAmount")),
            @AttributeOverride(name="currency", column = @Column(name = "interestRateCurrency"))
    })
    private Money interestRate;
    private Date creationDate;
    private Status status;

    public Savings(){

    }


    public Savings(Money balance, String secretKey, User primaryOwner, User secondaryOwner, Money minimumBalance, Money interestRate, Date creationDate, Status status) {
        super(balance, secretKey, primaryOwner, secondaryOwner);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
        this.creationDate = creationDate;
        this.status = status;
    }

    public Money getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(Money minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public Money getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Money interestRate) {
        this.interestRate = interestRate;
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
