package ch.dreamweb.client.managed.activity;

import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.managed.ui.TestStatisticDetailsView;
import ch.dreamweb.client.managed.ui.TestStatisticEditView;
import ch.dreamweb.client.managed.ui.TestStatisticListView;
import ch.dreamweb.client.managed.ui.TestStatisticMobileDetailsView;
import ch.dreamweb.client.managed.ui.TestStatisticMobileEditView;
import ch.dreamweb.client.proxy.TestStatisticProxy;
import ch.dreamweb.client.request.TestStatisticRequest_Roo_Gwt;
import ch.dreamweb.client.scaffold.ScaffoldApp;
import ch.dreamweb.client.scaffold.place.CreateAndEditProxy;
import ch.dreamweb.client.scaffold.place.FindAndEditProxy;
import ch.dreamweb.client.scaffold.place.ProxyPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;

public class TestStatisticActivitiesMapper extends TestStatisticActivitiesMapper_Roo_Gwt {

    public TestStatisticActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new TestStatisticDetailsActivity((EntityProxyId<TestStatisticProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? TestStatisticMobileDetailsView.instance() : TestStatisticDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
