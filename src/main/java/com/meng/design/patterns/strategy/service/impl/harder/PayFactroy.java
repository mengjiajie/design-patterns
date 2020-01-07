package com.meng.design.patterns.strategy.service.impl.harder;

import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PayFactroy {
    private static Map<String,Strategy> services = new ConcurrentHashMap<String,Strategy>();
    public  static Strategy getByUserType(String type){
        return services.get(type);
    }
    public static void register(String userType,Strategy strategy){
        Assert.notNull(userType,"userType can't be null");
        services.put(userType,strategy);
    }

}
