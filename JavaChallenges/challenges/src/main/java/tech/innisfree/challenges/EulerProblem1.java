package tech.innisfree.challenges;

import java.util.ArrayList;

public class EulerProblem1 {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int totalforthree = 0;
        int totalforfive = 0;

        int total =0;

        for(int temp =0; temp < 1000 ; temp++){
            if(temp % 3 == 0){
                x.add(temp);
                totalforthree += temp;
            }else if(temp % 5 == 0){
                y.add(temp);
                totalforfive += temp;
            }
        }

        total = totalforfive + totalforthree;



        System.out.println("The multiples of 3 or 5 up to 1000 are: " +total);

    }


}
