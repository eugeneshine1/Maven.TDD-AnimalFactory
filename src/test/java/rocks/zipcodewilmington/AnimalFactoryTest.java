package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        Dog dog = AnimalFactory.createDog("Doge",new Date(0));

        Assert.assertEquals("Doge",dog.getName());
        Assert.assertEquals(new Date(0),dog.getBirthDate());

    }
    @Test
    public void testCreateCat(){
        Cat cat =AnimalFactory.createCat("Kitty",new Date(1));

        Assert.assertEquals("Kitty",cat.getName());
        Assert.assertEquals(new Date(1),cat.getBirthDate());

    }




}

