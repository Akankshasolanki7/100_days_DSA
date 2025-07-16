class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            int loser = matches[i][1];
            mp.put(loser, mp.getOrDefault(loser, 0) + 1);
        }
        Set<Integer> zeroLossSet = new HashSet<>();
        Set<Integer> oneLossSet = new HashSet<>();

        for (int i = 0; i < matches.length; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];
            if (mp.get(loser) == 1) {
                oneLossSet.add(loser);
            }
            if (!mp.containsKey(winner)) {
                zeroLossSet.add(winner);
            }
        }

        // Convert sets to sorted lists
        List<Integer> zerolos = new ArrayList<>(zeroLossSet);
        List<Integer> onelos = new ArrayList<>(oneLossSet);
        Collections.sort(zerolos);
        Collections.sort(onelos);
        return Arrays.asList(zerolos, onelos);
    }
}
