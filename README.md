Search
======
README

Jun Xie(xie@eecs.oregonstate.edu)

Search aims for providing the Java implementation of different search algorithms, for example, Beam Search. You can get to know different search algorithm in Search Category.jpg.

In the current time, beam search algorithm are implemented. As we know, there are two types of beam search, breath-first version(http://jhave.org/algorithms/graphs/beamsearch/beamsearch.shtml) and best first version (http://en.wikibooks.org/wiki/Artificial_Intelligence/Search/Heuristic_search/Beam_search). The only difference between the two versions is the successor generation. For breath-first search, we need to add all successor of the current nodes in the Beam into the successor list, while for best-first search, we just need to exapnd the best node in the beam according to heuristic function and add the successors and the remaining nodes in the beam into the successor list. Then based on the successor list and heuristic function, we choose the beam width nodes into the new Beam and do search until the goal state is found. For example, if we set the beam width as 2, we just need to 2 nodes into the new Beam.

For beam search, I choose the example specified in (http://jhave.org/algorithms/graphs/beamsearch/beamsearch.shtml). In order to execute the programs, you just need to cd to the BeamSearch folder and follow the guidelines specified below:
        (1) Breath-first version
        >>  java BeamSearch tinyG.txt 2
        (2) Best-first version
        >> java BestFirstBeamSearch
        <b>NOTE</b> if you want to modify the parameters, you can go to the main function of the specific files.
