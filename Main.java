import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number to count down or up from:");

    Scanner num = new Scanner(System.in);

    int userNum = num.nextInt();

    if (userNum >=0){
      while (userNum >=0){
        System.out.println(userNum);
        userNum --;
      }
    }
    else {
      while (userNum<=0){
        System.out.println(userNum);
        userNum ++;
      }
    }
    System.out.println("Blast Off!");
  }
}