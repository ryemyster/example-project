/**
 * 
 */
package com.example.configuration;

import com.example.configuration.resources.ExampleResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * @author ryanmcdonald
 * 
 */
public class ExampleApplication extends Application<ConfigurationExample> {

     /**
      * @param args
      * @throws Exception
      */
     public static void main(String[] args) throws Exception {
          new ExampleApplication().run(args);
     }

     /**
      * Name of the endpoint
      */
     public String getName() {
          return "dropwizard-example";
     }

     /**
      * 
      */
     @Override
     public void run(ConfigurationExample config, Environment env) throws Exception {

          final ExampleResource exResource = new ExampleResource(config.getExampleField());

          // register resource
          // env.healthChecks().register("", healthCheck);
          env.jersey().register(exResource);
     }

}
