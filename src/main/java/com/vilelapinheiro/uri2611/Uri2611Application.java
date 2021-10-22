package com.vilelapinheiro.uri2611;

import com.vilelapinheiro.uri2611.dto.MovieMinDTO;
import com.vilelapinheiro.uri2611.repositories.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Uri2611Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Uri2611Application.class, args);
    }

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("SQL raiz");
        movieRepository.search1("action")
                .stream()
                .map(MovieMinDTO::new)
                .forEach(System.out::println);

        log.info("JPQL");
        movieRepository.search2("action")
                .stream()
//                .map(MovieMinDTO::new)
                .forEach(System.out::println);
    }
}
