package com.rainbow.rainboweureka.statedemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author xiaoming
 * @Date 2020/7/8
 */

@Data
@Service
public class Context {

    @Autowired
    private AbstractState state;

    public Context () {
        this.state = AppContext.getBean(State1.class);
    }

    public void go (int i) {
        synchronized (this) {
            state.changeState(i);
            state.doSomething();
        }
    }

}
