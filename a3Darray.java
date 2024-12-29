
class a3Darray{
 public static void main(String[]agrs){

   int a3darr[][][] = new int[3][4][5];
   
    for(int i=0 ; i<3;i++){
     for(int k=0 ; k<4;k++){
      for(int j=0; j<3;j++){
      a3darr[i][k][j] = i*k*j;
      }}}

      
    for(int i=0 ; i<3;i++){
    for(int k=0 ; k<4;k++){

  
     for(int j=0; j<3;j++){
        System.out.print(a3darr[i][k][j] + "  ");
     
    }
}
}  
} 


    
}