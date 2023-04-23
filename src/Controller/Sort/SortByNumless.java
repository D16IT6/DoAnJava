/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Sort;

import Model.Subject;
import java.util.Collections;
import java.util.Comparator;
import Model.Subject;
import java.util.List;

/**
 *
 * @author PC
 */
public class SortByNumless{
    public List<Subject> sortDesc(List<Subject> arrSubject){
        Collections.sort(arrSubject, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return -o1.getSotiet() + o2.getSotiet();
            }
        });
        return arrSubject;
    }
    public List<Subject> sortAsc(List<Subject> arrSubject){
        Collections.sort(arrSubject, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getSotiet() - o2.getSotiet();
            }
        });
        return arrSubject;
    }
}
