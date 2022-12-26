package me.majbar.customerqueryservice.mappers;


import me.majbar.customerqueryservice.entities.Customer;
import me.majbar.commonapi.*;
import me.majbar.commonapi.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMappers {
    Customer fromCustomerDto(CustomerDTO customerDTO);
    CustomerDTO fromCustomer(Customer customer);
    Customer fromCustomerEditDto(CustomerDTO customer);

}
