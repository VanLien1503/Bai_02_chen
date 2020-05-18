import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap size list : ");
        int size = scanner.nextInt();

        int [] list = new int[size];
        System.out.println("list size : "+list.length);

        for (int i=0;i<list.length;i++){
            int random= (int) (Math.floor(Math.random()*100)+10);
            list[i]=random;
        }
        System.out.println(" List: ");
        for (int lt:list) {
            System.out.print(lt+" ");
        }
        System.out.println("\ndung Chen: ");
        insertionSort(list);

    }
    public static void insertionSort(int[]list){
        int n=list.length;
        for (int i=1;i<n;i++){
            int key = list[i];
            int j=i-1;
            while (j>=0 && list[j]>key){
                int temp = list[j];
                list[j]=list[j+1];
                list[j+1]=temp;
                j--;
            }
            System.out.println("Vong 1 : "+i);
            for (int x:list){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        for (int a:list){
            System.out.print(a+" ");
        }
    }

}
