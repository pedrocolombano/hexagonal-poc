package br.com.colombano.hexagonalpoc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.colombano.hexagonalpoc"})
public class HexagonalPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexagonalPocApplication.class, args);
    }

}
