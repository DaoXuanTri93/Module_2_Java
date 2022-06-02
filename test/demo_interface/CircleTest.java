package demo_interface;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
   public void checkTest(){
        Circle circle = new Circle(12);
        double before = circle.area();
        double res = 123;
        Assertions.assertEquals(res,before,"that vong area");


    }

}