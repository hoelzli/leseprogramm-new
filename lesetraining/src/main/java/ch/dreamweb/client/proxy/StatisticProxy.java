// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import java.util.Date;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "ch.dreamweb.domain.Statistic", locator = "ch.dreamweb.server.locator.StatisticLocator")
@RooGwtProxy(value = "ch.dreamweb.domain.Statistic", readOnly = { "version", "id" }, scaffold = true)
public interface StatisticProxy extends EntityProxy {

    abstract Long getId();

    abstract String getLogin();

    abstract void setLogin(String login);

    abstract Date getDatetime();

    abstract void setDatetime(Date datetime);

    abstract Integer getTrainingday();

    abstract void setTrainingday(Integer trainingday);

    abstract Integer getUnit();

    abstract void setUnit(Integer unit);

    abstract Integer getRightexercices();

    abstract void setRightexercices(Integer rightexercices);

    abstract Integer getWrongexercices();

    abstract void setWrongexercices(Integer wrongexercices);

    abstract Integer getLevelsum();

    abstract void setLevelsum(Integer levelsum);

    abstract Integer getLevelsumright();

    abstract void setLevelsumright(Integer levelsumright);

    abstract Float getAveragelevelright();

    abstract void setAveragelevelright(Float averagelevelright);

    abstract Integer getHighestlevelindex();

    abstract void setHighestlevelindex(Integer highestlevelindex);

    abstract Integer getStepsperlevel();

    abstract void setStepsperlevel(Integer stepsperlevel);

    abstract String getHistory();

    abstract void setHistory(String history);

    abstract Integer getVersion();
}
