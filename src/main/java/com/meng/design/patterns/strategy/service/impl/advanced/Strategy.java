package com.meng.design.patterns.strategy.service.impl.advanced;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 策略枚举方式实现策略模式
 */
@AllArgsConstructor
@Slf4j
public enum Strategy {
    WXPAY("wx"){
        @Override
        public void success(String str) {
            log.info("微信支付"+str);
        }
    },
    ALIPAY("ali"){
        @Override
        public void success(String str) {
            log.info("支付宝支付"+str);
        }
    };
    private String payName;

    public abstract void success(String str);
}
