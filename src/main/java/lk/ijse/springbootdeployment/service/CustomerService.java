package lk.ijse.springbootdeployment.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lk.ijse.springbootdeployment.dto.CustomerDto;
import lk.ijse.springbootdeployment.entity.Customer;
import lk.ijse.springbootdeployment.repo.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author manuthlakdiv
 * @email manuthlakdiv2006.com
 * @project springbootdeployment
 * @github https://github.com/ManuthLakdiw
 */

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ObjectMapper objectMapper;


    public CustomerDto saveCustomer(CustomerDto customer) {
        Customer customerEntity = objectMapper.convertValue(customer, Customer.class);
        Customer saveCustomerEntity = customerRepository.save(customerEntity);
        return objectMapper.convertValue(saveCustomerEntity, CustomerDto.class);
    }
}
