/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Game;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ush-Work
 */
@Stateless
public class GameFacade extends AbstractFacade<Game> {
    @PersistenceContext(unitName = "GamesStorePUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameFacade() {
        super(Game.class);
    }
    
}
