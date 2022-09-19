//package assignment;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//class AirConditionerTest {
//    @Test
//    public void turnOnAcTest() {
//        AirConditioner myAC = new AirConditioner();
//        myAC.setOn(true);
//        assertEquals(true, myAC.getACIsOn());
//
//    }
//
//
//    @Test
//    public void turnOffACTest() {
//        AirConditioner myAC = new AirConditioner();
//        myAC.setOn(false);
//        assertEquals(false, myAC.getACIsOn());
//
//
//    }
//
//    @Test
//    public void increaseTemperature() {
//        // given that I have an AC
//        AirConditioner myAC = new AirConditioner();
//        // it is on
//        myAC.setOn(true);
//        // and temperature is at 0
//        // when I increase temperature
//        myAC.increaseTemperature();
//        // check that the temperature increases to 1
//        assertEquals(1, myAC.getTemperature());
//    }
//
//
//    @Test
//    public void decreaseTemperature() {
//
//        // given that I have an AC
//        AirConditioner myAC = new AirConditioner();
//        // it is on
//        myAC.setOn(true);
//        // and temperature is at 20
//        myAC.setTemperature(20);
//        // when I decrease temperature
//        myAC.decreaseTemperature();
//        // check that the temperature decreases to 19
//        assertEquals(19, myAC.getTemperature());
//
//    }
//
//    @Test
//    public void increaseTemperatureBeyond30() {
//        // given that I have an AC
//        AirConditioner myAC = new AirConditioner();
//        // it is on
//        myAC.setOn(true);
//        // and temperature is at 30
//        myAC.setTemperature(30);
//        // when I increase temperature beyond 30
//        myAC.increaseTemperature();
//        // check that temperature is still at 30
//        assertEquals(30, myAC.getTemperature());
//    }
//
//    @Test
//    public void decreaseTemperatureBelow16() {
//        // given that I have an AC
//        AirConditioner myAC = new AirConditioner();
//        // it is on
//        myAC.setOn(true);
//        // and temperature is at 16
//        myAC.setTemperature(16);
//        // when I decrease temperature below 16
//        myAC.decreaseTemperature();
//        // check that temperature is still at 16
//        assertEquals(16, myAC.getTemperature());
//
//    }
//
//}