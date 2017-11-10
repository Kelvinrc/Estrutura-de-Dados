#include <stdio.h>
int main()
{    

    int num, i;
    scanf("%d", &num);

    int pre[num], pos[num], in[num];

    for(i = 0; i < num; i++) {
	    scanf("%d", &pre[i]);
	}
	for(i = 0; i < num; i++) { 
	    scanf("%d", &pos[i]);
	}
	for(i = 0; i < num; i++) {
	    scanf("%d", &in[i]);
	}	
    if(TransMethod(pre, pos, in, num)) 
	    printf("yes\n");
    else 
	    printf("no\n");
}
int TransMethod(int *pre, int *pos, int *in, int n){    

    if(pre[0] != pos[n - 1]) return 0;

    if(n == 1)
        if(pre[0] == pos[0] && pos[0] == in[0]) 
		    return 1;
        else 
		    return 0;

    int cont;
    for(cont = 0; cont < n; cont++)
        if(in[cont] == pre[0]) break;

    if(cont == n) return 0;

    int c, final = 1, pos_r = pos[n - 2], leftn = 0;

    for(c = 0; c < n; c++)
        if(pre[c] == pos_r){    
		    if((final *= TransMethod(pre + c, pos + c - 1, in + cont + 1, n - c)) == 0) 
			    return 0;
            leftn = c - 1;
            break;
        }

    if(cont != 0) 
	    final *= TransMethod(pre + 1, pos, in + 1, leftn);
    
    return final;
}