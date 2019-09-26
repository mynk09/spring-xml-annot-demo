package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class Main {

    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie M1 = context.getBean("M1", Movie.class);
        M1.role();
        Movie M2 = context.getBean("M2", Movie.class);
        M2.role();
        context.close();
        System.out.println(M1==M2);
    }
}