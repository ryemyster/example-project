/**
 * 
 */
package com.example.configuration.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ryanmcdonald
 *         RESPONSE OBJECT
 */
public class ExampleEntity {

     private long   id;

     private String data;

     /**
      * 
      * @param transactionId
      * @param data
      */
     public ExampleEntity(long transactionId, String data) {
          this.data = data;
     }

     /**
      * @return the data
      */
     @JsonProperty
     public String getData() {
          return data;
     }

     /**
      * @param data
      *             the data to set
      */
     public void setData(String data) {
          this.data = data;
     }

     /**
      * @return the id
      */
     @JsonProperty
     public long getId() {
          return id;
     }

     /**
      * @param id
      *             the id to set
      */
     public void setId(long id) {
          this.id = id;
     }

}
