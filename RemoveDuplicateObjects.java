import java.util.*;
class Student{
    String name;
    int id;
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int hashCode(){
        return id;
    }
    @Override
    public boolean equals(Object obj){
        Student st=(Student) obj;
        return (id==st.id);
    }
    @Override
    public String toString(){
        return id+","+name;
    }
}
public class RemoveDuplicateObjects {
    public static void main(String[] args){
        HashSet<Student> st = new HashSet<Student>();
        st.add(new Student(1,"abc"));
        st.add(new Student(2,"pqr"));
        st.add(new Student(2,"pqr"));
        st.add(new Student(3,"xyz"));
        st.add(new Student(1,"abc"));
        Iterator<Student> it = st.iterator();
        while(it.hasNext()){
            Student s=(Student) it.next();
            System.out.println(s);
        }
    }
}
