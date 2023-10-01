import java.util.*;
import classes.*;

public class Lecture {
	
	private Date lectureDate;
	private GregorianCalendar gregorianCalendar;
	private Course course;

	public Lecture(Course course) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Day: ");
		int day = scan.nextInt();
		System.out.println("Month: ");
		int month = scan.nextInt();
		System.out.println("Year: ");
		int year = scan.nextInt();
		System.out.println("Hour: ");
		int hour = scan.nextInt();
		System.out.println("Minute: ");
		int minute = scan.nextInt();
		
		this.gregorianCalendar = new GregorianCalendar(
				year,
				month,
				day,
				hour,
				minute);
		long timeInMillis = gregorianCalendar.getTimeInMillis();
		this.lectureDate = new Date(timeInMillis);

		this.course = course;
	}

	public void setLectureDate(Date lectureDate) {
		this.lectureDate = lectureDate;
	}

	public Date getLectureDate() {
		return this.lectureDate;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return this.course;
	}

	@Override
	public boolean equals(Object obj) {
		Lecture lectureComparisonObject;
		if(this == obj)
			return true;
		else if(obj instanceof Lecture) {
			lectureComparisonObject = (Lecture)obj;
			boolean courseEquality = this.course.equals(
					lectureComparisonObject.course
					);

			boolean dateEquality = this.lectureDate.equals(
					lectureComparisonObject.lectureDate
					);

			return courseEquality && dateEquality;			
		}
		else 
			return super.equals(obj);

	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer(String.format(
					"%-20s%-30s\n",
					"Day of lecture:", 
					this.lectureDate
					));

		buffer.append(String.format(
					"%-20s%-30s\n", 
					"Course name:",
					this.course
					));

		buffer.append(String.format(
					"%-20s%-30s\n", 
					"Lecturer:", 
					this.course.getTutor()
					));
		return buffer.toString();
	}
}





