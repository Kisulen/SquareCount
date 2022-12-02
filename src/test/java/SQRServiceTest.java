import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test

public void SquareWithinLimits () {
        SQRService service = new SQRService();

        int expected = 4;
        int actual = service.squareCount(195, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void BorderlineValues () {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.squareCount(100, 289);

        Assertions.assertEquals(expected, actual);
    }

    @Test
     public void NoOverlap () {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.squareCount(50, 98);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NegativeValues () {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.squareCount(-315, -7);

        Assertions.assertEquals(expected, actual);
    }

}
