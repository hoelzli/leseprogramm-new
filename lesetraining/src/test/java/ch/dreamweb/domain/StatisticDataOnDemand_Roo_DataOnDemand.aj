// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ch.dreamweb.domain;

import ch.dreamweb.domain.Statistic;
import ch.dreamweb.domain.StatisticDataOnDemand;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Component;

privileged aspect StatisticDataOnDemand_Roo_DataOnDemand {
    
    declare @type: StatisticDataOnDemand: @Component;
    
    private Random StatisticDataOnDemand.rnd = new SecureRandom();
    
    private List<Statistic> StatisticDataOnDemand.data;
    
    public Statistic StatisticDataOnDemand.getNewTransientStatistic(int index) {
        Statistic obj = new Statistic();
        setAveragelevelright(obj, index);
        setDatetime(obj, index);
        setHighestlevelindex(obj, index);
        setHistory(obj, index);
        setLevelsum(obj, index);
        setLevelsumright(obj, index);
        setLogin(obj, index);
        setRightexercices(obj, index);
        setStepsperlevel(obj, index);
        setTrainingday(obj, index);
        setUnit(obj, index);
        setWrongexercices(obj, index);
        return obj;
    }
    
    public void StatisticDataOnDemand.setAveragelevelright(Statistic obj, int index) {
        Float averagelevelright = new Integer(index).floatValue();
        obj.setAveragelevelright(averagelevelright);
    }
    
    public void StatisticDataOnDemand.setDatetime(Statistic obj, int index) {
        Date datetime = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setDatetime(datetime);
    }
    
    public void StatisticDataOnDemand.setHighestlevelindex(Statistic obj, int index) {
        Integer highestlevelindex = new Integer(index);
        obj.setHighestlevelindex(highestlevelindex);
    }
    
    public void StatisticDataOnDemand.setHistory(Statistic obj, int index) {
        String history = "history_" + index;
        obj.setHistory(history);
    }
    
    public void StatisticDataOnDemand.setLevelsum(Statistic obj, int index) {
        Integer levelsum = new Integer(index);
        obj.setLevelsum(levelsum);
    }
    
    public void StatisticDataOnDemand.setLevelsumright(Statistic obj, int index) {
        Integer levelsumright = new Integer(index);
        obj.setLevelsumright(levelsumright);
    }
    
    public void StatisticDataOnDemand.setLogin(Statistic obj, int index) {
        String login = "login_" + index;
        obj.setLogin(login);
    }
    
    public void StatisticDataOnDemand.setRightexercices(Statistic obj, int index) {
        Integer rightexercices = new Integer(index);
        obj.setRightexercices(rightexercices);
    }
    
    public void StatisticDataOnDemand.setStepsperlevel(Statistic obj, int index) {
        Integer stepsperlevel = new Integer(index);
        obj.setStepsperlevel(stepsperlevel);
    }
    
    public void StatisticDataOnDemand.setTrainingday(Statistic obj, int index) {
        Integer trainingday = new Integer(index);
        obj.setTrainingday(trainingday);
    }
    
    public void StatisticDataOnDemand.setUnit(Statistic obj, int index) {
        Integer unit = new Integer(index);
        obj.setUnit(unit);
    }
    
    public void StatisticDataOnDemand.setWrongexercices(Statistic obj, int index) {
        Integer wrongexercices = new Integer(index);
        obj.setWrongexercices(wrongexercices);
    }
    
    public Statistic StatisticDataOnDemand.getSpecificStatistic(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Statistic obj = data.get(index);
        Long id = obj.getId();
        return Statistic.findStatistic(id);
    }
    
    public Statistic StatisticDataOnDemand.getRandomStatistic() {
        init();
        Statistic obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Statistic.findStatistic(id);
    }
    
    public boolean StatisticDataOnDemand.modifyStatistic(Statistic obj) {
        return false;
    }
    
    public void StatisticDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Statistic.findStatisticEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Statistic' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Statistic>();
        for (int i = 0; i < 10; i++) {
            Statistic obj = getNewTransientStatistic(i);
            try {
                obj.persist();
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
