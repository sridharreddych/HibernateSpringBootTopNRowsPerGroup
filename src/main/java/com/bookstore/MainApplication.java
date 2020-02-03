package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.fetchAuthorTop2BySales();
        };
    }
}


/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * How To Efficiently Finding Top N Rows Of Every Group

Description: This application is an example of finding top N rows of every group.

Key points:

write a native query relying on ROW_NUMBER() window function
Output sample:

 */
