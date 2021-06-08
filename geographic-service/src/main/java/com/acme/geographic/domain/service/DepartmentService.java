package com.acme.geographic.domain.service;

import com.acme.geographic.domain.model.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface DepartmentService {
    Department getDepartmentById(Long departmentId);
    Page<Department> getAllDepartments(Pageable pageable);

    Department createDepartment(Department department);
    ResponseEntity<?> deleteDepartment(Long departmentId);
}
