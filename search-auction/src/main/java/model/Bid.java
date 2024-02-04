package model;


public class Bid {
    private Bidder bidder;
    private SearchTerm searchTerm;
    private double maxBidPrice;
    private double budget;

    public Bid(Bidder bidder, SearchTerm searchTerm, double maxBidPrice, double budget) {
        this.bidder = bidder;
        this.searchTerm = searchTerm;
        this.maxBidPrice = maxBidPrice;
        this.budget = budget;
    }

    // Getters and setters
    public Bidder getBidder() {
        return bidder;
    }

    public SearchTerm getSearchTerm() {
        return searchTerm;
    }

    public double getMaxBidPrice() {
        return maxBidPrice;
    }

    public double getBudget() {
        return budget;
    }

    public void setMaxBidPrice(double maxBidPrice) {
        this.maxBidPrice = maxBidPrice;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    @Override
    public String toString() {
        return "Bidder: " + bidder.getName() +
               ", Search Term: " + searchTerm.getTerm() +
               ", Max Bid Price: " + maxBidPrice +
               ", Budget: " + budget;
    }
}

