package com.project.jurassic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.jurassic.Model.ClassificacaoCientifica;
 
@Repository
public interface RepositoryClassificacaoCientifica extends JpaRepository<ClassificacaoCientifica, Long>{

}
