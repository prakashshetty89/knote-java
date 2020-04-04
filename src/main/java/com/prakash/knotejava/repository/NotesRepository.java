package com.prakash.knotejava.repository;

import com.prakash.knotejava.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Prakash Shetty
 */
public interface NotesRepository extends MongoRepository<Note, String> {
}
