import java.util.*;
class StudentGradeTracker
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<Student>list = new ArrayList<>();
        System.out.println("====Student Grade Manager====");

       int choice=0;
        do
        {
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update a Student's grade");
            System.out.println("4. Delete a Student");
            System.out.println("5. Show Stats(Average,Highest,Lowest)");
            System.out.println("6. Display Summary Report");
            System.out.println("7. Exit");

            System.out.println("Enter Choice : ");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice)
            {
                case 1:
                    {
                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();
                        System.out.print("Enter Marks : ");
                        int marks = Integer.parseInt(sc.nextLine());

                        if(marks>=0 && marks<=100)
                        {
                            list.add(new Student(name, marks));
                            System.out.println("Student added successfully ! ");
                        }
                        else{
                            System.out.print("Plese Enter Valid Marks !");
                        }
                        break;

                    }
                case 2:
                    {
                        for(Student s : list)
                        {
                            System.out.println(s);
                        }
                        break;
                    }
                case 3:
                    {
                        System.out.println("Enter Students Name : ");
                        String name = sc.nextLine();
                        Student found = Student.findStudent(list,name);
                        if(found==null)
                        {
                            System.out.println("Student Not Found");
                        }
                        else
                        {
                            System.out.println("Enter New Grade : ");
                            int newGrade = Integer.parseInt(sc.nextLine());
                            found.setGrade(newGrade);
                            System.out.println("Grade Updated...");
                            System.out.println(found);

                        }
                        break;
                        
                    }
                case 4:
                    {
                        System.out.println("Enter Name of Student to Delete : ");
                        String name = sc.nextLine();
                        
                        Student found = Student.findStudent(list, name);
                        if(found==null)
                        {
                            System.out.println("Student Not Found...");
                        }
                        else
                        {
                            list.remove(found);
                            System.out.println("Student Removed Successfully...");
                        }
                        break;
                    }  
                case 5:
                    {
                        System.out.println("Highest Marks : " + Student.getHighestMarks(list));
                        int total = Student.getTotalMarks(list);

                        System.out.println("Average Marks : " + total/list.size());

                        System.out.println("Lowest Marks : " + Student.getLowestMarks(list));
                        break;
                    }
                case 6:
                    {
                        System.out.println("====Summary Report====");
                        int i =1;
                        System.out.println("--------------------------------------------------------------------------");
                        for(Student s : list)
                        {
                            System.out.println(i + "." + s);
                            i++;
                        }
                        System.out.println("--------------------------------------------------------------------------");

                        System.out.println("Class Average : " + Student.getTotalMarks(list)/list.size());
                        
                        System.out.println("Topper : " + Student.getHighName(list) + " " + Student.getHighestMarks(list));
                        System.out.println("Lowest : " + Student.getLowName(list) + " " + Student.getLowestMarks(list));
                       
                        Student.getLowestMarks(list);

                        System.out.println("=======================");
                        break;
                    }
                case 7:
                    {
                        System.out.println("====You Exited====");
                        System.out.println("====Thanks For Using Our Student Grade Tracker====");
                        break;
                    }
                default:
                    {
                        System.out.println("!Invalid Choice!");
                    }
            }

        }
        while(choice!=7);
        


        


    }
}