// Define a class Resort with the following description:
//  Members are: RNo to store Room Number, Name store customer name,
// Charges to store per day charges, Days to store number of days of stay.
//  Member functions:
//  Compute() to calculate and return Amount as Days * Charges and if the
// values of Days*Charges is more than 11000 then as 1.02*Days*Charges
//  Getinfo() A function to enter the content Rno, Name, Charges and Days.
//  DispInfo() A function to enter the content Rno, Name, Charges, Days and
// Amount by calling function Compute().
class Resort:
    def __init__(self):
        self.RNo = 0
        self.Name = ""
        self.Charges = 0
        self.Days = 0

    # Function to input details
    def Getinfo(self):
        self.RNo = int(input("Enter Room Number: "))
        self.Name = input("Enter Customer Name: ")
        self.Charges = float(input("Enter Charges per Day: "))
        self.Days = int(input("Enter Number of Days: "))

    # Function to compute amount
    def Compute(self):
        amount = self.Days * self.Charges
        if amount > 11000:
            amount = amount * 1.02
        return amount

    # Function to display details
    def DispInfo(self):
        amount = self.Compute()
        print("\n------ RESORT DETAILS ------")
        print(f"Room Number   : {self.RNo}")
        print(f"Customer Name : {self.Name}")
        print(f"Charges/Day   : {self.Charges}")
        print(f"Days Stayed   : {self.Days}")
        print(f"Total Amount  : {amount}")
        print("-----------------------------")


# Main Program
r = Resort()
r.Getinfo()
r.DispInfo()
