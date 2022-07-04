package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getCatById;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testAddCat() {
        Cat cat = new Cat("kitty",new Date(),0);
        String expectedAdd = "kitty";

        CatHouse catHouse = new CatHouse();
        CatHouse.clear();

        catHouse.add(cat);
        Cat addCat = getCatById(0);

        Assert.assertEquals(expectedAdd, addCat.getName());

    }
    @Test
    public void testRemoveCat() {
//        CatHouse.clear();
//        String givenName = "Kitty";
//        Date givenBirthDate = new Date();
//
//        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
//        CatHouse.add(cat);
//        CatHouse.remove(cat);
//
//        Integer cats = CatHouse.getNumberOfCats();
//
//
//        Assert.assertEquals(cats,cat);
        Cat cat = new Cat("kitty",new Date(),0);
        String expected = "kitty";

        CatHouse catHouse = new CatHouse();
        CatHouse.clear();

        catHouse.remove(cat);
        Cat removeCat = getCatById(0);

        Assert.assertEquals(expected, removeCat.getName());

    }
    @Test
    public void testRemoveCatById() {
        CatHouse.clear();
        String givenName = "Kitty";
        Date givenBirthDate = new Date();

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
        CatHouse.add(cat);
        CatHouse.remove(0);

        Integer newId = CatHouse.getNumberOfCats();
        Integer expected =0;

        Assert.assertEquals(expected,newId);

//        CatHouse.clear();
//
//        Cat cat1 = AnimalFactory.createCat(givenName, givenBirthDate);
//        CatHouse.add(cat1);
//        CatHouse.remove(0);
//
//        Integer newId1 = CatHouse.getNumberOfCats();
//        Integer expected1 =0;
//
//        Assert.assertEquals(expected1,newId1);
    }
    @Test
    public void testGetCatById() {
        CatHouse.clear();
        String givenName = "Kitty";
        Date givenBirthDate = new Date();

        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
        CatHouse.add(cat);

        Integer newId = CatHouse.getNumberOfCats();
        Integer expected =1;

        Assert.assertEquals(expected,newId);
    }


    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Kitty";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
}
