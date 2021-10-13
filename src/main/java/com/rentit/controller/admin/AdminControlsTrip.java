package com.rentit.controller.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Trip_WEB_Controller;
import com.rentit.entity.Trip;
  

@Controller
public class AdminControlsTrip
{
	Admin_Trip_WEB_Controller adminController=new Admin_Trip_WEB_Controller();
	
	Trip tripp=null;
	
	@RequestMapping(value="/tripDisplay", method=RequestMethod.GET)
	public String vehicleDisplay(ModelMap model)
	{
		model.addAttribute("trips", adminController.getAllTrips());
		return "trip-display";
	}
	
	
	@RequestMapping(value="/deleteTrip", method=RequestMethod.GET)
	public String deleteTrip(@RequestParam int id, ModelMap model)
	{
		adminController.deleteTrip(id);
		model.clear();
		return "redirect:tripDisplay";
	}
	
	
	@RequestMapping(value="/updateTrip", method=RequestMethod.GET)
	public String updateTrip(@RequestParam int id, ModelMap model)
	{
		tripp=adminController.retreiveTriplById(id);
		model.addAttribute("trip", tripp);
		return "update-trip";
	}
	
	
	
	@RequestMapping(value="/updateTrip", method=RequestMethod.POST)
	public String updateCompanyPOST(ModelMap model,  @Valid Trip trip, BindingResult result)
	{
		
		System.out.println(result);
		
		if(result.hasErrors())
		{
			System.out.println("Error Sending back");
			return "update-trip";
		}
			
		
		trip.setCustomer(tripp.getCustomer());
		adminController.updateTrip(trip);
		model.clear();
		return("redirect:tripDisplay");
	}
	
	

}
