package com.iornhack.Project3;

import com.iornhack.Project3.model.AccountsGroup.Checking;
import com.iornhack.Project3.model.AccountsGroup.Money;
import com.iornhack.Project3.model.AccountsGroup.enums.Status;
import com.iornhack.Project3.model.UsersGroup.AccountHolder;
import com.iornhack.Project3.model.UsersGroup.Address;
import com.iornhack.Project3.model.UsersGroup.User;
import com.iornhack.Project3.repository.AccountRepository;
import com.iornhack.Project3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;


@SpringBootApplication
public class Project3Application implements CommandLineRunner {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception{



		AccountHolder user1 = new AccountHolder("ale", new Date(System.currentTimeMillis()),new Address("Street", "45", "Barcelona", "Andorra"),"my@mail.com");
		userRepository.save(user1);
		Checking checking = new Checking(new Money(new BigDecimal(10000)),"secret", user1,user1,new Money(new BigDecimal(1000)),new Money(new BigDecimal(5)), new Date(System.currentTimeMillis()), Status.ACTIVE);
		accountRepository.save(checking);






	}

}
