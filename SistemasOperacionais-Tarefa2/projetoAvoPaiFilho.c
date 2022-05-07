#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>
int main(){
    int id1 = fork();
    int id2; 
  
    if(id1 == 0){
        id2 = fork();
    }

    if(id1 == 0){
        if(id2 == 0){
            printf("Olá do processo filho pid: %d e ppid: %d  \n", getpid(), getppid());
        }else{
            printf("Olá do processo pai pid: %d e ppid: %d  \n", getpid(), getppid());
        }
    }else{
        if(id2 != 0){
            printf("Olá do processo Avo pid: %d e ppid: %d  \n", getpid(), getppid());
        }
    }
    printf("Olá");
    while(wait(NULL) != -1  || errno != ECHILD);
    
    return 0;
} 