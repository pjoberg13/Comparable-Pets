package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private Integer petAmount = 0;


    public Console(){

    }
    public void getPetAmount(){
        Scanner petAmt = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        Integer amt = petAmt.nextInt();
        this.petAmount = amt;
    }
    public void getPetKind(){
        Scanner petKind = new Scanner(System.in);
        System.out.println("What kind of pets do you have?");
    }
}
