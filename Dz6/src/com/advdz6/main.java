package com.advdz6;
public class main {
    public static void main(String[] args) {
        Phone iphone = new Phone(111,"IPhoneXS",150);{
            System.out.println("Model: " + iphone.model + " number: " + iphone.number + " weight: " + iphone.weight);
            System.out.println(iphone.getNumber(iphone.number));
            System.out.println(iphone.receiveCall("Yuriy"));
        }
        Phone samsung = new Phone(222,"Samsung S10",170);{
            System.out.println("Model: " + samsung.model + " number: " + samsung.number + " weight: " + samsung.weight);
            System.out.println(samsung.getNumber(samsung.number));
            System.out.println(samsung.receiveCall("Jhonny"));
        }
        Phone nokia = new Phone(333,"nokia991",999);{
            System.out.println("Model: " + nokia.model + " number: " + nokia.number + " weight: " + nokia.weight);
            System.out.println(iphone.getNumber(nokia.number));
            System.out.println(iphone.receiveCall("Antoine"));
        }
    }
}
