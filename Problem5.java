// Write a program to print the area of two rectangles having sides (4,5) and (5,8)
// respectively by creating a class named ‘Rectangle’ with a method named ‘Area’
// which returns the area and length and breadth passed as parameters to its
// constructor.
class Rectangle:
    # Constructor to initialize length and breadth
    def __init__(self, length, breadth):
        self.length = length
        self.breadth = breadth

    # Method to calculate area
    def Area(self):
        return self.length * self.breadth


# Create objects for two rectangles
rect1 = Rectangle(4, 5)
rect2 = Rectangle(5, 8)

# Print areas
print(f"Area of Rectangle 1 (4x5) : {rect1.Area()}")
print(f"Area of Rectangle 2 (5x8) : {rect2.Area()}")
