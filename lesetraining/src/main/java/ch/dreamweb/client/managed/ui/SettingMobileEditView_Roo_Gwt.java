// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.managed.activity.SettingEditActivityWrapper;
import ch.dreamweb.client.managed.activity.SettingEditActivityWrapper.View;
import ch.dreamweb.client.proxy.SettingProxy;
import ch.dreamweb.client.scaffold.place.ProxyEditView;
import ch.dreamweb.client.scaffold.ui.*;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import java.util.Collection;
import java.util.List;

public abstract class SettingMobileEditView_Roo_Gwt extends Composite implements View<SettingMobileEditView> {

    @UiField
    TextBox login;

    @UiField
    TextBox password;

    @UiField
    IntegerBox testday;

    @UiField
    IntegerBox testnumber;

    @UiField
    IntegerBox testround;

    @UiField
    TextBox schoolclass;

    @UiField
    TextBox soundfiletype;

    @UiField
    IntegerBox test1record;

    @UiField
    IntegerBox test2record;

    @UiField
    IntegerBox test3record;

    @UiField
    IntegerBox test4record;

    @UiField
    IntegerBox test5record;

    @UiField
    IntegerBox test6record;

    @UiField(provided = true)
    CheckBox enabletest = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    CheckBox enabletraining = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    CheckBox t1done = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    CheckBox t2done = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    CheckBox t3done = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    CheckBox t4done = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField
    IntegerBox t1tottime;

    @UiField
    IntegerBox t2tottime;

    @UiField
    IntegerBox t3tottime;

    @UiField
    IntegerBox t4tottime;

    @UiField
    IntegerBox t1stepsperlevel;

    @UiField
    IntegerBox t2stepsperlevel;

    @UiField
    IntegerBox t3stepsperlevel;

    @UiField
    IntegerBox t4stepsperlevel;

    @UiField
    IntegerBox t1level;

    @UiField
    IntegerBox t2level;

    @UiField
    IntegerBox t3level;

    @UiField
    IntegerBox t4level;

    @UiField
    IntegerBox t1step;

    @UiField
    IntegerBox t2step;

    @UiField
    IntegerBox t3step;

    @UiField
    IntegerBox t4step;

    @UiField
    IntegerBox t1highestdaylevel;

    @UiField
    IntegerBox t2highestdaylevel;

    @UiField
    IntegerBox t3highestdaylevel;

    @UiField
    IntegerBox t4highestdaylevel;

    @UiField
    IntegerBox t1highestlevel;

    @UiField
    IntegerBox t2highestlevel;

    @UiField
    IntegerBox t3highestlevel;

    @UiField
    IntegerBox t4highestlevel;

    @UiField
    IntegerBox t1highestdaystep;

    @UiField
    IntegerBox t2highestdaystep;

    @UiField
    IntegerBox t3highestdaystep;

    @UiField
    IntegerBox t4highestdaystep;

    @UiField
    IntegerBox t1higheststep;

    @UiField
    IntegerBox t2higheststep;

    @UiField
    IntegerBox t3higheststep;

    @UiField
    IntegerBox t4higheststep;

    @UiField
    IntegerBox t1prestime;

    @UiField
    IntegerBox t2prestime;

    @UiField
    IntegerBox t3prestime;

    @UiField
    IntegerBox t4prestime;
}
