import java.util.*;
public class PrioryQ{ 
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
           return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); //for prioritising in decreasing order
        PriorityQueue<Student> st = new PriorityQueue<>();
        pq.add(3); 
        pq.add(6);
        pq.add(1);
        pq.add(7);

        pq1.add(1);
        pq1.add(8);
        pq1.add(3);
        pq1.add(4);

        st.add(new Student("A", 15));
        st.add(new Student("B", 4));
        st.add(new Student("C", 10));

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

        while(!pq1.isEmpty()){
            System.out.print(pq1.peek()+" ");
            pq1.remove();
        }

        while(!st.isEmpty()){
            System.out.println(st.peek().name +"-->"+ st.peek().rank);
            st.remove();
        }
    }
}