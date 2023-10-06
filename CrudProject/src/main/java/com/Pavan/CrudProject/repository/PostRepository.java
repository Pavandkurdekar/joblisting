package com.Pavan.CrudProject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Pavan.CrudProject.model.JobModel;

import java.util.List;

public interface PostRepository extends JpaRepository<JobModel, Long> {
    List<JobModel> findByProfileContainingIgnoreCase(String profile);
}

