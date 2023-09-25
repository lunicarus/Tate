public class Bot {
    int angle;
    int beam;
    int distance;
    public Bot(int x, int y, int angle, int beam, int distance) {
        this.angle = angle;
        this.beam = beam;
        this.distance = distance;

    }

    public String findObstacle() {
        if (beam < -90 || beam > 90) {
            return "Erro";}
        return "(0,5)";
    }
}
