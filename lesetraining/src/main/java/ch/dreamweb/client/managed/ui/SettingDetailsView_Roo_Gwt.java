// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.proxy.SettingProxy;
import ch.dreamweb.client.scaffold.place.ProxyDetailsView;
import ch.dreamweb.client.scaffold.place.ProxyListView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public abstract class SettingDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<SettingProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement login;

    @UiField
    SpanElement password;

    @UiField
    SpanElement testday;

    @UiField
    SpanElement testnumber;

    @UiField
    SpanElement testround;

    @UiField
    SpanElement schoolclass;

    @UiField
    SpanElement soundfiletype;

    @UiField
    SpanElement test1record;

    @UiField
    SpanElement test2record;

    @UiField
    SpanElement test3record;

    @UiField
    SpanElement test4record;

    @UiField
    SpanElement test5record;

    @UiField
    SpanElement test6record;

    @UiField
    SpanElement enabletest;

    @UiField
    SpanElement enabletraining;

    @UiField
    SpanElement t1done;

    @UiField
    SpanElement t2done;

    @UiField
    SpanElement t3done;

    @UiField
    SpanElement t4done;

    @UiField
    SpanElement t1tottime;

    @UiField
    SpanElement t2tottime;

    @UiField
    SpanElement t3tottime;

    @UiField
    SpanElement t4tottime;

    @UiField
    SpanElement t1stepsperlevel;

    @UiField
    SpanElement t2stepsperlevel;

    @UiField
    SpanElement t3stepsperlevel;

    @UiField
    SpanElement t4stepsperlevel;

    @UiField
    SpanElement t1level;

    @UiField
    SpanElement t2level;

    @UiField
    SpanElement t3level;

    @UiField
    SpanElement t4level;

    @UiField
    SpanElement t1step;

    @UiField
    SpanElement t2step;

    @UiField
    SpanElement t3step;

    @UiField
    SpanElement t4step;

    @UiField
    SpanElement t1highestdaylevel;

    @UiField
    SpanElement t2highestdaylevel;

    @UiField
    SpanElement t3highestdaylevel;

    @UiField
    SpanElement t4highestdaylevel;

    @UiField
    SpanElement t1highestlevel;

    @UiField
    SpanElement t2highestlevel;

    @UiField
    SpanElement t3highestlevel;

    @UiField
    SpanElement t4highestlevel;

    @UiField
    SpanElement t1highestdaystep;

    @UiField
    SpanElement t2highestdaystep;

    @UiField
    SpanElement t3highestdaystep;

    @UiField
    SpanElement t4highestdaystep;

    @UiField
    SpanElement t1higheststep;

    @UiField
    SpanElement t2higheststep;

    @UiField
    SpanElement t3higheststep;

    @UiField
    SpanElement t4higheststep;

    @UiField
    SpanElement t1prestime;

    @UiField
    SpanElement t2prestime;

    @UiField
    SpanElement t3prestime;

    @UiField
    SpanElement t4prestime;

    @UiField
    SpanElement version;

    SettingProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(SettingProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        login.setInnerText(proxy.getLogin() == null ? "" : String.valueOf(proxy.getLogin()));
        password.setInnerText(proxy.getPassword() == null ? "" : String.valueOf(proxy.getPassword()));
        testday.setInnerText(proxy.getTestday() == null ? "" : String.valueOf(proxy.getTestday()));
        testnumber.setInnerText(proxy.getTestnumber() == null ? "" : String.valueOf(proxy.getTestnumber()));
        testround.setInnerText(proxy.getTestround() == null ? "" : String.valueOf(proxy.getTestround()));
        schoolclass.setInnerText(proxy.getSchoolclass() == null ? "" : String.valueOf(proxy.getSchoolclass()));
        soundfiletype.setInnerText(proxy.getSoundfiletype() == null ? "" : String.valueOf(proxy.getSoundfiletype()));
        test1record.setInnerText(proxy.getTest1record() == null ? "" : String.valueOf(proxy.getTest1record()));
        test2record.setInnerText(proxy.getTest2record() == null ? "" : String.valueOf(proxy.getTest2record()));
        test3record.setInnerText(proxy.getTest3record() == null ? "" : String.valueOf(proxy.getTest3record()));
        test4record.setInnerText(proxy.getTest4record() == null ? "" : String.valueOf(proxy.getTest4record()));
        test5record.setInnerText(proxy.getTest5record() == null ? "" : String.valueOf(proxy.getTest5record()));
        test6record.setInnerText(proxy.getTest6record() == null ? "" : String.valueOf(proxy.getTest6record()));
        enabletest.setInnerText(proxy.getEnabletest() == null ? "" : String.valueOf(proxy.getEnabletest()));
        enabletraining.setInnerText(proxy.getEnabletraining() == null ? "" : String.valueOf(proxy.getEnabletraining()));
        t1done.setInnerText(proxy.getT1done() == null ? "" : String.valueOf(proxy.getT1done()));
        t2done.setInnerText(proxy.getT2done() == null ? "" : String.valueOf(proxy.getT2done()));
        t3done.setInnerText(proxy.getT3done() == null ? "" : String.valueOf(proxy.getT3done()));
        t4done.setInnerText(proxy.getT4done() == null ? "" : String.valueOf(proxy.getT4done()));
        t1tottime.setInnerText(proxy.getT1tottime() == null ? "" : String.valueOf(proxy.getT1tottime()));
        t2tottime.setInnerText(proxy.getT2tottime() == null ? "" : String.valueOf(proxy.getT2tottime()));
        t3tottime.setInnerText(proxy.getT3tottime() == null ? "" : String.valueOf(proxy.getT3tottime()));
        t4tottime.setInnerText(proxy.getT4tottime() == null ? "" : String.valueOf(proxy.getT4tottime()));
        t1stepsperlevel.setInnerText(proxy.getT1stepsperlevel() == null ? "" : String.valueOf(proxy.getT1stepsperlevel()));
        t2stepsperlevel.setInnerText(proxy.getT2stepsperlevel() == null ? "" : String.valueOf(proxy.getT2stepsperlevel()));
        t3stepsperlevel.setInnerText(proxy.getT3stepsperlevel() == null ? "" : String.valueOf(proxy.getT3stepsperlevel()));
        t4stepsperlevel.setInnerText(proxy.getT4stepsperlevel() == null ? "" : String.valueOf(proxy.getT4stepsperlevel()));
        t1level.setInnerText(proxy.getT1level() == null ? "" : String.valueOf(proxy.getT1level()));
        t2level.setInnerText(proxy.getT2level() == null ? "" : String.valueOf(proxy.getT2level()));
        t3level.setInnerText(proxy.getT3level() == null ? "" : String.valueOf(proxy.getT3level()));
        t4level.setInnerText(proxy.getT4level() == null ? "" : String.valueOf(proxy.getT4level()));
        t1step.setInnerText(proxy.getT1step() == null ? "" : String.valueOf(proxy.getT1step()));
        t2step.setInnerText(proxy.getT2step() == null ? "" : String.valueOf(proxy.getT2step()));
        t3step.setInnerText(proxy.getT3step() == null ? "" : String.valueOf(proxy.getT3step()));
        t4step.setInnerText(proxy.getT4step() == null ? "" : String.valueOf(proxy.getT4step()));
        t1highestdaylevel.setInnerText(proxy.getT1highestdaylevel() == null ? "" : String.valueOf(proxy.getT1highestdaylevel()));
        t2highestdaylevel.setInnerText(proxy.getT2highestdaylevel() == null ? "" : String.valueOf(proxy.getT2highestdaylevel()));
        t3highestdaylevel.setInnerText(proxy.getT3highestdaylevel() == null ? "" : String.valueOf(proxy.getT3highestdaylevel()));
        t4highestdaylevel.setInnerText(proxy.getT4highestdaylevel() == null ? "" : String.valueOf(proxy.getT4highestdaylevel()));
        t1highestlevel.setInnerText(proxy.getT1highestlevel() == null ? "" : String.valueOf(proxy.getT1highestlevel()));
        t2highestlevel.setInnerText(proxy.getT2highestlevel() == null ? "" : String.valueOf(proxy.getT2highestlevel()));
        t3highestlevel.setInnerText(proxy.getT3highestlevel() == null ? "" : String.valueOf(proxy.getT3highestlevel()));
        t4highestlevel.setInnerText(proxy.getT4highestlevel() == null ? "" : String.valueOf(proxy.getT4highestlevel()));
        t1highestdaystep.setInnerText(proxy.getT1highestdaystep() == null ? "" : String.valueOf(proxy.getT1highestdaystep()));
        t2highestdaystep.setInnerText(proxy.getT2highestdaystep() == null ? "" : String.valueOf(proxy.getT2highestdaystep()));
        t3highestdaystep.setInnerText(proxy.getT3highestdaystep() == null ? "" : String.valueOf(proxy.getT3highestdaystep()));
        t4highestdaystep.setInnerText(proxy.getT4highestdaystep() == null ? "" : String.valueOf(proxy.getT4highestdaystep()));
        t1higheststep.setInnerText(proxy.getT1higheststep() == null ? "" : String.valueOf(proxy.getT1higheststep()));
        t2higheststep.setInnerText(proxy.getT2higheststep() == null ? "" : String.valueOf(proxy.getT2higheststep()));
        t3higheststep.setInnerText(proxy.getT3higheststep() == null ? "" : String.valueOf(proxy.getT3higheststep()));
        t4higheststep.setInnerText(proxy.getT4higheststep() == null ? "" : String.valueOf(proxy.getT4higheststep()));
        t1prestime.setInnerText(proxy.getT1prestime() == null ? "" : String.valueOf(proxy.getT1prestime()));
        t2prestime.setInnerText(proxy.getT2prestime() == null ? "" : String.valueOf(proxy.getT2prestime()));
        t3prestime.setInnerText(proxy.getT3prestime() == null ? "" : String.valueOf(proxy.getT3prestime()));
        t4prestime.setInnerText(proxy.getT4prestime() == null ? "" : String.valueOf(proxy.getT4prestime()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(SettingProxyRenderer.instance().render(proxy));
    }
}
