// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.managed.activity;

import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.proxy.TestStatisticProxy;
import ch.dreamweb.client.scaffold.ScaffoldMobileApp;
import ch.dreamweb.client.scaffold.activity.IsScaffoldMobileActivity;
import ch.dreamweb.client.scaffold.place.AbstractProxyListActivity;
import ch.dreamweb.client.scaffold.place.ProxyListView;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;

public abstract class TestStatisticListActivity_Roo_Gwt extends AbstractProxyListActivity<TestStatisticProxy> implements IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    public TestStatisticListActivity_Roo_Gwt(PlaceController placeController, ProxyListView<ch.dreamweb.client.proxy.TestStatisticProxy> view, Class<ch.dreamweb.client.proxy.TestStatisticProxy> proxyType) {
        super(placeController, view, proxyType);
    }

    protected void fireCountRequest(Receiver<java.lang.Long> callback) {
        requests.testStatisticRequest().countTestStatistics().fire(callback);
    }
}
