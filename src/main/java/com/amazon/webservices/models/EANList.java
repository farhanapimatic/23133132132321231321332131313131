/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EANList 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5720669170333550413L;
    private List<String> eANListElement;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EANListElement")
    public List<String> getEANListElement ( ) { 
        return this.eANListElement;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EANListElement")
    public void setEANListElement (List<String> value) { 
        this.eANListElement = value;
    }
 
}
 