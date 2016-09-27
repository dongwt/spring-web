package com.dongwt.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParamsObj {
    
    private int[] array;
    
    private Map<String,String> map;
    
    private Set<Integer> set;
    
    private List<Integer> list;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
    
    
    

}
