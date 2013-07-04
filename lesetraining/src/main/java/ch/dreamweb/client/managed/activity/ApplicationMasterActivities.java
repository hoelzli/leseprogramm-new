package ch.dreamweb.client.managed.activity;

import ch.dreamweb.client.managed.request.ApplicationEntityTypesProcessor;
import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.managed.ui.SettingListView;
import ch.dreamweb.client.managed.ui.SettingMobileListView;
import ch.dreamweb.client.proxy.SettingProxy;
import ch.dreamweb.client.scaffold.ScaffoldApp;
import ch.dreamweb.client.scaffold.place.ProxyListPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;

public final class ApplicationMasterActivities extends ApplicationMasterActivities_Roo_Gwt {

    @Inject
    public ApplicationMasterActivities(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }
}
