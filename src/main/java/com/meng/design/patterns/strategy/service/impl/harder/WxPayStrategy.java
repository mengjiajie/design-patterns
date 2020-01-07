package com.meng.design.patterns.strategy.service.impl.harder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Slf4j
@Service("wx")
public class WxPayStrategy implements Strategy, InitializingBean {
    @Override
    public void algorithm(String str) {
        log.info("微信支付"+str);
    }

    @Override
    public void afterPropertiesSet() {
        PayFactroy.register("wx",this);
    }
}
