// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ch.dreamweb.domain;

import ch.dreamweb.domain.Statistic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Statistic_Roo_Jpa_Entity {
    
    declare @type: Statistic: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Statistic.id;
    
    @Version
    @Column(name = "version")
    private Integer Statistic.version;
    
    public Long Statistic.getId() {
        return this.id;
    }
    
    public void Statistic.setId(Long id) {
        this.id = id;
    }
    
    public Integer Statistic.getVersion() {
        return this.version;
    }
    
    public void Statistic.setVersion(Integer version) {
        this.version = version;
    }
    
}
