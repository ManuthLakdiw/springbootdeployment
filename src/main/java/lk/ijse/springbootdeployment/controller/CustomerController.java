package lk.ijse.springbootdeployment.controller;

import lk.ijse.springbootdeployment.dto.ApiResponse;
import lk.ijse.springbootdeployment.dto.CustomerDto;
import lk.ijse.springbootdeployment.entity.Customer;
import lk.ijse.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author manuthlakdiv
 * @email manuthlakdiv2006.com
 * @project springbootdeployment
 * @github https://github.com/ManuthLakdiw
 */

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public String getCustomer() {
        return "Customer";
    }

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<CustomerDto>> saveCustomer(@RequestBody CustomerDto customer) {
      return new ResponseEntity<>(new ApiResponse<>(
              200,
              "Customer saved successfully",
              customerService.saveCustomer(customer)
      ), HttpStatus.CREATED);
    }
}
