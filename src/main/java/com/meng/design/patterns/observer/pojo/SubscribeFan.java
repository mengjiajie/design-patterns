package com.meng.design.patterns.observer.pojo;

import com.meng.design.patterns.observer.service.Fan;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.Period;

@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class SubscribeFan implements Fan {

    private String name;

    @Override
    public void notify(String str) {
        log.info(name + "收到消息-->" + str);
    }
}
