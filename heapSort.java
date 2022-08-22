import java.util.Scanner;

public class heapSort {
    public static void main(String[] args) {
        int array[] = {11,2,1,8,6,78};
        int n = array.length;

        heapSort heap = new heapSort();
        heap.sort(array);

        System.out.println("The sorted array is: ");
        printArray(array);
    

        
    }
    
    public void sort(int array[]){
        int n = array.length;

        for(int i = (n/2)-1;i>=0;i--){
            BuildMaxHeap(array,n,i);   
        }
            for(int i= n-1; i>=0;i--){
                int m = array[0];
                array[0] = array[i];
                array[i] = m;
                 
                heapify(array,i,0);
            }

    

    }
    public void BuildMaxHeap(int array[],int n, int i){
        int Greater = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if(l < n && array[l]> array[Greater]){
            Greater = l;
        }
        if(r < n && array[r]> array[Greater]){
            Greater = r;
        }
        if(Greater!=i){
            int swap = array[i];
            array[i]= array[Greater];
            array[Greater] = swap;

        }

    }
    public void heapify(int array[],int n, int i){
        int Greater = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l < n && array[l]> array[Greater]){
            Greater = l;
        }
        if(r < n && array[r]> array[Greater]){
            Greater = r;
        }
        if(Greater!=i){
            int swap = array[i];
            array[i]= array[Greater];
            array[Greater] = swap;

            heapify(array, n, Greater);
        }
    }
    public static void printArray(int array[]){
        int n = array.length;
        for(int i =0; i< n; i++){
            System.out.print(array[i]+ " ");
            System.out.println();
        } 
    }
        
}
