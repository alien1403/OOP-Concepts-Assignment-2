# OOP-Concepts-Assignment-2
Requirements

All phones offer the following behavior:
- you can create new contacts
- you can see existing contacts
- you can send a text message
- you can see all messages for a specific contact
- you can make a call
- you can see all calls history


Implement a phone hierarchy where:
- A phone can be of certain manufacturers and it can have a specific model (Phone - Samsung - SamsungGalaxyS6)
- properties which cannot change: battery life (in number of hours)
- properties that are configurable: color, material
- properties that are instance specific: imei

Behavior: 
 - a message can have maximum 500 chars
 - every time a message is send an hour is taken from the battery life
 - every time a call is made two hours are taken from the battery life

API:
  Phone phone= new Samsung(); // shouldn't compile
       Phone phone = new SamsungGalaxy6();

       phone.addContact("1", "phone number", "first name", "last name");
       phone.addContact("2", "phone number", "first name", "last name");
       phone.listContacts();

       // send a message to the first contact from the previous listed
        // max number of characters - 100
       phone.sendMessage("phone number", "message content");
       phone.listMessages("phone number");

        // send a message to the second contact from the previous listed
       phone.call("phone number");
       phone.viewHistory();

Tasks:
- implement the classes, abstract classes and interfaces according to the given information
- create at least 2 phone brands with 2 models for each
- create 2 new contacts
- send a message to the first contact
- make a call to the second contact
