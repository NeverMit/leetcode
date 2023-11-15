public class Main {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,1};
        int[] ans=new int[nums.length*2];
        ans=getConcatenation(nums);
        for(int i=0;i< ans.length;i++)
            System.out.print(ans+" ");
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[2* nums.length];
        for(int i=0;i< nums.length;i++){
            ans[i]=nums[i];
            ans[i+ nums.length]=nums[i];
        }
        return ans;
    }
}
