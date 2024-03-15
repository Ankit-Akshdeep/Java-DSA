import java.util.*;
public class JobSequencing{
    static class Job{
        int deadline;
        int profit;
        int id;  //0(A),1(B),2,3...

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsinfo[][] = {{4,20},{1,10},{1,40}, {1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        //input values
        for(int i = 0; i<jobsinfo.length; i++){
            jobs.add(new Job(i, jobsinfo[i][0], jobsinfo[i][1]));
        }

        //sorting
       // Collections.sort(jobs, (a,b) -> a.profit - b.profit );  //ascending order of profit.
       Collections.sort(jobs, (a,b) -> b.profit - a.profit); //in descending order
        
        //creating arrayList to store the ans
        ArrayList<Integer> ans = new ArrayList<>();

        int time = 0;    
        for(int i = 0; i<jobs.size(); i++){
           Job currJob = jobs.get(i);
            if(currJob.deadline > time){
                ans.add(currJob.id);
                time ++;
            }
        }
        System.out.println("Maximum jobs = "+ ans.size());
        for(int i = 0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}