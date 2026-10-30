public class ProjectEuler {

   
   public static int problem1() {
      int number=0;
      int sum1=0;
      while(number<1000) {
         if(number % 3==0 || number % 5==0) {
            sum1+=number;
         }
         number+=1;
      }
      return sum1;
   }
   public static int problem2() {
      int term1=1;
      int term2=2;
      int newTerm=0;
      int sum2=0;
      while(newTerm<=4000000) {
         newTerm=term1+term2;
         term1=term2;
         term2=newTerm;
         if (newTerm % 2==0) {
            sum2+=newTerm;
         }
      }
      return sum2;
   }
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());
   }
}