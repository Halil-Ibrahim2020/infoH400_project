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
@Table(name = "courses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Courses.findAll", query = "SELECT c FROM Courses c"),
    @NamedQuery(name = "Courses.findById", query = "SELECT c FROM Courses c WHERE c.id = :id"),
    @NamedQuery(name = "Courses.findByName", query = "SELECT c FROM Courses c WHERE c.name = :name"),
    @NamedQuery(name = "Courses.findByCreatedAt", query = "SELECT c FROM Courses c WHERE c.createdAt = :createdAt"),
    @NamedQuery(name = "Courses.findByUpdatedAt", query = "SELECT c FROM Courses c WHERE c.updatedAt = :updatedAt"),
    @NamedQuery(name = "Courses.findByCreator", query = "SELECT c FROM Courses c WHERE c.creator = :creator")})
public class Courses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Basic(optional = false)
    @Column(name = "creator")
    private String creator;
    @JoinColumn(name = "id_teacher", referencedColumnName = "id")
    @ManyToOne
    private Teachers idTeacher;

    public Courses() {
    }

    public Courses(Integer id) {
        this.id = id;
    }

    public Courses(Integer id, Date createdAt, Date updatedAt, String creator) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.creator = creator;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Teachers getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Teachers idTeacher) {
        this.idTeacher = idTeacher;
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
        if (!(object instanceof Courses)) {
            return false;
        }
        Courses other = (Courses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoh400_projet.model.Courses[ id=" + id + " ]";
    }
    
}
