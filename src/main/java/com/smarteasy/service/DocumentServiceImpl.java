package com.smarteasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarteasy.dao.DocumentDAO;
import com.smarteasy.model.Document;

@Service
public class DocumentServiceImpl implements DocumentService {

  private DocumentDAO documentDAO;

  @Autowired
  public DocumentServiceImpl(DocumentDAO documentDAO) {
    this.documentDAO = documentDAO;
  }

  @Override
  @Transactional
  public List<Document> findAll() {
    return documentDAO.findAll();
  }

  @Override
  @Transactional
  public Document findById(Integer id) {
    return documentDAO.findById(id);
  }

  @Override
  @Transactional
  public void save(Document document) {
    documentDAO.save(document);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
    documentDAO.deleteById(id);
  }

}
