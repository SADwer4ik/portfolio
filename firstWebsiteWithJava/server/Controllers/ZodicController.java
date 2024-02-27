package com.lab1.backend2.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab1.backend2.Containers.ZodicSign;
import com.lab1.backend2.Services.FindService;
import com.lab1.backend2.Services.SignService;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.time.LocalDate;

@RestController
@RequestMapping("/sign")
public class ZodicController {
    @GetMapping()
    @CrossOrigin
    public ArrayList<ZodicSign> getReq(HttpServletRequest request){
        ArrayList<ZodicSign> list = new ArrayList<ZodicSign>();
        String month = "1";
        String day = "1";
        month = request.getParameter("month");
        day = request.getParameter("day");
        Integer d = Integer.parseInt(day);
        Integer m = Integer.parseInt(month);
        int dayI, monthI;
        dayI = d;
        monthI = m;
        LocalDate date = LocalDate.of(2007, monthI, dayI);
        SignService serv = new SignService();
        list = serv.getZodSign(date);
        return list;
    }
    FindService findServ = new FindService();
        @GetMapping(value = "/find")
        @CrossOrigin
    public ZodicSign getSignByName(HttpServletRequest request) {
        String name = request.getParameter("name");
        ZodicSign answ = new ZodicSign();
        answ = findServ.findSign(name);
        return answ;
    }
}
