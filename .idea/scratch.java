 import java.util.Arrays;
import java.util.Scanner;
class program {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int[] mas;
        int sum = 0;
        double m = 0;
        int x= sc.nextInt();
        int factorial=0;
        int chet=0;
        sc.close();


        mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = ((int) (Math.random() * 10) + 100);
            System.out.println(mas[i]);
        }
        for(int i  = 0; i<mas.length; i++)
        {
            sum=sum+mas[i];
        }
        System.out.println(sum);
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) {

            System.out.println(mas[i]);
        }
        for (int i=1; i<mas.length;i++)
        {
            m=m+1/i;

        }
        System.out.println(m);
        factorial=x;
        for(int i =1; i<mas.length;i++){
            factorial*=x-i;}
        System.out.println(factorial);

    }



}