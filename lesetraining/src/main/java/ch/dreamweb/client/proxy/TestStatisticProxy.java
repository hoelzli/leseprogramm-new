// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import java.util.Date;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "ch.dreamweb.domain.TestStatistic", locator = "ch.dreamweb.server.locator.TestStatisticLocator")
@RooGwtProxy(value = "ch.dreamweb.domain.TestStatistic", readOnly = { "version", "id" }, scaffold = true)
public interface TestStatisticProxy extends EntityProxy {

    abstract Long getId();

    abstract String getLogin();

    abstract void setLogin(String login);

    abstract Date getDatetime();

    abstract void setDatetime(Date datetime);

    abstract Integer getTest();

    abstract void setTest(Integer test);

    abstract Integer getTestround();

    abstract void setTestround(Integer testround);

    abstract Integer getSpanscore();

    abstract void setSpanscore(Integer spanscore);

    abstract Integer getTrialscore();

    abstract void setTrialscore(Integer trialscore);

    abstract Integer getTrialscore_version();

    abstract void setTrialscore_version(Integer trialscore_version);

    abstract String getHistory();

    abstract void setHistory(String history);

    abstract Integer getVersion();
}
