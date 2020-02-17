package onlineBusTicket.repositories;

import onlineBusTicket.config.HibernateUtil;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;


public abstract class CRUDRepository<Entity extends Object, ID extends Serializable> {
    private Session session = HibernateUtil.getSession();

    protected abstract Class<Entity> getEntityClass();

    public Session getSession() {
        return session;
    }

    public Entity save(Entity entity) {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();

        return entity;
    }

    public Entity update(Entity entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();

        return entity;
    }

    public List<Entity> findAll () {
        session.beginTransaction();
        List<Entity> itemsList = session.createQuery("from " + getEntityClass().getName()).list();
        session.getTransaction().commit();

        return itemsList;
    }

    public List<Entity> findAll(String attribute, String value) {
        session.beginTransaction();
        List<Entity> entities = session.createQuery("from " + getEntityClass().getName() + " where " + attribute + "=:" + value).list();
        session.getTransaction().commit();

        return entities;
    }

    public Entity findByAttribute (String attribute, String value) {
        session.beginTransaction();
        Entity entity = (Entity)session.createQuery("from " + getEntityClass().getName() + " where " + attribute + "=:" + value).getSingleResult();
        session.getTransaction().commit();

        return entity;
    }
}


