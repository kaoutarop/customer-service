package org.elhachemykaoutar.customerservice.Dao.repository;

import org.elhachemykaoutar.customerservice.Dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
