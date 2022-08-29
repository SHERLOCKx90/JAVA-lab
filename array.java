import java.util.Scanner;
public class array{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int a[]=new int[5];
for(int i=0; i<a.length; i++){
 a[i]=input.nextInt();
}
System.out.println();
for(int i=0; i<a.length; i++){
 System.out.print(a[i]+" ");
}
}
}
