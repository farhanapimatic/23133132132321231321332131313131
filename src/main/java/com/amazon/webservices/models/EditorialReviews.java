/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EditorialReviews 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4690793499351004423L;
    private List<EditorialReview> editorialReview;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EditorialReview")
    public List<EditorialReview> getEditorialReview ( ) { 
        return this.editorialReview;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EditorialReview")
    public void setEditorialReview (List<EditorialReview> value) { 
        this.editorialReview = value;
    }
 
}
 