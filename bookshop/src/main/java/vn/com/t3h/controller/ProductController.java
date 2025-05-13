package vn.com.t3h.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.com.t3h.model.Product;
import vn.com.t3h.service.ProductionService;


@Controller
public class ProductController {
  private final ProductionService producService;

  @Autowired
  public ProductController(ProductionService producService) {
    this.producService = producService;
  }

  @GetMapping("/production-detail")
  public String detail(@RequestParam("id") int id, Model model) {
    Product product = producService.getProduct(id);
    model.addAttribute("product", product);
    return "production-detail";
  }
}
