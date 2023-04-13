import java.util.Random;

public class homework1 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        Random rand = new Random();
        for(int i=0; i <20; i++){
            mass[i] = rand.nextInt(50);
        }
        System.out.println("lenght massive =" + mass.length);
        for(int i=0; i<mass.length; i++){
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        System.out.println("Sum: ");
        int sum = 0;
        for(int i=0; i<mass.length; i++){
            if (mass[i]>=5 && mass[i]<=45){
                    sum = sum + mass[i];
            }
            System.out.print(sum+ " ");
        }
        System.out.println();
        System.out.println("Even numbers:");
        for(int i=0; i<mass.length; i++){
            if(mass[i]%2 ==0 && mass[i]!=0){

                System.out.print(mass[i] + " ");
            }
        }
    }
}
