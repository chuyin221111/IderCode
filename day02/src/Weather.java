import java.util.Random;

public class Weather {
    int temperature;
    int humidity;

    public Weather() {
        this.temperature=new Random().nextInt(36);
        this.humidity=new Random().nextInt(41)+30;
    }
    public boolean isComfortable(int temperature,int humidity) {
        if ((temperature <= 25) && (temperature >= 15) && (humidity >= 50) && (humidity <= 70))
        {
            return true;
        }
        return false;
    }

     public void print()
     {
         System.out.println("温度："+temperature+",湿度："+humidity);
     }
}
