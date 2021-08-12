package com.RimAirV3.VersionSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class RimairSprinv2 extends SpringBootServletInitializer {

    public static void main(String[] args) {
        /*        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                String password [] = {"abdou"};
                for(int i = 0; i < password.length; i++)
                    System.out.println(passwordEncoder.encode(password[i]));
*/
        SpringApplication.run(RimairSprinv2.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RimairSprinv2.class);
    }
}
