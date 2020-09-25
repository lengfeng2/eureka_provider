package com.szb;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Service;

/**
 * 改变健康状态的Service
 */
@Service
public class HealthStatusService implements HealthIndicator {

    private Boolean status = true;

    public String getStatus() {
        return this.status.toString();
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public Health health() {
        if (status){
            return new Health.Builder().up().build();
        }
        return new Health.Builder().down().build();
    }
}
