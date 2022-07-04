package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.getDogById;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test
    public void testAddDog() {
        Dog dog = new Dog("Doge",new Date(),1);
        String expectedAdd = "Doge";

        DogHouse dogHouse = new DogHouse();
        DogHouse.clear();

        dogHouse.add(dog);
        Dog addDog = getDogById(1);

        Assert.assertEquals(expectedAdd, addDog.getName());

    }
    @Test
    public void testRemoveDog() {
        Dog dog = new Dog("Doge", new Date(), 1);
        String expectedAdd = "Doge";

        DogHouse dogHouse = new DogHouse();
        DogHouse.clear();

        dogHouse.remove(dog);
        Dog removeDog = getDogById(1);

        Assert.assertEquals(expectedAdd, removeDog.getName());
    }
    @Test
    public void testRemoveDogById() {
        DogHouse.clear();
        String givenName = "Doge";
        Date givenBirthDate = new Date();

        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);
        DogHouse.add(dog);
        DogHouse.remove(0);

        Integer newId = DogHouse.getNumberOfDogs();
        Integer expected = 0;

        Assert.assertEquals(expected, newId);
    } @Test
    public void testGetDogById() {
        DogHouse.clear();
        String givenName = "Doge";
        Date givenBirthDate = new Date();

        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);
        DogHouse.add(dog);

        Integer newId = DogHouse.getNumberOfDogs();
        Integer expected =1;

        Assert.assertEquals(expected,newId);
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
