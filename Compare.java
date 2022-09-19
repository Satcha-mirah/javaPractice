package tddPractice;

public class Compare {

    public int enterOneInteger(int num1) {
        if (num1 <= 0 ) {
            System.out.println("Invalid input");
        }
        int input = num1;

        return input;
    }

    public int getSquaredNumber(int num1) {
        return (int) Math.pow(num1,2);
    }

    public boolean inputGreaterNumbers(int num1) {
      if(num1 > 100){
          return true;
      }
      else {
          return false;
      }
    }

    public boolean inputEqualNumbers(int num1) {
       if(num1 == 100) {
           return true;
       }
       else{
           return false;
       }
    }

    public boolean sqrGreaterThan100(int num) {
        if(num*num > 100){
            return true;
        } else {
            return false;
        }
    }


    public boolean sqrEqualNumber(int num) {
        if(num*num == 100){
            return true;
        } else {
            return false;
        }
    }

    }


