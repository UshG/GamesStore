/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.WishList;
import javax.ejb.Stateless;

/**
 *
 * @author Ush-Work
 */
@Stateless
public class WishListFacade extends AbstractFacade<WishList> {

    public WishListFacade() {
        super(WishList.class);
    }
    
}
