import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> a;
  public RandomStringChooser()
  {
     a = new ArrayList<String>();
    for(int i = 0; i < a.size(); i++){
      a.add(a.get(i));
    }
    
  }

  public String getNext()
  {
    if(words.size() == 0){
      return "NONE";
    }
    else return words.remove((int)Math.random()*a.size());
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
