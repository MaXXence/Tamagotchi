import java.util.ArrayList;
import java.util.Arrays;


public class Robot extends Personnage{
    
    Robot(String n)
    {
        super(n);
        super.nomCaracteristiques=new ArrayList<>(Arrays.asList("Vie","Integrité","Batterie","Propreté","Huile","Moral"));
    }
    
}
