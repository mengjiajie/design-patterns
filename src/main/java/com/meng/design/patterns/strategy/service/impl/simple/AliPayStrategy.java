package com.meng.design.patterns.strategy.service.impl.simple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AliPayStrategy implements Strategy {
    @Override
    public void algorithm(String str) {
        log.info("支付宝支付" + str);
    }
}
