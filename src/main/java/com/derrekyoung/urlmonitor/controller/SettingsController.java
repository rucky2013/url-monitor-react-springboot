package com.derrekyoung.urlmonitor.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ComponentScan
public class SettingsController {

	@RequestMapping(value = {"/settings"}, method = RequestMethod.GET)
	public String savePage(Model model) {
		return "settings";
	}
}
