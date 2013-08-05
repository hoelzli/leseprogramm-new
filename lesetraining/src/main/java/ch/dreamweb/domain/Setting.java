package ch.dreamweb.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooSerializable
@RooJpaActiveRecord(finders = { "findSettingsByLogin" })
public class Setting {

    private String login;
    
    private String password;

    private Integer testday;

    private Integer testnumber;

    private Integer testround;

    private String schoolclass;
    
    private String soundfiletype;

    private Integer test1record;

    private Integer test2record;

    private Integer test3record;

    private Integer test4record;

    private Integer test5record;

    private Integer test6record;

    private Boolean enabletest;

    private Boolean enabletraining;

    private Boolean t1done;

    private Boolean t2done;

    private Boolean t3done;

    private Boolean t4done;

    private Integer t1tottime;

    private Integer t2tottime;

    private Integer t3tottime;

    private Integer t4tottime;

    private Integer t1stepsperlevel;

    private Integer t2stepsperlevel;

    private Integer t3stepsperlevel;

    private Integer t4stepsperlevel;

    private Integer t1level;

    private Integer t2level;

    private Integer t3level;

    private Integer t4level;

    private Integer t1step;

    private Integer t2step;

    private Integer t3step;

    private Integer t4step;

    private Integer t1highestdaylevel;

    private Integer t2highestdaylevel;

    private Integer t3highestdaylevel;

    private Integer t4highestdaylevel;

    private Integer t1highestlevel;

    private Integer t2highestlevel;

    private Integer t3highestlevel;

    private Integer t4highestlevel;

    private Integer t1highestdaystep;

    private Integer t2highestdaystep;

    private Integer t3highestdaystep;

    private Integer t4highestdaystep;

    private Integer t1higheststep;

    private Integer t2higheststep;

    private Integer t3higheststep;

    private Integer t4higheststep;

    private Integer t1prestime;

    private Integer t2prestime;

    private Integer t3prestime;

    private Integer t4prestime;

}
