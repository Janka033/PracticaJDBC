package org.example.repository;

import java.util.List;

public interface Repository <T>{
    List<T> list();
    T byId(long id);
    void save(T t);
    void delete(long id);
    void update(T t);
}
