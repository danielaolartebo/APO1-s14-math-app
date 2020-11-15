package model;
import java.util.ArrayList;
public class IntegerSet {
    private ArrayList <Integer> elements;
    private int cardinality;
    private String name;
    public IntegerSet(String name){
        this.name=name;
        elements = new ArrayList<Integer>();
        cardinality=elements.size();
    }
    public ArrayList<Integer> getElements(){
        return elements;
    }
	public String getName(){
        return name;
    }
    public int getCardinality(){
        return cardinality;
    }
    public void addElement(int element){
       elements.add(element);
    }
    public void removeElement(int element){
        elements.remove(element);
    }
    public IntegerSet union(IntegerSet set, String newName){
        IntegerSet newSet = new IntegerSet(newName);
        for(int i=0; i<elements.size(); i++){
            for(int j=0; j<set.getElements().size(); j++){
                if(elements.get(i) != set.getElements().get(j)){
                    newSet.addElement(elements.get(i));
                    newSet.addElement(set.getElements().get(j));
                }
            }
        }
        return newSet;
    }
    public IntegerSet difference(IntegerSet set, String newName){
        int count=0;
        IntegerSet newSet = new IntegerSet(newName);
        for(int i=0; i<elements.size(); i++){
            for(int j=0; j<set.getElements().size(); j++){
                if(elements.get(i) == set.getElements().get(j)){
                    count++;
                }
            }
            if(count==0){
                newSet.addElement(elements.get(i));
                count=0;
            }
        }
        return newSet;
    }
    public IntegerSet intersection(IntegerSet set, String newName){
        IntegerSet newSet=new IntegerSet(newName);
        for(int i=0;i<elements.size();i++){
            for(int j=0; j<set.getElements().size(); j++){
                if(elements.get(i) != set.getElements().get(j)){
                    newSet.addElement(elements.get(i));
                    newSet.addElement(set.getElements().get(j));
                }
            }
        }
        return newSet;
    }
    public IntegerSet symmetricDifference(IntegerSet set, String newName){
        int count=0;
        IntegerSet newSet=new IntegerSet(newName);
        for(int i=0;i<elements.size();i++){
            for(int j=0; j<set.getElements().size(); j++){
                if(elements.get(i) == set.getElements().get(j)){
                   count++;
                }
            }
            if(count==0){
                newSet.addElement(elements.get(i));
                count=0;
            }
        }
        for(int i=0;i<set.getElements().size();i++){
            for(int j=0; j<elements.size(); j++){
                if(elements.get(i) == set.getElements().get(j)){
                   count++;
                }
            }
            if(count==0){
                newSet.addElement(set.getElements().get(i));
                count=0;
            }
        }
        return newSet;
    }
    public String showContests(){
        String msg="elements are: ";
        for(int i=0; i<elements.size();i++){
            msg+=elements.get(i)+", ";
        }
        return msg;
    }
}
