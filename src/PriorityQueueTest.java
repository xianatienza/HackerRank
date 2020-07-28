import java.util.*;
import java.util.stream.Collectors;


public class PriorityQueueTest {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

    static class Priorities  {

        StudentComparator studentComparator = new StudentComparator();

        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(studentComparator);

        public Priorities() {


        }
        public List<Student> getStudents(List<String> event) {

            List<Student> students = new ArrayList<>();

            event.stream().forEach( input -> {

                if(input.contains("ENTER")) {
                    String[] stringArr = input.split(" ");

                    Student newStudent = new Student(stringArr[1], Float.parseFloat(stringArr[2]), Integer.parseInt(stringArr[3]));
                    priorityQueue.add(newStudent);
                }

                if(input.contains("SERVED")) {
                    Student servedStudent =  priorityQueue.remove();
                }


            });

            return priorityQueue.stream().collect(Collectors.toList());
        }


    }

    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student student, Student t1) {

            //compare CGPA
            if (student.getCGPA().compareTo(t1.getCGPA()) == -1) {
                return 1;
            }

            if (student.getCGPA().compareTo(t1.getCGPA()) == 1) {
                return -1;
            }

            if(student.getCGPA().compareTo(t1.getCGPA()) == 0)
            if(student.getName().compareTo(t1.getName()) == 1) {
                return 1;
            }

            if(student.getName().compareTo(t1.getName()) == -1) {
                return -1;
            }

            if(student.getID().compareTo(t1.getID()) == 1) {
                return 1;
            }

            if(student.getID().compareTo(t1.getID()) == -1) {
                return -1;
            }

            return 0;
        }
    }

    static class Student {

        private String name;
        private Float CGPA;
        private Integer ID;

        public Student(String name, Float CGPA, Integer id) {

            this.name = name;
            this.CGPA = CGPA;
            this.ID = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Float getCGPA() {
            return CGPA;
        }

        public void setCGPA(Float CGPA) {
            this.CGPA = CGPA;
        }

        public Integer getID() {
            return ID;
        }

        public void setID(Integer ID) {
            this.ID = ID;
        }
    }
}
