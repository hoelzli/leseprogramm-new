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
@RooJpaActiveRecord(finders = { "findTestStatisticsByLogin" })
public class TestStatistic {

    private String login;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date datetime;
    
    private Integer test;

    private Integer testround;

    private Integer spanscore;

    private Integer trialscore;

    private Integer trialscore_version;

    private String history;
}
