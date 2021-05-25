package com.unnurnment.service;

import com.unnurnment.dao.DAO;
import com.unnurnment.model.Massage;

import java.util.*;

public class MassageService implements DAO<Massage,Long> {
    private final Map<Long,Massage> massages = new HashMap<Long, Massage>();

    public void create(Massage massage) {
        massages.put(massage.getId(),massage);
    }

    public void update(Massage massage) {
        massages.put(massage.getId(),massage);
    }

    public void delete(Long id) {
        massages.remove(id);
    }

    public Optional<Massage> readById(Long id) {
        return Optional.ofNullable(massages.getOrDefault(id,null));
    }

    public Collection<Massage> findAll() {
        return massages.values();
    }
}
