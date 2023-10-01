import java.util.*;
import classes.*;

public class LectureCalendar {
	private Map<Date, List<Lecture>> scheduledLectures = new TreeMap<Date, List<Lecture>>();
	private List<Lecture> lecturesAtDayList;

	public boolean addLectureToCalendar(Lecture lecture) {
		boolean verbose = false;
		if(scheduledLectures.containsKey(lecture.getLectureDate())) {
			//DEBUG
			System.out.println("contained");
			List<Lecture> lL = scheduledLectures.get(lecture.getLectureDate());
			lL.add(lecture);
		}
		else {
			lecturesAtDayList = new LinkedList<Lecture>();
			verbose = lecturesAtDayList.add(lecture);
			scheduledLectures.put(lecture.getLectureDate(), lecturesAtDayList);
		}

		return verbose;

	}

	public boolean removeLectureFromCalendar(Course course) {
		boolean verbose = false;
		Lecture lectureToRemove = new Lecture(course);
		if(scheduledLectures.containsKey(lectureToRemove.getLectureDate())) {
			System.out.println("contains to tree");
			List<Lecture> lL = scheduledLectures.get(lectureToRemove.getLectureDate());
			if(lL.contains(lectureToRemove)) {
				System.out.println("contains to list:");
				verbose = lL.remove(lectureToRemove);
				if(lL.isEmpty())
					scheduledLectures.remove(lectureToRemove.getLectureDate());
			}

		} 
		return verbose;
	}

	public String getAllScheduledLectures() {
		StringBuffer buffer = new StringBuffer();
		Iterator<Date> it = scheduledLectures.keySet().iterator();
		List<Lecture> lL;
		while(it.hasNext()) {
			lL = scheduledLectures.get(it.next());
			for(Lecture i: lL)
				buffer.append(i + "\n");
		}

		return buffer.toString();
	}


}
