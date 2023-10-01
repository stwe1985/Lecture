package classes;
import java.util.*;

public class Course implements Comparable<Course> {
	private String courseName;
	private String tutor;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public Course(String courseName, String tutor) {
		this(courseName);
		this.tutor = tutor;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getTutor() {
		return this.tutor;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		
		if(o instanceof Course) {
			Course courseToCheck = (Course)o;

			return this.courseName == courseToCheck.courseName;
		} else
			return super.equals(o);
	}

	@Override
	public int compareTo(Course course) {
		return this.courseName.compareTo(course.courseName);
	}

	@Override
	public String toString() {
		return this.courseName;
	}
}

