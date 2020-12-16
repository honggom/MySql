package kr.or.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.bit.service.TestService;

@Controller
public class InsertMySqlController {
	
	@Autowired
	TestService testservice;
	
	@RequestMapping("insert.do")
	public String insert() {
		System.out.println("컨트롤러");
		testservice.insertTest();
		System.out.println("insert 완료");
		return null;
	}

}
