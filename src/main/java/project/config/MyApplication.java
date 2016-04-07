package project.config;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import project.resources.Resource;

public class MyApplication extends Application<MyConfiguration> {
    public static void main(String[] args) throws Exception {
        new MyApplication().run(args);
    }

    @Override
    public String getName() {
        return "my-app";
    }

    @Override
    public void initialize(Bootstrap<MyConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(MyConfiguration configuration, Environment environment) {

        final Resource resource = new Resource(configuration.getEnvironmentAccount());
        final MyHealthCheck healthCheck = new MyHealthCheck(configuration.getEnvironmentAccount());

        environment.healthChecks().register("envAccount", healthCheck);
        environment.jersey().register(resource);
    }

}
