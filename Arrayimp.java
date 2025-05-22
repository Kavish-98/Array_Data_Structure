import java.util.Scanner;
public class Arrayimp {
    public static void main(String[] args){

        int[] arr = new int[10];
        int size = 5;

        Scanner UserIn = new Scanner(System.in);
        
        System.out.println("Enter Data: ");
        for(int j=0; j<size;j++){
            arr[j] = UserIn.nextInt();
        }
        System.out.println("Output of array: ");
        for(int i =0; i<size;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter the data for search: ");
            int data = UserIn.nextInt();

        int k;
        for(k=0; k<size;k++){
            if(arr[k] == data){
                break;

            }
        }
        System.out.println(k);
    }
       
}