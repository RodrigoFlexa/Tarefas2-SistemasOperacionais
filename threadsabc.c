#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <pthread.h>
#include  <time.h>

int a = 0;

void* printaa(){
     while(a != 0){
        sleep(0.5);
    }
    printf("A\n");
    a++;
}
void* printab(){
    while(a != 1){
        sleep(0.5);
    }
    printf("B\n");
    a++;
}

void* printac(){
     while(a != 2){
        sleep(0.5);
    }
    printf("C\n");
    a++;
}

int main(){
    pthread_t t1,t2,t3;

    pthread_create(&t1,NULL,&printaa,NULL);
    pthread_create(&t2,NULL,&printab,NULL);
    pthread_create(&t3,NULL,&printac,NULL);

    pthread_join(t1,NULL);
    pthread_join(t2,NULL);
    pthread_join(t3,NULL);
    
    return 0;
}