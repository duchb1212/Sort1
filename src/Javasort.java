import java.util.*;
class Student {
        private int id;
        private String name;
        private double cgpa;
        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public double getCgpa() {
            return cgpa;
        }
    }

    public class Javasort {
        public static void main(String[] args) {
            Scanner ob = new Scanner(System.in);
            int num = ob.nextInt();
            List<Student> students = new ArrayList<>();

            for (int i = 0; i < num; i++) {
                int id = ob.nextInt();
                String name = ob.next();
                double cgpa = ob.nextDouble();
                students.add(new Student(id, name, cgpa));
            }
            Collections.sort(students, new Comparator<Student>() {
                public int compare(Student a, Student b) {
                    if (Double.compare(b.getCgpa(), a.getCgpa()) != 0) {
                        return Double.compare(b.getCgpa(), a.getCgpa());
                    }
                    int nameCmp = a.getName().compareTo(b.getName());
                    if (nameCmp != 0) {
                        return nameCmp;
                    }
                    return Integer.compare(a.getId(), b.getId());
                }
            });

            for (Student s : students) {
                System.out.println(s.getName());
            }

            ob.close();
        }
    }

