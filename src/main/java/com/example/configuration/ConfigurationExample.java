/**
 * 
 */
package com.example.configuration;

import org.hibernate.validator.constraints.NotEmpty;

import io.dropwizard.Configuration;

/**
 * @author ryanmcdonald
 * 
 */
public class ConfigurationExample extends Configuration {

     @NotEmpty
     private String exampleField;

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
