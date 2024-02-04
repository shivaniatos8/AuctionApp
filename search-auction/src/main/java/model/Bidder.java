package model;

import java.util.HashMap;
import java.util.Map;

public class Bidder {
    private String name;
    private Map<SearchTerm, Bid> bids;

    public Bidder(String name) {
        this.name = name;
        this.bids = new HashMap<>();
    }

    public void placeBid(SearchTerm searchTerm, double maxBidPrice, double budget) {
        Bid bid = new Bid(this, searchTerm, maxBidPrice, budget);
        bids.put(searchTerm, bid);
    }

    public void updateBid(SearchTerm searchTerm, double maxBidPrice, double budget) {
        if (bids.containsKey(searchTerm)) {
            Bid bid = bids.get(searchTerm);
            bid.setMaxBidPrice(maxBidPrice);
            bid.setBudget(budget);
            System.out.println("Bid is Updated.");
        } else {
            System.out.println("Bid not found for the given search term.");
        }
    }

    public void removeBid(SearchTerm searchTerm) {
        if (bids.containsKey(searchTerm)) {
            bids.remove(searchTerm);
            System.out.println("Bid is Removed.");
            
        } else {
            System.out.println("Bid not found for the given search term.");
        }
    }

    public String getName() {
        return name;
    }

    public Map<SearchTerm, Bid> getBids() {
        return bids;
    }
}
