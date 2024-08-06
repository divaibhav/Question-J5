### Simple Design Specifications

#### Create the following design as per given requirements

1. Task 1:
  - Create a `RectangleShape` class, which contains following field `double length` and ` double breadth`.
    - Provide proper encapsulation for the `RectangleShape` class.
    - Create **getter** and **setter** for the fields.
    - `RectangleShape` will contain two constructors parameterized and non-parameterized.
  - Create a `MyMain` class, which contains following methods and perform the mentioned operations.
    - Create `public double calculatePerimeter(RectangleShape object)` method, which calculate the perimeter of rectangle and return the calculated perimeter.
    - Create `public double calculateArea(RectangleShape object)` method, which calculate the area of rectangle and return the calculated area.
    - Create `public boolean isSameRectangle(RectangleShape rectangleShape1, RectangleShape rectangleShape2)`method, which check if both the objects are equal using following rules:
      - if `rectangleShape1` and `rectangleShape2` refers the same object they are equal then return true otherwise check if `length` and `breadth` of both the objects are equal then return true, otherwise false.
    - Create `public static void main(String[] args)` method which will create three objects `object1`, `object2` and `object3` of `RectangleShape` class, by accepting the values form user. 
      - print area and perimeter for each object.
      - check `object1` and `object2` are equal
      - check `object2` and `object3` are equal 
    - Note: All input and output must be performed from `main method`.