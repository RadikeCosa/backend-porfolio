package com.radike.porfolio.repository;

import com.radike.porfolio.model.SocialLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialLinksRepository extends JpaRepository<SocialLinks, Long> {
}
