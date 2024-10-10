package ru.javacode;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        LocalDateTime time = LocalDateTime.of(2024, 10, 10, 15, 30, 45, 123000000);
        TimeWrapper tw = new TimeWrapper(time);
        System.out.println( "Hello World!" );
    }
}