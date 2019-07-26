import java.util.*;

public class Auction {

    protected String name;
    protected Integer price;
    protected Map<Item, Integer> biddenItemCotations;
    protected List<AuctionParticipant> bidderAuctionParticipantsList;

    public Auction(String name) {
        this.name = name;
        biddenItemCotations = new HashMap<>();
        bidderAuctionParticipantsList = new ArrayList<>();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Map<Item, Integer> getBiddenItemCotations() {
        return biddenItemCotations;
    }

    public void setBiddenItemCotations(Map<Item, Integer> biddenItemCotations) {
        this.biddenItemCotations = biddenItemCotations;
    }

    public List<AuctionParticipant> getBidderAuctionParticipantsList() {
        return bidderAuctionParticipantsList;
    }

    public void setBidderAuctionParticipantsList(List<AuctionParticipant> bidderAuctionParticipantsList) {
        this.bidderAuctionParticipantsList = bidderAuctionParticipantsList;
    }


}
