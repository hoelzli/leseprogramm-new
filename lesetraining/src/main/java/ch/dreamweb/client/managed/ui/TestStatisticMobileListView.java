package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.proxy.TestStatisticProxy;
import ch.dreamweb.client.scaffold.ScaffoldMobileApp;
import ch.dreamweb.client.scaffold.ui.MobileProxyListView;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TestStatisticMobileListView extends TestStatisticMobileListView_Roo_Gwt {

    private static ch.dreamweb.client.managed.ui.TestStatisticMobileListView instance;

    public TestStatisticMobileListView() {
        super("New TestStatistic", new CellRenderer());
        init();
    }

    public static ch.dreamweb.client.managed.ui.TestStatisticMobileListView instance() {
        if (instance == null) {
            instance = new TestStatisticMobileListView();
        }
        return instance;
    }

    public String[] getPaths() {
        return paths.toArray(new String[paths.size()]);
    }

    private static class CellRenderer extends AbstractSafeHtmlRenderer<TestStatisticProxy> {

        private final String dateStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().dateProp();

        private final String secondaryStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().secondaryProp();

        private final Renderer<String> primaryRenderer = new AbstractRenderer<String>() {

            public String render(java.lang.String obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        private final Renderer<String> secondaryRenderer = new AbstractRenderer<String>() {

            public String render(java.lang.String obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        private final Renderer<Date> dateRenderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

        @Override
        public SafeHtml render(TestStatisticProxy value) {
            if (value == null) {
                return SafeHtmlUtils.EMPTY_SAFE_HTML;
            }
            SafeHtmlBuilder sb = new SafeHtmlBuilder();
            if (value.getLogin() != null) {
                sb.appendEscaped(primaryRenderer.render(value.getLogin()));
            }
            sb.appendHtmlConstant("<div style=\"position:relative;\">");
            sb.appendHtmlConstant("<div class=\"" + secondaryStyle + "\">");
            if (value.getHistory() != null) {
                sb.appendEscaped(secondaryRenderer.render(value.getHistory()));
            }
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("<div class=\"" + dateStyle + "\">");
            if (value.getDatetime() != null) {
                sb.appendEscaped(dateRenderer.render(value.getDatetime()));
            }
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("</div>");
            return sb.toSafeHtml();
        }
    }
}
