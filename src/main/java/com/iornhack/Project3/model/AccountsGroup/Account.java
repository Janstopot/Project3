package com.iornhack.Project3.model.AccountsGroup;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.iornhack.Project3.model.UsersGroup.User;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "USD", column = @Column(name = "balance")),
            @AttributeOverride(name = "DEFAULT_ROUNDING", column = @Column(name = "balanceRounding")),
            @AttributeOverride(name = "currency", column = @Column(name = "balanceCurrency")),
            @AttributeOverride(name = "amount", column = @Column(name = "balanceAmount"))
    })
    private Money balance;
    private String secretKey;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "primary_user_id")
    private User primaryOwner;

    @ManyToOne
    @JsonIgnore@JoinColumn(name = "secondary_user_id")
    private User secondaryOwner;


    public Account() {
    }

    public Account(Money balance, String secretKey, User primaryOwner, User secondaryOwner) {
        this.balance = balance;
        this.secretKey = secretKey;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public User getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(User primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public User getSecondaryOwner() {
        return secondaryOwner;
    }

    public void setSecondaryOwner(User secondaryOwner) {
        this.secondaryOwner = secondaryOwner;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }





}
