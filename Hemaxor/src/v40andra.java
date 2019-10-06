import java.util.*;

public class v40andra 
{
public static void main(String[] args) throws Exception{
    Scanner ny = new Scanner(System.in);
    while(true){
        if(!ny.hasNext())break;
        int timme = ny.nextInt();
        int min = ny.nextInt();
        if(min<45){
            if(timme<1){
                System.out.println(23+" "+(min+15));
            }else{
                System.out.println((timme-1)+" "+(min+15));
            }
        }else{
            System.out.println(timme+" "+(min-45));
        }
    }
}
}


		
	
	
	
	
	
	
	

