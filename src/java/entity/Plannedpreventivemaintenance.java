/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    /*
   
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
@Table(name = "plannedpreventivemaintenance")
@NamedQueries({
    @NamedQuery(name = "Plannedpreventivemaintenance.findAll", query = "SELECT p FROM Plannedpreventivemaintenance p")})
public class Plannedpreventivemaintenance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "idpassport")
    private Integer idpassport;
    @Column(name = "startdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "enddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @Size(max = 45)
    @Column(name = "typemaintrance")
    private String typemaintrance;
    @Size(max = 200)
    @Column(name = "description")
    private String description;
    @Column(name = "amperagea")
    private Integer amperagea;
    @Column(name = "amperageb")
    private Integer amperageb;
    @Column(name = "potencialeon")
    private Integer potencialeon;
    @Column(name = "potencialeoff")
    private Integer potencialeoff;
    @Column(name = "resistanode")
    private Integer resistanode;
    @Column(name = "resistprotect")
    private Integer resistprotect;
    @Size(max = 45)
    @Column(name = "sign")
    private String sign;
    
    @ManyToOne
    @JoinColumn(name = "id_protect")
    private Cathodicprotection idprotect;

    public Plannedpreventivemaintenance() {
    }

    public Plannedpreventivemaintenance(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdpassport() {
        return idpassport;
    }

    public void setIdpassport(Integer idpassport) {
        this.idpassport = idpassport;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getTypemaintrance() {
        return typemaintrance;
    }

    public void setTypemaintrance(String typemaintrance) {
        this.typemaintrance = typemaintrance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmperagea() {
        return amperagea;
    }

    public void setAmperagea(Integer amperagea) {
        this.amperagea = amperagea;
    }

    public Integer getAmperageb() {
        return amperageb;
    }

    public void setAmperageb(Integer amperageb) {
        this.amperageb = amperageb;
    }

    public Integer getPotencialeon() {
        return potencialeon;
    }

    public void setPotencialeon(Integer potencialeon) {
        this.potencialeon = potencialeon;
    }

    public Integer getPotencialeoff() {
        return potencialeoff;
    }

    public void setPotencialeoff(Integer potencialeoff) {
        this.potencialeoff = potencialeoff;
    }

    public Integer getResistanode() {
        return resistanode;
    }

    public void setResistanode(Integer resistanode) {
        this.resistanode = resistanode;
    }

    public Integer getResistprotect() {
        return resistprotect;
    }

    public void setResistprotect(Integer resistprotect) {
        this.resistprotect = resistprotect;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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
        if (!(object instanceof Plannedpreventivemaintenance)) {
            return false;
        }
        Plannedpreventivemaintenance other = (Plannedpreventivemaintenance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Plannedpreventivemaintenance[ id=" + id + " ]";
    }
    
    public Cathodicprotection getCathodicprotection(){
        return idprotect;
    }
    
}
