package com.tuankietnguyen.tintuconline.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tuankietnguyen.tintuconline.Service.accountService;


@Controller
public class HomeController {


	@Autowired
	//private BanTinService banTinService;
	private accountService x;
	
	@GetMapping("/")
	public String Home(HttpServletRequest request) {
		request.setAttribute("trend", x.findAll());
		request.setAttribute("popular",x.findAllpopular());
		request.setAttribute("last",x.findAlllastedVideo());
		request.setAttribute("cate",x.findAllCate());
		return "index";
	}
	
	/*@GetMapping("/")
	public String Home(HttpServletRequest request) {
		request.setAttribute("bantin", banTinService.findAll());
		return "index";
	}*/
	
	@GetMapping("/homeController")
	public String homeController(HttpServletRequest request) {
		request.setAttribute("trend", x.findAll());
		request.setAttribute("popular",x.findAllpopular());
		request.setAttribute("last",x.findAlllastedVideo());
		request.setAttribute("cate",x.findAllCate());
		return "index";
	}
	
	@GetMapping("/archiveController")
	public String archiveController() {
		return "archive";
	}
	
	@GetMapping("/video-postController")
	public String videoPostController() {
		return "video-post";
	}
	
	@GetMapping("/single-postController")
	public String singlePostController() {
		return "single-post";
	}
	
	@GetMapping("/aboutController")
	public String aboutController() {
		return "about";
	}
	
	@GetMapping("/contactController")
	public String contactController() {
		return "contact";
	}
	
	@GetMapping("/submit-videoController")
	public String submitVideoController() {
		return "submit-video";
	}

	@GetMapping("/loginController")
	public String loginController() {
		return "login";
	}
	@GetMapping("/adminController")
	public String adminController() {
		return "admin";
	}
}
