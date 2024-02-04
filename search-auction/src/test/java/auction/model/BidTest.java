package auction.model;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Bid;
import model.Bidder;
import model.SearchTerm;

public class BidTest {

    @Test
    public void testBidConstructorAndGetters() {
        Bidder bidder = new Bidder("TestBidder");
        model.SearchTerm searchTerm = new SearchTerm("testTerm");
        Bid bid = new Bid(bidder, searchTerm, 0.5, 100);

        assertEquals(bidder, bid.getBidder());
        assertEquals(searchTerm, bid.getSearchTerm());
        assertEquals(0.5, bid.getMaxBidPrice(), 0.001);
        assertEquals(100, bid.getBudget(), 0.001);
    }

    @Test
    public void testToString() {
        Bidder bidder = new Bidder("TestBidder");
        SearchTerm searchTerm = new SearchTerm("testTerm");
        Bid bid = new Bid(bidder, searchTerm, 0.5, 100);

        String expected = "Bidder: TestBidder, Search Term: testTerm, Max Bid Price: 0.5, Budget: 100.0";
        assertEquals(expected, bid.toString());
    }
}
