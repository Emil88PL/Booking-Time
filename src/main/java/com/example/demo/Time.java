package com.example.demo;
public class Time {
    public static void main(String[] args) {
        int time;
          
        int price = GetPrice(61);
        System.out.println("Cost of booking will be: £" + price); 
    }
    public static int GetPrice(int time) {
      if (time <= 6) {
        return time*2; // per minute
      } else if (time > 11 && time <= 60) {
           return 22; // per hour
      }
      else  if (time >= 61 && time <= 120) {
            return 44; // 2h 
      }
        else if (time > 120 && time <= 180) {
           return 60; // 3h up - £6 use daily price of £60
      }
       else if (time >= 181 && time < 1440) {
           return 60; // per day
      }
      else  if (time >= 1440 && time < 2880) {
           return 105; // per week
      }
      else  if (time >= 2880 && time < 9999) {
       return 210; // more than week
  }
    return time;
}

}