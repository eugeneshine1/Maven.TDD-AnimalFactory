package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void testSetNameCat() {
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String newName = "Jennifer";
        cat.setName(newName);
        String actual = cat.getName();

        Assert.assertEquals(newName,actual);
    }
    @Test
    public void testSetBirthDateCat() {
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        cat.setBirthDate(givenBirthDate);
        Date actual = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, actual);
    }
    @Test
    public void testSpeakCat() {
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String expected = "meow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEatCat() {
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer expected = 1;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food();
        cat.eat(food);


        Integer actual = cat.getNumberOfMealsEaten();


        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testIdCat() {
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Integer actual = cat.getId();

        Assert.assertEquals(givenId, actual);
    }
    @Test
    public void testAnimalInheritanceCat() {
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Animal);

    }
    @Test
    public void testMammalInheritanceCat() {
        String givenName = "Kitty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Mammal);

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
