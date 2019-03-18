package first;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



  
	@Controller  
	public class HelloController {  
	@RequestMapping("/")  
	    public String display()  
	    {  
		HibernateUtil util=new HibernateUtil();
		util.createSessionFactory();
	        return "index";  
	    }     
	
	@RequestMapping("/hello")  
    public String display2()  
    {  
        return "hello";  
    }    
	
	
	    //For next page
	
		@RequestMapping("/submit")  
    public String display3(@RequestParam("name") String name,@RequestParam("password") String pass,Model m)  
    {  
			
		
			System.out.println(name);
			
			String msg="Hello "+ name;  
		 m.addAttribute("name", msg);  
		 m.addAttribute("password", pass);
            RegDAO rega=new RegDAO();
		 rega.addreg(name,pass);
		 
			

        return "hello";     
    }     
	
		@RequestMapping("/display")  
	    public String all(Model m)  
	    {  
			
			RegDAO dao = new RegDAO();
			
			List<add> users= dao.getUsers();	
			m.addAttribute("users",users);
		
			
			
	        return "hello";  
	    }    
		
		
		@RequestMapping("/register")  
	    public String display6()  
	    {  
	        return "register";  
	    }    
		
		@RequestMapping("/done")  
	    public String yes(Model m,@RequestParam("Name") String name,@RequestParam("Email")String email,@RequestParam("Mobile")String mobile,@RequestParam("Place")String place)  
	    {  
			
			
			 RegDAO rega2=new RegDAO();
		rega2.add(name, email,Integer.parseInt(mobile),place);
	        return "index";  
	    }    
	
	
	
	
	//For same Page 
	/*	@RequestMapping("/submit")  
    public String display3(@RequestParam("name1") String name,@RequestParam("pwd") String pass,Model m)  
    {  
		 String msg="Hello "+ name;  
		 m.addAttribute("message", msg);  
		  m.addAttribute("password", pass);
        return "index";  
    }     
	*/
	
		
		
		
		
		//For Showing database on screen
	/*   @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        departmentDAO.insertDepartment("HR", "Chicago");
        departmentDAO.insertDepartment("INV", "Hanoi");
        List<Department> list = departmentDAO.listDepartment();
        model.addAttribute("departments", list);
        return "index";
    }*/
	
	
	} 

