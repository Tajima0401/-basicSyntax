public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		
     int a = 10;
     int b = 5;
     System.out.println(a > b);

     boolean isSunny = true;
     boolean isWarm = true;
     System.out.println(isSunny && isWarm);

     int x = 5;
     int y = 4;
     System.out.println(x >= 0 && y % 2 == 0);
     
     boolean hasPermission = false;
     System.out.println(!hasPermission);
 
   }
}