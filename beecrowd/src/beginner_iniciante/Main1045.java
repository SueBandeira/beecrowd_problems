package beginner_iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Main1045 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] nums = new double[3];
    double soma =0;

    for (int i = 0; i < 3; i++) {
      nums[i] = sc.nextFloat();
    }
    Arrays.sort(nums);
    if(nums[2] >= nums[0]+nums[1]) {
      System.out.println("Nao forma triangulo");
    }else {
      for(int i = 0; i < nums.length; i++){
        nums[i] = Math.pow(nums[i], 2);
        if(i < 2)
          soma += nums[i];
      }
      if (nums[2] == soma)
        System.out.println("TRIANGULO RETANGULO");
      else if (nums[2] > soma)
        System.out.println("TRIANGULO OBTUSANGULO");
      else
        System.out.println("TRIANGULO ACUTANGULO");
      if (nums[2] == nums[1] && nums[2] == nums[0])
        System.out.println("TRIANGULO EQUILATERO");
      else
        System.out.println("TRIANGULO ISOSCELES");
    }
  }
}
