# Learning how to use Spring

#autowired project: 
  Spring bean wiring without the need for a reference attribute in the  SpringBeans.xml file
  ie 
    <bean id="myAppBean" class="com.shnooga.MyApp">
        <property name="helloWorld" ref="helloBean" />
    </bean>
