package model;

/*Continuous:This type of auction implies that the bidding process is continuous and ongoing.
 *In a continuous auction, advertisers can change their bids at any time, and the auction mechanism continuously evaluates bids and allocates slots based on the current bids.
 *This type of auction is suitable for scenarios where bidding activity is frequent and bids can change rapidly.
 *Dynamic:This type of auction implies that the bidding process is dynamic but not necessarily continuous. 
 *In a dynamic auction, advertisers can still change their bids, but the auction mechanism may not evaluate bids continuously
 
*/
public enum AuctionType {
    CONTINUOUS,
    DYNAMIC
}

