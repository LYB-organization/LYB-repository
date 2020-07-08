package com.rainbow.rainboweureka.statedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author xiaoming
 * @Date 2020/7/8
 */

@Service
public abstract class AbstractState {

    @Autowired
    protected Context context;

    public void changeState (int i) {
        if (i == 2) {
            context.setState(AppContext.getBean(State2.class));
        } else if (i == 3) {
            context.setState(AppContext.getBean(State3.class));
        } else {
            context.setState(AppContext.getBean(State1.class));
        }
    }

    protected abstract void doSomething ();

}
