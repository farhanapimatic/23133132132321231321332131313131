/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VariationDimensions 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4673951774438812022L;
    private List<String> variationDimension;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("VariationDimension")
    public List<String> getVariationDimension ( ) { 
        return this.variationDimension;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("VariationDimension")
    public void setVariationDimension (List<String> value) { 
        this.variationDimension = value;
    }
 
}
 