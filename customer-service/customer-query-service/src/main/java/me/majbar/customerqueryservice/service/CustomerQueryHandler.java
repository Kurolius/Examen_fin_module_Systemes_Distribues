package me.majbar.customerqueryservice.service;


import me.majbar.commonapi.*;
import me.majbar.customerqueryservice.entities.Customer;
import me.majbar.customerqueryservice.mappers.CustomerMappers;
import me.majbar.customerqueryservice.repositories.CustomerRepository;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerQueryHandler {
    private CustomerRepository customerRepository;
    private CustomerMappers customerMappers;


    public CustomerQueryHandler(CustomerRepository customerRepository, CustomerMappers customerMappers) {
        this.customerRepository = customerRepository;
        this.customerMappers = customerMappers;
    }

    @QueryHandler
    public List<CustomerDTO>  handler(GetAllCustomerQuery query){
        List<Customer> allCustomers = customerRepository.findAll();
        return allCustomers.stream().map(customer->customerMappers.fromCustomer(customer))
                .collect(Collectors.toList());
    }

    @QueryHandler
    public CustomerDTO  handler(CustomerById query){
        Customer customer=customerRepository.findById(query.getCustomerId())
                .orElseThrow(()->new RuntimeException("Customer Not found"));
        CustomerDTO customerResponseDTO=customerMappers.fromCustomer(customer);

        return customerResponseDTO;
    }
    @QueryHandler
    public List<EventDataResponseDTO> handle(SubscribeToEventsQuery query) {
        return new ArrayList<>();
    }

}
