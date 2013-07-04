// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "ch.dreamweb.domain.Setting", locator = "ch.dreamweb.server.locator.SettingLocator")
@RooGwtProxy(value = "ch.dreamweb.domain.Setting", readOnly = { "version", "id" }, scaffold = true)
public interface SettingProxy extends EntityProxy {

    abstract Long getId();

    abstract String getLogin();

    abstract void setLogin(String login);

    abstract Integer getVersion();
}
