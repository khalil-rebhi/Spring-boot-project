package tn.esprit.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(FirstProjectApplication.class, args);
        }catch (Exception err){
            System.out.println(err.toString());
        }
    }

}
