public class ArrayMistakes
{
    public static void main()
    {
      int [] nums;
      int nums[0] =6;
      

      System.out.print("\nForward");
      for (int i = 1; i <= nums.length; i++) {
         System.out.print(": " + nums[i]);
      }

      System.out.print("\nBackward" );
      for (int i = nums.length; i > 0; i--) {
         System.out.print( ": " + nums[i]);
      }
}
}