/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.api;

import heps.db.naming.comman.tools.EmProvider;
import heps.db.naming.entity.TSignal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Lvhuihui
 */
public class TSignalAPI {
    public static EntityManager em = EmProvider.getInstance().getEntityManagerFactory().createEntityManager();
    
     public List<TSignal> getAllTSignal(){
        Query q;
        q=em.createNamedQuery("TSignal.findAll");
        return q.getResultList();
    }
}
