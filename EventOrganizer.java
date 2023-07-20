package PracticeTasks;

import java.util.Scanner;

public class EventOrganizer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int heat;
        System.out.println("Please enter temperature of weather");
        heat=input.nextInt();
        if(heat<5){
            System.out.println("YOU CAN GO TO SKKING");
        }
        if(heat>=5 && heat<=25){
            if(heat>5 && heat<15){
                System.out.println("YOU CAN GO TO CINEMA");
            }
            else if(heat>=15 && heat<25){
                System.out.println("YOU CAN GO TO PICNIC");
            }
        }
        else if(heat>=25) {
            System.out.println("YOU CAN GO SWIMMING");
        }
    }
}
