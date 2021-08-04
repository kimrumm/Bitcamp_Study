package com.bitcamp.firstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.firstSpring.member.domain.OrderCommand;

@Controller
@RequestMapping("/order/order")
public class OrderController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getOrderForm() {
		return "order/orderForm"; //  /WEB-INF/views/order/orderForm.jsp 를 찾고 없으면 404 오류 발생
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String order(
			OrderCommand orderCommand
			){
			
			System.out.println(orderCommand);
			
		return null;
	}
	
	
	}

