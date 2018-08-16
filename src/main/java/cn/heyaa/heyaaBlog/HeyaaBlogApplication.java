package cn.heyaa.heyaaBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@SpringBootApplication
public class HeyaaBlogApplication {

	/**
	 *

	@RequestMapping("/")
	String index(){
		return "Hello Spring Boot";
	} */

	@RequestMapping("/toIndex")
	ModelAndView toIndex(HttpServletRequest req, ModelAndView view){
		view.setViewName("web/index.html");
		return view;
	}

	public static void main(String[] args) {
		SpringApplication.run(HeyaaBlogApplication.class, args);
	}
}
