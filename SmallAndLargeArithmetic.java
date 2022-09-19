package tddPractice;

public class SmallAndLargeArithmetic {


    public int sumThreeNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int multiplyThreeNumbers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int divideThreeNumbers(int num1, int num2, int num3) {
        return num1 / 3;
    }

    public int smallestOfThreeNumbers(int num1, int num2, int num3) {
        int smallestNumber = num2;
        if (num1 < smallestNumber) {
            smallestNumber = num1;
        }
        if (num1 < smallestNumber) {
            smallestNumber = num3;
        }
        return smallestNumber;
    }

    public int largestOfThreeNumbers(int num1, int num2, int num3) {
        int largestNumber = num1;
        if(num2 > largestNumber){
            largestNumber = num2;

        }
        if(num3 > largestNumber){
            largestNumber = num3;

        }

        return largestNumber;
    }
}











