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
                        	calculateCalories(bread);
                        	//call the function which calculate the calories for only bread
                        	System.out.println();
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	calculateCalories(bread, jam);
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	calculateCalories(bread, jam, butter);
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.println();
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
                        
            }

			private static void calculateCalories(Integer bread, Integer jam, Integer butter) {
				// TODO Auto-generated method stub
				
			}

			private static void calculateCalories(Integer bread, Integer jam) {
				// TODO Auto-generated method stub
				
			}

			private static void calculateCalories(Integer bread) {
				// TODO Auto-generated method stub
				
			}
}
class Calories {
	        int total;
	        int calculateCalories(int i) {
            //you have to overload this function for three parameters refer the question
            	total = i*74;
            	return total;
            }
	        int calculateCalories(int i, int j) {
                //you have to overload this function for three parameters refer the question
            	total = (i*74) + (j*26);
            	return total;
                }
	        int calculateCalories(int i, int j, int k) {
                //you have to overload this function for three parameters refer the question
            	total = (i*74) + (j*26)+ (k*102);
            	return total;
                }
            
}