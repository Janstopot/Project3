package com.iornhack.Project3.model.AccountsGroup;

import com.iornhack.Project3.model.UsersGroup.User;

import javax.persistence.*;

@Entity
public class CreditCard extends Account{
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="amount", column= @Column(name="creditLimitAmount")),
            @AttributeOverride(name="currency", column = @Column(name = "creditLimitCurrency"))
    })
    Money creditLimit;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="amount", column= @Column(name="interestRateAmount")),
            @AttributeOverride(name="currency", column = @Column(name = "interestRateCurrency"))
    })
    Money interestRate;


    public CreditCard(){

    }

    public CreditCard( Money balance, String secretKey, User primaryOwner, User secondaryOwner, Money creditLimit, Money interestRate) {
        super(balance, secretKey, primaryOwner, secondaryOwner);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Money creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Money getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Money interestRate) {
        this.interestRate = interestRate;
    }
}
