package ch.dreamweb.client.scaffold;

import ch.dreamweb.client.scaffold.ioc.DesktopInjectorWrapper;
import ch.dreamweb.client.scaffold.ioc.InjectorWrapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Application for browsing entities.
 */
public class Scaffold implements EntryPoint {
	final private InjectorWrapper injectorWrapper = GWT.create(DesktopInjectorWrapper.class);

	public void onModuleLoad() {
		/* Get and run platform specific app */
		injectorWrapper.getInjector().getScaffoldApp().run();
	}
}