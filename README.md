# WareHouse_RoutingOrder_Heuristic_TSP_AI_GeneticAlgorithm (under construction)
Implementation of Traveling Salesman Problem (TSP) using AI Genetic Algorithm (GA) in Java.

The Traveling Salesperson Problem (TSP) is a classic optimization problem in computer science, where the goal is to find the shortest possible route that visits a given set of cities and returns to the starting city.

  Because or its exponentional complexity the nature of the difficulty for the TSP problem is characterised as NP-Complete. More specific, in a undirected complete graph of 100 nodes (K100 in graph theory) there will be (n*(n-1))/2=(100*(100-1))/2=4.950 weight edges connecting those nodes.

  Approaching with a  graph traversal algorithm finding the shortest path from a starting node to all other nodes like Dijstra or Prim, it must search all the available search space on a graph before reach the target node.There will be fuctorial 100! difeerent ways from start node visiting all nodes and find different routes beetween them.
  
  Another approach like DFS or BFS will have the same result but those search are for balanced edges between nodes, furthermore DFS might not found the solution because of local optimum trap and BFS will not find the optimal path.

 **My approach will be with genetic algorithm (a small description):**
A genetic algorithm is a search and optimization technique inspired by the process of natural selection and evolution(Charles Darwin). It is used to find approximate solutions to complex problems where traditional methods may be inefficient or impractical as we explained before.

  The algorithm operates on a population of potential solutions, which are encoded as chromosomes of genes. Each chromosome represents a candidate solution to the problem. The genetic algorithm iteratively evolves this population through a process of selection, crossover, and mutation, mimicking the principles of natural selection.

  During each iteration, the algorithm evaluates the fitness of each chromosome based on how well it solves the problem. Chromosomes with higher fitness have a better chance of being selected for the next generation. Crossover combines genetic material from selected parents to create new offspring, while mutation introduces random changes to promote diversity.
  
  Over time, the population evolves, with fitter chromosomes being favored and less fit ones being gradually replaced. This evolutionary process continues until a termination criterion is met, such as reaching a maximum number of iterations or finding a satisfactory solution.
  
  The strength of genetic algorithms lies in their ability to explore a large search space efficiently, discovering good solutions even in the presence of complex and multi-dimensional problem landscapes.

## Designing the genetic algorithm
**State space or state graph design:**
**Description:** There will be same implementation with AI "Maze problem" scenario. Meaning the warehouse will be only one floor (n)x(m) matrix and it will have 1.000 storage places. Each storage location will be 1 meter distance and the corrindor will have 2 meter on x->x axis and m meter long on y->y axis. The START and the Target location will be the same.

**Effector:** An order at any location on {x,y} coordinates, the worker can have any specific actions: Left, Right, Down and Up. 

Left: Moving left by one spot (1 meter). Condition: Y (diff) 1 and the spot is not block (corrindor). Result: Movement (X, Y-1).
Right: Moving right by one spot (1 meter). Condition: Y (diff) Max(array column size)  and the spot is not block (corrindor). Result: Movement (X, Y+1).
Up: Moving left by one spot (1 meter). Condition: X (diff) 1 and the spot is not block (corrindor). Result: Movement (X-1, Y).
Down: Moving left by one spot (1 meter). Condition: X (diff) Max(array column size) and the spot is not block (corrindor). Result: Movement (X+1, Y).

**heuristic function:** Manhatan or Euclidean distance

**Search Space description:**
The graph will be implement with adjacency matrix (without graph feedback loop). 0 values at rows and columns means there is no path beetween nodes. Greater than 1 is the weight path connecting nodes.

## Designing TSP
**Desciption:** - It will pass to each node only one times. -It will Start and finish at the same point. -It will have as fitness the minimization of the function (sum of Manhatan or Euclidean distance).
**Encoding:** Vector of Integers wich represents the nodes.
**Fitness evaluation:** F(x) = -F(x)+C. Where: - f(x) = sum of Manhatan or Euclidean distance. - C = (nodes) multiply by (max distance between two nodes)  
**Genetic function:**
Selection: Roulette Selection
Crossover: Order Crossover (OX)
Mutation: Random swich places.
