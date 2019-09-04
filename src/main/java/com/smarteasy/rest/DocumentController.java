package com.smarteasy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.smarteasy.model.Document;
import com.smarteasy.service.DocumentService;

@RestController()
@RequestMapping("/documents")
// @CrossOrigin(origins = "http://localhost:4200")
public class DocumentController {

  private DocumentService documentService;

  @Autowired
  public DocumentController(DocumentService documentService) {
    this.documentService = documentService;
  }

  // @PreAuthorize("hasAnyRole('ADMIN')")
  @GetMapping()
  public ResponseEntity<List<Document>> findAll() {

    List<Document> list = documentService.findAll();

    HttpStatus status;

    if (list.size() == 0)
      status = HttpStatus.NOT_FOUND;
    else
      status = HttpStatus.OK;

    return new ResponseEntity<>(list, status);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Document> getDocument(@PathVariable Integer id) {

    Document document = documentService.findById(id);

    HttpStatus status;

    if (document == null)
      status = HttpStatus.NOT_FOUND;
    else
      status = HttpStatus.OK;

    return new ResponseEntity<>(document, status);
  }

  @PostMapping()
  public ResponseEntity<Void> addDocument(@RequestBody Document document) {

    document.setId(null);
    documentService.save(document);

    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping()
  public ResponseEntity<Document> updateDocument(@RequestBody Document document) {

    documentService.save(document);

    return new ResponseEntity<>(document, HttpStatus.OK);
  }

}
