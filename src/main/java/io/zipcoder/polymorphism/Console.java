package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Console {
    private Integer petAmount = 0;
    private ArrayList<Pet> petlist = new ArrayList<Pet>();

    public Console() {

    }

    public void getPetAmount() {
        Scanner petAmt = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        Integer amt = petAmt.nextInt();
        this.petAmount = amt;
    }

    public void makePetList() {

        int i = 0;
        while (i < petAmount) {
            Scanner petSelect = new Scanner(System.in);
            System.out.println("What kind of pet do you have?\n" +
                    "1.Dog   2.Cat   3.Bird");
            Integer selection = petSelect.nextInt();
            switch (selection) {
                case 1:
                    dogAdd();
                    i++;
                    break;
                case 2:
                    catAdd();
                    i++;
                    break;
                case 3:
                    birdAdd();
                    i++;
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        }
    }
    public void orderByName(){
        StringBuilder petPrinter = new StringBuilder();
        Collections.sort(this.petlist);
        petPrinter.append("Pets alphabetically by name: \n");
        for(Pet p:this.petlist){
            petPrinter.append(p.getName() + " ");
        }
        petPrinter.append("\n");
        System.out.println(petPrinter.toString());
    }
    public void orderByType(){
        StringBuilder petPrinter = new StringBuilder();
        Collections.sort(this.petlist, new PetComparator());
        petPrinter.append("Pets alphabetically by species: \n");
        for(Pet p:this.petlist){
            petPrinter.append(p.getName() + " ");
        }
        System.out.println(petPrinter.toString());
    }

    public void printNameAndTalk(){
        StringBuilder petPrinter = new StringBuilder();
        for(Pet p:this.petlist){
            petPrinter.append(p.getName() + ": ");
            petPrinter.append(p.speak()+"\n");
        }
        String petList = petPrinter.toString();
        System.out.println(petList);
    }

    public void dogAdd(){
        Scanner dogName = new Scanner(System.in);
        System.out.println("What is your dogs name?");
        String name = dogName.nextLine();
        Dog dog = new Dog(name, "dog");
        petlist.add(dog);
    }
    public void catAdd(){
        Scanner catName = new Scanner(System.in);
        System.out.println("What is your cats name?");
        String nameC = catName.nextLine();
        Cat cat = new Cat(nameC, "cat");
        petlist.add(cat);
    }
    public void birdAdd(){
        Scanner birdName = new Scanner(System.in);
        System.out.println("What is your birds name?");
        String nameB = birdName.nextLine();
        Bird bird = new Bird(nameB, "bird");
        petlist.add(bird);
    }
}