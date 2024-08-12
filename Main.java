import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Enter the amount of money you will use for your expenses:");
        double total = scan.nextDouble();

        int day = 0;
        double sum = 0.00;
        int i = 0;

        ArrayList<Double> proportion = new ArrayList<Double>();
        System.out.println("Enter the proportion for each day");
        do{
            System.out.println("Proportin for day " + (i + 1 )+ " :");
            double value = scan.nextDouble();
            proportion.add(value);
            sum += proportion.get(i);
            i ++;
        } while(sum<=100);
        scan.close();

        double cumulativesum = 0;
        if(sum > 100){
            for(int j=0; j< proportion.size() - 1; j++){
                cumulativesum += proportion.get(j);
            }
            proportion.set(proportion.size()-1, 100 - cumulativesum);
        }

        double result;
        System.out.println("\n");
        for(double value : proportion){
            result = value * total / 100;

            System.out.println("Proportin for day " + (day + 1 )+ " : " + result);
            day ++;
        }

    }    
}