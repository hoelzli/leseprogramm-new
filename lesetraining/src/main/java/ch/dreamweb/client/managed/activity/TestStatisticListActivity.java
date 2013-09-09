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

public class TestStatisticListActivity extends TestStatisticListActivity_Roo_Gwt {

    public TestStatisticListActivity(ApplicationRequestFactory requests, ProxyListView<ch.dreamweb.client.proxy.TestStatisticProxy> view, PlaceController placeController) {
        super(placeController, view, TestStatisticProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "TestStatistics";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<ch.dreamweb.client.proxy.TestStatisticProxy>> createRangeRequest(Range range) {
        return requests.testStatisticRequest().findTestStatisticEntries(range.getStart(), range.getLength());
    }
}
