package model;

import java.util.List;

public class SearchResult {
    private List<Bid> sponsoredResults;

    public SearchResult(List<Bid> sponsoredResults) {
        this.sponsoredResults = sponsoredResults;
    }

    public List<Bid> getSponsoredResults() {
        return sponsoredResults;
    }
}

