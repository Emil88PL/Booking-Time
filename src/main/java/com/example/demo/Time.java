package com.example.demo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Time {
    public int GetPrice(int durationMinutes) {

     int price = 0;
     Map<String,Integer> prices = new HashMap<>();
     prices.put("minute", 2);
     prices.put("hour", 22);
     prices.put("day", 60);
     prices.put("week", 105);

     int weeks = durationMinutes / (60 * 24 * 7);
     int days = (durationMinutes % (60 * 24 * 7)) / (60 * 24);
     int hours = ((durationMinutes % (60 * 24 * 7)) % (60 * 24)) / 60;
     int minutes = ((durationMinutes % (60 * 24 * 7)) % (60 * 24)) % 60;

     if (weeks > 0) {
          price += weeks * prices.get("week");
     }
     if (days > 0) {
          price += days * prices.get("day");
     }
     if (hours > 0) {
          price += hours * prices.get("hour");
     }
     if (minutes > 0) {
          price += minutes * prices.get("minute");
     }

     return price;
    }
}