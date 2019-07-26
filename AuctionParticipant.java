import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuctionParticipant {

    protected String name;
    protected List<Item> biddenItemsList;
    protected Map<Item, Integer> latestCotations;


    public AuctionParticipant(String name) {
        this.name = name;
        biddenItemsList = new ArrayList<>();
        latestCotations = new HashMap<>();
    }


    public void update(Item itemWhoIsBidden) {

        if (biddenItemsList.contains(itemWhoIsBidden)) {
            Integer previousCotation = latestCotations.get(itemWhoIsBidden);
            Integer currentCotation = itemWhoIsBidden.getLatestBid();

            if (previousCotation == null || previousCotation.compareTo(currentCotation) != 0){

                System.out.println("I am " + this.name + " and I received an update from "
                        + itemWhoIsBidden.getName() + " : The new cotation of this item is "
                        + currentCotation );

                latestCotations.put(itemWhoIsBidden,currentCotation);
            }

        }
    }

    public void bid(Item item){
        biddenItemsList.add(item);
        item.addAuctionParticipants(this);
    }

    public void unbid(Item item){
        biddenItemsList.remove(item);
        item.removeAuctionParticipants(this);
    }

}

