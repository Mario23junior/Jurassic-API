package com.project.jurassic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.jurassic.Model.Dinossauro;

@Repository
public interface RepositoryDinossauro extends JpaRepository<Dinossauro, Long> {

}
