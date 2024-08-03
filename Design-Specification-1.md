#### Design the application using the following specification
- Create a class UserName, which contains two fields first name and last name of type String.
UserName class must be properly encapsulated. This class will contain a method fullName,
which will return full name by combining first name and last name. This class doesn't have any constructor.
    ```
   Sample
   first name = Ramesh, last name = Sharma, then full name is Ramesh Sharma
   ```
- Create a utility class MyUtility. This class will have one static method countVowel, 
which accept one parameter of type UserName and return the count of vowels in the parameter.
This class also contains a private method isVowel, that will accept one parameter of type char and return true if the
parameter is a vowel, otherwise it will return false. This class doesn't have any constructor.

- Create a class MyMain, which contains a main method. And perform the following tasks :
   - From main method accept first name and last name from the user and store it in UserName object.
   - Print the full name of the user
   - Print the number of vowels in the full name of the user, using the countVowel method.
