package org.elhachemykaoutar.customerservice.web;

import org.elhachemykaoutar.customerservice.Dao.entities.Customer;
import org.elhachemykaoutar.customerservice.Dao.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customerList")
public class CustomerRestController {
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerRestController(CustomerRepository customerRepository)
    {
        this.customerRepository=customerRepository;
    }
    @GetMapping
    public List<Customer> customerList()
    {
         return customerRepository.findAll();
    }
    @GetMapping("{id}")
    public Customer customerById(@PathVariable(name = "id") Long id)
    { Customer customer=customerRepository.findById(id).get();
         return customer;
    }
    @PostMapping
    public Customer saveCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }
    // question10
}
