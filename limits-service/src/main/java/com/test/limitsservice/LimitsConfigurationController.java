package com.test.limitsservice;

import com.test.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    LimitConfiguration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        //return new LimitConfiguration(1000, 1);
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());

    }
}
