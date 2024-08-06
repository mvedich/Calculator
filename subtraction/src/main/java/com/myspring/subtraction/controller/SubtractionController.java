package com.myspring.subtraction.controller;

import com.myspring.subtraction.service.SubIntr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SubtractionController {
    @Autowired
    public SubIntr subintr;

    @PostMapping("/sub")
    public ResponseEntity<Integer> getSubtractionController(@RequestBody Map<String, Integer> inp){
        Integer val1 = inp.get("val1");
        Integer val2 = inp.get("val2");
        Integer result = subintr.getSubtraction(val1,val2);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
