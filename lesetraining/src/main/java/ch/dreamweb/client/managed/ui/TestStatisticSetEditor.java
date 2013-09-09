package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.managed.ui.TestStatisticSetEditor.NameLabel;
import ch.dreamweb.client.proxy.TestStatisticProxy;
import ch.dreamweb.client.scaffold.ui.CollectionRenderer;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.Editor.Ignore;
import com.google.gwt.editor.client.EditorDelegate;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.editor.client.ValueAwareEditor;
import com.google.gwt.editor.client.adapters.EditorSource;
import com.google.gwt.editor.client.adapters.ListEditor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestStatisticSetEditor extends TestStatisticSetEditor_Roo_Gwt {

    @UiField
    FlexTable table;

    @UiField(provided = true)
    @Ignore
    ValueListBox<TestStatisticProxy> picker = new ValueListBox<TestStatisticProxy>(ch.dreamweb.client.managed.ui.TestStatisticProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<TestStatisticProxy>());

    @UiField
    Button add;

    @UiField
    HTMLPanel editorPanel;

    @UiField
    Button clickToEdit;

    @UiField
    HTMLPanel viewPanel;

    @UiField
    Label viewLabel;

    @UiField
    Style style;

    boolean editing = false;

    private Set<TestStatisticProxy> values;

    private final List<TestStatisticProxy> displayedList;

    public TestStatisticSetEditor() {
        initWidget(GWT.<Binder>create(Binder.class).createAndBindUi(this));
        Driver driver = GWT.<Driver>create(Driver.class);
        ListEditor<TestStatisticProxy, NameLabel> listEditor = ListEditor.of(new NameLabelSource());
        driver.initialize(listEditor);
        driver.display(new ArrayList<TestStatisticProxy>());
        displayedList = listEditor.getList();
        editing = false;
    }

    @UiHandler("add")
    public void addClicked(ClickEvent e) {
        if (picker.getValue() == null) {
            return;
        }
        for (TestStatisticProxy proxy : displayedList) {
            if (proxy.getLogin().equals(picker.getValue().getLogin())) {
                return;
            }
        }
        displayedList.add(picker.getValue());
        viewLabel.setText(makeFlatList(displayedList));
        addToTable(picker.getValue());
    }

    @UiHandler("clickToEdit")
    public void clickToEditClicked(ClickEvent e) {
        toggleEditorMode();
    }

    @Override
    public void flush() {
    }

    @Override
    public Set<ch.dreamweb.client.proxy.TestStatisticProxy> getValue() {
        if (values == null && displayedList.size() == 0) {
            return null;
        }
        return new HashSet<TestStatisticProxy>(displayedList);
    }

    public void onLoad() {
        makeEditable(false);
    }

    @Override
    public void onPropertyChange(String... strings) {
    }

    public void setAcceptableValues(Collection<ch.dreamweb.client.proxy.TestStatisticProxy> proxies) {
        picker.setAcceptableValues(proxies);
    }

    @Override
    public void setDelegate(EditorDelegate<java.util.Set<ch.dreamweb.client.proxy.TestStatisticProxy>> editorDelegate) {
    }

    @Override
    public void setValue(Set<ch.dreamweb.client.proxy.TestStatisticProxy> values) {
        this.values = values;
        makeEditable(editing = false);
        if (displayedList != null) {
            displayedList.clear();
            table.clear();
            if (values != null) {
                for (TestStatisticProxy e : values) {
                    displayedList.add(e);
                    addToTable(e);
                }
            }
        }
        viewLabel.setText(makeFlatList(values));
    }

    private void addToTable(TestStatisticProxy value) {
        addToTable(value, displayedList.size() - 1);
    }

    private void addToTable(TestStatisticProxy value, int index) {
        final int finalIndex = index;
        if (value != null) {
            table.setText(finalIndex, 0, ch.dreamweb.client.managed.ui.TestStatisticProxyRenderer.instance().render(value));
            Button removeEntryButton = new Button("x");
            removeEntryButton.addClickHandler(new ClickHandler() {

                public void onClick(final ClickEvent event) {
                    displayedList.remove(finalIndex);
                    table.removeRow(finalIndex);
                    viewLabel.setText(makeFlatList(displayedList));
                }
            });
            table.setWidget(finalIndex, 1, removeEntryButton);
        }
    }

    private void makeEditable(boolean editable) {
        if (editable) {
            editorPanel.setStylePrimaryName(style.editorPanelVisible());
            viewPanel.setStylePrimaryName(style.viewPanelHidden());
            clickToEdit.setText("Done");
        } else {
            editorPanel.setStylePrimaryName(style.editorPanelHidden());
            viewPanel.setStylePrimaryName(style.viewPanelVisible());
            clickToEdit.setText("Edit");
        }
    }

    private String makeFlatList(Collection<ch.dreamweb.client.proxy.TestStatisticProxy> values) {
        return CollectionRenderer.of(ch.dreamweb.client.managed.ui.TestStatisticProxyRenderer.instance()).render(values);
    }

    private void toggleEditorMode() {
        editing = !editing;
        makeEditable(editing);
    }

    interface Binder extends UiBinder<Widget, TestStatisticSetEditor> {
    }

    interface Driver extends RequestFactoryEditorDriver<List<TestStatisticProxy>, ListEditor<TestStatisticProxy, NameLabel>> {
    }

    class NameLabel extends Composite implements LeafValueEditor<TestStatisticProxy> {

        final Label loginEditor = new Label();

        private TestStatisticProxy proxy = null;

        public NameLabel() {
            this(null);
        }

        public NameLabel(EventBus eventBus) {
            initWidget(loginEditor);
        }

        public void setValue(TestStatisticProxy proxy) {
            this.proxy = proxy;
            loginEditor.setText(ch.dreamweb.client.managed.ui.TestStatisticProxyRenderer.instance().render(proxy));
        }

        @Override
        public TestStatisticProxy getValue() {
            return proxy;
        }
    }

    interface Style extends CssResource {

        String editorPanelHidden();

        String editorPanelVisible();

        String viewPanelHidden();

        String viewPanelVisible();
    }

    private class NameLabelSource extends EditorSource<NameLabel> {

        @Override
        public NameLabel create(int index) {
            NameLabel label = new NameLabel();
            addToTable(label.getValue(), index);
            return label;
        }

        @Override
        public void dispose(NameLabel subEditor) {
            subEditor.removeFromParent();
        }

        @Override
        public void setIndex(NameLabel editor, int index) {
            addToTable(editor.getValue(), index);
        }
    }
}
