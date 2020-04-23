
public class Hairetu3 {

	public static void main(String[] args) {
		
		
		//int型の配列 nums に8.5.9.2.4 を入れる
		int [] nums = {8,5,9,2,4};
		
		//すべて表示
		for (int n :nums) {
			System.out.println(n);
		}
		//合計値を表示
		int sum=0;
			for(int i=0; i<nums.length ;i++) {
				sum += nums[i];
			}
		System.out.println(sum);
		
		//5個以上の個数を表示
		int count =0;
		 for(int i=0; i<nums.length ;i++ ) {
			if(nums [i]>=5) {
			   count++;
			}
		 }
		 System.out.println(count);
		 
		//すべての要素を2倍に書き換え
		 for(int i=0 ; i<nums.length ; i++ ) {
			 nums[i]*=2;
		 }
		 
		//最大値を求める
		 int max=nums[0];
		 for(int n:nums) {
			 max=Math.max(max, n);
		 }
		 System.out.println(max);
	}
}