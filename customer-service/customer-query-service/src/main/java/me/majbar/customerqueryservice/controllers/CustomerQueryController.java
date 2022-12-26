package me.majbar.customerqueryservice.controllers;

import me.majbar.commonapi.*;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@Slf4j
@RequestMapping("/query")
@CrossOrigin("*")
public class CustomerQueryController {
    private QueryGateway queryGateway;

    public CustomerQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping("/customers/all")
    public CompletableFuture<List<CustomerDTO>> allCustomers(){
        return queryGateway.query(
                new GetAllCustomerQuery()
                , ResponseTypes.multipleInstancesOf(CustomerDTO.class)
        );
    }

    @GetMapping("/customer/byId/{id}")
    public CompletableFuture<CustomerDTO> geCustomerById(@PathVariable String id){
        return queryGateway.query(
                new CustomerById(id)
                , ResponseTypes.instanceOf(CustomerDTO.class)
        );
    }

}
