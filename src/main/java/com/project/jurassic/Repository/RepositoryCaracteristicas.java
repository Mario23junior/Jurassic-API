package com.project.jurassic.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.jurassic.Model.Caracteristicas;

@Repository
public interface RepositoryCaracteristicas extends JpaRepository<Caracteristicas, Long> {

     List<Caracteristicas> findByAlimentoIgnoreCaseContaining(String alimento);
}
