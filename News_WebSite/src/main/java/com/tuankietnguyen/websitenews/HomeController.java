package com.tuankietnguyen.websitenews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

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
