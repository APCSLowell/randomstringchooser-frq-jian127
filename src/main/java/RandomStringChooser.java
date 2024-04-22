import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> a;
  public RandomStringChooser()
  {
    ArrayList<String> a = new ArrayList<String>();
    for(int i = 0; i < a.size(); i++){
      a.add(i);
    }
    
  }

  public getNext(String x)
  {
    if(words.size() == 0){
      return "NONE";
    }
    else return words.remove((int)Math.random()*a.size());
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
