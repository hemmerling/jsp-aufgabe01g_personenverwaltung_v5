/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe01f_personenverwaltung_v4.model.business;

import com.hemmerling.aufgabe01f_personenverwaltung_v4.model.persistence.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface PersonService {
    
    //public abstract PersonService getInstance();
    
    public abstract List<String[]> get();
    
    public abstract void add(Person person);
    
    public abstract void set(int id, Person person);

    public abstract void remove(int id);
}
