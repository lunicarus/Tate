package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int angle = scanner.nextInt();
        int beam = scanner.nextInt();
        int distance = scanner.nextInt();
        scanner.close();
        CartesianPlane plane = new CartesianPlane(x1,y1);
        Robot robot = new Robot(plane.getX(), plane.getY(), angle, beam,distance);
        System.out.println(robot.findObstacle());
    }
}