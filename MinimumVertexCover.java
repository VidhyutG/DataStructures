public class Utility {
	
    static boolean[] find(UndirectedGraph g)
    
    {
        boolean[] resultArray = new boolean[g.size()];
        int k = 0;
        for (int i =0;i<g.size();i++)
    {
      if (g.has(i))
      {
    	  k = i;
    	  break ;
      }
    }
 int count = k;
 k--;
        
        for(int i=0; i<g.size(); i++)
        {
            if(g.remove(i).has(k))
            {
                resultArray[i] = true;
                count--;
            }
            if(count==0)
                break;
        }
        return resultArray;
    }
}

