package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;
import com.easybytes.accounts.entity.Accounts;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public interface IAccountsService {
    /**
    * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
    /**
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(@RequestParam String mobileNumber);
    /**
     * @param customerId - Input Customer id
     * @return Accounts
     */
    Optional<Accounts> findByCustomerId(Long customerId);
    /**
     * @param customerDto - Input Customer Dto
     * @return boolean
     */
    boolean updateAccount(CustomerDto customerDto);
    /**
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
