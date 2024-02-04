package auction.model;


import org.junit.Before;
import org.junit.Test;

import model.Bid;
import model.Bidder;
import model.SearchTerm;

import static org.junit.Assert.*;

import java.util.Map;

public class BidderTest {

    private Bidder bidder;
    private SearchTerm searchTerm1;
    private SearchTerm searchTerm2;

    @Before
    public void setUp() {
        bidder = new Bidder("TestBidder");
        searchTerm1 = new SearchTerm("term1");
        searchTerm2 = new SearchTerm("term2");
    }

    @Test
    public void testPlaceBid() {
        bidder.placeBid(searchTerm1, 0.5, 100);

        Map<SearchTerm, Bid> bids = bidder.getBids();
        assertNotNull(bids);
        assertEquals(1, bids.size());
        assertTrue(bids.containsKey(searchTerm1));
    }

    @Test
    public void testUpdateBid() {
        bidder.placeBid(searchTerm1, 0.5, 100);
        bidder.updateBid(searchTerm1, 0.6, 120);

        Map<SearchTerm, Bid> bids = bidder.getBids();
        assertNotNull(bids);
        assertEquals(1, bids.size());
        assertTrue(bids.containsKey(searchTerm1));

        Bid updatedBid = bids.get(searchTerm1);
        assertNotNull(updatedBid);
        assertEquals(0.6, updatedBid.getMaxBidPrice(), 0.001);
        assertEquals(120, updatedBid.getBudget(), 0.001);
    }

    @Test
    public void testRemoveBid() {
        bidder.placeBid(searchTerm1, 0.5, 100);
        bidder.placeBid(searchTerm2, 0.7, 150);

        bidder.removeBid(searchTerm1);

        Map<SearchTerm, Bid> bids = bidder.getBids();
        assertNotNull(bids);
        assertEquals(1, bids.size());
        assertFalse(bids.containsKey(searchTerm1));
        assertTrue(bids.containsKey(searchTerm2));
    }
}

