/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Sort;

import Controller.StudentDB;
import Model.Student;
import Model.Subject;
import java.text.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class SortByName {

    List<Student> list = new ArrayList<>();

    public List<Student> sort(JTable tbStudent, int check) {
        int row = tbStudent.getRowCount();
        for (int i = 0; i < row; i++) {
            String name = tbStudent.getValueAt(i, 1) + "";
            String[] catchuoi = name.split(" ");
            String hodem = "";
            for (int j = 0; j < catchuoi.length - 1; j++) {
                hodem = hodem + catchuoi[j] + " ";
            }
            String ten = catchuoi[catchuoi.length - 1];
            String id = tbStudent.getValueAt(i, 0).toString();
            String address = tbStudent.getValueAt(i, 3).toString();
            String email = tbStudent.getValueAt(i, 4).toString();
            String ngaysinh = tbStudent.getValueAt(i, 2).toString();
            String malop = tbStudent.getValueAt(i, 5).toString();
            Student st = new Student(id.trim(), malop.trim(), hodem.trim(), ten.trim(), ngaysinh, email, address);
            list.add(st);
        }
        if (check == 1) {
            return new SortByName().SortASC(list);
        }
        return new SortByName().SortDESC(list);
    }

    public List<Student> SortASC(List<Student> list) {

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return cutString(o1.getTen().toUpperCase(), o2.getTen().toUpperCase());
            }
        });
        return list;
    }

    public List<Student> SortDESC(List<Student> list) {

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -cutString(o1.getTen(), o2.getTen());
            }
        });
        return list;
    }

    public int cutString(String a, String b) {
        char[] a1 = a.trim().toCharArray();
        char[] b1 = b.trim().toCharArray();
        String a2 = "", b2 = "";
        Collator collator = Collator.getInstance(new Locale("vi", "VN"));
        int check = a1.length > b1.length ? b1.length : a1.length;
        for (int i = 0; i < check; i++) {
            if (a1[i] == b1[i]) {
                a2 += a1[i];
                b2 += b1[i];
            } else {
                a2 += a1[i];
                b2 += b1[i];
                break;
            }
        }
        if (collator.compare(b2, a2)==0) {
            return 0;
        }
        if (collator.compare(b2, a2) > 0) {
            return 1;
        }
        return -1;
    }
}
