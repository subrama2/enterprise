package com.myplantdiary.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;git

@Controller
public class PlantDiaryController {

    /**
     * Handle the root (/) endpoint and return a start page
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }
}
