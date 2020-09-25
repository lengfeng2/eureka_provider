package com.szb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MainController {

    @Resource
    HealthStatusService healthStatusService;

    @GetMapping("/home")
    public String home() {
        System.out.println("get in");
        return "Spring Cloud ,hello world";
    }

    /**
     * 手动开启上线下线状态
     * @param status
     * @return
     */
    @GetMapping("/health")
    public String health(@RequestParam("status") Boolean status) {
        healthStatusService.setStatus(status);
        return healthStatusService.getStatus();
    }
}
