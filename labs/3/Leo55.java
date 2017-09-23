package lab3;

public class Leo55 {

	public static void main(String[] args) {
		//formatting the header
        System.out.printf("%-10s %8s    |     %-8s %10s%n", "Kilos", "Pounds", "Pounds", "Kilos");
                
        int lbs = 20;
        for (int kg = 1; kg < 200; kg += 2){
        	
            System.out.printf("%-10d %8.1f    |     %-8d %10.2f%n", 
            kg,
            //converting kilos to pound
            kg * 2.2,
            lbs,
            //converting pounds to kilos
            lbs * 0.4545);
            lbs += 5;
            }    
	}
}