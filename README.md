# Simulated Annealing Algorithm for Optimization

This repository contains a Java implementation of the Simulated Annealing algorithm, a heuristic optimization technique inspired by the annealing process in metallurgy. Simulated Annealing is particularly useful for solving complex optimization problems where traditional methods may be ineffective or impractical.

## Overview

Simulated Annealing is a stochastic optimization algorithm that mimics the annealing process in metallurgy. It starts with an initial solution and iteratively explores the solution space by accepting moves that improve the solution or moves that degrade the solution based on a temperature parameter. Over time, the temperature parameter decreases, reducing the likelihood of accepting worse solutions. This process continues until the algorithm reaches a stopping criterion or convergence.


This will execute the Simulated Annealing algorithm on a sample optimization problem defined in the code.

## Algorithm Details

The Simulated Annealing algorithm consists of the following key steps:

- **Initialization**: Start with an initial solution and set the initial temperature.
- **Temperature Annealing**: Iteratively decrease the temperature according to a cooling schedule.
- **Neighbor Generation**: Generate neighboring solutions by making small changes to the current solution.
- **Acceptance Criteria**: Accept new solutions based on the temperature and the change in the objective function value.
- **Termination**: Stop the algorithm when a stopping criterion is met, such as reaching a maximum number of iterations or convergence.

## Parameters

- **TEMPERATURE**: Initial temperature parameter for the Simulated Annealing algorithm.
- **TEMPERATURE_coefficient**: Coefficient for reducing the temperature in each iteration.
- **M**: Number of iterations to perform at each temperature.

## Example

The provided Java code demonstrates how to use the Simulated Annealing algorithm to solve an optimization problem defined by the objective function. The algorithm iteratively improves the solution by exploring neighboring solutions and accepting moves based on the temperature parameter.

## References

- Kirkpatrick, S., Gelatt, C. D., & Vecchi, M. P. (1983). Optimization by simulated annealing. Science, 220(4598), 671-680.
- Van Laarhoven, P. J., & Aarts, E. H. (1987). Simulated annealing: Theory and applications (Vol. 37). Springer Science & Business Media.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
