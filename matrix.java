//java program to illustrate the use of multidimensional array
public class matrix{
public static void main(String[] args){
//declaring and initializing 2D array
int sum[][]={{0,0,0},{0,0,0},{0,0,0}};
int arr1[][]={{1,2,3},{2,3,4},{3,4,5}};
int arr2[][]={{2,4,6},{5,9,6},{3,2,5}};
for(int i=0; i<3; i++){
for(int j=0; j<3;j++){
 sum[i][j]= arr1[i][j] + arr2[i][j];
System.out.print(sum[i][j]+"");
}
System.out.println(); //newline
}
}
}
