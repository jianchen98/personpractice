package com.chen;

public class TestMaopao {
	public static void main(String[] args) {
		int a[]={25,68,59,78,45,32,1,9,47,43,196};
        System.out.println("≈≈–Ú«∞£∫");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("\n≈≈–Ú∫Û£∫");
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }          
            }
           
        }
        for(int i=0;i<a.length;i++){
         System.out.print(a[i]+",");
        }
	}
}
