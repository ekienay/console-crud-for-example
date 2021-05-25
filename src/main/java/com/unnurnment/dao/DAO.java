package com.unnurnment.dao;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface DAO <Entity,Key> {
    void create(Entity entity);
    void update(Entity entity);
    void delete(Long id);
    Optional<Entity> readById(Long id);
    Collection<Entity> findAll();
}
