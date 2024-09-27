package org.example.robot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Поведение робота
* */
public class Robot implements Behavior {

    private int x;
    private int y;

    // Первиччный номер шага, в координатах которого состоится пересечение
    private int firstStepTillCollision;

    // Сохранение траетории робота int steps - счетчик шагов, координаты положения int[x, y]
    private final Map<Integer, int[]> trace = new HashMap<>();

    //Счетчик шагов
    public int steps = 0;


    // Определяем координаты шага
    @Override
    public void move(Step d) {
        switch (d){
            case UP -> this.y ++;
            case DOWN -> this.y--;
            case LEFT -> this.x --;
            case RIGHT -> this.x++;

        }
        /* Если нет пересечений с пройденным путем, сохранияй коррдинаты этого шага,
            иначе сообщи - на какомшаге ты был здесь ранее
         */
        if (!isIntersection()) saveTrace();
        else {
            saveTrace();
            System.out.println("Я споткнулся на " + this.steps +
                    " шаге, потому что  я уже тут был! на  " + this.firstStepTillCollision
                    + " шаге ранее !");
        }


    }
    //Сохранение координат поде очередног шага
    private void saveTrace(){
        this.steps++;
        int[] temp =new int[] {this.x, this.y};
        trace.put(this.steps, temp);

    }



    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }

    /* Вывод пройденного пути в виде 3[1, 2], 4[2,2] s String, где
       перчислены шаги и координаты [x, y], где был раньше   */
    public String readTrace(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i: this.trace.keySet()){
            stringBuilder.append(Integer.toString(i))
                    .append("-").append(Arrays.toString(this.trace.get(i)));
        }
        return stringBuilder.toString();

    }
    private boolean isIntersection(){
        for (int i: this.trace.keySet()){
            int[] t = this.trace.get(i);

            if (t[0] ==this.x  & t[1] == this.y) {
                this.firstStepTillCollision = i;
                return true;
            }

        }
        return false;
    }

}
