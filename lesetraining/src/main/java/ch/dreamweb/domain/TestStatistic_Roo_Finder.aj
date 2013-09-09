// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ch.dreamweb.domain;

import ch.dreamweb.domain.TestStatistic;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect TestStatistic_Roo_Finder {
    
    public static TypedQuery<TestStatistic> TestStatistic.findTestStatisticsByLogin(String login) {
        if (login == null || login.length() == 0) throw new IllegalArgumentException("The login argument is required");
        EntityManager em = TestStatistic.entityManager();
        TypedQuery<TestStatistic> q = em.createQuery("SELECT o FROM TestStatistic AS o WHERE o.login = :login", TestStatistic.class);
        q.setParameter("login", login);
        return q;
    }
    
}