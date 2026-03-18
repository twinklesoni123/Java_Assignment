// Define a class employee with the following specification:
//  Members are: empno of type integer, ename of type String, basic, hr and da
// are of type float, netpay of type float.
//  Member functions:
//  Calculate() : A function to find basix+hra+da with the float return type.
//  havedata(): function to accept values for empno, ename, basic, hra, da and
// invoke calculate() to calculate netpay.
//  dispdata(): function to display all the data members.
class Employee:
    def __init__(self):
        self.empno = 0
        self.ename = ""
        self.basic = 0.0
        self.hra = 0.0
        self.da = 0.0
        self.netpay = 0.0

    # Function to calculate netpay
    def Calculate(self):
        return self.basic + self.hra + self.da

    # Function to accept data and calculate netpay
    def havedata(self):
        self.empno = int(input("Enter Employee Number: "))
        self.ename = input("Enter Employee Name: ")
        self.basic = float(input("Enter Basic Salary: "))
        self.hra = float(input("Enter HRA: "))
        self.da = float(input("Enter DA: "))
        self.netpay = self.Calculate()  # calculate netpay

    # Function to display all employee details
    def dispdata(self):
        print("\n------ EMPLOYEE DETAILS ------")
        print(f"Employee Number : {self.empno}")
        print(f"Employee Name   : {self.ename}")
        print(f"Basic Salary    : {self.basic}")
        print(f"HRA             : {self.hra}")
        print(f"DA              : {self.da}")
        print(f"Net Pay         : {self.netpay}")
        print("-------------------------------")


# Main program
emp = Employee()
emp.havedata()
emp.dispdata()
