// 18. A bank has a fixed interest rate that should not be changed once it is defined.
// Question:
// Create a class Bank with a final variable interestRate.
// Create a method calculateInterest(double amount) that calculates the interest using
// the fixed rate.
// Write a program to calculate interest for different customers.
class Bank:
    def __init__(self, interest_rate):
        # Fixed interest rate (do not change after setting)
        self.interest_rate = interest_rate  

    def calculate_interest(self, amount):
        interest = (amount * self.interest_rate) / 100
        return interest


# Create a Bank object with a fixed interest rate
bank = Bank(5)   # 5% interest rate

# Calculate interest for different customers
customer1 = 1000
customer2 = 5000
customer3 = 2000

print("Interest for Customer 1:", bank.calculate_interest(customer1))
print("Interest for Customer 2:", bank.calculate_interest(customer2))
print("Interest for Customer 3:", bank.calculate_interest(customer3))
