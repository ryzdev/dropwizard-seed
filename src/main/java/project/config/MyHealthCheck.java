package project.config;

import com.codahale.metrics.health.HealthCheck;

public class MyHealthCheck extends HealthCheck {

    private final String accountId;

    public MyHealthCheck(String accountId) {
        this.accountId = accountId;
    }

    @Override
    protected Result check() throws Exception {
        if (accountId == null) {
            return Result.unhealthy("config account value cannot be null");
        }
        return Result.healthy();
    }
}
