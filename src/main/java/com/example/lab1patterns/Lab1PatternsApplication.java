package com.example.lab1patterns;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Lab1PatternsApplication implements CommandLineRunner {
    private final RaisePowerAction powerAction;

    public Lab1PatternsApplication(RaisePowerAction powerAction) {
        this.powerAction = powerAction;
    }

    public static void main(String[] args) {
        SpringApplication.run(Lab1PatternsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic number: SOME CHANGES IN THE CODE FOR 4 Task IN 2LAB AaP ");
        int userNum = scanner.nextInt();

        System.out.println("Enter power: ");
        int p = scanner.nextInt();

        int result = powerAction.calculate(userNum,p);

        System.out.printf("%d^%d = %d", userNum, p, result);
        scanner.close();
    }
}
