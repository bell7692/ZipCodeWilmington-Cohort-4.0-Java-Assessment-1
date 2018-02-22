package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    String name;
    ArrayList<Pet> pets ;



    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets == null){
            this.pets = null;
        }
        else if (pets!=null){
            this.pets = new ArrayList<Pet>(Arrays.asList(pets));
            for(Pet p : pets){
                p.setOwner(this);
            }
        }
        //initializes pet owner objects and put it in to the arrayList called pets
        //null in case a user put in an empty string
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if( this.pets == null) {
            this.pets = new ArrayList<Pet>();
        }
        this.pets.add(pet);
        pet.setOwner(this);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.pets.remove(pet);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return this.pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = Integer.MAX_VALUE;
        for (Pet p : this.pets){
            if(p.getAge()< youngestAge){
                youngestAge = p.getAge();
            }
        }
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = 0;
        for (Pet p : this.pets){
            if(p.getAge() > oldestAge){
                oldestAge = p.getAge();
                //everytime we find a age older than the previous one, we REPLACE IT!
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer sumOfPets = 0;
        for (Pet p : this.pets){
           sumOfPets += p.getAge();
        }
       return sumOfPets / (float) getNumberOfPets();
        //put float with denominator so it will always be a float. forcing the slash to be a float divide
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if (this.pets ==null) return null;
        return this.pets.toArray(new Pet [this.pets.size()]);

        //toArray(needs what data type will go in and the SIZE of array)
        //creates a new array of pets

        //        Integer sz = this.petsOwned.size();
//        Pet[] p = new Pet[sz];
//        Integer i = 0;
//        for (Pet tp : this.petsOwned) {
//            p[i] = tp;
//            i++;
//        }
//        return p;
    }
}
