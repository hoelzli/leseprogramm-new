package ch.dreamweb.server.locator;

import ch.dreamweb.domain.Statistic;
import com.google.web.bindery.requestfactory.shared.Locator;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;

@RooGwtLocator("ch.dreamweb.domain.Statistic")
@Component
public class StatisticLocator extends Locator<Statistic, Long> {

    public Statistic create(Class<? extends ch.dreamweb.domain.Statistic> clazz) {
        return new Statistic();
    }

    public Statistic find(Class<? extends ch.dreamweb.domain.Statistic> clazz, Long id) {
        return Statistic.findStatistic(id);
    }

    public Class<ch.dreamweb.domain.Statistic> getDomainType() {
        return Statistic.class;
    }

    public Long getId(Statistic statistic) {
        return statistic.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Statistic statistic) {
        return statistic.getVersion();
    }
}
