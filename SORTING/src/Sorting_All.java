public class Sorting_All {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        int n = 5;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        selectionSort(arr,n);
        bubbleSort(arr,n);
        insertionSort(arr,n);
    }

    //SELECTION SORT
    static void selectionSort(int[] arr,int n){
       for(int i = 0; i < n-1; i++){
           int min = i;

           for(int j = i + 1 ; j < n;j++){
               if(arr[j] < arr[min]){
                   min = j;
               }
           }
           int temp = arr[min];
           arr[min] = arr[i];
           arr[i] = temp;
       }
       System.out.println(" ");
       System.out.println("SELECTION SORTED ARRAY");
       for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //BUBBLE SORT
    static void bubbleSort(int[] arr,int n){
      for(int i = n-1; i >= 1; i--){
          for(int j = 0; j < i-1; j++){
              if(arr[j] > arr[j+1]){
                  int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j] = temp;
              }
          }
      }
      System.out.println(" ");
      System.out.println("BUBBLE SORTED ARRAY");
      for(int i = 0 ; i < n ; i++){
          System.out.print(arr[i] + " ");
        }
    }

    //INSERTION SORT
    static void insertionSort(int[] arr,int n){
    for(int i =0; i<n; i++){
        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;

            j--;
        }
    }

    System.out.println(" ");
    System.out.println("INSERTION SORTED ARRAY");
    for(int i = 0 ; i < n ; i++){
        System.out.print(arr[i] + " ");
     }
    }


}
