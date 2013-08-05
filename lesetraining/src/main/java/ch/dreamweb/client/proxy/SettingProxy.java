// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package ch.dreamweb.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "ch.dreamweb.domain.Setting", locator = "ch.dreamweb.server.locator.SettingLocator")
@RooGwtProxy(value = "ch.dreamweb.domain.Setting", readOnly = { "version", "id" }, scaffold = true)
public interface SettingProxy extends EntityProxy {

    abstract Long getId();

    abstract String getLogin();

    abstract void setLogin(String login);

    abstract String getPassword();

    abstract void setPassword(String password);

    abstract Integer getTestday();

    abstract void setTestday(Integer testday);

    abstract Integer getTestnumber();

    abstract void setTestnumber(Integer testnumber);

    abstract Integer getTestround();

    abstract void setTestround(Integer testround);

    abstract String getSchoolclass();

    abstract void setSchoolclass(String schoolclass);

    abstract String getSoundfiletype();

    abstract void setSoundfiletype(String soundfiletype);

    abstract Integer getTest1record();

    abstract void setTest1record(Integer test1record);

    abstract Integer getTest2record();

    abstract void setTest2record(Integer test2record);

    abstract Integer getTest3record();

    abstract void setTest3record(Integer test3record);

    abstract Integer getTest4record();

    abstract void setTest4record(Integer test4record);

    abstract Integer getTest5record();

    abstract void setTest5record(Integer test5record);

    abstract Integer getTest6record();

    abstract void setTest6record(Integer test6record);

    abstract Boolean getEnabletest();

    abstract void setEnabletest(Boolean enabletest);

    abstract Boolean getEnabletraining();

    abstract void setEnabletraining(Boolean enabletraining);

    abstract Boolean getT1done();

    abstract void setT1done(Boolean t1done);

    abstract Boolean getT2done();

    abstract void setT2done(Boolean t2done);

    abstract Boolean getT3done();

    abstract void setT3done(Boolean t3done);

    abstract Boolean getT4done();

    abstract void setT4done(Boolean t4done);

    abstract Integer getT1tottime();

    abstract void setT1tottime(Integer t1tottime);

    abstract Integer getT2tottime();

    abstract void setT2tottime(Integer t2tottime);

    abstract Integer getT3tottime();

    abstract void setT3tottime(Integer t3tottime);

    abstract Integer getT4tottime();

    abstract void setT4tottime(Integer t4tottime);

    abstract Integer getT1stepsperlevel();

    abstract void setT1stepsperlevel(Integer t1stepsperlevel);

    abstract Integer getT2stepsperlevel();

    abstract void setT2stepsperlevel(Integer t2stepsperlevel);

    abstract Integer getT3stepsperlevel();

    abstract void setT3stepsperlevel(Integer t3stepsperlevel);

    abstract Integer getT4stepsperlevel();

    abstract void setT4stepsperlevel(Integer t4stepsperlevel);

    abstract Integer getT1level();

    abstract void setT1level(Integer t1level);

    abstract Integer getT2level();

    abstract void setT2level(Integer t2level);

    abstract Integer getT3level();

    abstract void setT3level(Integer t3level);

    abstract Integer getT4level();

    abstract void setT4level(Integer t4level);

    abstract Integer getT1step();

    abstract void setT1step(Integer t1step);

    abstract Integer getT2step();

    abstract void setT2step(Integer t2step);

    abstract Integer getT3step();

    abstract void setT3step(Integer t3step);

    abstract Integer getT4step();

    abstract void setT4step(Integer t4step);

    abstract Integer getT1highestdaylevel();

    abstract void setT1highestdaylevel(Integer t1highestdaylevel);

    abstract Integer getT2highestdaylevel();

    abstract void setT2highestdaylevel(Integer t2highestdaylevel);

    abstract Integer getT3highestdaylevel();

    abstract void setT3highestdaylevel(Integer t3highestdaylevel);

    abstract Integer getT4highestdaylevel();

    abstract void setT4highestdaylevel(Integer t4highestdaylevel);

    abstract Integer getT1highestlevel();

    abstract void setT1highestlevel(Integer t1highestlevel);

    abstract Integer getT2highestlevel();

    abstract void setT2highestlevel(Integer t2highestlevel);

    abstract Integer getT3highestlevel();

    abstract void setT3highestlevel(Integer t3highestlevel);

    abstract Integer getT4highestlevel();

    abstract void setT4highestlevel(Integer t4highestlevel);

    abstract Integer getT1highestdaystep();

    abstract void setT1highestdaystep(Integer t1highestdaystep);

    abstract Integer getT2highestdaystep();

    abstract void setT2highestdaystep(Integer t2highestdaystep);

    abstract Integer getT3highestdaystep();

    abstract void setT3highestdaystep(Integer t3highestdaystep);

    abstract Integer getT4highestdaystep();

    abstract void setT4highestdaystep(Integer t4highestdaystep);

    abstract Integer getT1higheststep();

    abstract void setT1higheststep(Integer t1higheststep);

    abstract Integer getT2higheststep();

    abstract void setT2higheststep(Integer t2higheststep);

    abstract Integer getT3higheststep();

    abstract void setT3higheststep(Integer t3higheststep);

    abstract Integer getT4higheststep();

    abstract void setT4higheststep(Integer t4higheststep);

    abstract Integer getT1prestime();

    abstract void setT1prestime(Integer t1prestime);

    abstract Integer getT2prestime();

    abstract void setT2prestime(Integer t2prestime);

    abstract Integer getT3prestime();

    abstract void setT3prestime(Integer t3prestime);

    abstract Integer getT4prestime();

    abstract void setT4prestime(Integer t4prestime);

    abstract Integer getVersion();
}
