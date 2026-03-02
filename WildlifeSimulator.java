/**
 * WildlifeSimulator - Manages population dynamics for multiple species
 * Uses an array of Species objects to store and simulate species data
 */
public class WildlifeSimulator {
    private Species[] species;
    private int speciesCount;
    
    public WildlifeSimulator(int maxSpecies) {
        //initialize species array
        //set up scanner
        //read file into species obejct
        //call addSpecies
        //TODO
        species = new Species[maxSpecies];


    }
    
    /**
     * Add a species to the simulator
     */
    public void addSpecies(Species s) {
        //TODO
        species[speciesCount]=s;
        speciesCount++;
    }
    
    /**
     * Simulate one year of population changes for all species
     */
    public void simulateYear() {
        //TODO
        //call each species simulateYear
        //loop the Species Array
        for(Species s:species){
            s.simulateYear();
                }

    }
    
    /**
     * Simulate multiple years
     */
    public void simulate(int years) {
        //TODO
        //a loop for "years"
        //each year call simulateYear
        for(int i=0;i<years;i++){
            simulateYear();
        }
    }    
    /**
     * Get species at given index
     */
    public Species getSpecies(int index) {
        //TODO
        if(index>species.length){
            throw  new IllegalArgumentException();
        }
        return species[index];
    }
    
    /**
     * Get species info as formatted string
     */
    public String getSpeciesInfo(int index) {
        return species[index].toString();
    }
    public String toString(){
        String m = "";
        for(Species s: species){
            m+=s.toString()+"\n";

        }return m;
    }
    
    /**
     * Get total wildlife count across all species
     */
    public double getTotalPopulation() {
        //TODO
        double x=0;
        for(Species s:species){
            x+=s.getPopulation();
        }
        return x;
    }
    
    /**
     * Find the species with largest population
     */
    public int getMostPopulousIndex() {
        //TODO
        int max=0;
        for(Species s:species){
            if(s.getPopulation()>max){
                max=s.getPopulation();
            }
        }
        return max;
    }
    
    /**
     * Find the species with smallest population (most endangered)
     */
    public int getMostEndangeredIndex() {
        //TODO
        return -1;
    }
    
    public int getSpeciesCount() {
        return speciesCount;
    }

    
    /**
     * Get array of all species
     */
    public Species[] getSpeciesArray() {
        return species;
    }
}
