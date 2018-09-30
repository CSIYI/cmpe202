1. List of CRC Cards
ClassName : Customer
Responsbility: enter the line and tell the receptionist name, phone #, and party size___Collaborator: Line_system
Responsbility: leave the line waiting for "table is ready message"___Collaborator: Message_system
Responsbility: respond to "Table is ready" message___Collaborator: Message_system
Responsbility: come back waiting to be seated
Responsbility: enjoy the meal


ClassName : Line_system
Responsbility: put/remove customer in line
Responsbility: edit customer information
Responsbility: add/remove customer to Message System___Collaborator: Message_system
Responsbility: confirm table is taken by customer___Collaborator: Table
Responsbility: inform Message System when a table is ready___Collaborator: Table

ClassName : Message_system
Responsbility: send "check in" message to customer
Responsbility: send "table is ready" message to customer___Line_System
Responsbility: receive customer respond, either "Stay" or "Leaving"___Collaborator: Customer
Responsbility: send customer respond to Line System___Collaborator: Line System

ClassName: Table
Responsbility: inform Line System when table is ready for party of 2___Collaborator: Line_System
Responsbility: inform Line System when table is ready for party of 3___Collaborator: Line_System
Responsbility: inform Line System when table is ready for party of 4 and above___Collaborator: Line_System

2. I will chose 2 design pattern for this project.
-State Design Pattern for Table class. It is because no matter what size of tables are, they always have the same stated to transformed. From "Open","Occupied","Cleaning" and etc.

-Observer Design Pattern for the Customer, Line_System, Table and Message_system classes. It is because both Line_System and Message_system need to be updated by the information from Customer and Table classes. All the update needs to be on real time. In this way, customer could get table information as soon as possible.