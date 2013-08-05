package ch.dreamweb.client.managed.activity;

import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.managed.ui.StatisticDetailsView;
import ch.dreamweb.client.managed.ui.StatisticEditView;
import ch.dreamweb.client.managed.ui.StatisticListView;
import ch.dreamweb.client.managed.ui.StatisticMobileDetailsView;
import ch.dreamweb.client.managed.ui.StatisticMobileEditView;
import ch.dreamweb.client.proxy.StatisticProxy;
import ch.dreamweb.client.request.StatisticRequest_Roo_Gwt;
import ch.dreamweb.client.scaffold.ScaffoldApp;
import ch.dreamweb.client.scaffold.place.CreateAndEditProxy;
import ch.dreamweb.client.scaffold.place.FindAndEditProxy;
import ch.dreamweb.client.scaffold.place.ProxyPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;

public class StatisticActivitiesMapper extends StatisticActivitiesMapper_Roo_Gwt {

    public StatisticActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new StatisticDetailsActivity((EntityProxyId<StatisticProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? StatisticMobileDetailsView.instance() : StatisticDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
