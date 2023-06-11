package com.javad.thirdappspringboot.service;

import com.javad.thirdappspringboot.model.Customer;
import com.javad.thirdappspringboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
    public void delete(int id){
        customerRepository.deleteById(id);
    }

    public Customer Update(int id,Customer customer){
        Customer customerData=customerRepository.findById(id).get();

        if (customer.getFirstname()!=null)
            customerData.setFirstname(customer.getFirstname());
        if (customer.getLastname()!=null)
            customerData.setLastname(customer.getLastname());
         if (customer.getAge()>0)
           customerData.setAge(customer.getAge());
        // TODO: 06/10/2023 |ask dr Sadeghi
         if (customer.getPhone()>0)
            customerData.setPhone(customer.getPhone());
        return customerRepository.save(customerData);

    }
}
