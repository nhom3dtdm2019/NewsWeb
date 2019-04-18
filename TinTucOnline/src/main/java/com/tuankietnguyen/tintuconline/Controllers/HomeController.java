package com.tuankietnguyen.tintuconline.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tuankietnguyen.tintuconline.Service.BanTinService;

@Controller
public class HomeController {


	@Autowired
	private BanTinService banTinService;
	
	@GetMapping("/all-bantin")
	public String allBanTin() {
		return banTinService.findAll().toString();
	}
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/homeController")
	public String homeController() {
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
}
