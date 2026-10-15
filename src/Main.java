import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter a character");
            char ch =scn.nextLine().charAt(0);
            if((int)ch>=65 && (int)ch <=90){
                System.out.print("Upper case");
            }
            else if((int)ch>=97 && (int)ch<=122){
                System.out.print("Lower case");
            }
            else{
                System.out.print("Invalid");
            }
        }}
