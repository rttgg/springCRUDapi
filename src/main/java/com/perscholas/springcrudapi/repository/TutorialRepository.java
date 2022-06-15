package com.perscholas.springcrudapi.repository;

import com.perscholas.springcrudapi.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    // Tutorial → Entity type and Long --> primary key
    //   findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}
