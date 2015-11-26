/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

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
 * @author Matt
 */
@Entity
@Table(name = "ShoppingCart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShoppingCart.findAll", query = "SELECT s FROM ShoppingCart s"),
    @NamedQuery(name = "ShoppingCart.findByCartID", query = "SELECT s FROM ShoppingCart s WHERE s.cartID = :cartID"),
    @NamedQuery(name = "ShoppingCart.findByItemCount", query = "SELECT s FROM ShoppingCart s WHERE s.itemCount = :itemCount"),
    @NamedQuery(name = "ShoppingCart.findByAddedGames", query = "SELECT s FROM ShoppingCart s WHERE s.addedGames = :addedGames"),
    @NamedQuery(name = "ShoppingCart.findByTotal", query = "SELECT s FROM ShoppingCart s WHERE s.total = :total")})
public class ShoppingCart implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cartID")
    private Integer cartID;
    @Column(name = "itemCount")
    private Integer itemCount;
    @Size(max = 250)
    @Column(name = "addedGames")
    private String addedGames;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Float total;
    @JoinColumn(name = "userID", referencedColumnName = "UserID")
    @ManyToOne
    private User userID;

    public ShoppingCart() {
    }

    public ShoppingCart(Integer cartID) {
        this.cartID = cartID;
    }

    public Integer getCartID() {
        return cartID;
    }

    public void setCartID(Integer cartID) {
        this.cartID = cartID;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public String getAddedGames() {
        return addedGames;
    }

    public void setAddedGames(String addedGames) {
        this.addedGames = addedGames;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
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
        hash += (cartID != null ? cartID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShoppingCart)) {
            return false;
        }
        ShoppingCart other = (ShoppingCart) object;
        if ((this.cartID == null && other.cartID != null) || (this.cartID != null && !this.cartID.equals(other.cartID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ShoppingCart[ cartID=" + cartID + " ]";
    }
    
}
