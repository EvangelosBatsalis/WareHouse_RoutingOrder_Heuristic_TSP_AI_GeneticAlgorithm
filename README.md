# WareHouse_RoutingOrder_Heuristic_TSP_AI_GeneticAlgorithm (under construction)
Implementation of Traveling Salesman Problem (TSP) using AI Genetic Algorithm (GA) in Java.

The Traveling Salesperson Problem (TSP) is a classic optimization problem in computer science, where the goal is to find the shortest possible route that visits a given set of cities and returns to the starting city.

  Because or its exponentional complexity the nature of the difficulty to the TSP problem is characterised as NP-Complete, meaning in a undirected complete graph of 100 nodes (K100 in graph theory) there will be (n*(n-1))/2=(100*(100-1))/2=4.950 weight edges connecting those nodes.

  Approaching with a  graph traversal algorithm finding the shortest path from a starting node to all other nodes like Dijstra or Prim, it must search all the available search space on a graph before reach its target node.There will be fuctorial 100! difeerent ways from start node visiting all nodes and find different routes beetween them.
  
  Another approach like DFS or BFS will have the same result but those search are for a balanced edges between nodes. DFS might not found the solution because of local optimum trap and BFS will not find the optimal path.

 **My approach will be with genetic algorithm (a small description):**
A genetic algorithm is a search and optimization technique inspired by the process of natural selection and evolution(Charles Darwin). It is used to find approximate solutions to complex problems where traditional methods may be inefficient or impractical as we explained before.

  The algorithm operates on a population of potential solutions, which are encoded as chromosomes of genes. Each chromosome represents a candidate solution to the problem. The genetic algorithm iteratively evolves this population through a process of selection, crossover, and mutation, mimicking the principles of natural selection.

  During each iteration, the algorithm evaluates the fitness of each chromosome based on how well it solves the problem. Chromosomes with higher fitness have a better chance of being selected for the next generation. Crossover combines genetic material from selected parents to create new offspring, while mutation introduces random changes to promote diversity.
  
  Over time, the population evolves, with fitter chromosomes being favored and less fit ones being gradually replaced. This evolutionary process continues until a termination criterion is met, such as reaching a maximum number of iterations or finding a satisfactory solution.
  
  The strength of genetic algorithms lies in their ability to explore a large search space efficiently, discovering good solutions even in the presence of complex and multi-dimensional problem landscapes.

## Designing the genetic algorithm
**State space or state graph design:**
**Description:** There will be same implementation such as AI "Maze problem" scenario. Meaning the warehouse will be only one floor (n)x(m) matrix and it will have 1.000 storage places. Each storate location will be 1 meter distance and the corrindor will have 2 meter long on x axis and m meter long on y axis. The Start and the target location will be at the same point.

**Effector:**
**Condition:** 
**Result:**

**Search Space description:**
The graph will be implement with adjacency matrix (without graph feedback loop) and the rows 


** TSP problem description: **
must visit all the edges of the graph
