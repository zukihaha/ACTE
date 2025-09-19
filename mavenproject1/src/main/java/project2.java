
import java.util.HashSet;


public class project2 {
public class Main
{
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    cars.add("Mazda");
    System.out.println(cars);
	}
    }
}