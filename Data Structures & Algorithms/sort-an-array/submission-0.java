class Solution {
    public int[] sortArray(int[] nums) {
     mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}

public static void mergeSort(int arr[],int st,int en){
 if (st >= en) return;
  int mid=st+(en-st)/2;

  mergeSort(arr,st,mid);
  mergeSort(arr,mid+1,en);
  merge(arr,st,mid,en);
}

public static void merge(int arr[], int st,int mid,int en){
           
         int n1=mid-st+1;
         int n2=en-mid;
         
         int [] left=new int [n1];
         int [] right=new int [n2];

         for(int i=0;i<n1;i++){
                 left[i]=arr[st+i];
         }
         for(int j=0;j<n2;j++){
          right[j]=arr[mid+1+j];
         }

         int i=0 ,j=0,k=st;
         while(i<n1&&j<n2){
          if(left[i]<=right[j]){
            arr[k++]=left[i++];
          }
          else{
            arr[k++]=right[j++];
          }
         }
         //reamaning part
         while(i<n1) {
        arr[k++]=left[i++];
         }
         
        while(j<n2){
           arr[k++]=right[j++];
        }
}