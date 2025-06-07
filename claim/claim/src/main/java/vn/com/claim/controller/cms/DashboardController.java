package vn.com.claim.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
  @GetMapping("/cms/dashboard")
  public String home() {
    return "cms/dashboard";
  }
}
