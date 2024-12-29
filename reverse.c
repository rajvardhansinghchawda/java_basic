#include <stdio.h>
#include <math.h>
int main(){
    int num;
    printf("entre a number");
    scanf("%d",&num);
    int add = 0;
    int orginal_value = num;
    while(num>0){
        num = num/10;
        add++;
    }
    int power = add-1;
    printf(" vale of add is %d", add);
    int rev=0, original = 0,value;
    for (int  i = 0; i < add; i++)
    {    printf("original value is %d\n", orginal_value);
        value = orginal_value % 10;

        orginal_value = orginal_value / 10;
        
        rev = value * pow(10, power);
        original = rev + original;

        power--;
    printf("the reverse value is %d", original);

    }
}