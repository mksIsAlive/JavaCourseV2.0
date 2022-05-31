package com.absoft.unit3;

public class Main {
    public static void main(String[] args) {
        DancingRobot robot1 = new BalletDancingRobot();
        DancingRobot robot2 = new FolkDancingRobot();

        System.out.println(robot1.getDanceType1());
        System.out.println(robot1.getDanceType2());
        System.out.println(robot1.getDefaultDanceType());
        System.out.println("===============\n");
    }
}
