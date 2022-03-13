package com.ivan.spring.mvc;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstMvcApplication(){
        return "MyView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
//        Employee employee = new Employee();
//        employee.setName("Ivan");
//        employee.setSurName("Petrov");
//        employee.setSalary(500);

        model.addAttribute("employee",new Employee());
        return "ask-emp-details-view";
    }
//    @RequestMapping("showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model){
//
//        String empName =  request.getParameter("employeeName");
//
//        empName = "Mr. " + empName;
//
//        model.addAttribute("nameAttribute",empName);
//
//        model.addAttribute("description"," - just learn");
//
//
//        return "show-emp-details-view";
//    }

    @GetMapping(path = "showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee")Employee emp,
                                 BindingResult result){


            if(result.hasErrors()){
                return "ask-emp-details-view";
            }
            else {
                return "show-emp-details-view";
            }


    }


}
