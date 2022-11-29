package service;

import com.samsung.model.Student;
import com.samsung.model.Teacher;
import com.samsung.model.University;

public class DemoService {
    public void demo() {
        Student student1 = new Student("Alex", "Опельсинович", "Андреевич", "+7(888)888-88-88", "math");
        Student student2 = new Student("Jeff", "John", "Андреевич", "+7(888)000-00-00", "computer science");
        Student student3 = new Student("Lewis", "Hamilton", "Викторович", "+7(890)448-28-58", "physics");

        Teacher teacher1 = new Teacher("Jeff", "Антонов", "Игорович", "+7(123)456-78-90", new String[]{"math", "computer science", "PE"});
        Teacher teacher2 = new Teacher("John", "Петров", "Петрович", "+7(123)344-34-23", new String[]{"english language", "literature", "music"});
        Teacher teacher3 = new Teacher("Jeff", "Сидоров", "Сидорович", "+7(123)423-32-23", new String[]{"high math", "biology", "physics"});

        System.out.println();

        University university = new University("Harvard", "Boston", new Student[]{student1, student2, student3}, new Teacher[]{teacher1, teacher2, teacher3});
        university.printInfoToConsoleSuperKpacuBo();
    }
}