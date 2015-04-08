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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "summaryinfo")
@NamedQueries({
    @NamedQuery(name = "Summaryinfo.findAll", query = "SELECT s FROM Summaryinfo s")})
public class Summaryinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "id_protect")
    private Cathodicprotection idProtect;
    @Size(max = 45)
    @Column(name = "pipeline_name")
    private String pipelineName;
    @Size(max = 45)
    @Column(name = "protect_type")
    private String protectType;
    @Size(max = 45)
    @Column(name = "geo")
    private String geo;
    @Column(name = "issuedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issuedate;
    @Size(max = 45)
    @Column(name = "project_company")
    private String projectCompany;
    @Size(max = 45)
    @Column(name = "montage_company")
    private String montageCompany;
    @Size(max = 45)
    @Column(name = "tenant")
    private String tenant;
    @Lob
    @Column(name = "map_img")
    private byte[] mapImg;

    public Summaryinfo() {
    }

    public Summaryinfo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cathodicprotection getIdProtect() {
        return idProtect;
    }

    public void setIdProtect(Cathodicprotection idProtect) {
        this.idProtect = idProtect;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public String getProjectCompany() {
        return projectCompany;
    }

    public void setProjectCompany(String projectCompany) {
        this.projectCompany = projectCompany;
    }

    public String getMontageCompany() {
        return montageCompany;
    }

    public void setMontageCompany(String montageCompany) {
        this.montageCompany = montageCompany;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public byte[] getMapImg() {
        return mapImg;
    }

    public void setMapImg(byte[] mapImg) {
        this.mapImg = mapImg;
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
        if (!(object instanceof Summaryinfo)) {
            return false;
        }
        Summaryinfo other = (Summaryinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Summaryinfo[ id=" + id + " ]";
    }
    
}
