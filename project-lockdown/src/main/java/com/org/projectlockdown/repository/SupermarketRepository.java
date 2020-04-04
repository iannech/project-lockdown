package com.org.projectlockdown.repository;

import com.org.projectlockdown.model.Supermarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SupermarketRepository extends JpaRepository<Supermarket, Long> {

    boolean existsByBranchName(@Param("branchName") String branchName);

    Optional<Supermarket> findByBranchName(String branchName);
}
