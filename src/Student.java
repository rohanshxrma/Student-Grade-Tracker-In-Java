package src;
import java.util.*;
public class Student {
    
    String name;
    int marks;

    public Student(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
    }

    public String toString()
    {
        return "Name : " + name + " " + "Marks : " + marks;
    }

    public void setGrade(int marks)
    {
        this.marks=marks;

    }
    public String getName()
    {
        return name;
    }

    static Student  findStudent(List<Student> list , String name)
    {
        for(Student s : list)
        {
            if(s.getName().equalsIgnoreCase(name))
                return s;
        }
            return null;
    }


    static int getTotalMarks(List<Student> list)
    {
        int total=0;
        for(Student s : list)
        {
            total = total + s.marks;
        }
        return total;
    }
    static int getHighestMarks(List<Student> list)
    {
        int highest =0;
        for(Student s : list)
        {
            if(highest<s.marks)
            {
                highest = s.marks;
                
            }
        }
        return highest;
       
    }
    
    static int getLowestMarks(List<Student>list)
    {
        int lowest =0;
        for(Student s : list)
        {
            lowest = s.marks;
            if(lowest>s.marks)
            {
                lowest = s.marks;
            }
        }
        return lowest;
        

    }

    static String getHighName(List<Student> list)
    {
        int highest =0;
        String hName= null;
        for(Student s : list)
        {
            if(highest<s.marks)
            {
                highest = s.marks;
                hName = s.name;
            }

        }
        return hName;
    }
    static String getLowName(List<Student> list)
    {
    
        Student low= list.get(0);
        for(Student s : list)
        {
           
            if(low.marks>s.marks)
            {
                low = s;
            }
        }
        return low.name;
        
    }
    // public boolean equals(Student that)
    // {
    //     if(this.name==that.name)
    //     {
    //         return true;
    //     }
    //     else
    //         return false;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    
    
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Student other = (Student) obj;
    //     if (name == null) {
    //         if (other.name != null)
    //             return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     return true;
    // }
    
}
