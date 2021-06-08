package com.acme.geographic.domain.repository;

import com.acme.geographic.domain.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    //Page<Departament> findByCountryId (Long countryId, Pageable pageable);
}
