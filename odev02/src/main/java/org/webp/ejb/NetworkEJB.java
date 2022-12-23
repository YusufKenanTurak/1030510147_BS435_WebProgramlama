package org.webp.ejb;
import org.webp.NETWORK;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class NetworkEJB {

    @PersistenceContext
    private EntityManager entityManager;

    public NETWORK getNetworkById(long id) {
        return entityManager.find(NETWORK.class, id);
    }

    public List<NETWORK> getAllNetworks() {
        return entityManager.createQuery("SELECT n FROM NETWORK n", NETWORK.class).getResultList();
    }
}
