# Bankingproject

## Project Description

The Banking System project is a java application that allows users to register and manage their accounts. Clients can register accounts and they are able to edit their profile, view their account, transfer money.In registration email address included and manage their accounts.


## Technologies Used

MSQL- version 8.0.28.0
JDBC connector - version 8 
Eclipse - version 2022-23

## Features
Account created using case1 in app.java
By using set and get methods data would be accesed.
Try and catch block is used for exception handling.
Interfaces jdbcaccountrepository used for full abstraction of data.
By using preparedstatment the object is created in program to access sql records with high efficiency
Balance enquiry
 
To-do list
#UPI payments
#Request Debit card/cheque book
#E-passbook

## Getting Started
   
git clone git@https://github.com/veronikakowsar/Bankingproject.git
Eclipse or webdevelopers 
MYSQL 8.0.28.0/MYSQL workbench
Create project database in mysql 
Create table  trans with tyhe property given below
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| fromid      | varchar(20) | YES  |     | NULL    |       |
| toid        | varchar(20) | YES  |     | NULL    |       |
| transamount | double      | YES  |     | NULL    |       |
| date        | date        | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
  Create table accountdetials (Account details) 
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| id        | int         | NO   | PRI | NULL    | auto_increment |
| user_name | varchar(20) | YES  |     | NULL    |                |
| phone_no  | varchar(20) | YES  |     | NULL    |                |
| address   | varchar(50) | YES  |     | NULL    |                |
| balance   | double      | YES  |     | NULL    |                |
| aadhar_no | int         | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+

In Eclipse after importing the project rectify any errors with java compatibility version by taking suggestedd actions by Ecplise IED

To run the programme run App.java
## Usage

we can able to add the values in both the entities,count the number of transactions,deleting the account and transferring the amount from one account to another account by giving specific details of the users.







