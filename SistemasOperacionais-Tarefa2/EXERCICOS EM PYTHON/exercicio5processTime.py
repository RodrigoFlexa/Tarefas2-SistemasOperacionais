import multiprocessing as mp
from multiprocessing import Process
import time

def countdown():
    COUNT = 10000000
    while COUNT > 0:
        COUNT -= COUNT

def main_fn():
    proc = Process(target=countdown)
    start = time.time()
    proc.start()
    proc.join()
    end = time.time()
    print("Feito")
    print("Tempo de execução: ",  end - start)

if __name__ == "__main__":
    main_fn()

