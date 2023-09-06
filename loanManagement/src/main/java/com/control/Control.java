package com.control;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.model.CustomerdetailsEntity;

import com.model.LoanApplicantsEntity;
import com.model.LoannomEntity;
import com.service.Service;
@Controller
public class Control {
	
	Service s;
	@Autowired
	Control(Service s)
	{
		this.s=s;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		s.first();
		return "home";
	}
	@RequestMapping(value = "/Customerdetails", method = RequestMethod.GET)
	public String Customer(CustomerdetailsEntity cd) {
		
		s.customer(cd);
		return "home";
	}
	@RequestMapping(value = "/LoanApplicants", method = RequestMethod.GET)
	public String applicants(LoanApplicantsEntity lp) {
		
		s.applicaints(lp);
		return "home";
	}
	@RequestMapping(value = "/Loannom", method = RequestMethod.GET)
	public String nominee(LoannomEntity ln) {
		System.out.println(ln.getLn_relation());
		s.nominee(ln);
		return "home";
	}
	@RequestMapping(value = "/preview", method = RequestMethod.GET)
	public String preview(CustomerdetailsEntity cd,Model m) {
		System.out.println("preview");
		m.addAttribute("id", cd);
		return "preview";
	}
	@RequestMapping(value = "/finalpage", method = RequestMethod.GET)
	public String finall(@RequestParam String status,Model m) {
		System.out.println(status);
		if(status.equals("true"))
		{
			s.finall();
			return "home";
		}
		else {
			return "www.githut.com";
		}
		
		
	}
	

}
