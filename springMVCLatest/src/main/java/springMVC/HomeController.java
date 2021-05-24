package springMVC;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sun.tools.javac.util.List;

import springMVC.Dao.Registration;
import springMVC.Model.RegistrationDetails;

@Controller
class HomeController {
	
	
	@Autowired
	private Registration registration;

	@RequestMapping(value ="/")
	public String loadHomePage() {
		return "Home.jsp";
	}
	
	@RequestMapping(value ="/Home")
	public String HomePage() {
		return "Home.jsp";
	}
	
	@RequestMapping(value ="/Register")
	public String register(@ModelAttribute("registrationDetails") RegistrationDetails registrationDetails, Model mv) {
		mv.addAttribute("RegistrationDetails", registrationDetails);
		registration.addDetails(registrationDetails);
		return "RegisteredStudentDetails.jsp";
	}
	
	@RequestMapping(value ="/Success")
	public String ShowDetails(Model mv) {
		ArrayList<RegistrationDetails> list =(ArrayList<RegistrationDetails>) registration.getDetails();
		mv.addAttribute("Details", list);
		
		System.out.println("list"+list);
		mv.addAttribute("Header", "Hi I am header");
		
		return "Success.jsp";
	}
	
	
	
}
