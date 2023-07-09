package com.test.limitsservice.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class LimitConfiguration {
    private int maximum;
    private int minimum;

    //no-argument constructor
    protected LimitConfiguration() {
    }

    //genetrating constructor using fields
    public LimitConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    //generating getters
    public int getMaximum() {
        return maximum;
    }

    // Setter for maximum
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    // Setter for minimum
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
