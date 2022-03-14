package proxy.restrict;

public class Client {
    public static void main(String args[]) throws Exception {
        Internet site = new ProxyInternet(new RealInternet());

        site.connectTo("nabor.com");
        site.connectTo("bat777.com");
    }
}
