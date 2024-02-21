import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double math, physics, tur, chem, music,totalNum=0;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Math grade :");
        math = input.nextInt();
        if (math<0 || math>100){
            System.out.println("Math grade will not be considered.");
            math = 0;
        } else {
            totalNum+=1;
        }

        System.out.print("Physics grade :");
        physics = input.nextInt();
        if (physics<0 || physics>100) {
            System.out.println("Physics grade will not be considered.");
            physics = 0;
        } else {
            totalNum+=1;
        }

        System.out.print("Turkish grade :");
        tur = input.nextInt();
        if (tur<0 || tur>100) {
            System.out.println("Turkish grade will not be considered.");
            tur = 0;
        }else {
            totalNum+=1;
        }

        System.out.print("Chemistry grade :");
        chem = input.nextInt();
        if (chem<0 || chem>100) {
            System.out.println("Chemistry grade will not be considered.");
            chem = 0;
        }else {
            totalNum+=1;
        }

        System.out.print("Music grade :");
        music = input.nextInt();
        if (music<0 || music>100) {
            System.out.println("Music grade will not be considered.");
            music = 0;
        }else {
            totalNum+=1;
        }

        avg = (math + physics + tur + chem + music)/totalNum;
        System.out.println("Your average grade:" + avg);
        if (avg<55){
            System.out.print("You failed, have to take the class again!");
        }
    }
}