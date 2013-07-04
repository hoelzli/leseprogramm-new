package ch.dreamweb.web;

import ch.dreamweb.domain.Setting;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/settings")
@Controller
@RooWebScaffold(path = "settings", formBackingObject = Setting.class)
public class SettingController {
}
