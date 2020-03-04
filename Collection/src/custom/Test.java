package custom;

public class Test 
{
	public static void main(String[] args) 
    {
        DataList<String> list = new DataList<>();
        System.out.println("list initialized with : "+list);
        
        list.add("11");
        list.add("12");
        list.add("13");
        System.out.println("list after adding elements : "+list);
         
        
        list.remove(2);
        System.out.println("list after removing elements : "+list);
        
        
        System.out.println( list.get(0));
        System.out.println( list.get(1));
 
    }

}
