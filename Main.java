public class Main {


    public static void main(String[] args) {

        Item keyboard = new Keyboard("ASUS");
        Item sofa = new Sofa("KIKA");

        AuctionParticipant jon = new Person("Jon");
        AuctionParticipant jack = new Person("Jack");
        AuctionParticipant jill = new Person("Jill");

        jon.bid(keyboard);
        jack.bid(keyboard);
        jill.bid(keyboard);

        keyboard.postNewBid(7);
    }
}
