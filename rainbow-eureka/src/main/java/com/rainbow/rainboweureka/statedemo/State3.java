package com.rainbow.rainboweureka.statedemo;

import org.springframework.stereotype.Service;

/**
 * @Author xiaoming
 * @Date 2020/7/8
 */

@Service
public class State3 extends AbstractState {
    @Override
    protected void doSomething() {
        System.out.println("现在的实现类是：" + context.getState().getClass().getName());
    }
}
