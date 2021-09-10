package com.app.repository;

import com.app.model.Customer;
import com.app.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
    Note findNoteById(Long id);
}
