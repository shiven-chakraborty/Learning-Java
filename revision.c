#include <stdio.h>

int main(){

    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    int d5 = ((num % 10) + 1) % 10;
    num = num / 10;
    int d4 = ((num % 10) + 1) % 10;
    num = num / 10;
    int d3 = ((num % 10) + 1) % 10;
    num = num / 10;
    int d2 = ((num % 10) + 1) % 10;
    num = num / 10;
    int d1 = ((num % 10) + 1) % 10;
    
    int new_num = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5;

    printf("The new number is %d", new_num);
    return 0; 
}