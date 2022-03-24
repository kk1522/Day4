public class AssociationTest {
    public static void main(String[] args) {

    }
}

class HolidayHome extends Hotel{ //isA

}
class Branch{

}
class Hotel{

}
class TwoWheeler extends Vehicle{ //isA

}
class ClassRoom{

}
class AirConditioner{

}
class Shirt{

}
class Book{

}
class ReportCard{

}
class Company{
    AirConditioner airConditionerObj = new AirConditioner(); //hasA
    Branch branchObj = new Branch();//hasA
}
class Aquarium{

}
class Laptop{

}
class FeedBackForm{

}
class Restaurant{
    Food serveFood(){ //producesA
        Food foodObj = new Food();
        return foodObj;
    }
    FeedBackForm feedBack(){ //producesA
        FeedBackForm feedBackForm = new FeedBackForm();
        return feedBackForm;
    }
}
class Vehicle{

}
class Library{

    Book rentBook(){ //producesA
        Book bookObj = new Book();
        return bookObj;
    }
    void returnBook(Book book){ //usesA

    }

}
class KFC extends Food{

}
class Movie{

}
class LearningGuitar{

}
class Trading{

}
class Toy{

}
class GasBill{

}
class Food{}


