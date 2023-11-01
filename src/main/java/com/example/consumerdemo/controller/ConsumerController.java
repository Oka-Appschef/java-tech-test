package com.example.consumerdemo.controller;

import com.example.consumerdemo.dto.request.ConsumerRequest;
import com.example.consumerdemo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allconsumers", consumerService.getAllConsumer());
        return "index";
    }

    @PostMapping("consumer/insert-seeds")
    public ResponseEntity<String> postSeedData(){
        consumerService.seedDb();
        return ResponseEntity.status(HttpStatus.OK).body("Seed initialized");
    }

    @GetMapping("consumer/addnew")
    public String addNewConsumer(Model model) {
        ConsumerRequest consumerRequest = new ConsumerRequest();
        model.addAttribute("consumer", consumerRequest);
        return "insertconsumer";
    }

    @PostMapping("consumer/insert")
    public String postConsumerData(@ModelAttribute("consumer") ConsumerRequest consumerRequest){
        consumerService.insertCustomer(consumerRequest);
        return "redirect:/";
    }
}
