package Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] arrayA = {1, 2, 4, 3, 1, 6, 1};
        int valueToRemove = 11;
        Test a = new Test();
        System.out.println(Arrays.toString(a.removeValueFromintArray(arrayA, valueToRemove)));

        int[] arrayB = {-1, -3, 4, 2};
        Test b = new Test();
        System.out.println(b.smallestPos(arrayB));

        Test c = new Test();
        c.pointsCalculation(70);

    }

    public int[] removeValueFromintArray(int[] intArrayToRemoveValue, int valueToRemove) {
        int count = 0;
        for (int i = 0; i < intArrayToRemoveValue.length; i++) {
            if (intArrayToRemoveValue[i] == valueToRemove) {
                count++;
            }
        }
        int[] arrayWithRemovedValue = new int[intArrayToRemoveValue.length - count];
        int n = 0;
        for (int j = 0; j < intArrayToRemoveValue.length; j++) {
            if (intArrayToRemoveValue[j] == valueToRemove) {
                continue;
            } else if (intArrayToRemoveValue[j] != valueToRemove) {
                arrayWithRemovedValue[n] = intArrayToRemoveValue[j];
                n++;
            }
        }
        return arrayWithRemovedValue;
    }

    public int smallestPos(int[] numbers) {
        int smallestNumber = 1;
        int tmp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        int counter = 0;
        for (int n = 0; n < numbers.length; n++) {

            if (numbers[n] > 0) {
                if (numbers[n] == 1) {
                    counter++;
                }
                if (n == numbers.length - 1) {
                    if (counter == 0) {
                        return 1;
                    } else {
                        return smallestNumber;
                    }
                } else if (numbers[n + 1] - numbers[n] > 1) {
                    smallestNumber = numbers[n] + 1;
                    if (counter == 0) {
                        return 1;
                    }
                    break;
                }
            }
        }
        return smallestNumber;
    }

    public void pointsCalculation(int speed) {
        int speedLimit = 70;
        int maxSpeed = 130; //max speed when dl will be suspended

        int speedOverLimit = speed - speedLimit;
        int points = speedOverLimit / 5;
        if (speed <= speedLimit) {
            System.out.println("Your speed is " + speed + " Points " + points
                    + "\nThank you for driving within the speed limit");
        } else if (speed >= maxSpeed) {
            System.out.println("Your speed is " + speed + " " + points + " points " + "\n" + "License suspended");
        } else System.out.println("Your speed is " + speed + " - Points " + points);
    }

}
