package com.springbootlearning.service_one.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //http://localhost:8081/api/rest/service-one/hello/getName
    @GetMapping("/getName")
    public String getName() {
        return "Rajib Kumer Ghosh";
    }

    //http://localhost:8081/api/rest/service-one/hello/getNameByID/1001
    @GetMapping("/getNameByID/{id}")
    public String getNameByID(@PathVariable Long id) {
        String name = "Rajib Kumer Ghosh";
        return "Name: " + name + ", ID: " + id.toString();
    }

    //http://localhost:8081/api/rest/service-one/hello/getNameByRoleAndClass/1001/KG-1
    @GetMapping("/getNameByRoleAndClass/{rollNo}/{className}")
    public String getNameByRoleAndClass(@PathVariable Long rollNo, @PathVariable String className) {
        String name = "Rajib Kumer Ghosh";
        return "Name: " + name + ", Role No.: " + rollNo.toString() + ", Class: " + className;
    }

    //http://localhost:8081/api/rest/service-one/hello/getNameByYearAndClass?year=2025&className=KG-1
    @GetMapping("/getNameByYearAndClass")
    public String getNameByYearAndClass(@RequestParam Long year, @RequestParam String className) {
        String name = "Rajib Kumer Ghosh";
        return "Name: " + name + ", Role No.: " + year.toString() + ", Class: " + className;
    }

    @GetMapping("/getNameByNid/{nidNo}")
    public ResponseEntity<String> getNameByNid(@PathVariable("nidNo") String nid) {
        String name = "Rajib Kumer Ghosh";
        return new ResponseEntity<>("Name: " + name + ", NID: " + nid , HttpStatus.OK);
    }
}
