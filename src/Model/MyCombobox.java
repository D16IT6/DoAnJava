/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class MyCombobox {
      private String value;// Chua ma
      private String text; //Chua ten

    public MyCombobox(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return  text ;
    }

    public void setText(String text) {
        this.text = text;
    }    

    public MyCombobox() {
    }
}
