class Secondsmallest{  
public static int getSecondSmallest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j <j total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[1];
}  
public static void main(String args[]){  
int a[]={3,7,45,46,432,342};  
int b[]={445,34,675,234,456,789,345};  
System.out.println("Second smallest: "+getSecondSmallest(a,6));  
System.out.println("Second smallest: "+getSecondSmallest(b,7));  
}}  