package az.developia.spring_project_14aprel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.service.ProducerService;

@RestController
@RequestMapping(path = "/message")
public class MessageController {

	@Autowired
	private ProducerService producerService;
	
	@GetMapping(path = "/send")
	public String send(@RequestParam(name = "q") String message) {
		producerService.sendMessage(message);
		return "message: " + message;
	}
}
