package hd.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DefaultController {

	@GetMapping("/")
	public String index() {
		return"index";
	}
	@GetMapping("/index2")
	public String index2() {
		return"example";
	}
	@GetMapping("/charset")
	public String charset() {
		return "charsetTest";
	}
}
