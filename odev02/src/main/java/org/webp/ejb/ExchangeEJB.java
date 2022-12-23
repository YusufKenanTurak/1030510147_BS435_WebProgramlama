package org.webp.ejb;
import org.webp.EXCHANGE;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class ExchangeEJB {

    @PersistenceContext
    private EntityManager em;

    public EXCHANGE createExchange(EXCHANGE exchange) {
        em.persist(exchange);
        return exchange;
    }

    public EXCHANGE findExchangeById(int id) {
        return em.find(EXCHANGE.class, id);
    }

    public EXCHANGE updateExchange(EXCHANGE exchange) {
        return em.merge(exchange);
    }

    public void deleteExchange(int id) {
        EXCHANGE exchange = findExchangeById(id);
        em.remove(exchange);
    }

    public List<EXCHANGE> findExchangesByCountry(String country) {
        TypedQuery<EXCHANGE> query = em.createQuery("SELECT e FROM EXCHANGE e WHERE e.country = :country", EXCHANGE.class);
        query.setParameter("country", country);
        return query.getResultList();
    }
}
