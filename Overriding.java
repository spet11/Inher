package com.In;

class Tax2021 {
    void Tax() {

        System.out.println("Council tax  was 2021 150.00");

    }
}
    class Tax2022 extends Tax2021 {
        void Tax() {
            System.out.println("Council tax is 150.00");
        }
    }

    public class Overriding {

        public static void main(String[] args) {
            Tax2022 ta =new Tax2022();
            ta.Tax();





        }
    }
