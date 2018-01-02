/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class DiscBuilder {
    //the instance to build
    private Disc disc;

    /**
     * Default constructor to initialize the instance
     */
    public DiscBuilder() {
        disc = new Disc();
    }

    public DiscBuilder number(int number) {
        disc.setNumber(number);
        return this;
    }

    public DiscBuilder track(List<Track> track) {
        disc.setTrack(track);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Disc build() {
        return disc;
    }
}