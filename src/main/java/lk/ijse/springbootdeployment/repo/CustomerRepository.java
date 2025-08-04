package lk.ijse.springbootdeployment.repo;

import lk.ijse.springbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author manuthlakdiv
 * @email manuthlakdiv2006.com
 * @project springbootdeployment
 * @github https://github.com/ManuthLakdiw
 */

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long>{
}
