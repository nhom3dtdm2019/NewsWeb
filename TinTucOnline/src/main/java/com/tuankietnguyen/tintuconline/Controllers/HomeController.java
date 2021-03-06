package com.tuankietnguyen.tintuconline.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tuankietnguyen.tintuconline.Model.Trending;
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
	public String loginController(HttpServletRequest request) {
		request.setAttribute("trend", x.findAll());
		return "login";
	}
	@GetMapping("/addTrendController")
	public String addTrendController() {
		return "addnew";
	}
	@GetMapping("/login1")
	public String login1(HttpServletRequest request) {
		return "login1";
	}
	/*
	 * @GetMapping("/saveTrend") public String saveTrend(HttpServletRequest request)
	 * throws NumberFormatException {
	 * 
	 * String name = request.getParameter("name"); String img =
	 * request.getParameter("img"); String sum = request.getParameter("sum");
	 * Trending trend = new Trending(name, img, sum); x.saveTrend(trend); return
	 * "login"; }
	 */
	 @GetMapping("/all-trending")
	 public String alltrending(HttpServletRequest request) {
		 request.setAttribute("trends", x.findAll());
		 request.setAttribute("mode", "MODE_TRENDS");
		 return "login";
	 }
	 @PostMapping("/save-trending")
	 public String savetrending(@ModelAttribute Trending task,HttpServletRequest request) {
		 x.saveTrend(task);
		 //return loginController( request);
		 request.setAttribute("trend", x.findAll());
		 return "login";
	 }
	 @GetMapping("/new-trending")
	 public String newtrending(@ModelAttribute Trending trending, HttpServletRequest request) {
		 request.setAttribute("mode", "MODE_TRENDS");
		 return "login";
	 }
	 @GetMapping("/update-trending")
	 public String updatetrending(@RequestParam int id, HttpServletRequest request) {
		 request.setAttribute("trends", x.findAll());
		 request.setAttribute("mode", "MODE_TRENDS");
		 return "login";
	 }
	 @GetMapping("/delete-trending")
	 public String deletetrending(@RequestParam int id, HttpServletRequest request) {
		 x.deleteTrend(id);
		 request.setAttribute("trend", x.findAll());
		 return "login";
	 }
}
