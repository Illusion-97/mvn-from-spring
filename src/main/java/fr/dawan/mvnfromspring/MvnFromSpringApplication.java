package fr.dawan.mvnfromspring;

import fr.dawan.bank.entities.Account;
import fr.dawan.discord.SpeakListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvnFromSpringApplication {

	public static void main(String[] args) {
		SpeakListener speakListener = new SpeakListener();
		SpringApplication.run(MvnFromSpringApplication.class, args);
		Account account = new Account();
	}

}
