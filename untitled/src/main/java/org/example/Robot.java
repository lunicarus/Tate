package org.example;

import java.util.Objects;

class Robot {
    private int x;
    private int y;
    private int beam ;
    private int distance;
    private int angle = 90;

    public Robot(int x, int y, int beam, int distance) {
        this.x = x;
        this.y = y;
        this.beam = beam;
        this.distance = distance;
    }
    public Robot(int x, int y, int beam, int distance,int angle) {
        this.x = x;
        this.y = y;
        this.beam = beam;
        this.distance = distance;
        this.angle = angle;
    }

    public String findObstacle(){
        double Radians = Math.toRadians(angle - 90);
        if (beam < 0 || beam > 180 || distance < 0 || distance > 800) {
            return "Erro";}
        else {
            this.x += (int) (distance * Math.cos(Radians));
            this.y += (int) (distance * Math.sin(Radians));
            StringBuilder cordenates = new StringBuilder("(");
            cordenates.append(x);cordenates.append(",");
            cordenates.append(y);cordenates.append(")");
            return cordenates.toString();
        }
    }

}
