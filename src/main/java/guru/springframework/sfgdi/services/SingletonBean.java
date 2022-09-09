package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by vladi on 09/09/2022
 **/
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
