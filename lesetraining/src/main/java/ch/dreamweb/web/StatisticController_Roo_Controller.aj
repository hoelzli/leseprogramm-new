// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ch.dreamweb.web;

import ch.dreamweb.domain.Statistic;
import ch.dreamweb.web.StatisticController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect StatisticController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String StatisticController.create(@Valid Statistic statistic, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, statistic);
            return "statistics/create";
        }
        uiModel.asMap().clear();
        statistic.persist();
        return "redirect:/statistics/" + encodeUrlPathSegment(statistic.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String StatisticController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Statistic());
        return "statistics/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String StatisticController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("statistic", Statistic.findStatistic(id));
        uiModel.addAttribute("itemId", id);
        return "statistics/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String StatisticController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("statistics", Statistic.findStatisticEntries(firstResult, sizeNo));
            float nrOfPages = (float) Statistic.countStatistics() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("statistics", Statistic.findAllStatistics());
        }
        addDateTimeFormatPatterns(uiModel);
        return "statistics/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String StatisticController.update(@Valid Statistic statistic, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, statistic);
            return "statistics/update";
        }
        uiModel.asMap().clear();
        statistic.merge();
        return "redirect:/statistics/" + encodeUrlPathSegment(statistic.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String StatisticController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Statistic.findStatistic(id));
        return "statistics/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String StatisticController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Statistic statistic = Statistic.findStatistic(id);
        statistic.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/statistics";
    }
    
    void StatisticController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("statistic_datetime_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    void StatisticController.populateEditForm(Model uiModel, Statistic statistic) {
        uiModel.addAttribute("statistic", statistic);
        addDateTimeFormatPatterns(uiModel);
    }
    
    String StatisticController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}