package com.ecommerce.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.ecommerce.Entity.UserEntity;
import com.ecommerce.Repository.UserRepo;

@Controller
public class LoginPgControl {
	@Autowired
	private UserRepo userRepository;
	
	@GetMapping("/loginPage")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/loginUser")
	public String loginUser(@ModelAttribute("form") UserEntity user, Model model) {
		user = userRepository.findByLoginAndPassword(user.getLogin(),user.getPassword());
		if(user == null) {
			model.addAttribute("msg", "Invalid Login and Password");
			return "Login";
		}
		else {
			return "redirect:/WelcomePg";
		}
	}

}
