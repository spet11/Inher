package com.In;

public class Earth {
    void animal (){
        System.out.println("i like animal like dog,horse,elephant");
    }
    }
    class   Bird extends Earth{
     void fly(){
         System.out.println("i like also bird like parrot,dove,crow");
     }
        }
class sea extends Bird {
    void swim() {
        System.out.println("i like fish like dolphin,jelly fish, blue wheal");
    }
}
    class human extends sea{
        void man (){
            System.out.println("Human is nice community");
        }

    public static void main(String[] args) {
        human hu= new human();
        hu.animal();
        hu.fly();
        hu.swim();
        hu.man();

    }
}