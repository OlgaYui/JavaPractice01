import java.util.Scanner;

public class Temperature {
    static void main(String[] args) {

        System.out.println("A guide on how to wear for certain weather!(I haven't figured it out yet <3 )");

        String repeats;

        Scanner scanner;
        do {
            scanner = new Scanner(System.in);
            System.out.println("What do you prefer to enter, the weather(a description) or the temperature?");
            String userAnswer = scanner.nextLine();
            String WeatherAnswer = "weather";
            String TempAnswer = "temperature";


            if (userAnswer.equals(WeatherAnswer)) {
                System.out.println("Can you describe the weather?");
                String ans01 = "windy";
                String ans02 = "cold";
                String ans03 = "sunny";
                String ans04 = "rainy";
                String ans05 = "foggy";
                String ans06 = "snowy";
                String userAnswerWeather = scanner.nextLine();

                if (userAnswerWeather.equals(ans01)) {
                    System.out.println("It's better to wear a windbreaker");
                } else if (userAnswerWeather.equals(ans02)) {
                    System.out.println("I don't care, just throw on something warm, okay?");
                } else if (userAnswerWeather.equals(ans03)) {
                    System.out.println("Nice, you can just vibe");
                } else if (userAnswerWeather.equals(ans04)) {
                    System.out.println("unluck unluck");
                } else if (userAnswerWeather.equals(ans05)) {
                    System.out.println("In my restless dreams, I see that town... Silent Hill...");
                } else if (userAnswerWeather.equals(ans06)) {
                    System.out.println("It's better to wear a jacket");
                } else {
                    System.out.println("Incorrect answer");
                }

            }

            if (userAnswer.equals(TempAnswer)) {
                System.out.println("Give me the temperature in Celsius");
                int userAnswerTemp = scanner.nextInt();
                scanner.nextLine();
                if (userAnswerTemp < 0) {
                    System.out.println("It's very cold outside, so you'd better wear something warm");
                } else if (userAnswerTemp > 30) {
                    System.out.println("It's hot as hell!!!");
                } else {
                    System.out.println("The best weather!");
                }

            }
            System.out.println("Do you wanna try again? yes/no");
            repeats = scanner.nextLine();
        } while (repeats.equals("yes"));


        scanner.close();
    }

}
