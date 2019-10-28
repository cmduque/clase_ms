package org.classes.ms;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MapService")
public class MapService {
    private Map<String, Integer> mapNombre = new HashMap<>();

    @GetMapping("/sumPoint/{name}/{value}")
    public Map<String, Integer>  sumPoint(@PathVariable String name, @PathVariable Integer value){
        Integer intValue;

        try{
            if (mapNombre.containsKey(name)){
                intValue  = mapNombre.get(name);
            } else intValue  = 0;
        }
        catch (Exception e)
        {
            intValue  = 0;
        }
        intValue  =  intValue  + value;
        mapNombre.put(name,intValue);
        return mapNombre;
    }

    @GetMapping("/obtainValue/{name}")
    public String obtainValue(@PathVariable String name){
        Integer intValue;
        String strName;
        try{
            if (mapNombre.containsKey(name)){
                intValue  = mapNombre.get(name);
            }  else intValue  = 0;
        }
        catch (Exception e)
        {
            intValue  = 0;
        }
        strName =  name + " : " + intValue.toString();
        return strName;
    }
}
