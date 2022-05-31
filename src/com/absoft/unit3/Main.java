package com.absoft.unit3;

public class Main {
    public static void main(String[] args) {
        DancingRobot robot1 = new BalletDancingRobot();
        DancingRobot robot2 = new FolkDancingRobot();
        DancingRobot robot3 = new JazzDancingRobot();

        printRobotInfo(robot1);
        printRobotInfo(new FolkDancingRobot());
        printRobotInfo(new JazzDancingRobot());
    }

    private static void printRobotInfo(DancingRobot robot1) {
        System.out.println("===============\n");
        System.out.println("Type 1: " + robot1.getDanceType1());
        System.out.println("Type 2: " + robot1.getDanceType2());
        System.out.println("Default dance type: " + robot1.getDefaultDanceType());
        System.out.println("===============\n");
    }
}
