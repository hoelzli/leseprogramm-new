// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;

@RooGwtRequest("ch.dreamweb.domain.TestStatistic")
@ServiceName("ch.dreamweb.domain.TestStatistic")
public interface TestStatisticRequest_Roo_Gwt extends RequestContext {

    abstract Request<java.lang.Long> countTestStatistics();

    abstract Request<java.util.List<ch.dreamweb.client.proxy.TestStatisticProxy>> findAllTestStatistics();

    abstract Request<java.util.List<ch.dreamweb.client.proxy.TestStatisticProxy>> findTestStatisticEntries(int firstResult, int maxResults);

    abstract Request<ch.dreamweb.client.proxy.TestStatisticProxy> findTestStatistic(Long id);

    abstract InstanceRequest<ch.dreamweb.client.proxy.TestStatisticProxy, java.lang.Void> persist();

    abstract InstanceRequest<ch.dreamweb.client.proxy.TestStatisticProxy, java.lang.Void> remove();
}
