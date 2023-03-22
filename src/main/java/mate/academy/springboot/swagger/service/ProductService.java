package mate.academy.springboot.swagger.service;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.springboot.swagger.entity.Product;
import org.springframework.data.domain.PageRequest;

public interface ProductService {
    Product save(Product product);

    void delete(Long id);

    Product findById(Long id);

    List<Product> findAllByPriceBetween(BigDecimal from, BigDecimal to, PageRequest pageRequest);

    List<Product> findAll(PageRequest pageRequest);
}
