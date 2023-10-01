import java.util.*;
import classes.*;

public class TestLectureCalendar {

	public static void main(String[] args) {
		
		Course course = new Course("Datenstrukturen und Java Klassenbibliothek", "Fr. Dr. Croitoru");
		Lecture lecture;
		LectureCalendar lectureCalendar = new LectureCalendar();
		Scanner scan = new Scanner(System.in);
		String menu = new String();
		boolean executed;

		System.out.println("Type 'help' for help.");
		while(true) {
			System.out.print("> ");
			menu = scan.next();

			switch(menu){
				case "help":
					System.out.println("Commands: \n" +
							"add \n" +
							"remove \n" +
							"show \n" +
							"q - quit \n");
					break;
				case "add":
					lecture = new Lecture(course);
					executed = lectureCalendar.addLectureToCalendar(lecture);
					System.out.println("Item added: " + executed);
					break;
				case "remove":
					executed = lectureCalendar.removeLectureFromCalendar(course);
					System.out.println("Item added: " + executed);
					break;
				case "show":
					System.out.println(lectureCalendar.getAllScheduledLectures());
					break;
				case "q":
					System.exit(1);
					break;
				default:
					System.out.println("Command not found");
			}
		}

	}
}
