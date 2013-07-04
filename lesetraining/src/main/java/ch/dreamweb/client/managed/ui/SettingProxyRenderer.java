package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.proxy.SettingProxy;
import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;

public class SettingProxyRenderer extends ProxyRenderer<SettingProxy> {

    private static ch.dreamweb.client.managed.ui.SettingProxyRenderer INSTANCE;

    protected SettingProxyRenderer() {
        super(new String[] { "login" });
    }

    public static ch.dreamweb.client.managed.ui.SettingProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new SettingProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(SettingProxy object) {
        if (object == null) {
            return "";
        }
        return object.getLogin() + " (" + object.getLogin() + ")";
    }
}
