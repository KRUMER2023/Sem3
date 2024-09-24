void printArray(int * A,int n)
{
    for(int i=0;i<n;i++)
    {
        printf("%d ",A[i]);
    }
    printf("\n");
}

int partition(int A[],int low , int high)
{
    int pivot = A[low];
    int i = low+1;
    int j = high,temp;

    while(A[i]<=pivot)//finds bigger element position
    {
        i++;
    }
    while(A[j]>pivot)//finds smaller element position
    {
        j--;
    }



}

void quso(int A[],int low , int high)
{
  int partitionindex;
  if(low<high)
  {
      partitionindex = partition(A,low,high);
      quso(A,low,partitionindex-1);
      quso(A,partitionindex+1,high);
  }
}

int main()
{
    int A[] = {3,55,44,9,33,6,4};
    int n = 7;
    printArray(A,n);
    quso(A,0,n);
    printArray(A,n);
    return 0;
}
