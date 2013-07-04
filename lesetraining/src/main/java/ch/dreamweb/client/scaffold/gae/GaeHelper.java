// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
package ch.dreamweb.client.scaffold.gae;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import ch.dreamweb.client.managed.request.ApplicationRequestFactory;
import ch.dreamweb.client.scaffold.ScaffoldDesktopShell;
import ch.dreamweb.client.scaffold.gae.*;

public class GaeHelper {

	@Inject
	public GaeHelper(ScaffoldDesktopShell shell, ApplicationRequestFactory requestFactory, EventBus eventBus) {
		// AppEngine user authentication

new GaeLoginWidgetDriver(requestFactory).setWidget(shell.getLoginWidget());

new ReloadOnAuthenticationFailure().register(eventBus);


	}
}