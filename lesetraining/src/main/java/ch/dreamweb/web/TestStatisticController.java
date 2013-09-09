package ch.dreamweb.web;

import ch.dreamweb.domain.TestStatistic;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/teststatistics")
@Controller
@RooWebScaffold(path = "teststatistics", formBackingObject = TestStatistic.class)
public class TestStatisticController {
}
