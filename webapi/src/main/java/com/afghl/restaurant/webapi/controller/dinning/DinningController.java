package com.afghl.restaurant.webapi.controller.dinning;

import com.afghl.restaurant.dinning.service.DinningService;
import com.afghl.restaurant.webapi.dto.DinningDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinningController {
    @Autowired
    private DinningService service;

    @RequestMapping(path = "/dinning")
    public DinningDto get() {
        return null;
    }
}
