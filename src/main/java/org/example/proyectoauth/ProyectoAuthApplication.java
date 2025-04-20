package org.example.proyectoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ProyectoAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoAuthApplication.class, args);
        System.out.println("Password: admin123");
        System.out.println(new BCryptPasswordEncoder().encode("admin123"));

    }

}
