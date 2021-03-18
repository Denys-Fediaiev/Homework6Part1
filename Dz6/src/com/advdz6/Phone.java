package com.advdz6;

public class Phone {
        int number;
        String model;
        int weight;
        public static String receiveCall(String name) {
                return "Звонит: " + name;
        }
        public static int getNumber(int number) {
                return number;
        }
        public Phone (int number,String model,int weight){
                this.number = number;
                this.model = model;
                this.weight = weight;
        }
        public Phone (int number,String model){
                this.number = number;
                this.model = model;
        }
        public Phone (){
        }
}
