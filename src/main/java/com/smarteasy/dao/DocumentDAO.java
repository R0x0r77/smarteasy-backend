package com.smarteasy.dao;

import java.util.List;

import com.smarteasy.model.Document;

public interface DocumentDAO {

  List<Document> findAll();

  Document findById(Integer id);

  void save(Document document);

  void deleteById(Integer id);
}
