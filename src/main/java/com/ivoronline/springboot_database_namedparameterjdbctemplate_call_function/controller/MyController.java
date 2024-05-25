package com.ivoronline.springboot_database_namedparameterjdbctemplate_call_function.controller;

import com.ivoronline.springboot_database_namedparameterjdbctemplate_call_function.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // CALL FUNCTION
  //=========================================================================================================
  // http://localhost:8080/callFunction?name=John
  @ResponseBody
  @GetMapping("/callFunction")
  public String callFunction(@RequestParam String name) {
    return myService.callFunction(name);
  }

}
