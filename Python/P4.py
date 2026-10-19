class Parent:
    def parent(self):
        print("From Parent Class")
class Child(Parent):
    def child(self):
        print("From Child Class")
c=Child()
c.child()
c.parent()