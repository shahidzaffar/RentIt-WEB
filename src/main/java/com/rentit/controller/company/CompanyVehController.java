package com.rentit.controller.company;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentit.controller.company.restController.CompanyVehicleWebController;
import com.rentit.entity.Terminal;
import com.rentit.entity.Vehicle;
import com.rentit.login.WelcomeController;


@Controller
public class CompanyVehController
{
	 CompanyVehicleWebController companyController=new CompanyVehicleWebController();
	 WelcomeController wc=new WelcomeController();
	
	
	@RequestMapping(value="/companyVehicleDisplay", method=RequestMethod.GET)
	public String vehicleDisplay(ModelMap model)
	{
		model.addAttribute("vehicles", companyController.getAllCompVehicles());
		return "company-vehicle-display";
	}
	

	@RequestMapping(value="/addVehicle", method=RequestMethod.GET)
	public String AddDriver(ModelMap model)
	{
		Terminal defaultTerminal=companyController.retreiveTerminalById();
		model.addAttribute("vehicle", new Vehicle("", "", "", true, "", "", wc.getLoggedInUser(), defaultTerminal));
		return "add-vehicle";
	}
	
	@RequestMapping(value="/addVehicle", method=RequestMethod.POST)
	public String AddVehiclePOST(ModelMap model, @Valid Vehicle vehicle, BindingResult result )
	{
		
		Terminal defaultTerminal=companyController.retreiveTerminalById();

		if(result.hasErrors())
			return "add-vehicle";
		
		companyController.addVehicle(vehicle.getV_reg_no(),vehicle.getModelNumber(),vehicle.getCategory(), 
				vehicle.isStatus(),
				vehicle.getV_make(), vehicle.getV_description(), wc.getLoggedInUser(), defaultTerminal  );
		model.clear();
		return "redirect:companyVehicleDisplay";
		
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/updateVehicle", method=RequestMethod.GET)
	public String updateCompany(@RequestParam int id, ModelMap model)
	{
		Vehicle vehicle=companyController.retreiveVehicleById(id);
		vehicle.setTerminalId(vehicle.getTerminal().getId());
		
		model.addAttribute("vehicle", vehicle);
		
		
		return "update-vehicle";
	}
	
	
	@RequestMapping(value="/updateVehicle", method=RequestMethod.POST)
	public String updateVehiclePOST(ModelMap model, @Valid Vehicle veh, BindingResult result)
	{
		
		
		if(result.hasErrors())
			return "update-vehicle";
		
		veh.setCompany(wc.getLoggedInUser());
		veh.setTerminal(companyController.retreiveTerminalById(veh.getTerminalId()));
		companyController.updateVehicle(veh);
		model.clear();
		return("redirect:companyVehicleDisplay");
	}
	
	
	

}
