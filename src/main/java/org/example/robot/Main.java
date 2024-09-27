package org.example.robot;
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        //Путь робота начинается с установленных координат
        robot.setX(0); robot.setY(0);

        // Шагай до тех пор, пока не наступишь на свой след
        robot.move(Step.UP);
        robot.move(Step.RIGHT);
        robot.move(Step.DOWN);
        robot.move(Step.LEFT);
        robot.move(Step.UP);

        //Вывод координат всего пути
        System.out.println("Я перемещался по этим координатам" + robot.readTrace());
    }
}
