# Learning how to use Spring

#autowired project: 
  Eliminate the need for property setters/getters in bean by using @Autowired annotation; still need to define beans in SpringBeans.xml file
  ie 
  <beans>
    <bean id="myAppBean" class="com.shnooga.MyApp">
        <property name="helloWorld" ref="helloBean" />
    </bean>
    <bean id="helloBean" class="com.shnooga.HelloWorld" />
  </beans>

#componentwiring project: 
  Eliminate the need for defining beans in SpringBeans.xml file by using @Component annotation
  ie 
  <beans>
    <context:component-scan base-package="com.shnooga">
  </beans>

#componentwiring_adv project: 
  Select specific object instantiation by using @Configuration & @Bean annotation; selects specific beaan creation methods. 
  ie

  @Configuration
  @Component
  public class MyApp {

    @Autowired
    private HelloWorld helloWorld;

    @Bean(name="inky")
    public HelloWorld getInky()     { return new HelloWorld("Inky"); }
    @Bean(name="clyde")
    public HelloWorld getClyde()    { return new HelloWorld("Clyde"); }
  }
