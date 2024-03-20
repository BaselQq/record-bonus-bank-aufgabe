Coding: Java Record Zoo Project
Create a new project in IntelliJ and lay the foundation for the Java Record Zoo Project.

Create a Java record "Animal" that should have properties for ID, Name, Species, and Age. Choose suitable field names.
Make a commit. Please post the link to your GitHub repository where you solved this task together. inputfield
## Coding: Calling Record Methods

Now let's test the automatically generated methods.

* In a main method, create multiple Animals.
* Call the automatically generated methods in the Record and check if they do what you expect (equals, toString).

## Coding: Nesting

Now we will use a Record as an attribute of another Record.

* Create an `Owner` Record that stores some properties of a pet owner (Name, Age, Address).
* Let each `Animal` have an `Owner`.

## Coding: Nesting + Reusing

Using a Record in multiple other Records.

* Create a `Species` Record that stores the properties of an animal species (Name, Food requirement in grams per day).
* Let each `Animal` have a `Species`.
* In your main method, let multiple `Animal` objects have the same `Species`.
* If you have already completed this task earlier, you can work on the bonus task on the next page.

## Coding: BankService Setup

Create a new Java project in IntelliJ and implement the following task to model a simple BankService and a customer account.

* Create a record 'Client' with the properties First Name, Last Name, and Customer Number (choose suitable English field names).
* Create a class 'Account' (not a record, should initially be mutable) with the properties Account Number (String), Account Balance (BigDecimal), and the associated customer.
* Please post the link to your GitHub repository here, where you share your solutions.
  `inputfield`

## Coding: Account Balance

Now we will implement convenience methods to retrieve and modify the account balance.

* Implement a method to deposit money into the account.
* Implement a method to withdraw money from the account.

## Coding: Management

Now we will implement a class that manages a list of customers and their accounts.

* Create a class 'BankService' that manages a set of accounts.
* Implement a method in BankService to open an account. It should only require a customer as an argument and should return the new account number.
* Implement a method in BankService to transfer a specific amount (as BigDecimal) from one account number (as String) to another account number (as String).

## Coding: Joint Accounts and Separations

What happens when 3 cents are divided between two people?

* Modify your records and classes so that an account can have multiple account holders (two or more account holders).
* Write a method `public List<String> split(String accountNumber)` in the service that splits an account equally. From a joint account, individual accounts should be created for each account holder. It should return the newly created account numbers. Each account should receive the same amount of money after the split (+- 1 cent). Make sure that the bank does not incur any cent gains or losses during the process.
* PS: as usual, our bank does not deal with half cents ;)
* Tip: Test Driven Development is also very useful for solving this task! (applies to the following tasks as well)

## Bonus: With-Methods

If you have already completed the main task, you can try this bonus task.

* Write with-methods ('wither', similar to the research questions) for all properties of the `Animal` Record.

## Bonus: Zoo

If you have already completed the main task, you can try this bonus task.

* Implement a "Zoo" Record that has a list of all Animals and can calculate the total food requirement of all animals in the Zoo.

## Bonus: Interest Calculator

A bank without interest? That's not acceptable!

* Extend the 'BankService' with a method that calculates and credits interest to all customer accounts based on an interest rate. (Interest = Account Balance * (Interest Rate / 100).

## Bonus: Transactions

Can I have a bank statement, please!

* Modify your classes so that there is no longer a fixed account balance, but a list of transactions instead. Each transaction has an amount, a balance (new account balance after the transaction), a description (optional), and a date. The transactions should be implemented as records. To determine the current account balance, the BankService should return the balance of the last transaction.

## Bonus: Daily Calculation of Interest

Subannual Calculation of Interest

* For each withdrawal or deposit action, the interest accrued since the last transaction should be calculated. The interest rate stored in the BankService should represent the annual interest rate. Pay attention to the compound interest effect (at 4% interest, not quite 2% has accrued after half a year). Create a second transaction for interest credits (or interest charges) for each transaction.