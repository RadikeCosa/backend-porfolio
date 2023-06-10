package com.radike.porfolio.repository;


import com.radike.porfolio.model.HeaderLogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderLogoRepository extends JpaRepository<HeaderLogo, Long> {
        }
