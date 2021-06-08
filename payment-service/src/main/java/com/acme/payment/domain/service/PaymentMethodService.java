
package com.acme.payment.domain.service;

import com.acme.payment.domain.model.PaymentMethod;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;


public interface PaymentMethodService {
//    Page<PaymentMethod> GetAllByAccountId(Long accountId, Pageable pageable);
//    PaymentMethod createPaymentMethod(PaymentMethod paymentMethod, Long accountId);
//

    PaymentMethod updatePaymentMethod(Long paymentMethodId,PaymentMethod resourceRequest);
    ResponseEntity<?> deletePaymentMethod(Long paymentMethodId);
    PaymentMethod getById(Long paymentMethodId);
}
