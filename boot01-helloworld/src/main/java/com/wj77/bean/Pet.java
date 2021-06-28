package com.wj77.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiewang
 */
@ConfigurationProperties(prefix = "mypet")
public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
