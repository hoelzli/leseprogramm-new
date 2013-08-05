package ch.dreamweb.web;

import ch.dreamweb.domain.Statistic;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/statistics")
@Controller
@RooWebScaffold(path = "statistics", formBackingObject = Statistic.class)
public class StatisticController {
}
