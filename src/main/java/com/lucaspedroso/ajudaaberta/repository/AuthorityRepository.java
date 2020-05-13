package com.lucaspedroso.ajudaaberta.repository;

import com.lucaspedroso.ajudaaberta.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
