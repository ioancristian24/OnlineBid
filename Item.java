import java.util.ArrayList;
import java.util.List;

public class Item {

    protected String name;
    protected List<AuctionParticipant>auctionParticipantsList;
    protected Integer latestBid = null;


    public Item(String name) {
        this.name = name;
        this.auctionParticipantsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<AuctionParticipant> getAuctionParticipantsList() {
        return auctionParticipantsList;
    }

    public Integer getLatestBid() {
        return latestBid;
    }

    public void addAuctionParticipants(AuctionParticipant auctionParticipant){
        auctionParticipantsList.add(auctionParticipant);
    }

    public void updateAuctionParticipants(){
        for (AuctionParticipant auctionParticipant : auctionParticipantsList){
            auctionParticipant.update(this);
        }
    }

    public void postNewBid(Integer price){
        latestBid = price;
        updateAuctionParticipants();
    }

    public void removeAuctionParticipants(AuctionParticipant auctionParticipant){
        auctionParticipantsList.remove(auctionParticipant);
    }
}
