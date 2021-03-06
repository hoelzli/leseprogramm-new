package ch.dreamweb.client.managed.activity;

import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.proxy.SettingProxy;
import ch.dreamweb.client.scaffold.activity.IsScaffoldMobileActivity;
import ch.dreamweb.client.scaffold.place.ProxyEditView;
import ch.dreamweb.client.scaffold.place.ProxyListPlace;
import ch.dreamweb.client.scaffold.place.ProxyPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SettingEditActivityWrapper extends SettingEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<SettingProxy> proxyId;

    public SettingEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<ch.dreamweb.client.proxy.SettingProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(SettingProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New Setting" : "Edit Setting";
    }

    public boolean hasEditButton() {
        return false;
    }

    @Override
    public String mayStop() {
        return wrapped.mayStop();
    }

    @Override
    public void onCancel() {
        wrapped.onCancel();
    }

    @Override
    public void onStop() {
        wrapped.onStop();
    }

    public interface View<V extends ch.dreamweb.client.scaffold.place.ProxyEditView<ch.dreamweb.client.proxy.SettingProxy, V>> extends ProxyEditView<SettingProxy, V> {
    }
}
