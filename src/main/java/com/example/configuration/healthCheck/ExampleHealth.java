/**
 * 
 */
package com.example.configuration.healthCheck;

import com.codahale.metrics.health.HealthCheck;

/**
 * @author ryanmcdonald
 * 
 */
public class ExampleHealth extends HealthCheck {

     @Override
     protected Result check() throws Exception {
          return Result.healthy();
     }

}
