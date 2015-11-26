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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "WishList")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WishList.findAll", query = "SELECT w FROM WishList w"),
    @NamedQuery(name = "WishList.findByWishID", query = "SELECT w FROM WishList w WHERE w.wishID = :wishID"),
    @NamedQuery(name = "WishList.findByItemCount", query = "SELECT w FROM WishList w WHERE w.itemCount = :itemCount"),
    @NamedQuery(name = "WishList.findByName", query = "SELECT w FROM WishList w WHERE w.name = :name"),
    @NamedQuery(name = "WishList.findByWishedGames", query = "SELECT w FROM WishList w WHERE w.wishedGames = :wishedGames")})
public class WishList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "wishID")
    private Integer wishID;
    @Column(name = "itemCount")
    private Integer itemCount;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "wishedGames")
    private String wishedGames;
    @JoinColumn(name = "userID", referencedColumnName = "UserID")
    @ManyToOne
    private User userID;

    public WishList() {
    }

    public WishList(Integer wishID) {
        this.wishID = wishID;
    }

    public Integer getWishID() {
        return wishID;
    }

    public void setWishID(Integer wishID) {
        this.wishID = wishID;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWishedGames() {
        return wishedGames;
    }

    public void setWishedGames(String wishedGames) {
        this.wishedGames = wishedGames;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wishID != null ? wishID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WishList)) {
            return false;
        }
        WishList other = (WishList) object;
        if ((this.wishID == null && other.wishID != null) || (this.wishID != null && !this.wishID.equals(other.wishID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.WishList[ wishID=" + wishID + " ]";
    }
    
}
