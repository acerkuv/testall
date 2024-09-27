import org.example.robot.Robot;
import org.example.robot.Robot.*;
import org.example.robot.Step;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRobot {
    @Test
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setX(0); robot.setY(0);
        List<Step> trace = new ArrayList<Step>
                (Arrays.asList(Step.UP, Step.UP, Step.RIGHT, Step.UP, Step.RIGHT,
                        Step.DOWN, Step.LEFT));
                for(Step s: trace.stream().toList()){
                    robot.move(s);
                }
        }

    }


