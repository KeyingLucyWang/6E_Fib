/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
      int result = 0;
      if ( n == 1 || n == 2)
        return 1;
      else if ( n > 2) {
        result = (int)fib_recurrence( n - 1) + (int)fib_recurrence( n - 2);
      }
      else return -2; // invalid Fibonacci number
      return result;
    }
     /* These are class methods because we don't apply it to Fib objects but rather user's inputs.
    */

    //Roughly, the highest index is 45~47.


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
      int result = 0;
      int first = 1;
      int second;

      if( n > 0) {
      for( int current = 0; current < n; current++){
          second = result + first;
          result = first;
          first = second;
        }
      return result;
      }
      else return -2;
    }

    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows ?? 
       as the size of the problem increases,
       because ??
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
      double result = -2;
      if( n > 0){
        result = ( Math.pow( ( 1 + Math.pow( 5, 0.5)) / 2, n) 
                - Math.pow( ( 1 - Math.pow( 5, 0.5)) / 2, n))
                / Math.pow( 5, 0.5);}
        return result; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be ...
       
       As the proxy for the time required, count...
       
       Then cost of the the recurrence algorithm
       grows ?? 
       as the size of the problem increases,
       because ??
     */
}
