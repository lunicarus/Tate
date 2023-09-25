import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class ObstacleDetectionTest {

    @Test
    @DisplayName("Should Return (0,5)")
    void ShouldReturn05(){
    int x = 0;
    int y = 0;
    int angle = 45;
    int beam = 45;
    int distance = 5;
    Bot testRobot = new Bot(x,y,angle,beam,distance);
        assertThat(testRobot.findObstacle()).isEqualTo("(0,5)");
    }
    @Test
    @DisplayName("Beam is greater than 90")
    void beamGreaterThan90Test(){
        int x = 0;
        int y = 0;
        int angle = 45;
        int beam = 181;
        int distance = 5;
        Bot testRobot = new Bot(x,y,angle,beam,distance);
        assertThat(testRobot.findObstacle()).isEqualTo("Erro");
    
    }

    @Test
    @DisplayName("Beam is lower than -90")
    void beamLowerThan90Test(){
        int x = 0;
        int y = 0;
        int angle = 45;
        int beam = -91;
        int distance = 5;
        Bot testRobot = new Bot(x,y,angle,beam,distance);
        assertThat(testRobot.findObstacle()).isEqualTo("Erro");

    }
    @Test
    @DisplayName("Beam is between 0 and 180")
    void beamIsBetween0180(){
        int x = -4;
        int y = 4;
        int angle = 45;
        int beam = 135;
        int distance = 4;
        Bot testRobot = new Bot(x,y,angle,beam,distance);
        assertThat(testRobot.findObstacle()).isNotEqualTo("Erro");

    }
    @Test
    @DisplayName("Distance greater than 0")
    void DistanceGreaterThan0(){
        int x = -4;
        int y = 4;
        int angle = 45;
        int beam = 135;
        int distance = -1;
        Bot testRobot = new Bot(x,y,angle,beam,distance);
        assertThat(testRobot.findObstacle()).isEqualTo("Erro");

    }
    @Test
    @DisplayName("Should return (10,20)")
    void ShouldReturn1020(){
        int x = 10;
        int y = 10;
        int angle = 45;
        int beam = 45;
        int distance = 10;
        Bot testRobot = new Bot(x,y,angle,beam,distance);
        assertThat(testRobot.findObstacle()).isEqualTo("(10,20)");
    }
}