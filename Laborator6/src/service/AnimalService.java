package service;

import model.Animal;

import java.util.List;

public interface AnimalService {
    public void addAnimal(Animal animal);

    public List<Animal> getAnimals();
}