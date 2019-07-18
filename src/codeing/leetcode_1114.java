package codeing;

public class leetcode_1114 {
    class Foo {

        public Foo() {

        }
        volatile int num=1;


        public void first(Runnable printFirst) throws InterruptedException {


            while(num!=1){

            }
            printFirst.run();
            num=2;


            // printFirst.run() outputs "first". Do not change or remove this line.

        }

        public void second(Runnable printSecond) throws InterruptedException {

            while(num!=2){

            }
            printSecond.run();
            num=3;


            // printSecond.run() outputs "second". Do not change or remove this line.

        }

        public void third(Runnable printThird) throws InterruptedException {

            while(num!=3){

            }
            printThird.run();
            num=1;


            // printThird.run() outputs "third". Do not change or remove this line.

        }
    }

}
