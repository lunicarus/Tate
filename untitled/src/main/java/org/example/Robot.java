package org.example;

import java.util.Objects;

class Robot {
    private int x;
    private int y;
    private int beam ;
    private int distance;
    private int angle = 90;

    public Robot(int x, int y, int beam, int distance) {
        this.x = Objects.requireNonNull(x,"Null Values for X are Not allowed");
        this.y = Objects.requireNonNull(y,"Null Values for Y are Not allowed");
        this.beam = Objects.requireNonNull(beam,"Null Values for beam are Not allowed");
        this.distance = Objects.requireNonNull(distance,"Null Values for Distance are Not allowed");
    }
    public Robot(int x, int y, int beam, int distance,int angle) {
        this.x = Objects.requireNonNull(x,"Null Values for X are Not allowed");
        this.y = Objects.requireNonNull(y,"Null Values for Y are Not allowed");
        this.beam = Objects.requireNonNull(beam,"Null Values for beam are Not allowed");
        this.distance = Objects.requireNonNull(distance,"Null Values for Distance are Not allowed");
        this.angle = angle;
    }

    public String findObstacle(){
        double Radians = Math.toRadians(angle - 90);
        if (beam < 0 || beam > 180 || distance < 0 || distance > 800) {
            return "Erro";}
        else {
            int deltaX = (int) (distance * Math.cos(Radians));
            int deltaY = (int) (distance * Math.sin(Radians));
            StringBuilder cordenates = new StringBuilder("(");
            cordenates.append(deltaX);cordenates.append(",");
            cordenates.append(deltaY);cordenates.append(")");
            return cordenates.toString();
        }
    }

}
