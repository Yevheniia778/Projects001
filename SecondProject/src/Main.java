public class Main {

    public static void main(String[] args) {
        int [] nums = new int [] {1,2,3,4,5,6,7,8,9,10};
        int i;
        int sum = 0;
        double avg;
        for (i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + (i == 9 ? ".\n" : ","));
            sum += nums[i];
        }
        avg = (double)sum / nums.length;
        System.out.println(avg);
        String str = "My super string";
        for (i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}
