/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.ShoppingCart;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Matt
 */
@Stateless
public class ShoppingCartFacade extends AbstractFacade<ShoppingCart> {
    @PersistenceContext(unitName = "web-jpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShoppingCartFacade() {
        super(ShoppingCart.class);
    }
    
}
