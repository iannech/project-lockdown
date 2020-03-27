package com.org.projectlockdown.repository;

import com.org.projectlockdown.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    boolean existsByPhoneNumber(@Param("phoneNumber") long phoneNumber);
}
