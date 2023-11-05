package com.digital.checkpoint.repository;

import com.digital.checkpoint.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTitle(String title);
}
