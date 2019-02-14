import java.util.ArrayList;


public class ArrayListFun
{

	public static void main(String[] args) 
	{
			
		System.out.println(getListOfFactors(465));
			ArrayList <Integer> ray = getListOfFactors(465);
			keepOnlyCompositeNumbers(ray);
			System.out.println(ray);
			
			
	}
	
  public static ArrayList<Integer> getListOfFactors(int number)
  {     	
	  
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		
		for(int i = 2; i < number; i++)
			{
			if(number % i == 0)
				nums.add(i);
			}
		return nums;
  }
 
  public static ArrayList<Integer >keepOnlyCompositeNumbers(ArrayList<Integer> nums)
  {
	 
	  for (int i = 0; i < nums.size(); i++)
	  {
		  if(getListOfFactors(nums.get(i)).size() == 0)
		  {
		  nums.remove(i);
		  i--;
		  }
	  }
	  return nums;
  }
}


