// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ch.dreamweb.domain;

import ch.dreamweb.domain.Setting;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Setting_Roo_Finder {
    
    public static TypedQuery<Setting> Setting.findSettingsByLogin(String login) {
        if (login == null || login.length() == 0) throw new IllegalArgumentException("The login argument is required");
        EntityManager em = Setting.entityManager();
        TypedQuery<Setting> q = em.createQuery("SELECT o FROM Setting AS o WHERE o.login = :login", Setting.class);
        q.setParameter("login", login);
        return q;
    }
    
}
