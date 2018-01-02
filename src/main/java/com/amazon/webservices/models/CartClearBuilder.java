/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class CartClearBuilder {
    //the instance to build
    private CartClear cartClear;

    /**
     * Default constructor to initialize the instance
     */
    public CartClearBuilder() {
        cartClear = new CartClear();
    }

    public CartClearBuilder marketplaceDomain(String marketplaceDomain) {
        cartClear.setMarketplaceDomain(marketplaceDomain);
        return this;
    }

    public CartClearBuilder aWSAccessKeyId(String aWSAccessKeyId) {
        cartClear.setAWSAccessKeyId(aWSAccessKeyId);
        return this;
    }

    public CartClearBuilder associateTag(String associateTag) {
        cartClear.setAssociateTag(associateTag);
        return this;
    }

    public CartClearBuilder validate(String validate) {
        cartClear.setValidate(validate);
        return this;
    }

    public CartClearBuilder xMLEscaping(String xMLEscaping) {
        cartClear.setXMLEscaping(xMLEscaping);
        return this;
    }

    public CartClearBuilder shared(CartClearRequest shared) {
        cartClear.setShared(shared);
        return this;
    }

    public CartClearBuilder request(List<CartClearRequest> request) {
        cartClear.setRequest(request);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartClear build() {
        return cartClear;
    }
}