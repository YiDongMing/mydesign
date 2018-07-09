package proxy.first;

public class ProxyOfBuyTicket  implements  IBuyTicket{
    private BuyTicket buyTicket;

    public ProxyOfBuyTicket(BuyTicket buyTicket) {
        this.buyTicket = buyTicket;
    }

    @Override
    public void buyTicket() {
        System.out.println("黄牛拿了你的车票钱和代买费");
        buyTicket.buyTicket();
        System.out.println("黄牛把票给你");
    }
}
