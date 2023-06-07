import java.util.Random;
public class Program2 {
    public static void main(String[] args) 
    {
        Random rand= new Random(System.currentTimeMillis());
        for (int i = 0; i < 3; i++) 
        {
                System.out.print(rand.nextInt(5));
        }
    }
}
