package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private String model;
    private String[] names;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    //Специальное представление через "--" 3 разаs
    public String getSpecialModel(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3 ; i++) {
            if (i != 2) stringBuilder.append(this.model).append("--");
            else stringBuilder.append(this.model);

        }
        return stringBuilder.toString();
    }

    //Сортировка имен с окончанием на "a"
    public List sortNames(){
        List<String> a = new ArrayList<String>();
        for (String s: this.names) if(s.endsWith("a")) a.add(s);
        return a;
    }

    //Подпись заглавными
    public String robotSign(){
        return this.model.toUpperCase();
    }

}
