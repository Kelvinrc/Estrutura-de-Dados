#include <stdio.h>
char a[10001];
int d;
int max(int p,int q){
    
	return p > q ? p : q;
}

int length(){
    
	if (a[d++] =='l'){

        return 1;
	}
    
	else
        return max(length(),length())+1;
}

int main(){
    int c;
    
	scanf("%d",&c);
    
	while (c--){
		
        scanf("%s", a);
        d=0;
        printf("%d\n",length() - 1);
    }
    
	return 0;
}
