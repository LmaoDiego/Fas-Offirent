//TODO
//vere que hay de comer me avisas al wtsp
package com.acme.user.domain.repository;

import com.acme.user.domain.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

}