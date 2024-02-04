package application;

import java.util.Map;

import model.Bid;
import model.Bidder;
import model.SearchTerm;

public class Main {
    public static void main(String[] args) {
    	
    	
        // Create bidders
        Bidder bidder1 = new Bidder("Online Fashion");
        Bidder bidder2 = new Bidder("Electronics Devices");
        Bidder bidder3 = new Bidder("Arts");

        // Create search terms
        SearchTerm fashionSearchTerm = new SearchTerm("Online");
        SearchTerm electronicSearchTerm = new SearchTerm("Devices");
        SearchTerm artsSearch = new SearchTerm("painting");

        // Place bids
     // Place bids
        bidder1.placeBid(fashionSearchTerm, 0.6, 200); 
        bidder2.placeBid(electronicSearchTerm, 0.8, 150);    
        bidder3.placeBid(artsSearch, 0.9, 250); 

        // Update bids
        bidder2.updateBid(electronicSearchTerm, 0.6, 120);

        // Remove bid
        bidder1.removeBid(fashionSearchTerm);
        
     // Print bidders and their bids
        printBiddersAndBids(bidder1);
        printBiddersAndBids(bidder2);
        printBiddersAndBids(bidder3);
        
    }
        
    private static void printBiddersAndBids(Bidder bidder) {
    	
        System.out.println("Bids for " + bidder.getName() + ":");
        Map<SearchTerm, Bid> bids = bidder.getBids();
        if (bids.isEmpty()) {
            System.out.println("No bids placed.");
        } else {
            for (Map.Entry<SearchTerm, Bid> entry : bids.entrySet()) {
                System.out.println("Search Term: " + entry.getKey().getTerm());
                System.out.println("Bid Details: " + entry.getValue());
            }
        }
        System.out.println();
        }
    }




    