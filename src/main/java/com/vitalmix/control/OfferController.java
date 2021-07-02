package com.vitalmix.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OfferController {

    @GetMapping("/ships")
    public String getOffers() {
        return "offers";
    }
}
