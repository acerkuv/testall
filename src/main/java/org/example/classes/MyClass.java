package org.example.classes;

import static java.lang.System.out;

public class MyClass {
    public static void main(String[] args){
        Robot robot = new Robot();

        //Специальное представление через "--" 3 раза
        robot.setModel("Verter");
        out.println(robot.getSpecialModel());

        //Сортировка имен с окончанием на "a"
        robot.setNames(new String[]{"Alpha", "Tomas", "Dyson", "Raketa", "Bosh", "Puma"});
        out.println( robot.sortNames());

        //Подпись заглавными
        out.println(robot.robotSign());
    }
}
