package org.example;

public class Item {
    private String[] itemId;
    private String[] title;
    private String[] globalId;
    private PrimaryCategory primaryCategory;
    private String[] galleryURL;
    private String[] viewItemURL;
    private String[] autoPay;
    private String[] postalCode;
    private String[] location;
    private String[] country;
    private ShippingInfo shippingInfo;
    private SellingStatus sellingStatus;
    private ListingInfo listingInfo;

    public String[] getItemId() {
        return itemId;
    }

    public void setItemId(String[] itemId) {
        this.itemId = itemId;
    }

    public String[] getTitle() {
        return title;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }

    public String[] getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String[] globalId) {
        this.globalId = globalId;
    }

    public PrimaryCategory getPrimaryCategory() {
        return primaryCategory;
    }

    public void setPrimaryCategory(PrimaryCategory primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public String[] getGalleryURL() {
        return galleryURL;
    }

    public void setGalleryURL(String[] galleryURL) {
        this.galleryURL = galleryURL;
    }

    public String[] getViewItemURL() {
        return viewItemURL;
    }

    public void setViewItemURL(String[] viewItemURL) {
        this.viewItemURL = viewItemURL;
    }

    public String[] getAutoPay() {
        return autoPay;
    }

    public void setAutoPay(String[] autoPay) {
        this.autoPay = autoPay;
    }

    public String[] getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String[] postalCode) {
        this.postalCode = postalCode;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public String[] getCountry() {
        return country;
    }

    public void setCountry(String[] country) {
        this.country = country;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public SellingStatus getSellingStatus() {
        return sellingStatus;
    }

    public void setSellingStatus(SellingStatus sellingStatus) {
        this.sellingStatus = sellingStatus;
    }

    public ListingInfo getListingInfo() {
        return listingInfo;
    }

    public void setListingInfo(ListingInfo listingInfo) {
        this.listingInfo = listingInfo;
    }
}