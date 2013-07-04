package ch.dreamweb.client.managed.activity;

import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.managed.ui.SettingDetailsView;
import ch.dreamweb.client.managed.ui.SettingEditView;
import ch.dreamweb.client.managed.ui.SettingListView;
import ch.dreamweb.client.managed.ui.SettingMobileDetailsView;
import ch.dreamweb.client.managed.ui.SettingMobileEditView;
import ch.dreamweb.client.proxy.SettingProxy;
import ch.dreamweb.client.request.SettingRequest_Roo_Gwt;
import ch.dreamweb.client.scaffold.ScaffoldApp;
import ch.dreamweb.client.scaffold.place.CreateAndEditProxy;
import ch.dreamweb.client.scaffold.place.FindAndEditProxy;
import ch.dreamweb.client.scaffold.place.ProxyPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;

public class SettingActivitiesMapper extends SettingActivitiesMapper_Roo_Gwt {

    public SettingActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new SettingDetailsActivity((EntityProxyId<SettingProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? SettingMobileDetailsView.instance() : SettingDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
