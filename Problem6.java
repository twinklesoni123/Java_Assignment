Create an abstract class Shape with an abstract method calculate_area() and a
concrete method display_info(). Create concrete subclasses
like Circle and Rectangle that must implement their own specific logic
for calculate_area(). Try to instantiate an object of the Shape class directly and
observe the compilation error. Use the subclass objects to call both abstract and
concrete methods.
from abc import ABC, abstractmethod
import math

# Abstract class
class Shape(ABC):
    @abstractmethod
    def calculate_area(self):
        """Abstract method to calculate area"""
        pass

    # Concrete method
    def display_info(self):
        print("This is a shape. It can calculate the area of specific shapes.")

# Concrete subclass: Circle
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def calculate_area(self):
        return math.pi * self.radius ** 2

# Concrete subclass: Rectangle
class Rectangle(Shape):
    def __init__(self, length, breadth):
        self.length = length
        self.breadth = breadth

    def calculate_area(self):
        return self.length * self.breadth


# Trying to instantiate Shape directly will raise an error
# Uncommenting the following line will give TypeError
# shape = Shape()

# Using subclass objects
circle = Circle(5)
rectangle = Rectangle(4, 6)

print("Circle Area:", circle.calculate_area())
circle.display_info()

print("Rectangle Area:", rectangle.calculate_area())
rectangle.display_info()
