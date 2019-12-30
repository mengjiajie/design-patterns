package com.meng.design.patterns.strategy.service.impl.simple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WxPayStrategy implements Strategy {
    @Override
    public void algorithm(String str) {
        log.info("微信支付"+str);
    }
}
