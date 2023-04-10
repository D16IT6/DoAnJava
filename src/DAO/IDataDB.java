/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author PC
 */
public interface IDataDB <T>{
    public void add(T t);
    public List<T> showAll();
    public void delete(T t);
    public void set(T t);
    public void showByName(String x);
}
