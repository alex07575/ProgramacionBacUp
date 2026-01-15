package ejerciciostema3;
public class dadobreik {
    public static void main (String [] args){
        int cont = 0;
        while (1>0){
            int n = (int) (Math.random() * 30)+1;
            if (n >= 10 && n <= 20 && n != 15){
                continue;
            } else if (n == 15){
                break;
            } else {
                cont ++;
                if (cont % 5 == 0)
                    System.out.println(n);
                else{
                    System.out.print(n+"  ");
                }
            }
        }
    }
}
