package project;

import project.api.HttpClientService;
import project.api.open_weather.CityOwResponse;
import project.services.WeatherService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        var isRunning = true;
        var isFirstRun = true;
        while (isRunning){
            if(isFirstRun) {
                System.out.println("""
                        -------------------
                        type X to quit
                        type Y to get a weather stats
                        -------------------
                        """);
                isFirstRun = false;
            }

            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();

            switch (userInput) {
                case "X" -> isRunning = false;
                case "Y" -> {
                     final CityOwResponse weatherFromOpenWeather = new WeatherService().getWeatherFromOpenWeather();
                    System.out.println("City name: " + weatherFromOpenWeather.getName());
                }
                default -> System.out.println("ERROR! INVALID INPUT!");
            }
        }
    }
}
