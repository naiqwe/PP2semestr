package service;

import model.Group;
import model.Student;
import model.Subject;

import java.util.List;

public class Service {

    private Service() {
    }

    public static boolean averageMarkIsRight(Student student) {
        double counter = 0;
        for (Subject i : student.getSubjects()) {
            counter += i.getMark();
        }
        return (counter / student.getSubjects().size()) == student.getAverage();
    }

    public static void fixAverageMark(Student student) {
        double counter = 0;
        for (Subject i : student.getSubjects()) {
            counter += i.getMark();
        }
        student.setAverage(counter / student.getSubjects().size());
    }

    public static void fixAverageMarkForGroup(Group group) {
        List<Student> students = group.getStudents();
        for (Student i : students) {
            if(!averageMarkIsRight(i)) {
                fixAverageMark(i);
            }
        }
    }
}