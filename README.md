In this exercise we try to program a contacts app with basic features (without using files).
NB: Since we are not working with files the contact list is gone after the program is closed.
The following features will be included:
1. The first command is "add".
    "add" function is to *drum rolls* no surprise, adding new contacts to our list. The goal is when we enter "add" the proram recieves info of a contact and declare an Id to it then return the id; it works as demonstrated below(the orange parts are printed by program in console the other parts are inputs, and the last 2 lines are output):
`enter your command: `add
    `first name: `James
    `last name: `Holden
    `phone number: `+989123456789
    `email: `someone@somemail.com
    `birthdate: `2010/22/9
####
id: 3


2. The second command is "list". As it names shows it lists the saved contacts in and order with the forat below:
enter your command: list
    ####
    id: 3
    first name: James
    last name: Holden
    phone number: +989123456789
    email: someone@somemail.com
    birthdate: 2010/22/9
    ####
    id: 5
    first name: Bernard
    last name: Lowe
    phone number: +989123498765
    email: bernard@wwc.com
    birthdate: 2000/12/9

3. The third command is "search-by-phone" which recieves a phone number and shows the contact saved with that phone number and if there is none says "no contact found". Here is an example:
    ex1:
    enter your command: search-by-phone
    phone number: +989123498765
    ####
    id: 5
    first name: Bernard
    last name: Lowe
    phone number: +989123498765
    email: bernard@wwc.com
    birthdate: 2000/12/9

4. Same as the 3rd command but it works with email:

    ex2:
    enter your command: search-by-email
    email: dolores@gmail.com
    ####
    no contacts found


**This is the overall functionality of this simple program, the main part of it is working with classes and objects, creating an array of objects and assign the values to them.**
