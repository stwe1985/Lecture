import java.util.*;
import classes.*;

public class TestLecture {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		

		Lecture lecture = new Lecture(scan.nextInt(),
				scan.nextInt(),
				scan.nextInt(),
				scan.nextInt(),
				scan.nextInt(),
			       	new Course("Datenstrukturen und Java-Klassenibliothek", "Fr. Dr. Croitoru"));

		System.out.println(lecture);
	}
}


