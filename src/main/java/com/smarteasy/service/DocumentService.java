package com.smarteasy.service;

import java.util.List;

import com.smarteasy.model.Document;

public interface DocumentService {

  List<Document> findAll();

  Document findById(Integer id);

  void save(Document document);

  void deleteById(Integer id);
}
