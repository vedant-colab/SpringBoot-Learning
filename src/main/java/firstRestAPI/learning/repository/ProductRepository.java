package firstRestAPI.learning.repository;

import firstRestAPI.learning.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
