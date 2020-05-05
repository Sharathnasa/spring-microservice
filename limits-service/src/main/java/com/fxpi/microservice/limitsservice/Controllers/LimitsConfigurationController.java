package com.fxpi.microservice.limitsservice.Controllers;

import com.fxpi.microservice.limitsservice.Bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(1000, 1);
    }
}
