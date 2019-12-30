package com.meng.design.patterns.observer.service;

public interface Idol {
    public void addFan(Fan fan);
    public void deleteFan(Fan fan);
    public void notify(String str);
}
