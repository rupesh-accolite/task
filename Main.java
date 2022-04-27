import java.util.*;
class Main {
    public static int search(ArrayList<Integer> nums, int target){
        int low=0, high = nums.size()-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (nums.get(mid) == target) 
                return mid;
            if (nums.get(mid) > target) 
                high = mid - 1; 
            else
                low = mid + 1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<n;i++)
            nums.add(sc.nextInt());
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int index = search(nums, target);
        if(index != -1)
            System.out.println("Target "+ target +" is present at index "+index);
        else
            System.out.println("Target is not present in list of numbers");
    }
}