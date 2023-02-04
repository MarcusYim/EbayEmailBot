package org.example;

public class ShippingInfo {
    private ShippingServiceCost shippingServiceCost;
    private String shippingType;
    private boolean expeditedShipping;
    private boolean oneDayShippingAvailable;
    private String handlingTime;
    private String shipToLocations;

    public ShippingServiceCost getShippingServiceCost() {
        return shippingServiceCost;
    }

    public String getShippingType() {
        return shippingType;
    }

    public boolean isExpeditedShipping() {
        return expeditedShipping;
    }

    public boolean isOneDayShippingAvailable() {
        return oneDayShippingAvailable;
    }

    public String getHandlingTime() {
        return handlingTime;
    }

    public String getShipToLocations() {
        return shipToLocations;
    }
}