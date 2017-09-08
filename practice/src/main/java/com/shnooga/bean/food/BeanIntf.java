package com.shnooga.bean.food;

import org.springframework.stereotype.Component;

@Component // Use @Component to signify Spring Bean
public interface BeanIntf {
    String getBehavior();
    String getName();
}
