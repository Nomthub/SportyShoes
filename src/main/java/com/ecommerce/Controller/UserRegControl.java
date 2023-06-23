package com.ecommerce.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.ecommerce.Entity.UserEntity;
import com.ecommerce.Repository.UserRepo;

@Controller
public class UserRegControl {
	 @Autowired
	    private UserRepo userRepository;
	    
	    @GetMapping("/userRegistration")
	    public String RegPage() {
	        return "userRegistration";
	    }
	    
	    @PostMapping("/saveUser")
	    public String saveUser(HttpServletRequest request, @ModelAttribute("form") UserEntity user , Model model){
	        userRepository.save(user); 
	        model.addAttribute("msg", "User Registered Sucessfully");
	        System.out.println("User Controller");
	        return "userRegistration";
	    }

}
