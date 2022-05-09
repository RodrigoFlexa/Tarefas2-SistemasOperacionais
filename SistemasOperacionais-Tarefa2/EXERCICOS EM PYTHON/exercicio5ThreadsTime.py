import time
from threading import Thread

COUNT = 100000

def countdown(n):
    while n > 0:
        n = n - 1

t1 = Thread(target=countdown, args=(COUNT,))


start = time.time()
t1.start()

t1.join()

end =  time.time()

print("Tempo de execução: ",  end - start)
