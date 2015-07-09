/**
 * 
 */
package com.example.configuration.resources;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;
import com.example.configuration.entities.ExampleEntity;

/**
 * @author ryanmcdonald
 * 
 */
@Path("/dropwizard-example")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {

     Logger                   logger = LoggerFactory.getLogger(ExampleResource.class);

     // Field from Configuration Class
     private String           exampleField;
     private final AtomicLong counter;

     /**
      * @param exampleField
      */
     public ExampleResource(String exampleField) {
          this.setExampleField(exampleField);
          this.counter = new AtomicLong();
     }

     /**
      * @return
      */
     @SuppressWarnings("javadoc")
     @GET
     @Timed
     public ExampleEntity output(@QueryParam("data") String data) {
          logger.debug("output()");
          return new ExampleEntity(counter.incrementAndGet(), data);
     }

     /**
      * @return the exampleField
      */
     public String getExampleField() {
          return exampleField;
     }

     /**
      * @param exampleField
      *             the exampleField to set
      */
     public void setExampleField(String exampleField) {
          this.exampleField = exampleField;
     }
}
