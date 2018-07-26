package proxy.first;
import java.lang.reflect.Proxy;

public class ProcessOfBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        ProxyOfBuyTicket proxyOfBuyTicket = new ProxyOfBuyTicket(buyTicket);
        proxyOfBuyTicket.buyTicket();
    }
}
