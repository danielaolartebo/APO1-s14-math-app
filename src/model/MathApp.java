package model;
import java.util.ArrayList;
public class MathApp {
    private int amount;
    private ArrayList <IntegerSet> sets;
    public MathApp(){
        this.amount=amount;
        sets=new ArrayList<IntegerSet>();
    }

	public void addSet(String name) {
        sets.add(new IntegerSet(name));
	}

	public void removeSet(String name) {
        for(int i=0; i<sets.size();i++){
            if(sets.get(i).getName().equals(name)){
                sets.remove(i);
            }
        }
	}

	public void addElementToSet(String setName, int element) {
        int count=0;
        for(int i=0; i<sets.size();i++){
            if(sets.get(i).getName().equals(setName)){
               for(int j=0; j<sets.get(i).getElements().size(); j++){
                   if(sets.get(i).getElements().get(j) != element){
                        count++;
                   }
               }
               if(count<1){
                sets.get(i).addElement(element);
               }
            }
        }
	}

	public void removeElementFromSet(String setName, int element) {
        int count=0;
        for(int i=0; i<sets.size();i++){
            if(sets.get(i).getName().equals(setName)){
               for(int j=0; j<sets.get(i).getElements().size(); j++){
                   if(sets.get(i).getElements().get(j) != element){
                        count++;
                   }
               }
               if(count<1){
                sets.get(i).removeElement(element);
               }
            }
        }
	}

	public void union(String name1, String name2, String newName) {
        for(int i=0; i<sets.size();i++){
            for(int j=0; j<sets.size(); j++){
                if(sets.get(i).getName().equals(name1) && sets.get(j).getName().equals(name2)){
                    sets.add(sets.get(i).union(sets.get(j), newName));
                }
            }
        }
    }

	public void difference(String name1, String name2, String newName) {
        for(int i=0; i<sets.size();i++){
            for(int j=0; j<sets.size(); j++){
                if(sets.get(i).getName().equals(name1) && sets.get(j).getName().equals(name2)){
                    sets.add(sets.get(i).difference(sets.get(j), newName));
                }
            }
        }
	}

	public void intersection(String name1, String name2, String newName) {
        for(int i=0; i<sets.size(); i++){
            for(int j=0; j<sets.size(); j++){
                if(sets.get(i).getName().equals(name1) && sets.get(j).getName().equals(name2)){
                    sets.add(sets.get(i).intersection(sets.get(j), newName));
                }
            }
        }
	}

	public void symmetricDifference(String name1, String name2, String newName) {
        for(int i=0; i<sets.size(); i++){
            for(int j=0; j<sets.size(); j++){
                if(sets.get(i).getName().equals(name1) && sets.get(j).getName().equals(name2)){
                    sets.add(sets.get(i).symmetricDifference(sets.get(j), newName));
                }
            }
        }
	}

	public String showInfoSet(String name) {
        String msg="";
        for(int i=0; i<sets.size(); i++){
            if(sets.get(i).getName().equals(name)){
                msg += sets.get(i).showContests()+"\n";
            }
        }
        return msg;
    }
    public String showInfoSets(){
        String msg="";
        for(int i=0; i<sets.size(); i++){
            msg += sets.get(i).getName()+" "+sets.get(i).showContests()+"\n";
        }
        return msg;
    }
    
}
