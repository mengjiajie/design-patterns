package com.meng.design.patterns;

import com.meng.design.patterns.strategy.service.impl.advanced.Strategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternsApplicationTests {


    @Test
    void contextLoads() {
        /**
         * 观察者模式测试
         */
//        SubscribeIdol idol = new SubscribeIdol();
//        SubscribeFan fan1 = new SubscribeFan("小明");
//        SubscribeFan fan2 = new SubscribeFan("小红");
//        SubscribeFan fan3 = new SubscribeFan("小张");
//        SubscribeOtherFan fan4 = new SubscribeOtherFan("小蓝");
//        idol.addFan(fan1);
//        idol.addFan(fan2);
//        idol.addFan(fan3);
//        idol.addFan(fan4);
//        idol.notify("dancing now!");
        /**
         * 简单策略模式测试
         */
//        Context context = new Context(new WxPayStrategy());
//        context.xx("支付成功");

        /**
         * 策略枚举实现策略模式测试
         */
//        Strategy.WXPAY.success("成功");
    }

}




