package com.example.demo.service;

import java.util.Optional;

public interface IClassService <Clazz>{
    Iterable<Clazz> findAll();
    Optional<Clazz> findById(Long id);

}