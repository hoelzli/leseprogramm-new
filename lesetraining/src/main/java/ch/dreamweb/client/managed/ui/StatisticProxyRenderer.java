package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.proxy.StatisticProxy;
import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;

public class StatisticProxyRenderer extends ProxyRenderer<StatisticProxy> {

    private static ch.dreamweb.client.managed.ui.StatisticProxyRenderer INSTANCE;

    protected StatisticProxyRenderer() {
        super(new String[] { "login" });
    }

    public static ch.dreamweb.client.managed.ui.StatisticProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new StatisticProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(StatisticProxy object) {
        if (object == null) {
            return "";
        }
        return object.getLogin() + " (" + object.getLogin() + ")";
    }
}
