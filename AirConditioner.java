package assignment;

public class AirConditioner {
   private int temperature;

   private boolean isOn;

   public void setOn(boolean value){
      isOn = value;
   }

   public boolean getACIsOn(){
      return isOn;
   }

   public void increaseTemperature() {
      if (temperature < 30){
         temperature = temperature + 1;
      }

   }

   public int getTemperature() {
      return temperature;
   }
   public void decreaseTemperature() {
      if (temperature > 16) {
         temperature = temperature - 1;
      }
   }


   public void setTemperature(int degree) {
      temperature = degree;
   }

}
