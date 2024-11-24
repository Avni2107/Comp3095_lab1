package ca.gbc.orderservice.repository;

import ca.gbc.orderservice.model.Order; // Import your entity class
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

