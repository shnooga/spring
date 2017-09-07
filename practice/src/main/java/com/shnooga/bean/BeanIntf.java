package com.shnooga.bean;

import org.springframework.stereotype.Component;

@Component // Use @Component to signify Spring Bean
public interface BeanIntf {
    String getBehavior();
    String getName();
}
