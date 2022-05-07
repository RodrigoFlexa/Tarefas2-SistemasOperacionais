#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <errno.h>
#include <signal.h>

int main(){

    int id1 = fork();
    int id2 = fork(); 

    if(id1 !=0 && id2 != 0 ){
        sleep(7);
       printf("Processo avo pid: %d e ppid: %d  \n", getpid(), getppid());
    }

    if(id1 == 0 && id2 != 0 ){
        printf("Processo pai pid: %d e ppid: %d  \n", getpid(), getppid());
    }

    if(id1 ==0 && id2 == 0 ){
        sleep(5);
     printf("Processo filho pid: %d e ppid: %d  \n", getpid(), getppid());
    }
    
    return 0;
} 