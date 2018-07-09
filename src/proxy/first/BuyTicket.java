package proxy.first;

public class BuyTicket implements IBuyTicket {
    @Override
    public void buyTicket() {
        System.out.println("买过年回家的票");
    }
}
