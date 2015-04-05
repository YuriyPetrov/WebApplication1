/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author profi
 */
@Entity
@Table(name = "expluatationcontrol")
@NamedQueries({
    @NamedQuery(name = "Expluatationcontrol.findAll", query = "SELECT e FROM Expluatationcontrol e")})
public class Expluatationcontrol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "dateofcontroll")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateofcontroll;
    @Column(name = "beforeamperage")
    private Integer beforeamperage;
    @Column(name = "beforevoltage")
    private Integer beforevoltage;
    @Column(name = "beforeamperageon")
    private Integer beforeamperageon;
    @Column(name = "beforevoltageon")
    private Integer beforevoltageon;
    @Column(name = "afteramperage")
    private Integer afteramperage;
    @Column(name = "aftervoltage")
    private Integer aftervoltage;
    @Column(name = "afteramperageon")
    private Integer afteramperageon;
    @Column(name = "aftervoltageon")
    private Integer aftervoltageon;
    @Column(name = "counterkv")
    private Integer counterkv;
    @Column(name = "countertime")
    private Integer countertime;
    @Column(name = "ukzstilltime")
    private Integer ukzstilltime;
    @Size(max = 45)
    @Column(name = "notes")
    private String notes;
    
    @ManyToOne
    @JoinColumn(name = "id_protect")
    private Cathodicprotection idprotect;
    

    public Expluatationcontrol() {
    }

    public Expluatationcontrol(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateofcontroll() {
        return dateofcontroll;
    }

    public void setDateofcontroll(Date dateofcontroll) {
        this.dateofcontroll = dateofcontroll;
    }

    public Integer getBeforeamperage() {
        return beforeamperage;
    }

    public void setBeforeamperage(Integer beforeamperage) {
        this.beforeamperage = beforeamperage;
    }

    public Integer getBeforevoltage() {
        return beforevoltage;
    }

    public void setBeforevoltage(Integer beforevoltage) {
        this.beforevoltage = beforevoltage;
    }

    public Integer getBeforeamperageon() {
        return beforeamperageon;
    }

    public void setBeforeamperageon(Integer beforeamperageon) {
        this.beforeamperageon = beforeamperageon;
    }

    public Integer getBeforevoltageon() {
        return beforevoltageon;
    }

    public void setBeforevoltageon(Integer beforevoltageon) {
        this.beforevoltageon = beforevoltageon;
    }

    public Integer getAfteramperage() {
        return afteramperage;
    }

    public void setAfteramperage(Integer afteramperage) {
        this.afteramperage = afteramperage;
    }

    public Integer getAftervoltage() {
        return aftervoltage;
    }

    public void setAftervoltage(Integer aftervoltage) {
        this.aftervoltage = aftervoltage;
    }

    public Integer getAfteramperageon() {
        return afteramperageon;
    }

    public void setAfteramperageon(Integer afteramperageon) {
        this.afteramperageon = afteramperageon;
    }

    public Integer getAftervoltageon() {
        return aftervoltageon;
    }

    public void setAftervoltageon(Integer aftervoltageon) {
        this.aftervoltageon = aftervoltageon;
    }

    public Integer getCounterkv() {
        return counterkv;
    }

    public void setCounterkv(Integer counterkv) {
        this.counterkv = counterkv;
    }

    public Integer getCountertime() {
        return countertime;
    }

    public void setCountertime(Integer countertime) {
        this.countertime = countertime;
    }

    public Integer getUkzstilltime() {
        return ukzstilltime;
    }

    public void setUkzstilltime(Integer ukzstilltime) {
        this.ukzstilltime = ukzstilltime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expluatationcontrol)) {
            return false;
        }
        Expluatationcontrol other = (Expluatationcontrol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Expluatationcontrol[ id=" + id + " ]";
    }
    
    public Cathodicprotection getCathodicprotection(){
        return idprotect;
    }
}
