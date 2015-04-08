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
@Table(name = "anodegrounding")
@NamedQueries({
    @NamedQuery(name = "Anodegrounding.findAll", query = "SELECT a FROM Anodegrounding a")})
public class Anodegrounding implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "installdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date installdate;
    @Size(max = 45)
    @Column(name = "anodegroundelecttype")
    private String anodegroundelecttype;
    @Size(max = 45)
    @Column(name = "manufacturer")
    private String manufacturer;
    @Size(max = 45)
    @Column(name = "construction")
    private String construction;
    @Column(name = "electrodecount")
    private Integer electrodecount;
    @Column(name = "depth")
    private Integer depth;
    @Column(name = "distancetopipeline")
    private Integer distancetopipeline;
    @Column(name = "distancetoukz")
    private Integer distancetoukz;
    @Column(name = "lengthanodepole")
    private Integer lengthanodepole;
    @Column(name = "spreadingresist")
    private Integer spreadingresist;
    @Column(name = "graundresist")
    private Integer graundresist;
    @Size(max = 45)
    @Column(name = "bildingcompany")
    private String bildingcompany;
    @Size(max = 45)
    @Column(name = "notes")
    private String notes;
    
    @ManyToOne
    @JoinColumn(name = "id_protect")
    private Cathodicprotection idprotect;


    public Anodegrounding() {
    }

    public Anodegrounding(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstalldate() {
        return installdate;
    }

    public void setInstalldate(Date installdate) {
        this.installdate = installdate;
    }

    public String getAnodegroundelecttype() {
        return anodegroundelecttype;
    }

    public void setAnodegroundelecttype(String anodegroundelecttype) {
        this.anodegroundelecttype = anodegroundelecttype;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public Integer getElectrodecount() {
        return electrodecount;
    }

    public void setElectrodecount(Integer electrodecount) {
        this.electrodecount = electrodecount;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getDistancetopipeline() {
        return distancetopipeline;
    }

    public void setDistancetopipeline(Integer distancetopipeline) {
        this.distancetopipeline = distancetopipeline;
    }

    public Integer getDistancetoukz() {
        return distancetoukz;
    }

    public void setDistancetoukz(Integer distancetoukz) {
        this.distancetoukz = distancetoukz;
    }

    public Integer getLengthanodepole() {
        return lengthanodepole;
    }

    public void setLengthanodepole(Integer lengthanodepole) {
        this.lengthanodepole = lengthanodepole;
    }

    public Integer getSpreadingresist() {
        return spreadingresist;
    }

    public void setSpreadingresist(Integer spreadingresist) {
        this.spreadingresist = spreadingresist;
    }

    public Integer getGraundresist() {
        return graundresist;
    }

    public void setGraundresist(Integer graundresist) {
        this.graundresist = graundresist;
    }

    public String getBildingcompany() {
        return bildingcompany;
    }

    public void setBildingcompany(String bildingcompany) {
        this.bildingcompany = bildingcompany;
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
        if (!(object instanceof Anodegrounding)) {
            return false;
        }
        Anodegrounding other = (Anodegrounding) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Anodegrounding[ id=" + id + " ]";
    }
    
    public Cathodicprotection getCathodicprotection(){
        return idprotect;
    }
    
}
