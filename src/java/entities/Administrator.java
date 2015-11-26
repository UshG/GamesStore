/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ush-Work
 */
@Entity
@Table(name = "Administrator")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrator.findAll", query = "SELECT a FROM Administrator a"),
    @NamedQuery(name = "Administrator.findByUserName", query = "SELECT a FROM Administrator a WHERE a.userName = :userName"),
    @NamedQuery(name = "Administrator.findByName", query = "SELECT a FROM Administrator a WHERE a.name = :name"),
    @NamedQuery(name = "Administrator.findByPassword", query = "SELECT a FROM Administrator a WHERE a.password = :password")})
public class Administrator implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "UserName")
    private String userName;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "password")
    private String password;

    public Administrator() {
    }

    public Administrator(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Administrator[ userName=" + userName + " ]";
    }
    
}
