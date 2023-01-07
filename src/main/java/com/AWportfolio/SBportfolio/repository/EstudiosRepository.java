package com.AWportfolio.SBportfolio.repository;

import com.AWportfolio.SBportfolio.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository <Estudios, Long>{    
}
