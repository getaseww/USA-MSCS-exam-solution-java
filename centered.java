class Main {

    public static int isCenterd(int[] nums) {
        if (nums.length % 2 == 0 && nums.length < 1)
            return 0;
        else {
            int center = (int) Math.floor(nums.length / 2);
            int mid = nums[center];
            for (int i = 0; i < nums.length; i++) {
                if (i != center && mid >= nums[i]) {
                    return 0;
                }
            }

            return 1;
        }
    }

    public static void main(String args[]) {
        int[] nums = { 3, 2, 1, 4, 1 };
        System.out.println(isCenterd(nums));
    }
}
