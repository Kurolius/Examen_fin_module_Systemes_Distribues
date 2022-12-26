package me.majbar.customerqueryservice.repositories;

import me.majbar.customerqueryservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
