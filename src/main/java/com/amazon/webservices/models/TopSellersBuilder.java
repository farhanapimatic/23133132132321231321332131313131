/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class TopSellersBuilder {
    //the instance to build
    private TopSellers topSellers;

    /**
     * Default constructor to initialize the instance
     */
    public TopSellersBuilder() {
        topSellers = new TopSellers();
    }

    public TopSellersBuilder topSeller(List<TopSeller> topSeller) {
        topSellers.setTopSeller(topSeller);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TopSellers build() {
        return topSellers;
    }
}