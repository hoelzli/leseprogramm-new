package ch.dreamweb.client.managed.activity;

import ch.dreamweb.client.managed.request.ApplicationEntityTypesProcessor;
import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.proxy.SettingProxy;
import ch.dreamweb.client.scaffold.place.ProxyPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;

public class ApplicationDetailsActivities extends ApplicationDetailsActivities_Roo_Gwt {

    @Inject
    public ApplicationDetailsActivities(ApplicationRequestFactory requestFactory, PlaceController placeController) {
        this.requests = requestFactory;
        this.placeController = placeController;
    }
}
