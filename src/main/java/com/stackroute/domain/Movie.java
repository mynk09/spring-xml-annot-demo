package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;


public class Movie implements BeanNameAware, BeanFactoryAware,ApplicationContextAware {
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void role(){
        System.out.println(this.actor);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory is getting Called");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context created");
    }
}
