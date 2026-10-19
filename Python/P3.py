class ATM:
    def __init__(self,balance):
        self.balance=balance
    def deposit(self,amount):
        self.balance+=amount
    def display(self):
        print("Current Balance: ",self.balance)
a=ATM(50000)
a.deposit(10000)
a.display()