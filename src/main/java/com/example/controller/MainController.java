package com.example.controller;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.boot.web.server.Cookie;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Exceptions.EmployeeAlredyPresent;
import com.example.Exceptions.FieldRequiredException;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

@Controller
public class MainController {

	@Autowired
	EmployeeService eservice;
	private boolean loggedin = false;

	@GetMapping("/")
	public String login() {
		return "login";
	}

	@PostMapping("/auth")
	public String auth(@RequestParam("user") String user, @RequestParam("pass") String pass) {
		// System.out.println(user + " " + pass);

		if (user.equalsIgnoreCase("root") && pass.equalsIgnoreCase("root")) {
			loggedin = true;
		
			return "home";
		}
		return "login";
	}
	
   
	@GetMapping("/logout")
	public String logout( Model model){
		loggedin = false;
		model.addAttribute("loggoedin", loggedin);
		return "login";
	}


	@GetMapping("/addnew")
	public String addnew() {
		if (!loggedin)
			return "login";

		return "register";
	}

	@GetMapping("/edit")
	public String editEmp() {
		if (!loggedin)
			return "login";

		return "editemployee";
	}
	
	

	@PostMapping("/editemp")
	public String editEmpForm(@RequestParam("id") int id, Model model) {
		if (!loggedin)
			return "login";

		Employee emp = eservice.showbyID(id);
		model.addAttribute("emp2edit", emp);
		return "editemployee";
	}

	@PostMapping("/register")
	public String addemp(@RequestParam("id") int id, @RequestParam("fname") String fname,
			@RequestParam("lname") String lname, @RequestParam("dept") String dept,
			@RequestParam("salary") int salary) {
		Employee employee = new Employee();
		if (!loggedin)
			return "login";

		List<Employee> emplist = eservice.showall();
		for (Employee emp2 : emplist) {
			if (emp2.getId() == id) {
				throw new EmployeeAlredyPresent("");
			}
		}
		employee.setId(id);
		employee.setFirstname(fname);
		employee.setDepartment(dept);
		employee.setLastname(lname);
		employee.setSalary(salary);
		eservice.addEmp(employee);
		// System.out.println(fname+ ""+lname+" " +salary+" "+dept);
		return "home";

	}

	@PostMapping("/update")
	public String editEMp(@RequestParam("id") int id, @RequestParam("fname") String fname,
			@RequestParam("lname") String lname, @RequestParam("dept") String dept,
			@RequestParam("salary") int salary) {
		Employee employee = eservice.showbyID(id);
		if (!loggedin)
			return "login";

		employee.setId(id);
		employee.setFirstname(fname);
		employee.setDepartment(dept);
		employee.setLastname(lname);
		employee.setSalary(salary);
		eservice.addEmp(employee);
		// System.out.println(fname+ ""+lname+" " +salary+" "+dept);
		return "home";

	}

	@GetMapping("/delete")
	public String delte() {

		if (!loggedin)
			return "login";

		return "deletebyid";
	}

	@PostMapping("/deletebyid")
	public String deletebyId(@RequestParam("id") int id) {
		if (!loggedin)
			return "login";

		Employee emp = eservice.showbyID(id);
		if (emp.getId() == id) {
			eservice.deleteEmp(id);
			return "home";
		}
		return "idnotfound";

	}

	@RequestMapping("/getdept")
	public String getDept() {

		if (!loggedin)
			return "login";
		return "getdept";
	}

	@RequestMapping("/changedept")
	public String changedept(@RequestParam("id") int id, @RequestParam("dept") String dept) {

		if (!loggedin)
			return "login";

		Employee emp = eservice.showbyID(id);
		emp.setDepartment(dept);
		eservice.addEmp(emp);
		return "home";
	}

	@GetMapping("/count")
	public String cout(Model model) {
		if (!loggedin)
			return "login";
		int count = eservice.count();
		model.addAttribute("count", count);
		return "count";
	}

	@GetMapping("/showall")
	public String ShowALL(Model model) {
		if (!loggedin)
			return "login";
		model.addAttribute("employee", eservice.showall());
		return "showall";
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> showall() {

		return new ResponseEntity<List<Employee>>(eservice.showall(), HttpStatus.OK);

	}

	@GetMapping("/get{id}")
	public ResponseEntity<Employee> showbyID(@PathVariable("id") int id) {
		return new ResponseEntity<Employee>(eservice.showbyID(id), HttpStatus.OK);

	}
	
	@GetMapping("/doc")
	public String help() {
		if (!loggedin)
			return "login";
		
		return "documentation";
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deletebyID(@PathVariable("id") int id) {

		Employee emp = eservice.showbyID(id);
		if (emp.getId() == id) {

			eservice.deleteEmp(id);
			return new ResponseEntity<Employee>(HttpStatus.OK);
		}
		return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);

	}

	@PostMapping("/add")
	public ResponseEntity<Employee> addEmp(@RequestBody Employee emp) {
		if (emp.getFirstname() == null || emp.getFirstname().isBlank()) {
			throw new FieldRequiredException("");
		}
		if (emp.getLastname() == null || emp.getLastname().isBlank()) {
			throw new FieldRequiredException("");
		}

		List<Employee> emplist = eservice.showall();
		for (Employee employee : emplist) {
			if (employee.getId() == emp.getId()) {
				throw new EmployeeAlredyPresent("");
			}
		}

		eservice.addEmp(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);

	}

	@PutMapping()
	public ResponseEntity<String> modifyEmp(@RequestBody Employee employee) {
		eservice.modifyEmp(employee);
		return new ResponseEntity<String>("Employee Details Updated", HttpStatus.OK);
	}

}
