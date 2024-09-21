package com.datawrite.tets_data_path.cnotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.datawrite.tets_data_path.Staff;
import com.datawrite.tets_data_path.service.StaffService;

import jakarta.validation.Valid;



@Controller
public class StaffController {

    @Autowired
    StaffService empService ;

    @GetMapping("/")
    public String getStaffData(Model model , @RequestParam(required = false) String id) {
        
        model.addAttribute("emp", empService.geEmpById(id));
        return "addStaffDetails";
    }

   

    @PostMapping("/dataSubmitForm")
    public String dataSubmitForm(@Valid @ModelAttribute("emp") Staff staff , BindingResult result) {
        System.out.println(result);

        if (result.hasErrors()) {
            return "addStaffDetails";
        }

      empService.submitStaff(staff);
        
        return "redirect:/getData";
    }

    @GetMapping("/getData")
    public String getData(Model model) {

        model.addAttribute("allEmp", empService.getAllEmp() );
        return "showAllStaff";
    }
      
    
}
