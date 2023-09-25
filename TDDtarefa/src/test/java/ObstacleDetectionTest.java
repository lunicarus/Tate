import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class ObstacleDetectionTest {

    @Test
    @DisplayName("ShouldReturn (0,5)")
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
    @DisplayName("beam is greater than 90")
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
    @DisplayName("Beam interval is between 0 and 180")
    void beamIsBetween0And180(){
        int x = -4;
        int y = 4;
        int angle = 45;
        int beam = 135;
        int distance = 4;
        Bot testRobot = new Bot(x,y,angle,beam,distance);
        assertThat(testRobot.findObstacle()).isNotEqualTo("Erro");

    }
}