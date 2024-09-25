#include <stdio.h>
void TOH(int n, char sou, char aux, char des
                 )
{
    if (n == 1)
    {
        printf("Move disk 1 from %c to %c\n", sou, des);
        return;
    }
    TOH(n - 1, sou, des, aux);
    printf("Move disk %d from %c to %c\n", n, sou, des);
    TOH(n - 1, aux, sou, des);
}

int main()
{
    int n;
Output:
    printf("Enter the number of disks: ");
    scanf("%d", &n);
    TOH(n, 'A', 'B', 'C');
    return 0;
}
