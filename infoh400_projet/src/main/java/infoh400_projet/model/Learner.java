/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infoh400_projet.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author halil
 */
@Entity
@Table(name = "learner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Learner.findAll", query = "SELECT l FROM Learner l"),
    @NamedQuery(name = "Learner.findById", query = "SELECT l FROM Learner l WHERE l.id = :id"),
    @NamedQuery(name = "Learner.findByName", query = "SELECT l FROM Learner l WHERE l.name = :name"),
    @NamedQuery(name = "Learner.findByRegistrationTime", query = "SELECT l FROM Learner l WHERE l.registrationTime = :registrationTime"),
    @NamedQuery(name = "Learner.findByLevel", query = "SELECT l FROM Learner l WHERE l.level = :level")})
public class Learner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "registration_time")
    @Temporal(TemporalType.DATE)
    private Date registrationTime;
    @Basic(optional = false)
    @Column(name = "level")
    private String level;
    @JoinColumn(name = "id_person", referencedColumnName = "id_person")
    @ManyToOne(optional = false)
    private Person idPerson;

    public Learner() {
    }

    public Learner(Integer id) {
        this.id = id;
    }

    public Learner(Integer id, Date registrationTime, String level) {
        this.id = id;
        this.registrationTime = registrationTime;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Person getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Person idPerson) {
        this.idPerson = idPerson;
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
        if (!(object instanceof Learner)) {
            return false;
        }
        Learner other = (Learner) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoh400_projet.model.Learner[ id=" + id + " ]";
    }
    
}
