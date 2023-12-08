package com.licagent;


import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//https://www.licagentpune.com/wp-json   base code for this application
//https://www.licagentpune.com/wp-content/cache/minify all css and js files
@Controller
public class HomePageController {
	private static final Logger logger = LogManager.getLogger(HomePageController.class);
	@GetMapping(value = "/")
	public String homePage(HttpSession session) {
		logger.info("Entered into Lic Agent Home page");
		return "agentInfo";
	}
	@GetMapping(value = "/jeevanumang")
	public String jeevanumang(HttpSession session) {
		logger.info("Entered into Jeevan Umang page");
		return "jeevanUmang";
	}
	@GetMapping(value = "/pensionplans")
	public String pensionplans(HttpSession session) {
		logger.info("Entered into Penson Plans page");
		return "pensionplans";
	}
	@GetMapping(value = "/jeevan-labh")
	public String jeevanlabh(HttpSession session) {
		logger.info("Entered into Penson Plans page");
		return "jeevan-labh";
	}
	
	@GetMapping(value = "/yogana_penson_scheme")
	public String yoganapensonscheme(HttpSession session) {
		logger.info("Entered into yogana penson scheme");
		return "yogana_penson_scheme";
	}
	@GetMapping(value = "/jeevan_shanti_single_premium_plan")
	public String jeevanshantisinglepremiumplan(HttpSession session) {
		logger.info("Entered into Jeevan jeevan_shanti_single_premium_plan page");
		return "jeevan_shanti_single_premium_plan";
	}
	
	@GetMapping(value = "/jeevan_lakshya")
	public String jeevanlakshya(HttpSession session) {
		logger.info("Entered into jeevan-lakshya plan page");
		return "jeevan-lakshya";
	}
	@GetMapping(value = "/jeevan-tarun-plan")
	public String jeevantarunplan(HttpSession session) {
		logger.info("Entered into jeevan-lakshya plan page");
		return "jeevan-tarun-plan";
	}
	@GetMapping(value = "/childrens-money-back-plans")
	public String childrensmoneybackplan(HttpSession session) {
		logger.info("Entered into jeevan-lakshya plan page");
		return "childrens-money-back-plan";
	}
	@GetMapping(value = "/money-back-plan-20-years")
	public String moneybackplan20years(HttpSession session) {
		logger.info("Entered into Money Back 20 Years plan");
		return "money-back-plan-20-years";
	}
	@GetMapping(value = "/money-back-plan-25-years")
	public String moneybackplan25years(HttpSession session) {
		logger.info("Entered into  Money Back 25 Years plan");
		return "money-back-plan-25-years";
	}
	@GetMapping(value = "/sub/money-back-plans")
	public String moneybackplans(HttpSession session) {
		logger.info("Entered into  Money Back  plans");
		return "money-back-plans";
	}

@GetMapping(value = "/sub/whole-life-plans")
public String wholelifeplans(HttpSession session) {
	logger.info("Entered into whole life plans");
	return "whole-life-plans";
}
	
	@GetMapping(value = "/new-jeevan-anand")
	public String newjeevananand(HttpSession session) {
		logger.info("Entered into  New Jeevan anand ");
		return "new-jeevan-anand";
	}
	@GetMapping(value = "/jeevan-amar")
	public String jeevanamar(HttpSession session) {
		logger.info("Entered into  jeevan amar");
		return "jeevan-amar";
	}
	@GetMapping(value = "/sub/term-plans")
	public String termplans(HttpSession session) {
		logger.info("Entered into  term plans");
		return "term-plans";
	}
	@GetMapping(value = "/sub/endowment-plans")
	public String endowmentplans(HttpSession session) {
		logger.info("Entered into  Endoment plans");
		return "endoment-plan";
	}
	
	@GetMapping(value = "/sub/child-plans")
	public String childplans(HttpSession session) {
		logger.info("Entered into  Endoment plans");
		return "child-plans";
	}
	
	@GetMapping(value = "/anmol-jeevan")
	public String anmoljeevan(HttpSession session) {
		logger.info("Entered into  anmol jeevan");
		return "anmol-jeevan";
	}
	@GetMapping(value = "/contactus")
	public String contactus(HttpSession session) {
		logger.info("Entered into  Contact Us");
		return "contactus";
	}
	
	
	@GetMapping(value = "/disclaimer")
	public String disclaimer(HttpSession session) {
		logger.info("Entered into  disclaimer");
		return "disclaimer";
	}
	
	@GetMapping(value = "/privacy-policy")
	public String privacypolicy(HttpSession session) {
		logger.info("Entered into  privacypolicy");
		return "privacypolicy";
	}
	@GetMapping(value = "/terms-of-use")
	public String termsofuse(HttpSession session) {
		logger.info("Entered into  termsofuse");
		return "termsofuse";
	}
	
	@GetMapping(value = "/about-agent")
	public String aboutAgent(HttpSession session) {
		logger.info("Entered into  aboutAgent");
		return "aboutagent";
	}
	
	@RequestMapping(value="/getdata",method=RequestMethod.POST)
	public String userLogin(@RequestParam("name") String name)
			{
		System.out.println("name===="+name);
				return name;
		
			}
	
	
	
	
}
