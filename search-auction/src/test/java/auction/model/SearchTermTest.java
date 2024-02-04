package auction.model;


import org.junit.Test;

import model.SearchTerm;

import static org.junit.Assert.assertEquals;

public class SearchTermTest {

    @Test
    public void testSearchTermConstructorAndGetTerm() {
        SearchTerm searchTerm = new SearchTerm("testTerm");

        assertEquals("testTerm", searchTerm.getTerm());
    }
}

