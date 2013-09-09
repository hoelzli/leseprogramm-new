package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.proxy.TestStatisticProxy;
import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;

public class TestStatisticProxyRenderer extends ProxyRenderer<TestStatisticProxy> {

    private static ch.dreamweb.client.managed.ui.TestStatisticProxyRenderer INSTANCE;

    protected TestStatisticProxyRenderer() {
        super(new String[] { "login" });
    }

    public static ch.dreamweb.client.managed.ui.TestStatisticProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new TestStatisticProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(TestStatisticProxy object) {
        if (object == null) {
            return "";
        }
        return object.getLogin() + " (" + object.getLogin() + ")";
    }
}
