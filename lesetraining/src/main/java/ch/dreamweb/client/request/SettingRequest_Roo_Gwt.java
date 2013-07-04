// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;

@RooGwtRequest("ch.dreamweb.domain.Setting")
@ServiceName("ch.dreamweb.domain.Setting")
public interface SettingRequest_Roo_Gwt extends RequestContext {

    abstract Request<java.lang.Long> countSettings();

    abstract Request<java.util.List<ch.dreamweb.client.proxy.SettingProxy>> findAllSettings();

    abstract Request<java.util.List<ch.dreamweb.client.proxy.SettingProxy>> findSettingEntries(int firstResult, int maxResults);

    abstract Request<ch.dreamweb.client.proxy.SettingProxy> findSetting(Long id);

    abstract InstanceRequest<ch.dreamweb.client.proxy.SettingProxy, java.lang.Void> persist();

    abstract InstanceRequest<ch.dreamweb.client.proxy.SettingProxy, java.lang.Void> remove();
}
