package com.ecommerce.Controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.ecommerce.Entity.OrderEntity;
import com.ecommerce.Repository.OrderRepo;

@Controller
public class OrderControl {
	 @Autowired
	    private OrderRepo orderRepository;
	    
	    @GetMapping("/userRegPage")
	    public String OrderPage() {
	        return "userOrder";
	    }
	    
	    @PostMapping("/saveProduct")
	    public String saveUser(HttpServletRequest request, @ModelAttribute("form") OrderEntity order , Model model){
	        orderRepository.save(order); 
	        model.addAttribute("msg", "User added Sucessfully");
	        System.out.println("Order Controller");
	        return "orderMade";
	    }

}
