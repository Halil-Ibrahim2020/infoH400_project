/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infoh400_projet.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author halil
 */
@Entity
@Table(name = "teachers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teachers.findAll", query = "SELECT t FROM Teachers t"),
    @NamedQuery(name = "Teachers.findById", query = "SELECT t FROM Teachers t WHERE t.id = :id"),
    @NamedQuery(name = "Teachers.findByName", query = "SELECT t FROM Teachers t WHERE t.name = :name"),
    @NamedQuery(name = "Teachers.findByProfession", query = "SELECT t FROM Teachers t WHERE t.profession = :profession"),
    @NamedQuery(name = "Teachers.findByRegistrationTime", query = "SELECT t FROM Teachers t WHERE t.registrationTime = :registrationTime")})
public class Teachers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "profession")
    private String profession;
    @Basic(optional = false)
    @Column(name = "registration_time")
    @Temporal(TemporalType.DATE)
    private Date registrationTime;
    @OneToMany(mappedBy = "idTeacher")
    private Collection<Courses> coursesCollection;
    @JoinColumn(name = "id_person", referencedColumnName = "id_person")
    @ManyToOne(optional = false)
    private Person idPerson;

    public Teachers() {
    }

    public Teachers(Integer id) {
        this.id = id;
    }

    public Teachers(Integer id, Date registrationTime) {
        this.id = id;
        this.registrationTime = registrationTime;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    @XmlTransient
    public Collection<Courses> getCoursesCollection() {
        return coursesCollection;
    }

    public void setCoursesCollection(Collection<Courses> coursesCollection) {
        this.coursesCollection = coursesCollection;
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
        if (!(object instanceof Teachers)) {
            return false;
        }
        Teachers other = (Teachers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoh400_projet.model.Teachers[ id=" + id + " ]";
    }
    
}
