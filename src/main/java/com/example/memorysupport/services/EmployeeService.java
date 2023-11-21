package com.example.memorysupport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    // More Code Here


    // -------------

    // Spring will create the implementation
    // for this class
    // and will inject the bean here (proxy)
    @Autowired
    private AddressClient addressClient;

    public EmployeeResponse getEmployeeById(int id) {

        // More Code Here

        // Using FeignClient
        ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressResponse(addressResponse.getBody());

        return employeeResponse;
    }
}