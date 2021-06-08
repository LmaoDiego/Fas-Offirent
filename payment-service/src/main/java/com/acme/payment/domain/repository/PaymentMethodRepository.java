package com.acme.payment.domain.repository;

import com.acme.payment.domain.model.PaymentMethod;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
//    Optional<Page<PaymentMethod>> findByAccountId(Long accountId, Pageable pageable);
}
