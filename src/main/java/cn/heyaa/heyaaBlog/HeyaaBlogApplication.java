package cn.heyaa.heyaaBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class HeyaaBlogApplication {



	public static void main(String[] args) {
		SpringApplication.run(HeyaaBlogApplication.class, args);
	}
}
