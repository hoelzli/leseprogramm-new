// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ch.dreamweb.domain;

import ch.dreamweb.domain.Setting;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Setting_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Setting.entityManager;
    
    public static final EntityManager Setting.entityManager() {
        EntityManager em = new Setting().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    @Transactional
    public static long Setting.countSettings() {
        return findAllSettings().size();
    }
    
    @Transactional
    public static List<Setting> Setting.findAllSettings() {
        return entityManager().createQuery("SELECT o FROM Setting o", Setting.class).getResultList();
    }
    
    @Transactional
    public static Setting Setting.findSetting(Long id) {
        if (id == null) return null;
        return entityManager().find(Setting.class, id);
    }
    
    @Transactional
    public static List<Setting> Setting.findSettingEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Setting o", Setting.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void Setting.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Setting.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Setting attached = Setting.findSetting(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Setting.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Setting.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Setting Setting.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Setting merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
