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
@Table(name = "cathodicconverter")
@NamedQueries({
    @NamedQuery(name = "Cathodicconverter.findAll", query = "SELECT c FROM Cathodicconverter c")})
public class Cathodicconverter implements Serializable {
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
    @Column(name = "convertertype")
    private String convertertype;
    @Column(name = "releasedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date releasedate;
    @Size(max = 45)
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "serialnumber")
    private Integer serialnumber;
    @Size(max = 45)
    @Column(name = "protectcovertype")
    private String protectcovertype;
    @Column(name = "power")
    private Integer power;
    @Column(name = "voltage")
    private Integer voltage;
    @Column(name = "amperage")
    private Integer amperage;
    @Size(max = 45)
    @Column(name = "telecontrol")
    private String telecontrol;
    @Size(max = 45)
    @Column(name = "jointprotection")
    private String jointprotection;
    @Size(max = 5)
    @Column(name = "emeter")
    private String emeter;
    @Column(name = "eresistance")
    private Integer eresistance;
    @Column(name = "notes")
    private String notes; 

    @ManyToOne
    @JoinColumn(name = "id_protect")
    private Cathodicprotection idprotect;

    public Cathodicconverter() {
    }

    public Cathodicconverter(Integer id) {
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

    public String getConvertertype() {
        return convertertype;
    }

    public void setConvertertype(String convertertype) {
        this.convertertype = convertertype;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getProtectcovertype() {
        return protectcovertype;
    }

    public void setProtectcovertype(String protectcovertype) {
        this.protectcovertype = protectcovertype;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getAmperage() {
        return amperage;
    }

    public void setAmperage(Integer amperage) {
        this.amperage = amperage;
    }

    public String getTelecontrol() {
        return telecontrol;
    }

    public void setTelecontrol(String telecontrol) {
        this.telecontrol = telecontrol;
    }

    public String getJointprotection() {
        return jointprotection;
    }

    public void setJointprotection(String jointprotection) {
        this.jointprotection = jointprotection;
    }

    public String getEmeter() {
        return emeter;
    }

    public void setEmeter(String emeter) {
        this.emeter = emeter;
    }

    public Integer getEresistance() {
        return eresistance;
    }

    public void setEresistance(Integer eresistance) {
        this.eresistance = eresistance;
    }
    
    public String getNotes() {
        return notes;
    }

    public void setNotes(String emeter) {
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
        if (!(object instanceof Cathodicconverter)) {
            return false;
        }
        Cathodicconverter other = (Cathodicconverter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cathodicconverter[ id=" + id + " ]";
    }
   
    public Cathodicprotection getCathodicprotection(){
        return idprotect;
    }

}
