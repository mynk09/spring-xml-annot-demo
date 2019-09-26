package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {

    }



    public void CustomInit(){
        System.out.println("Initialization");
    }

    public void CustomDestroy(){
        System.out.println("Destruction");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}