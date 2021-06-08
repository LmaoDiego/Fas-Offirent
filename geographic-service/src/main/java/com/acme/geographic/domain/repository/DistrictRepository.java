package com.acme.geographic.domain.repository;

import com.acme.geographic.domain.model.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository<District, Long> {
    Page<District> findAllByDepartmentId(Long departmentId, Pageable pageable);
}
