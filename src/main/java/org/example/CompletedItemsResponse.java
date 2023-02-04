package org.example;

public class CompletedItemsResponse
{
    private String xmlns;
    private String ack;
    private String version;
    private String timestamp;
    private SearchResult searchResult;

    public String getXmlns() {
        return xmlns;
    }

    public String getAck() {
        return ack;
    }

    public String getVersion() {
        return version;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }
}
