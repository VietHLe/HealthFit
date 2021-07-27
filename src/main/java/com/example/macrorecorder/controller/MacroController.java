package com.example.macrorecorder.controller;


import com.example.macrorecorder.model.MacroModel;
import com.example.macrorecorder.service.macrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user")
public class MacroController {
    @Autowired
    private macrosService macroRepository;

    @GetMapping("macros")
    public List<MacroModel> getAllMacros() {
        return macroRepository.getAll();
    }
    @PostMapping("macros")
    public MacroModel create(@RequestBody MacroModel macro){
        return macroRepository.create(macro);
    }
    @DeleteMapping("macros/{id}")
    public void delete(@PathVariable Long id){
        macroRepository.delete(id);
    }
    @PutMapping("macros/{id}")
    public MacroModel updateFood(@PathVariable Long id,@RequestBody MacroModel foodEat){
        return macroRepository.updateFood(id, foodEat);
    }
    @PutMapping("macros/{id}/caloriesFood")
    public MacroModel updateCaloriesTotal(@PathVariable Long id, @RequestBody MacroModel foodCal){
        return macroRepository.updateFoodCalories(id,foodCal);
    }
    @PutMapping("macros/{id}/fat")
    public MacroModel updateFat(@PathVariable Long id, @RequestBody MacroModel foodFat){
        return macroRepository.updateFat(id,foodFat);
    }
    @PutMapping("macros/{id}/carbs")
    public MacroModel updateCarbs(@PathVariable Long id, @RequestBody MacroModel carbs){
        return macroRepository.updateCarb(id,carbs);
    }
    @PutMapping("macros/{id}/protein")
    public MacroModel updateProtein(@PathVariable Long id, @RequestBody MacroModel protein){
        return macroRepository.updateProtein(id,protein);
    }
    @PutMapping("macros/{id}/finish")
    public MacroModel complete(@PathVariable Long id, @RequestBody MacroModel finish){
        return macroRepository.done(id,finish);
    }
    @PutMapping("macros/{id}/finish/dueDate")
    public MacroModel due(@PathVariable Long id,@RequestBody MacroModel dueDate){
        return  macroRepository.due(id,dueDate);
    }
}
