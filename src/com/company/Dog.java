package com.company;
public  class Dog {
    // instance variable
    public String breed;
    public String size;
    public String color;
    public int age;

    public void testDog(){ // Data input for Dog Object 1
        this.size ="Large";
        this.breed ="Beagle";
        this.color ="Orange";
        this.age = 5;
        System.out.println("Dog Object 1: \n Breed: "+breed+"\n Size: "+size+"\n Color: "+color+" Age: "+age+" ");
    }
    public void testDog2(){ // Data input for Dog Object 2
        this.size ="Bulldog";
        this.breed ="Large";
        this.color ="Orange";
        this.age = 6;
        System.out.println("Dog Object 2: \n Breed: "+breed+"\n Size: "+size+"\n Color: "+color+" Age: "+age+" ");
    }
    public void testDog3(){ // Data input for Dog Object 3
        this.size ="German Shepherd";
        this.breed ="Large";
        this.color ="white and Orange";
        this.age = 6;
        System.out.println("Dog Object 3: \n Breed: "+breed+"\n Size: "+size+"\n Color: "+color+" Age: "+age+" ");
    }

}