#include<stdio.h>
void main(){
    int num,sum=0,x;
    scanf("%d",&num);
    while(num!=0){
        x=num%10;
        num/=10;
        sum=sum+x;
    }
    printf("%d",sum);

}
