package vn.com.t3h.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.com.t3h.model.Product;
import vn.com.t3h.service.ProductionService;
import vn.com.t3h.service.impl.ProducionServiceImpl;

/*
@Controller dùng để đánh dấu cho sping biết đây là tầng controller cần được tạo Bean trong spring container
trả về html qua thư viện jsp
 */



/*
Baen trong spring : tất cả các object thay vì dev phải chủ động tạo đối tượng bằng từ khóa new
thì khi sử dụng các anotation
-> spring sẽ tự động sử dụng cơ chế IOC để tạo ra các bean và sử dụng cơ chế DI tiêm các bean vào trong class


  -@Component, @Service, @Controller,....
  tất cả các anotation này về mặt bản chất là giống nhau vì đều cùng đánh giấu giúp tạo ra bean
  + @Controller tầng để tiếp nhận dữ request và trả về respone
  +@Service : tầng sử lí logic để giao tiếp với tằng repository
  +@Repository ; tầng thực hiện thao tác dữ liệu, giao tiếp với db
 */
@Controller
public class HomeController {
  private final ProductionService producService;

  @Autowired
  public HomeController(ProductionService producService) {
    this.producService = producService;
  }

  @RequestMapping("/home")
  public String hello(Model model) {
    List<Product> list = producService.getProducts();
    model.addAttribute("listProduct", list);
    return "home";
  }
}


