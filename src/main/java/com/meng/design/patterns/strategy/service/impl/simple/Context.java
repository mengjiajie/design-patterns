package com.meng.design.patterns.strategy.service.impl.simple;

/**
 * 最简单的策略模式实践
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void xx(String str){
        strategy.algorithm(str);
    }
}
