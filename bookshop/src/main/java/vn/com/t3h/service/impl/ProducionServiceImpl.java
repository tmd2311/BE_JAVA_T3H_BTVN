package vn.com.t3h.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import vn.com.t3h.dao.ProductionDao;
import vn.com.t3h.model.Product;
import vn.com.t3h.service.ProductionService;
@Service
public class ProducionServiceImpl implements ProductionService {
  private ProductionDao productionDao;

  public ProducionServiceImpl(ProductionDao productionDao) {
    this.productionDao = productionDao;
  }

  @Override
  public List<Product> getProducts() {
    return productionDao.getAll();
  }

  @Override
  public Product getProduct(int id) {
    return productionDao.getProductById(id);
  }
}
