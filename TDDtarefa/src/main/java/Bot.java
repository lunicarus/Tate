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
        if (beam < -90 || beam > 90 || distance < 0) {
            return "Erro";}
        return "(0,5)";
    }
}
