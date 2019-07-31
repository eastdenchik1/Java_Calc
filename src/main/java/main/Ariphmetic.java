package main;



public class Ariphmetic {

    public long add(long num1, long num2) {
        return num1 + num2;
    }

    public long sub(long num1, long num2) {
        return num1 - num2;
    }

    public long mul(long num1, long num2) {
        return num1 * num2;
    }

    public long div(long num1, long num2) {
        long res = 0;
        try {
            res = num1/num2;
        } catch (ArithmeticException e) {
            e.getMessage();
        }
        return res;
    }

    public long mod(long num1, long num2) {
        long res = 0;
        try {
            res = num1%num2;
        } catch (ArithmeticException e) {
            e.getMessage();
        }
        return res;
    }



}
