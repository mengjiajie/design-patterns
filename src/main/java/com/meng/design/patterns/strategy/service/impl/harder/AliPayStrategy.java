package com.meng.design.patterns.strategy.service.impl.harder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Slf4j
@Service("ali")
public class AliPayStrategy implements Strategy, InitializingBean {
    @Override
    public void algorithm(String str) {
        log.info("支付宝支付" + str);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PayFactroy.register("aliPay",this);
    }
}
