package com.example.SpringBootEc2CodeDeployDemo.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;

@RestController
public class Controller {

    HashMap<Integer, String> stringHashMap = new HashMap<>();

    @GetMapping("/getEmployee")
    public String getEmployee(@RequestParam Integer id) {

        if (stringHashMap.containsKey(id)) {
            return stringHashMap.get(id);
        } else
            return "No employeee available with this specific Employee Id";
    }

    @PostMapping("/addEmployee")
    public String postEmployee(@RequestParam String employee) {
        try {
            if (stringHashMap.size() == 0)
                stringHashMap.put(1, employee);

            stringHashMap.put(Collections.max(stringHashMap.keySet()) + 1, employee);
            return "successfully added employee: " + employee;
        } catch (Exception e) {
            return " Yo Unable to add employee due to the following exception : " + e.getMessage();
        }
    }
}
