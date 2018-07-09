package proxy.first;

public class ProcessOfBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        ProxyOfBuyTicket proxyOfBuyTicket = new ProxyOfBuyTicket(buyTicket);
    }
}
