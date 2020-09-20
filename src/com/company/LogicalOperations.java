package com.company;

public class LogicalOperations {

    public int number(int number) {
        if (number >= 2 && number <= 8) {
            return (number);

        }

        return 0;
    }


    public String MultitudeofNumber(int number) {
        if (number > 3 && number != 4) {
            return (" The number is greater than 3 and not equal to 4");
        } else if (number == 4) {
            return (" The number is lower than 3");
        } else if (number < 3) {
            return ("The number is lower than 3");

        }
        return " The numbers are invalid";

    }

    public String checknumberint(int number) {
        if (number >= 8 && number == 6) {
            return ("The amount of snow this winter was(cm)& number" + "number");
        } else
            return ("The forecast snow is(cm):" + "number");

    }

    public void printnumber(int startNumber) {

        for (int i = startNumber; i >= -100; i--) {
            System.out.println(i);

        }
    }


    public void countNumber(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i == 1; i++) {
            for (int j = secondNumber; j == 1; j++) {
                System.out.println(i + " to " + j);
            }
        }
    }

    public void checkBiggerNumber(int biggerNumber, int bigestNumber) {
        for (int i = biggerNumber; i == 10; i++) {
            for (int j = bigestNumber; j == 20; j++) {
                if (i == 10 && j == 20) {
                    System.out.println(j + "from " + i);
                }
            }
        }

    }

    public void allevennumberfrom1to100(int firstevennumber, int lastevennumber) {
        for (int i = firstevennumber; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void alloddnumberfrom1to100(int firstoddnumber, int lastoddnumber) {
        for (int i = firstoddnumber; i < 100; i++) {
            if (i % 2 ==1){
                System.out.println(i);
            }
        }
    }

    public void sumnumber(int sart, int last) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1;
            System.out.println(sum);
        }

    }


    public void averagenumber(int start, int last) {
        int average = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(average);
        }
    }

    public void countingnumber(int start, int finish) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;

        }
    }
    public void countnegativenumber(int start, int finish){
        int i = 1;
        while(i>= -100){
            System.out.println(i);
            i--;
        }
    }


    public void countnumberwhile(int start, int finish){
        int i=1;
        int j=1;
        while(i == start){
            System.out.println(i);
            i++;
            while(j== finish){
                System.out.println(j);
                j++;
            }

        }
    }


    public void bignumberwhile (int start, int second){
        int i=1;
        int j=1;
        while (i== start){
            while(j==second){
                System.out.println(j+ "to" + i);
                i++;
                j++;
            }
        }
    }

public void evennumberwhile (int firstenennumer, int lastevennumber){
        int i=1;

}
    }













