from threading import Semaphore
class H2O:
    def __init__(self):
        self.h_sem=Semaphore(2)
        self.o_sem=Semaphore(1)
        self.bar_sem=Semaphore(0)


    def hydrogen(self, releaseHydrogen: 'Callable[[], None]') -> None:
        self.h_sem.acquire()
        # releaseHydrogen() outputs "H". Do not change or remove this line.
        releaseHydrogen()
        self.bar_sem.release()


    def oxygen(self, releaseOxygen: 'Callable[[], None]') -> None:
        self.o_sem.acquire()
        self.bar_sem.acquire()
        self.bar_sem.acquire()
    
        # releaseOxygen() outputs "O". Do not change or remove this line.
        releaseOxygen()
        self.h_sem.release()
        self.h_sem.release()
        self.o_sem.release()
        