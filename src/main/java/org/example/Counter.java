package org.example;

public class Counter {
    int num;


    public Counter(int startValue) {
        this.num = startValue;
    }

    public Counter() {
        num = 0;
    }

    public int value() {
        return this.num;
    }

    public void increase() {
        num += 1;
    }

    public void decrease() {
        num -= 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            increaseBy = 0;
        } else {
            num += increaseBy;
        }
    }
    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            decreaseBy = 0;
        } else {
            num -= decreaseBy;
        }
    }
    public static void main(String[] args) {
        // COUNTER CONSTRUCTORS PORTION ******---------------------********

        Counter num = new Counter();

        num.increase();
        num.increase();
        num.decrease();
        System.out.println(num.value());

        num.increase(27);
        num.decrease(97);

        System.out.println(num.value());
    }





}
