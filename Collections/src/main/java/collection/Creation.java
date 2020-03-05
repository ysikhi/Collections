package collection;
import java.util.*;
import org.apache.logging.log4j.*;
public class Creation
{
	private static final Logger log = LogManager.getLogger(Creation.class);
    private static Scanner sc;

	public static void main(String[] args) 
    {
    	sc = new Scanner(System.in);
    	Collection<Integer> list = new Collection<Integer>();
    	log.info(list);
    	log.info("How many elements do you want to add");
        int noOfAdd=sc.nextInt();
        log.info("enter elements:");
        for (int i=0;i<noOfAdd;i++)
        {
        	int adding=sc.nextInt();
        	list.add(adding);
        }
        log.info("Total list after adding elements:");
        log.info(list);
        log.info("enter index to be removed");
        int removeElement;
        removeElement=sc.nextInt();
        list.remove(removeElement);
        log.info("Total list after removing elements:"+list);
        log.info("value at index 0 is "+ list.fetch(0));
        log.info("value at index 1 is:"+list.fetch(1));
        log.info("total size"+list.size());
    }
}