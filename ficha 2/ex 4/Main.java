public class Main {
    
    public static void main(String[] args){
        
        Exercicio4 obj = new Exercicio4();
        int[] nums = {1,5,3,4,6,2,7,9,8,0};
        obj.ordenaArr(nums, 10);

        for(int i = 0; i < 10; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
