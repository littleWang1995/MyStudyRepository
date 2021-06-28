package com.wj77.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiewang
 */
@ConfigurationProperties
public class Car {
    private String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
