package com.example.demo;


public class Time {
    public static void main(String[] args) {
        int time;
        
        Gettime(181);
    }

    public static void Gettime(int time) {
      if (time <= 6) {
        System.out.println("Cost of booking will be: " + "£" + time*2); // per minut
      } else if (time > 11 && time <= 60) {
            System.out.println("Cost of booking will be: " + "£" + 22); // per hour
      }
      else  if (time >= 61 && time <= 120) {
            System.out.println("Cost of booking will be: " + "£" + 44); // 2h 
      }
        else if (time > 120 && time <= 180) {
            System.out.println("Cost of booking will be: " + "£" + 60); // 3h up - £6
      }
       else if (time >= 181 && time < 1440) {
            System.out.println("Cost of booking will be: " + "£" + 60); // per day
      }
      else  if (time >= 1440 && time < 2880) {
            System.out.println("Cost of booking will be: " + "£" + 105); // per week
      }
}   
}