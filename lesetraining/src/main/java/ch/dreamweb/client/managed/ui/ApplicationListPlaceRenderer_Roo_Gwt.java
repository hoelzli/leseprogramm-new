// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.managed.request.ApplicationEntityTypesProcessor;
import ch.dreamweb.client.proxy.SettingProxy;
import ch.dreamweb.client.proxy.StatisticProxy;
import ch.dreamweb.client.proxy.TestStatisticProxy;
import ch.dreamweb.client.scaffold.place.ProxyListPlace;
import com.google.gwt.text.shared.AbstractRenderer;

public abstract class ApplicationListPlaceRenderer_Roo_Gwt extends AbstractRenderer<ProxyListPlace> {

    public String render(ProxyListPlace object) {
        return new ApplicationEntityTypesProcessor<String>() {

            @Override
            public void handleSetting(SettingProxy isNull) {
                setResult("Settings");
            }

            @Override
            public void handleStatistic(StatisticProxy isNull) {
                setResult("Statistics");
            }

            @Override
            public void handleTestStatistic(TestStatisticProxy isNull) {
                setResult("TestStatistics");
            }
        }.process(object.getProxyClass());
    }
}
