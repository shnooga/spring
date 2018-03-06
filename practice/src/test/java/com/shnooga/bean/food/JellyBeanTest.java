package com.shnooga.bean.food;

import com.shnooga.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class JellyBeanTest {

    @Autowired
    BeanIntf jellyBean;

    @Test
    public void getBehavior() {
        assertThat(jellyBean.getBehavior(), is("sweet"));
    }

    @Test
    public void getName() {
        assertThat(jellyBean.getName(), is("JellyBean"));
    }
}