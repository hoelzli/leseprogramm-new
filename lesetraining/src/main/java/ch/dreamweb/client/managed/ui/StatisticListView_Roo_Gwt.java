// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.managed.ui;

import ch.dreamweb.client.proxy.StatisticProxy;
import ch.dreamweb.client.scaffold.place.AbstractProxyListView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import java.util.HashSet;
import java.util.Set;

public abstract class StatisticListView_Roo_Gwt extends AbstractProxyListView<StatisticProxy> {

    @UiField
    CellTable<StatisticProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("id");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("login");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getLogin());
            }
        }, "Login");
        paths.add("datetime");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getDatetime());
            }
        }, "Datetime");
        paths.add("trainingday");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getTrainingday());
            }
        }, "Trainingday");
        paths.add("unit");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getUnit());
            }
        }, "Unit");
        paths.add("rightexercices");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getRightexercices());
            }
        }, "Rightexercices");
        paths.add("wrongexercices");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getWrongexercices());
            }
        }, "Wrongexercices");
        paths.add("levelsum");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getLevelsum());
            }
        }, "Levelsum");
        paths.add("levelsumright");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getLevelsumright());
            }
        }, "Levelsumright");
        paths.add("averagelevelright");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Float> renderer = new AbstractRenderer<java.lang.Float>() {

                public String render(java.lang.Float obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getAveragelevelright());
            }
        }, "Averagelevelright");
        paths.add("highestlevelindex");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getHighestlevelindex());
            }
        }, "Highestlevelindex");
        paths.add("stepsperlevel");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getStepsperlevel());
            }
        }, "Stepsperlevel");
        paths.add("history");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getHistory());
            }
        }, "History");
        paths.add("version");
        table.addColumn(new TextColumn<StatisticProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(StatisticProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}
