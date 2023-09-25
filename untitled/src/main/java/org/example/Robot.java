package org.example;

class Robot {
    private int x;
    private int y;
    private int beam ;
    private int distance;
    private int angle;

    public Robot(int x, int y,int angle ,int beam,int distance) {
        this.x = x;
        this.y = y;
        this.beam = beam-90;
        this.distance = distance;
        this.angle = angle;
    }

    public String findObstacle(){
        if (beam < -90 || beam > 90 || distance < 0) {
            return "Erro";}
        double polarCoordinate =  distance;
        double Radians = Math.toRadians(angle + beam);
            int obstacleX = (int) Math.round(this.x +(polarCoordinate * Math.cos(Radians)));
            int obstacleY = (int) Math.round(this.y + (polarCoordinate * Math.sin(Radians)));
            StringBuilder coordinates = new StringBuilder();
            coordinates.append("(").append(obstacleX).append(",").append(obstacleY).append(")");
            return coordinates.toString();

    }

}
