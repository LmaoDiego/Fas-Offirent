package com.acme.geographic.domain.service;

import com.acme.geographic.domain.model.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface DistrictService {
    District getDistrictById(Long districtId);
    Page<District> getAllDistricts(Pageable pageable);
    Page<District> getAllDistrictsByDepartmentId(Long departmentId, Pageable pageable);
    District createDistrict(District district, Long departmentId);
    ResponseEntity<?> deleteDistrict(Long districtId);
}
