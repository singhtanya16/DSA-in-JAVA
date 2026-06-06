import java.util.Scanner;
public class array_loop {
    public static void main (String [] args ){
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter size of array : ");
        int size = sc.nextInt();

        int [] marks = new int [size];
// input in array using loop: 
        for (int i =0 ; i<size ; i++){
            System.out.print ("Enter the marks in array: ");
            marks [i] = sc.nextInt();
        }
// output in array using loop:
for (int i = 0 ; i<size ; i++){
    System.out.println ("Marks are: " + marks [i] );
   
}
}
}


//    int [] marks = new int [3];
//    marks [0] = 97;
//    marks [1] = 98;
//    marks [2] = 95;
//    for (int i = 0 ; i<3 ; i++){
//     System.out.println (marks [i]);
   

