package org.example.classes;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args){
        Robot robot = new Robot();
        robot.setModel("Verter");

        //Вывод модели
        out.println("Моя модель  " + robot.getModel());

        //Специальное представление через "--" 3 раза
        out.println("Спецальный вывод имени "  + robot.getSpecialModel());

        //Сортировка имен с окончанием на "a"
        robot.setNames(new String[]{"Alpha", "Tomas", "Dyson", "Raketa", "Bosh", "Puma"});
        out.println("Сортировка имен по окончанию:  " +  robot.sortNames());

        //Подпись заглавными
        out.println("Вывод имени заглаными: " + robot.robotSign());
    }
}
