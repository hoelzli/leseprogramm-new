// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;

@RooGwtRequest("ch.dreamweb.domain.Statistic")
@ServiceName("ch.dreamweb.domain.Statistic")
public interface StatisticRequest_Roo_Gwt extends RequestContext {

    abstract Request<java.lang.Long> countStatistics();

    abstract Request<java.util.List<ch.dreamweb.client.proxy.StatisticProxy>> findAllStatistics();

    abstract Request<java.util.List<ch.dreamweb.client.proxy.StatisticProxy>> findStatisticEntries(int firstResult, int maxResults);

    abstract Request<ch.dreamweb.client.proxy.StatisticProxy> findStatistic(Long id);

    abstract InstanceRequest<ch.dreamweb.client.proxy.StatisticProxy, java.lang.Void> persist();

    abstract InstanceRequest<ch.dreamweb.client.proxy.StatisticProxy, java.lang.Void> remove();
}
