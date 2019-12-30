package com.meng.design.patterns.observer.pojo;

import com.meng.design.patterns.observer.service.Fan;
import com.meng.design.patterns.observer.service.Idol;

import java.util.ArrayList;
import java.util.List;

public class SubscribeIdol implements Idol {

    private List<Fan> fanList  = new ArrayList<>();

    @Override
    public void addFan(Fan fan) {
        fanList.add(fan);
    }

    @Override
    public void deleteFan(Fan fan) {
        fanList.remove(fan);
    }

    @Override
    public void notify(String str) {
        fanList.forEach(fan -> fan.notify(str));
    }
}
