public class Bot {
    private int x;
    private int y;
    private int angle;
    private int beam;
    private int distance;
    public Bot(int x, int y, int angle, int beam, int distance) {
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.beam = beam-90;
        this.distance = distance;

    }

    public String findObstacle() {
        if (beam < -90 || beam > 90 || distance <= 0 || distance > 8) {
            return "Erro";}
        double polarCoordinate =  distance;
        double Radians = Math.toRadians(angle) - Math.toRadians(beam);
        int obstacleX = (int) Math.round(this.x +(polarCoordinate * Math.cos(Radians)));
        int obstacleY = (int) Math.round(this.y + (polarCoordinate * Math.sin(Radians)));
        StringBuilder coordinates = new StringBuilder();
        coordinates.append("(").append(obstacleX).append(",").append(obstacleY).append(")");
        return coordinates.toString();
    }

    public int getBeam() {
        return this.beam;
    }

    public int getDistance() {
        return distance;
    }
}
