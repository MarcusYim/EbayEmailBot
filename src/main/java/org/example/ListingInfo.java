package org.example;

import com.google.api.client.util.DateTime;

public class ListingInfo
{
    private boolean bestOfferEnabled;
    private boolean buyItNowAvailable;
    private String startTime;
    private String endTime;
    private String listingType;
    private boolean gift;

    public boolean isBestOfferEnabled() {
        return bestOfferEnabled;
    }

    public boolean isBuyItNowAvailable() {
        return buyItNowAvailable;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getListingType() {
        return listingType;
    }

    public boolean isGift() {
        return gift;
    }
}
