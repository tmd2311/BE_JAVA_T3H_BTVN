package vn.com.t3h.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vn.com.t3h.dao.ProductionDao;
import vn.com.t3h.model.Product;

@Repository
public class ProducionDaoImpl implements ProductionDao {
  private JdbcTemplate jdbcTemplate;

  @Autowired
  public ProducionDaoImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }
  public List<Product> getAll() {
    String sql = "SELECT * FROM production";
    return jdbcTemplate.query(sql, new RowMapper<Product>() {
      @Override
      public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product model = new Product();
        model.setId(rs.getInt("id"));
        model.setTitle(rs.getString("title"));
        model.setAuthor(rs.getString("author"));
        model.setDescription(rs.getString("description"));
        model.setPublisher(rs.getString("publisher"));
        model.setPublicationYear(rs.getInt("publication_year"));
        model.setPageCount(rs.getInt("page_count"));
        model.setPrice(rs.getDouble("price"));
        model.setDiscountPercent(rs.getDouble("discount_percent"));
        model.setStockQuantity(rs.getInt("stock_quantity"));
        model.setCategory(rs.getString("category"));
        model.setImage(rs.getString("image_url"));
        return model;
      }
    });
  }

  public Product getProductById(int id) {
    String sql = "SELECT * FROM production WHERE id = ?";
    return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
      Product model = new Product();
      model.setId(rs.getInt("id"));
      model.setTitle(rs.getString("title"));
      model.setAuthor(rs.getString("author"));
      model.setDescription(rs.getString("description"));
      model.setPublisher(rs.getString("publisher"));
      model.setPublicationYear(rs.getInt("publication_year"));
      model.setPageCount(rs.getInt("page_count"));
      model.setPrice(rs.getDouble("price"));
      model.setDiscountPercent(rs.getDouble("discount_percent"));
      model.setStockQuantity(rs.getInt("stock_quantity"));
      model.setCategory(rs.getString("category"));
      model.setImage(rs.getString("image_url"));
      return model;
    });
  }
}
