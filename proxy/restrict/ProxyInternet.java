package proxy.restrict;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProxyInternet implements Internet{

    private Internet internet;
    private static List<String> bannedSite;

    static {
        bannedSite = new ArrayList<>();
        bannedSite.add("illegal.com");
        bannedSite.add("bat777.com");
    }

    public ProxyInternet(Internet internet) {
        this.internet = internet;
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSite.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverHost);
    }
}
