package com.iornhack.Project3.model.AccountsGroup;

import com.iornhack.Project3.model.AccountsGroup.enums.Status;
import com.iornhack.Project3.model.UsersGroup.User;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Checking extends Account{

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="amount", column= @Column(name="minimumBalanceAmount")),
            @AttributeOverride(name="currency", column = @Column(name = "minimumBalanceCurrency"))
    })
    private Money minimumBalance;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="amount", column= @Column(name="monthlyMaintenanceAmount")),
            @AttributeOverride(name="currency", column = @Column(name = "monthlyMaintenanceCurrency"))
    })
    private Money monthlyMaintenanceFee;
    Date creationDate;
    @Enumerated(EnumType.STRING)
    Status status;

    public Checking() {
    }

    public Checking(Money balance, String secretKey, User primaryOwner, User secondaryOwner, Money minimumBalance, Money monthlyMaintenanceFee, Date creationDate, Status status) {
        super(balance, secretKey, primaryOwner, secondaryOwner);
        this.minimumBalance = minimumBalance;
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
        this.creationDate = creationDate;
        this.status = status;
    }

    public Money getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(Money minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public Money getMonthlyMaintenanceFee() {
        return monthlyMaintenanceFee;
    }

    public void setMonthlyMaintenanceFee(Money monthlyMaintenanceFee) {
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
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
