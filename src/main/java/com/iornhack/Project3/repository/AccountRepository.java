package com.iornhack.Project3.repository;

import com.iornhack.Project3.model.AccountsGroup.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository <Account, Long> {
}
