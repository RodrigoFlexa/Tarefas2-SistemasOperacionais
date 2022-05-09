#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

int main(){

    int pid1 ;
    int pid2 ;
    pid1 = fork();
     
    if(pid1 == 0){
        printf("Processo filho A: pid :%d ppid:%d \n",getpid(),getppid());
    }
    
    if(pid1 != 0){
        pid2 = fork();

        if(pid2 == 0){
            printf("Processo filho B: pid: %d, ppid:%d \n", getpid(),getppid());
        } else if(pid2 != 0){
          printf("Processo pai: pid:%d \n",getpid());
        }
    }
    return 0;
}

