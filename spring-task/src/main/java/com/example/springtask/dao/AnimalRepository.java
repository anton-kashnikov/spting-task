package com.example.springtask.dao;

import com.example.springtask.entity.Animal;
import com.example.springtask.entity.Bear;
import com.example.springtask.entity.Lion;
import com.example.springtask.entity.Tiger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalRepository {

//    TODO: Можливо переназвати всі updateOrCreate в save(). І зробити їх незалежними від типу
    private List<Bear> bears = new ArrayList<>();
    private List<Lion> lions = new ArrayList<>();
    private List<Tiger> tigers = new ArrayList<>();
    private Long bearsIdCounter = 0L;
    private Long lionsIdCounter = 0L;
    private Long tigersIdCounter = 0L;

    {
        bears.add(new Bear(1L, "Holy", 13, 111.0, 156.0));
        bears.add(new Bear(2L, "Lotus", 15, 124.0, 168.0));
        bears.add(new Bear(3L, "Peanut", 2, 89.0, 114.0));
        bears.add(new Bear(4L, "Sonya", 2, 85.0, 104.0));
        bearsIdCounter = bears.stream().max((o1, o2) ->  (int)(o1.getId() - o2.getId())).get().getId();

        lions.add(new Lion(1L, "Special", 9, 95.0, 109.0));
        lions.add(new Lion(2L, "Gertrude", 2, 52.0, 81.0));
        lions.add(new Lion(3L, "Spunk", 2, 75.0, 82.0));
        lions.add(new Lion(4L, "Calvin", 10, 87.0, 105.0));
        lions.add(new Lion(5L, "King", 18, 71.0, 89.0));
        lions.add(new Lion(6L, "Onion", 12, 95.0, 120.0));
        lions.add(new Lion(7L, "Picasso", 14, 81.0, 113.0));
        lions.add(new Lion(8L, "Ludwig", 8, 80.0, 101.0));
        lionsIdCounter = lions.stream().max((o1, o2) ->  (int)(o1.getId() - o2.getId())).get().getId();

        tigers.add(new Tiger(1L, "Smoke", 6, 90.0, 110.0));
        tigers.add(new Tiger(2L, "Nelson", 5, 86.0, 115.0));
        tigers.add(new Tiger(3L, "Daze", 8, 96.0, 106.0));
        tigers.add(new Tiger(4L, "Smarty", 11, 79.0, 100.0));
        tigers.add(new Tiger(5L, "Monte", 9, 87.0, 103.0));
        tigers.add(new Tiger(6L, "Zeta", 10, 85.0, 110.0));
        tigersIdCounter = tigers.stream().max((o1, o2) ->  (int)(o1.getId() - o2.getId())).get().getId();
    }

    public List<Animal> getAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.addAll(bears);
        animals.addAll(lions);
        animals.addAll(tigers);
        return animals;
    }

    public List<Bear> getBears() {
        return bears;
    }

    public Bear getBearById(Long id) {
        return bears.stream().filter(bear -> bear.getId().equals(id)).findFirst().get();
    }

    public Bear saveBear(Bear bear) {
        if (bear.getId() == null) {
            bear.setId(++bearsIdCounter);
            bears.add(bear);
            return bear;
        }
        Bear bearToUpdate = getBearById(bear.getId());
        if (bearToUpdate == null){
            return null;
        }
        bearToUpdate.setName(bear.getName());
        bearToUpdate.setAge(bear.getAge());
        bearToUpdate.setCurrentSatiety(bear.getCurrentSatiety());
        bearToUpdate.setFullSatiety(bear.getFullSatiety());
        return bearToUpdate;
    }

    public Long deleteBearById(Long id) {
        bears.removeIf(bear -> bear.getId().equals(id));
        return id;
    }

    public List<Lion> getLions() {
        return lions;
    }

    public Lion getLionById(Long id) {
        return lions.stream().filter(lion -> lion.getId().equals(id)).findFirst().get();
    }

    public Lion saveLion(Lion lion) {
        if (lion.getId() == null) {
            lion.setId(++lionsIdCounter);
            lions.add(lion);
            return lion;
        }
        Lion lionToUpdate = getLionById(lion.getId());
        if (lionToUpdate == null){
            return null;
        }
        lionToUpdate.setName(lion.getName());
        lionToUpdate.setAge(lion.getAge());
        lionToUpdate.setCurrentSatiety(lion.getCurrentSatiety());
        lionToUpdate.setFullSatiety(lion.getFullSatiety());
        return lionToUpdate;
    }

    public Long deleteLionById(Long id) {
        lions.removeIf(lion -> lion.getId().equals(id));
        return id;
    }

    public List<Tiger> getTigers() {
        return tigers;
    }

    public Tiger getTigerById(Long id) {
        return tigers.stream().filter(tiger -> tiger.getId().equals(id)).findFirst().get();
    }

    public Tiger saveTiger(Tiger tiger) {
        if (tiger.getId() == null) {
            tiger.setId(++tigersIdCounter);
            tigers.add(tiger);
            return tiger;
        }
        Tiger tigerToUpdate = getTigerById(tiger.getId());
        if (tigerToUpdate == null){
            return null;
        }
        tigerToUpdate.setName(tiger.getName());
        tigerToUpdate.setAge(tiger.getAge());
        tigerToUpdate.setCurrentSatiety(tiger.getCurrentSatiety());
        tigerToUpdate.setFullSatiety(tiger.getFullSatiety());
        return tigerToUpdate;
    }

    public Long deleteTigerById(Long id) {
        tigers.removeIf(tiger -> tiger.getId().equals(id));
        return id;
    }
}
