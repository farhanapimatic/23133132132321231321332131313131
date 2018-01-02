/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OfferSummary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5723167753775003358L;
    private Price lowestNewPrice;
    private Price lowestUsedPrice;
    private Price lowestCollectiblePrice;
    private Price lowestRefurbishedPrice;
    private String totalNew;
    private String totalUsed;
    private String totalCollectible;
    private String totalRefurbished;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("LowestNewPrice")
    public Price getLowestNewPrice ( ) { 
        return this.lowestNewPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("LowestNewPrice")
    public void setLowestNewPrice (Price value) { 
        this.lowestNewPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("LowestUsedPrice")
    public Price getLowestUsedPrice ( ) { 
        return this.lowestUsedPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("LowestUsedPrice")
    public void setLowestUsedPrice (Price value) { 
        this.lowestUsedPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("LowestCollectiblePrice")
    public Price getLowestCollectiblePrice ( ) { 
        return this.lowestCollectiblePrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("LowestCollectiblePrice")
    public void setLowestCollectiblePrice (Price value) { 
        this.lowestCollectiblePrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("LowestRefurbishedPrice")
    public Price getLowestRefurbishedPrice ( ) { 
        return this.lowestRefurbishedPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("LowestRefurbishedPrice")
    public void setLowestRefurbishedPrice (Price value) { 
        this.lowestRefurbishedPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalNew")
    public String getTotalNew ( ) { 
        return this.totalNew;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalNew")
    public void setTotalNew (String value) { 
        this.totalNew = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalUsed")
    public String getTotalUsed ( ) { 
        return this.totalUsed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalUsed")
    public void setTotalUsed (String value) { 
        this.totalUsed = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalCollectible")
    public String getTotalCollectible ( ) { 
        return this.totalCollectible;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalCollectible")
    public void setTotalCollectible (String value) { 
        this.totalCollectible = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalRefurbished")
    public String getTotalRefurbished ( ) { 
        return this.totalRefurbished;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalRefurbished")
    public void setTotalRefurbished (String value) { 
        this.totalRefurbished = value;
    }
 
}
 