package com.marflo.ws.streaming.application;

import com.marflo.ws.streaming.configuration.StreamingServiceConfiguration;
import com.marflo.ws.streaming.endpoint.StreamingService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class StreamingServiceRunner extends Application<StreamingServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new StreamingServiceRunner().run(args);
    }

    @Override
    public void initialize(Bootstrap<StreamingServiceConfiguration> bootstrap) {
    }

    @Override
    public void run(StreamingServiceConfiguration streamingServiceConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new StreamingService());
    }
}
