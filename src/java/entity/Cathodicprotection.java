/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author profi
 */
@Entity
@Table(name = "cathodicprotection")
@NamedQueries({
    @NamedQuery(name = "Cathodicprotection.findAll", query = "SELECT c FROM Cathodicprotection c")})
public class Cathodicprotection implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pass")
    private int idPass;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    
    @OneToMany(mappedBy="idprotect")
    private Set<Cathodicconverter> cathodicprotection;
    @OneToMany(mappedBy="idprotect")
    private Set<Anodegrounding> anode;
    @OneToMany(mappedBy="idprotect")
    private Set<Expluatationcontrol> expcontrol;
    @OneToMany(mappedBy="idprotect")
    private Set<Plannedpreventivemaintenance> maintrance;
    
    

    public Cathodicprotection() {
    }

    public Cathodicprotection(Integer id) {
        this.id = id;
    }

    public Cathodicprotection(Integer id, int idPass) {
        this.id = id;
        this.idPass = idPass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPass() {
        return idPass;
    }

    public void setIdPass(int idPass) {
        this.idPass = idPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(object instanceof Cathodicprotection)) {
            return false;
        }
        Cathodicprotection other = (Cathodicprotection) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cathodicprotection[ id=" + id + " ]";
    }
    
    public Set<Cathodicconverter> getCathodicconverter(){
        return cathodicprotection;
    }
    public Set<Anodegrounding> getAnodegrounding(){
        return anode;
    }
    public Set<Expluatationcontrol> getExpluatationcontrol(){
        return expcontrol;
    }
    public Set<Plannedpreventivemaintenance> getPlannedpreventivemaintenance(){
        return maintrance;
    }
    
}
