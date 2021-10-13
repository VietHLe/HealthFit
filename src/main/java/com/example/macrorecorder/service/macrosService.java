package com.example.macrorecorder.service;

import com.example.macrorecorder.model.MacroModel;
import com.example.macrorecorder.repository.MacroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class macrosService {
    @Autowired
    private MacroRepo macroRepository;

    public List<MacroModel> getAll() {
        return macroRepository.findAll();
    }
    public MacroModel create(MacroModel macros){

        return macroRepository.save(macros);
    }
    //update food calories and add it to the previous calories to get new total calories
    public MacroModel updateFoodCalories(Long id, MacroModel foodCalories){
        MacroModel foodCal = macroRepository.findById(id).orElse(null);
        int oldCal = foodCal.getCaloriesFood();
        int newCal = foodCalories.getCaloriesFood();
        int total = oldCal + newCal;
        foodCal.setCaloriesFood(total);
        return macroRepository.save(foodCal);
    }
    public MacroModel updateCarb(Long id, MacroModel carb){
        MacroModel foodCarb = macroRepository.findById(id).orElse(null);
        int oldCarb = foodCarb.getCarbs();
        int newCarb = carb.getCarbs();
        int total = oldCarb + newCarb;
        foodCarb.setCarbs(total);
        return macroRepository.save(foodCarb);
    }
    public MacroModel updateFat(Long id, MacroModel fat){
        MacroModel foodFat = macroRepository.findById(id).orElse(null);
        int oldFat = foodFat.getFat();
        int newFat = fat.getFat();
        int total = oldFat + newFat;
        foodFat.setFat(total);
        return macroRepository.save(foodFat);
    }
    public MacroModel updateProtein(Long id, MacroModel protein){
        MacroModel foodProtein = macroRepository.findById(id).orElse(null);
        int oldProtein = foodProtein.getProtein();
        int newProtein = protein.getProtein();
        int total = oldProtein + newProtein;
        foodProtein.setProtein(total);
        return macroRepository.save(foodProtein);
    }
    public MacroModel updateFood(Long id,MacroModel foodEat){
        MacroModel food = macroRepository.findById(id).orElse(null);
        String newFoodEat = foodEat.getFoodEat();
        food.setFoodEat(newFoodEat);
        return macroRepository.save(food);
    }
    // boolean that will turn true by user if finish else it would stay false as default
    public MacroModel done(Long id,MacroModel finish){
        //update whether its completed
        MacroModel nonComplete = macroRepository.findById(id).orElse(null);
        nonComplete.setFinish(true);
        return macroRepository.save(nonComplete);
    }
    // create a user input for string
    public MacroModel due(Long id, MacroModel newDate){

        MacroModel stringNewDate = macroRepository.findById(id).orElse(null);
        String newDateString = newDate.getDueDate();
        stringNewDate.setDueDate(newDateString);
        return macroRepository.save(stringNewDate);
    }
    public void delete(Long id){
        macroRepository.deleteById(id);
    }

    public MacroModel advice(Long id, MacroModel advice){
        MacroModel oldAdvice = macroRepository.findById(id).orElse(null);
        String newUpdateAdvice = advice.getAdvice();
        oldAdvice.setAdvice(newUpdateAdvice);
        return macroRepository.save(oldAdvice);
    }

}
