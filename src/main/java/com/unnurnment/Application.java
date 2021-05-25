package com.unnurnment;

import com.unnurnment.dao.DAO;
import com.unnurnment.model.Massage;
import com.unnurnment.service.MassageService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        DAO<Massage,Long> massageLongDAO = new MassageService();
        Massage massage = new Massage((long) 1,"hello","lol");
        Massage massage1 = new Massage((long) 2,"lol","lol");
        massageLongDAO.create(massage);
        massageLongDAO.create(massage1);
        Collection<Massage> massageList = massageLongDAO.findAll();
        List<Massage> massages = new ArrayList<>();
        for (Massage massage3 : massageList){
            if (massage3.getId() == 1){
                massages.add(massage3);
            }
        }
        System.out.println(massages);
    }
}
