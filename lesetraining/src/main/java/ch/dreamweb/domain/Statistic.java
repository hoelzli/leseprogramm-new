package ch.dreamweb.domain;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooSerializable
@RooJpaActiveRecord(finders = { "findStatisticsByLogin" })
public class Statistic {

    private String login;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date datetime;
    
    private Integer trainingday;

    private Integer unit;

    private Integer rightexercices;

    private Integer wrongexercices;

    private Integer levelsum;

    private Integer levelsumright;

    private Float averagelevelright;

    private Integer highestlevelindex;

    private Integer stepsperlevel;

    private String history;
}
