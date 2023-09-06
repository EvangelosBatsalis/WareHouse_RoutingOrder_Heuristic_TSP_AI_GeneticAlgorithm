package gr.vbatsalis;
//designing the code in one class without loose-coupling. In final release all methods will be loose coupled.

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    
    // TODO: 6/9/23 1. initialization
    // 2.  @Repeat:

    // TODO: 6/9/23 1. fitness evaluation
    // TODO: 6/9/23 2. selection
    // TODO: 6/9/23 3. crossover
    // TODO: 6/9/23 4. mutation
    
    //until final criteria

    /*
    * Fitness evaluation:
    * Sum of the weight of each node
    *
    *
    *
    * */

    /*
    Initialize the population with random routes
    Repeat for a fixed number of generations or until convergence:
        Calculate the fitness of each route in the population
        Select a portion of the population for the next generation based on fitness (e.g., roulette wheel or tournament selection)

        // Crossover (Recombination)
        Repeat until the population size is reached:
            Select two parent routes from the selected population
            Perform crossover to create one or more offspring routes
            Add offspring routes to the new population

        // Mutation
        For each route in the new population:
            Apply mutation with a small probability

        Replace the old population with the new population

    Extract the best route found in the final population as the solution to the TSP
*/

}