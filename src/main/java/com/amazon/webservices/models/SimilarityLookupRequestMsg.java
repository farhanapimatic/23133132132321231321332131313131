/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SimilarityLookupRequestMsg 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5191686946294314403L;
    private SimilarityLookup body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public SimilarityLookup getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (SimilarityLookup value) { 
        this.body = value;
    }
 
}
 