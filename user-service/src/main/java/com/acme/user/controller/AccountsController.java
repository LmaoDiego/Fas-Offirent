package com.acme.user.controller;

import com.acme.user.domain.model.Account;
import com.acme.user.domain.service.AccountService;
import com.acme.user.resource.*;
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
public class AccountsController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ModelMapper mapper;

    @Operation(summary = "Get all accounts",description = "Get all accounts",tags = {"accounts"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get all accounts",content =@Content(mediaType = "application/json") )
    })
    @GetMapping("/accounts")
    public List<AccountResource> getAllAccounts(Pageable pageable){

        Page<Account> resourcePage = accountService.getAllAccounts(pageable);
        List<AccountResource> resources = resourcePage.getContent()
                .stream().map(this::convertToResource).collect(Collectors.toList());
        //return new PageImpl<>(resources,pageable,resources.size());
        return resources;

    }

    @Operation(summary = "Get Account by Id", description = "Get Account for given Id", tags = {"accounts"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Account returned", content = @Content(mediaType = "application/json"))
    })
    @GetMapping("/accounts/{id}")
    public AccountResource getAccountById(@PathVariable(name = "id") Long accountId){
        return convertToResource(accountService.getAccountById(accountId));
    }

    @Operation(summary = "Create Account ",description = "Enter a new Account at register",tags = {"accounts"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Enter a new account for given information",content =@Content(mediaType = "application/json") )
    })
    @PostMapping("/accounts")
    public AccountResource createAccount(@Valid @RequestBody SaveAccountResource resource){
        return convertToResource(
                accountService.createAccount(convertToEntity(resource)));
    }

    @Operation(summary = "Update Accounts",description = "Update an Account",tags = {"accounts"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Change the account information",content =@Content(mediaType = "application/json") )
    })
    @PutMapping("/accounts/{accountId}")
    public  AccountResource activeOffice(@PathVariable(name = "accountId")Long accountId,@Valid @RequestBody SaveAccountResource resource){
        return  convertToResource(accountService.updateAccount(accountId,convertToEntity(resource)));
    }

    private Account convertToEntity(SaveAccountResource resource){return  mapper.map(resource, Account.class);}

    private AccountResource convertToResource(Account entity){return  mapper.map(entity,AccountResource.class);}
}