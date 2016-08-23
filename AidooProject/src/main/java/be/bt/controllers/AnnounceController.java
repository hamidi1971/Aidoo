package be.bt.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.bt.services.IAnnounceService;

@Controller
public class AnnounceController {

	@Autowired
	IAnnounceService announceService;

	private static final Logger logger = LoggerFactory.getLogger(AnnounceController.class);

	@RequestMapping(value = "/annonces", method = RequestMethod.GET)
	public String home(ModelMap model,

			@RequestParam(value = "zipcode") String zipCode,
			@RequestParam(value="annoncecat") String announceCat 
			) {

		System.out.println(announceService.findAnnoucesByZipCode(zipCode).size());
		
		

		return "homeBoot";
	}

}
