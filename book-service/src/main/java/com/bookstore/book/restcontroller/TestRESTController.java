package com.bookstore.book.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
//@RefreshScope
public class TestRESTController {
  Logger logger = LoggerFactory.getLogger(this.getClass());
  
  @Value("${catalog.sample.data}")
  private String data;

  @GetMapping("/getSampleData")
  public String getSampleData() {
    logger.info(" sample data value is -->"+this.data);
    return this.data;
  }
}
