package proxy.first;

public class ProxyOfBuyTicket  implements  IBuyTicket{
    //private BuyTicket buyTicket;①
    private IBuyTicket iBuyTicket;

    /*public ProxyOfBuyTicket(BuyTicket buyTicket) {
        this.buyTicket = buyTicket;①
    }*/
    public ProxyOfBuyTicket(IBuyTicket iBuyTicket){
        this.iBuyTicket = iBuyTicket;
    }

    @Override
    public void buyTicket() {
        System.out.println("黄牛拿了你的车票钱和代买费");
        //buyTicket.buyTicket();①
        iBuyTicket.buyTicket();
        System.out.println("黄牛把票给你");
    }
}
