package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testSetNameDog() {
        String givenName = "Doge";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String newName = "doggy";
        dog.setName(newName);
        String actual = dog.getName();

        Assert.assertEquals(newName,actual);
    }
    @Test
    public void testSetBirthDateDog() {
        String givenName = "Doge";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        dog.setBirthDate(givenBirthDate);
        Date actual = dog.getBirthDate();

        Assert.assertEquals(givenBirthDate, actual);
    }
    @Test
    public void testSpeak() {
        String givenName = "Doge";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String expected = "bark!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEat() {
        String givenName = "Doge";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Integer expected = 1;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Food food = new Food();
        dog.eat(food);


        Integer actual = dog.getNumberOfMealsEaten();


        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testId() {
        String givenName = "Doge";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Integer actual = dog.getId();

        Assert.assertEquals(givenId, actual);
    }
    @Test
    public void testAnimalInheritance() {
        String givenName = "Doge";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Animal);

    }
    @Test
    public void testMammalInheritance() {
        String givenName = "Doge";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Mammal);

    }
}
