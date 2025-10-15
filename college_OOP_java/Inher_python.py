class Animal:
    def __init__(self, sentence):
        self.sentence = sentence
    def printf(self):
        print(self.sentence)

class Dog(Animal):
    def __init__(self):
        super.__init__("Hellish")

dawg = Animal("Chal bhaag")
dawg.printf()

dawg2 = Dog()
dawg2.printf()