import org.testng.annotations.Test;

public class Grouping {
  @Test(groups={"Car"})
  public void Car() {
	  System.out.println("Batch Car-Test Car ParallelTesting");
	  
  }
  @Test(groups={"Scooter"})
  public void Car1() {
	  System.out.println("Batch Car-Test Car ParallelTesting");
	  
  }
  @Test(groups={"Scooter"})
  public void Scooter() {
	  System.out.println("Batch Scooter-Test scooter ParallelTesting");
  }
  @Test(groups={"Scooter"})  
 public void Scooter2() {
	 System.out.println("Batch Scooter-Test scooter ParallelTesting");
	  
  }
}
