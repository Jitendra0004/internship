 #include<stdio.h>
int linear_search(int list[],int n,int item){
    int index;
    for(index=0;index<n;index++){
        if(item==list[index]){
         return(index);
        } /* end of if */
     } /* end of for */
   return(-1); */
 }/*  end of function 'linear_search' */
 int main(){
    int linear_search(int list[],int n,int item);
    int a[]={1,2,3,4,5,6,7,8,9};
    int search_index;
    search_index=linear_search(a,9,7);
    if(search_index!=1){
           printf("\n Item index is : %d",search_index); }
           
      else{
           printf("\n Item not found");
    } /* end of if */
     return(0);    

 } /* end of the function 'main' */
