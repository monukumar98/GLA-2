package Lec35;

import java.util.*;

public class Is_Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {

			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

			for (int i = 0; i < graph.length; i++) {
				map.put(i, new HashMap<>());
			}

			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph[i].length; j++) {
					map.get(i).put(graph[i][j], 1);
				}
			}
			LinkedList<BipartitePair> qq = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int src : map.keySet()) {
				if (visited.containsKey(src)) {
					continue;
				}

				// bfs
				BipartitePair bp = new BipartitePair();
				bp.vtx = src;
				bp.lv = 0;
				qq.add(bp);
				while (!qq.isEmpty()) {
					BipartitePair rbp = qq.remove();

					if (visited.containsKey(rbp.vtx) && visited.get(rbp.vtx) != rbp.lv) {
						return false;
					}

					visited.put(rbp.vtx, rbp.lv);
					for (int key : map.get(rbp.vtx).keySet()) {
						if (!visited.containsKey(key)) {
							BipartitePair nbp = new BipartitePair();
							nbp.vtx = key;
							nbp.lv = rbp.lv + 1;
							qq.add(nbp);
						}
					}

				}

			}

			return true;
		}

		public class BipartitePair {
			int vtx;
			int lv;
		}
	}

}
