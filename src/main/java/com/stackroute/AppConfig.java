package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.stackroute.demo.BeanLifecycleDemoBean;


@Configuration
public class AppConfig {

    @Bean
    public Actor actor1(){
        return new Actor("Jack sparrow", "Male", 27);
    }
    @Bean
    public Actor actor2(){
        return new Actor("Jill robertson", "Female", 24);
    }
    @Bean
    public Actor actor3(){
        return new Actor("Amy Stark", "Female", 19);
    }

    @Bean(name = {"M1", "M2"})
        public Movie movie(){
            Movie movie = new Movie(actor1());
            return movie;
    }
    @Bean(initMethod = "CustomInit", destroyMethod = "CustomDestroy")
    public BeanLifecycleDemoBean demoBean(){
        return new BeanLifecycleDemoBean();
    }

}