package com.smarteasy.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smarteasy.model.Document;

@Repository
public class DocumentDAOImpl implements DocumentDAO {

  private EntityManager entityManager;

  @Autowired
  public DocumentDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  public List<Document> findAll() {

    Session session = entityManager.unwrap(Session.class);

    Query<Document> query = session.createQuery("from Document", Document.class);

    return query.getResultList();
  }

  @Override
  public Document findById(Integer id) {

    Session session = entityManager.unwrap(Session.class);

    return session.get(Document.class, id);
  }

  @Override
  public void save(Document document) {

    Session session = entityManager.unwrap(Session.class);

    session.saveOrUpdate(document);
  }

  @Override
  public void deleteById(Integer id) {

    Session session = entityManager.unwrap(Session.class);

    Query<Document> query = session.createQuery("from Document where id=:id", Document.class).setParameter("id", id);

    query.executeUpdate();
  }

}
