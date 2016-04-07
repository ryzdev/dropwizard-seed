package project.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class MyConfiguration extends Configuration {

    @NotEmpty
    private String environmentAccount;

    @JsonProperty
    public String getEnvironmentAccount() {
        return environmentAccount;
    }

    @JsonProperty
    public void setEnvironmentAccount(String environmentAccount) {
        this.environmentAccount = environmentAccount;
    }
}
