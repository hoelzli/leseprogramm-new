package ch.dreamweb.client.managed.activity;

import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.proxy.TestStatisticProxy;
import ch.dreamweb.client.scaffold.activity.IsScaffoldMobileActivity;
import ch.dreamweb.client.scaffold.place.ProxyDetailsView;
import ch.dreamweb.client.scaffold.place.ProxyListPlace;
import ch.dreamweb.client.scaffold.place.ProxyPlace;
import ch.dreamweb.client.scaffold.place.ProxyPlace.Operation;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.Set;

public class TestStatisticDetailsActivity extends TestStatisticDetailsActivity_Roo_Gwt {

    public TestStatisticDetailsActivity(EntityProxyId<ch.dreamweb.client.proxy.TestStatisticProxy> proxyId, ApplicationRequestFactory requests, PlaceController placeController, ProxyDetailsView<ch.dreamweb.client.proxy.TestStatisticProxy> view) {
        this.placeController = placeController;
        this.proxyId = proxyId;
        this.requests = requests;
        view.setDelegate(this);
        this.view = view;
    }

    public void editClicked() {
        placeController.goTo(getEditButtonPlace());
    }

    public Place getBackButtonPlace() {
        return new ProxyListPlace(TestStatisticProxy.class);
    }

    public String getBackButtonText() {
        return "Back";
    }

    public Place getEditButtonPlace() {
        return new ProxyPlace(view.getValue().stableId(), Operation.EDIT);
    }

    public String getTitleText() {
        return "View TestStatistic";
    }

    public boolean hasEditButton() {
        return true;
    }

    public void onCancel() {
        onStop();
    }

    public void onStop() {
        display = null;
    }

    public void start(AcceptsOneWidget displayIn, EventBus eventBus) {
        this.display = displayIn;
        Receiver<EntityProxy> callback = new Receiver<EntityProxy>() {

            public void onSuccess(EntityProxy proxy) {
                if (proxy == null) {
                    placeController.goTo(getBackButtonPlace());
                    return;
                }
                if (display == null) {
                    return;
                }
                view.setValue((TestStatisticProxy) proxy);
                display.setWidget(view);
            }
        };
        find(callback);
    }
}
