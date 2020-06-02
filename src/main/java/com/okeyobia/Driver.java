package com.okeyobia;

import java.util.Scanner;


public class Driver {

    public static void main(String[] args) {
        System.out.println("Enter your vehicle type.");
        System.out.println("car, truck, bus, motorcycle");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
      int premium = switch (type) {
            case "car" -> 200;
            case "truck" -> 300;
            case "bus" -> 400;
            case "motorcycle" -> {
                System.out.println("Enter your motor motorcycle: ");
                System.out.println("1 (low power), 2 (medium), 3 (high)");
                int mType = scanner.nextInt();
                yield getMotorType(mType);

            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
      scanner.close();
        System.out.println("The premium is $" + premium);
    }

    private static int getMotorType(int mType) {
        return switch (mType) {
             case 1 -> 300;
             case 2 ->  400;
             case 3 -> 500;
             default -> throw new IllegalStateException("Unexpected value: " + mType);
         };

    }

}


