package cn.itcast.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Item;

@Controller
public class EditController {

	@RequestMapping("/editItem.action")
	public ModelAndView edit(){
		List<Item> list = new ArrayList();
		list.add(new Item(1, "1��Ϊ ��ҫ9", 2399, new Date(), "�����ã�1"));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("/WEB-INF/jsp/editItem.jsp");
		return modelAndView;
		
	}
}
