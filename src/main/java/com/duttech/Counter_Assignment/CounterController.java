package com.duttech.Counter_Assignment;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String initCounter(HttpSession session, Model model) {
		
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
			
		}
			
		else {
			Integer displayCount = (Integer) session.getAttribute("count");
			session.setAttribute("count", displayCount +1);
//			or
//			session.setAttribute("count", (Integer) session.getAttribute("count") +1);
		}
			
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			
		}
		Integer displayCount = (Integer) session.getAttribute("count");
		model.addAttribute("count", displayCount);
		return "counter.jsp";
		
		
	}
			
			
		
			
}
		
	
	
	
