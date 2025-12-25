package Assignment1;


import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

class ArrayOper{
    public void insert(int[]arr,int size,int element,int indexPosition){
        int[]newArray=new int[size+1];

        for(int i=0;i<size+1;i++){
            if(indexPosition>size){
                newArray[size]=element;
            }
                if(i<indexPosition){
                    newArray[i]=arr[i];
                }
              else if(i==indexPosition){
                    newArray[i]=element;
                }
                else{
                    newArray[i]=arr[i-1];
                }
        }
        System.out.println("Array after insertion");
        for (int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }

    }
    public void delete(int[]arr,int n,int position){
        int[]newArray=new int[n-1];
        for(int i=0;i<n-1;i++){


            if(i<position) {
                newArray[i] = arr[i];
            }
            else{
                newArray[i]=arr[i+1];
            }

        }
        System.out.println("Array after deletion");
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }

    }
    public void linearSearch(int[]arr,int element){
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                System.out.println("element found in the index "+i);
            }
            else{
                System.out.println("Element not found");
            }
        }
    }
       public int[] insertionSort(int[]arr) {
           for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++){
                   if(arr[i]>arr[j]){
                       int copy=arr[i];
                       arr[i]=arr[j];
                       arr[j]=copy;
                   }
                   else{
                           if(i==j){
                               break;
                           }
                   }
               }
           }
           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
           }
           return arr;
       }

      public void binarySearch(int[]arr,int element){
             int[]arr1=insertionSort(arr);
            boolean found=false;
             int start=0;
             int end=arr1.length-1;
             int mid;
             int index=-1;
           while(start<=end){
                mid=start+(end-start)/2;
               if(arr[mid]==element){
                 found=true;
                 index=mid;
                 break;
               }
            else if(element>arr[mid]){
                   start=mid+1;
               }
            else{
                end=mid-1;
               }

           }
         if(found==true){
             System.out.println("Search Successfull! Element found at "+index);
         }
         else{
             System.out.println("Search unsuccessfull "+index);
         }
      }
      public void findMax(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
          System.out.println("Maximum value in the array is "+max);
      }
      public void countEvenOdd(int[]arr){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
          System.out.println("Number of even elements in the array is "+even);
          System.out.println("Number of odd elements in the array is "+odd);
      }

}


public class ArrayOperations {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
//        int size=kb.nextInt();
//        int[]arr=new int[size];
//        for(int i=0;i<size;i++){
//            arr[i]=kb.nextInt();
//        }
        ArrayOper operation=new ArrayOper();
//        operation.insert(arr,5,15,5);
//        operation.delete(arr,5,4);
        int[]arr1={4,1,2,3,5,25,10};
//        operation.insertionSort(arr1);

        operation.binarySearch(arr1,5);

    }
}

