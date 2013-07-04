package ch.dreamweb.server.locator;

import ch.dreamweb.domain.Setting;
import com.google.web.bindery.requestfactory.shared.Locator;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;

@RooGwtLocator("ch.dreamweb.domain.Setting")
@Component
public class SettingLocator extends Locator<Setting, Long> {

    public Setting create(Class<? extends ch.dreamweb.domain.Setting> clazz) {
        return new Setting();
    }

    public Setting find(Class<? extends ch.dreamweb.domain.Setting> clazz, Long id) {
        return Setting.findSetting(id);
    }

    public Class<ch.dreamweb.domain.Setting> getDomainType() {
        return Setting.class;
    }

    public Long getId(Setting setting) {
        return setting.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Setting setting) {
        return setting.getVersion();
    }
}
