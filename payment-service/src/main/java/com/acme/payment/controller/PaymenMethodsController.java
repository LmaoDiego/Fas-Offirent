package com.acme.payment.controller;

import com.acme.payment.domain.model.PaymentMethod;
import com.acme.payment.domain.service.PaymentMethodService;
import com.acme.payment.resource.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PaymenMethodsController {

    @Autowired
    PaymentMethodService paymentMethodService;

    @Autowired
    private ModelMapper mapper;

    @Operation(summary = "Get payment method by id",description = "Get PaymentMethod by given Id",tags = {"payment-methods"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get PaymentMethod by given Id",content =@Content(mediaType = "application/json") )
    })
    @GetMapping("/payment-methods/{paymentMethodId}")
    public PaymentMethodResource getPaymentMethodById(@PathVariable(name = "paymentMethodId") Long paymentMethodId){

        PaymentMethod paymentMethod = paymentMethodService.getById(paymentMethodId);
        return convertToResource(paymentMethod);
    }

//    @Operation(summary = "Get all Payment Methods by Account",description = "Get all payment methods by given AccountId",tags = {"accounts"})
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Get all reservations by given AccountId",content =@Content(mediaType = "application/json") )
//    })
//    @GetMapping("/accounts/{accountId}/payment-methods")
//    public List<PaymentMethodResource> getAllPaymentMethodsByAccountId(
//            @PathVariable(name = "accountId") Long accountId, Pageable pageable){
//
//        Page<PaymentMethod> paymentMethodPage = paymentMethodService.GetAllByAccountId(accountId,pageable);
//        List<PaymentMethodResource> resources = paymentMethodPage.getContent().stream().map(
//                this::convertToResource).collect(Collectors.toList());
//        //return new PageImpl<>(resources,pageable,resources.size());
//        return resources;
//    }
//
//    @Operation(summary = "Create PaymentMethod ",description = "Enter a new Payment Method at register",tags = {"accounts"})
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Enter a new payment method for given information",content =@Content(mediaType = "application/json") )
//    })
//    @PostMapping("/accounts/{accountId}/payment-methods")
//    public PaymentMethodResource createPaymentMethod(@PathVariable(name = "accountId") Long accountId, @Valid @RequestBody SavePaymentMethodResource resource){
//        return convertToResource(
//                paymentMethodService.createPaymentMethod(convertToEntity(resource),accountId));
//    }

    @Operation(summary = "Update Payment", description = "Update Payment by Id", tags = {"payment-methods"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Update Payment-method by Id", content = @Content(mediaType = "application/json"))
    })
    @PutMapping("/payment-methods/{id}")
    public PaymentMethodResource updatePaymenMethod(@PathVariable(name = "id")   Long paymentId,@Valid @RequestBody SavePaymentMethodResource resource){
        return convertToResource(this.paymentMethodService.updatePaymentMethod(paymentId,this.convertToEntity(resource)));
    }


    private PaymentMethod convertToEntity(SavePaymentMethodResource resource){return  mapper.map(resource, PaymentMethod.class);}

    private PaymentMethodResource convertToResource(PaymentMethod entity){return  mapper.map(entity,PaymentMethodResource.class);}
}
