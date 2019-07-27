package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	cal.calculateCalories(bread);
                        	System.out.println();
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	cal.calculateCalories(bread,jam);
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	cal.calculateCalories(bread,jam,butter);
                        	System.out.println();
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            int calculateCalories(int bread) {
            //overload this function for one parameter 
            	int calc = bread*74;
            	double energy = 309.8232*bread;
            	System.out.printf("%.3f",energy);
            	System.out.print(" of energy generated from "+calc+".0 "+"calories");
            	return calc;
            }
            int calculateCalories(int bread, int jam) {
                //overload this function for two parameters
            	int calc = (bread*74) + (jam*26);
            	double energy = 309.8232*bread + 108.8568*jam;
            	System.out.printf("%.3f",energy );
            	System.out.print(" of energy generated from "+calc+".0 "+"calories");
            	return calc;
                	
            }
            int calculateCalories(int bread, int jam, int butter) {
                //overload this function for three parameters 
            	int calc = (bread*74) + (jam*26) + (butter*102);
            	double energy = 309.8232*bread + 108.8568*jam  +427.0536*butter;
            	System.out.printf("%.3f",energy );
            	System.out.print(" of energy generated from "+calc+".0 "+"calories");
            	return calc;
            }
            
            
}