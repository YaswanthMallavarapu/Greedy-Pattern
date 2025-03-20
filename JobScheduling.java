class Solution {

    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        int n=deadline.length;
        int[][]jobs=new int[n][3];
        int maxDeadline=0;
        for(int i=0;i<n;i++){
            jobs[i][0]=id[i];
            jobs[i][1]=deadline[i];
            jobs[i][2]=profit[i];
            if(deadline[i]>maxDeadline)maxDeadline=deadline[i];
        }
        Arrays.sort(jobs,(a,b)->b[2]-a[2]);
        int count=0;
        int maxprofit=0;
        int []slots=new int[maxDeadline+1];
        for(int i=0;i<n;i++){
            for(int j=jobs[i][1];j>0;j--){
                if(slots[j]==0){
                count++;
                slots[j]=jobs[i][0];
                maxprofit+=jobs[i][2];
                break;
            }
        }
        }
        return new ArrayList<>(Arrays.asList(count,maxprofit));
    }
}
