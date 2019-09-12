package com.rainbow.rainbowadmin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class RainbowAdminApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void test(){
        List<Double> list = DoubleStream.of(1.0, 2.0, 3.0)
                .collect(ArrayList<Double>::new, ArrayList::add, ArrayList::addAll);

        System.out.println(list);
    }
}
