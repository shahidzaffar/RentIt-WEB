package com.rentit.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.admin.restController.Admin_Vehicle_WEB_Controller;


@Controller
public class AdminControlsVehicle
{
	Admin_Vehicle_WEB_Controller adminController=new Admin_Vehicle_WEB_Controller();
	
	
	@RequestMapping(value="/vehicleDisplay", method=RequestMethod.GET)
	public String vehicleDisplay(ModelMap model)
	{
		model.addAttribute("vehicles", adminController.getAllVehicles());
		return "vehicle-display";
	}
	
	
	@RequestMapping(value="/deleteVehicle", method=RequestMethod.GET)
	public String deleteCustomer(@RequestParam int id, ModelMap model)
	{
		adminController.deleteVehicle(id);
		model.clear();
		return "redirect:vehicleDisplay";
	}
	
	
	
	

}
