package ch.dreamweb.server.locator;

import ch.dreamweb.domain.TestStatistic;
import com.google.web.bindery.requestfactory.shared.Locator;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;

@RooGwtLocator("ch.dreamweb.domain.TestStatistic")
@Component
public class TestStatisticLocator extends Locator<TestStatistic, Long> {

    public TestStatistic create(Class<? extends ch.dreamweb.domain.TestStatistic> clazz) {
        return new TestStatistic();
    }

    public TestStatistic find(Class<? extends ch.dreamweb.domain.TestStatistic> clazz, Long id) {
        return TestStatistic.findTestStatistic(id);
    }

    public Class<ch.dreamweb.domain.TestStatistic> getDomainType() {
        return TestStatistic.class;
    }

    public Long getId(TestStatistic testStatistic) {
        return testStatistic.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(TestStatistic testStatistic) {
        return testStatistic.getVersion();
    }
}
